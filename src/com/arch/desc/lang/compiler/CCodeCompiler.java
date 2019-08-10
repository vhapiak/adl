package com.arch.desc.lang.compiler;

import com.arch.desc.lang.entity.*;
import com.arch.desc.lang.grammar.ADLGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class CCodeCompiler {

    public CCodeCompiler(ADLGrammarParser.CodeContext code) throws CCompilerError {
        compileStatic(code);
        compileDynamic(code);
    }

    public CNamespaceContext getGlobalNamespace() {
        return mGlobalNamespace;
    }

    private void compileStatic(ADLGrammarParser.CodeContext code) throws CCompilerError {
        mGlobalNamespace.addType(new CType("void"));

        for (ADLGrammarParser.InterfaceDefinitionContext context : code.interfaceDefinition()) {
            mGlobalNamespace.addType(compileInterface(context, mGlobalNamespace));
        }
    }

    private void compileDynamic(ADLGrammarParser.CodeContext code) throws CCompilerError {
        for (ADLGrammarParser.BehaviorDefinitionContext context : code.behaviorDefinition()) {
            mGlobalNamespace.addExecutionSequence(compileBehavior(context, mGlobalNamespace));
        }
    }

    private static CExecutionSequence compileBehavior(
            ADLGrammarParser.BehaviorDefinitionContext behaviorAST,
            CNamespaceContext namespace) throws CCompilerError {
        CExecutionContext executionContext = new CExecutionContext();

        return compileBehaviorBody(behaviorAST.behaviorBody(), executionContext, namespace);
    }

    private static CExecutionSequence compileBehaviorBody(
            ADLGrammarParser.BehaviorBodyContext behaviorAST,
            CExecutionContext executionContext,
            CNamespaceContext namespace) throws CCompilerError {
        ArrayList<IExecutionStatement> statements = new ArrayList<>(behaviorAST.executionStatement().size());

        for (ADLGrammarParser.ExecutionStatementContext context : behaviorAST.executionStatement()) {
            if (context.methodCall() != null) {
                statements.add(compileMethodCall(context.methodCall(), executionContext, namespace));
            } else if (context.variableDefinition() != null) {
                statements.add(compileVariableDefinition(context.variableDefinition(), executionContext, namespace));
            }
        }

        return new CExecutionSequence("", statements);
    }

    private static CMethodCall compileMethodCall(
            ADLGrammarParser.MethodCallContext methodCallAST,
            CExecutionContext context,
            CNamespaceContext namespace) throws CCompilerError {

        String variableName = methodCallAST.variableName().IDENTIFIER().getText();
        CVariable variable = context.getVariable(variableName);
        if (variable == null) {
            throw new CCompilerError(
                    "Unknown variable " + variableName,
                    methodCallAST.variableName().getStart().getLine());
        }

        String methodName = methodCallAST.methodName().IDENTIFIER().getText();
        CMethod method = variable.getType().getMethod(methodName);
        if (method == null) {
            throw new CCompilerError(
                    "Unknown method " + methodName + " from " + variable.getType().getName(),
                    methodCallAST.methodName().getStart().getLine());
        }

        ArrayList<CVariable> arguments = new ArrayList<>();
        if (methodCallAST.argumentsList() != null) {
            for (ADLGrammarParser.VariableNameContext argContext : methodCallAST.argumentsList().variableName()) {
                String argumentName = argContext.IDENTIFIER().getText();
                CVariable argument = context.getVariable(argumentName);
                if (argument == null) {
                    throw new CCompilerError(
                            "Unknown variable " + argumentName + " in arguments list",
                            argContext.getStart().getLine());
                }
                arguments.add(argument);
            }
        }

        List<CArgument> definedArguments = method.getArguments();
        if (definedArguments.size() != arguments.size()) {
            throw new CCompilerError(
                    "Arguments number mismatch for method " + methodName,
                    methodCallAST.methodName().getStart().getLine());
        }
        for (int i = 0; i < definedArguments.size(); ++i) {
            CVariable actualArgument = arguments.get(i);
            CArgument definedArgument = definedArguments.get(i);
            if (definedArgument.getType().getName() != actualArgument.getType().getName()) {
                throw new CCompilerError(
                        "Cannot cast variable " + actualArgument.getName() +
                                " of type " + actualArgument.getType().getName() +
                                " to type " + definedArgument.getType().getName(),
                        methodCallAST.methodName().getStart().getLine());
            }
        }

        CExecutionSequence executionSequence = null;
        if (methodCallAST.behaviorBody() != null) {
            CExecutionContext ctx = new CExecutionContext();
            for (CVariable var : arguments) {
                ctx.addVariable(var);
            }
            executionSequence = compileBehaviorBody(methodCallAST.behaviorBody(), ctx, namespace);
        }

        return new CMethodCall(variable, method, arguments, executionSequence);
    }

    private static CVariableDefinition compileVariableDefinition(
            ADLGrammarParser.VariableDefinitionContext variableDefinitionAST,
            CExecutionContext context,
            CNamespaceContext namespace) throws CCompilerError {
        String name = variableDefinitionAST.variableName().IDENTIFIER().getText();
        String typeName = variableDefinitionAST.typeName().IDENTIFIER().getText();

        CType type = namespace.getType(typeName);
        if (type == null) {
            throw new CCompilerError(
                    "Unknown variable type " + typeName,
                    variableDefinitionAST.typeName().getStart().getLine());
        }

        CVariable variable = new CVariable(name, type);
        CMethodCall initializationCall =
                variableDefinitionAST.methodCall() == null
                        ? null
                        : compileMethodCall(variableDefinitionAST.methodCall(), context, namespace);

        if (initializationCall != null) {
            CType returnType = initializationCall.getMethod().getReturnType();
            if (returnType.getName() != type.getName()) {
                throw new CCompilerError(
                        "Cannot cast return type " + returnType.getName() + " to type " + type.getName(),
                        variableDefinitionAST.typeName().getStart().getLine());
            }
        }

        context.addVariable(variable);

        return new CVariableDefinition(variable, initializationCall);
    }

    private static CType compileInterface(
            ADLGrammarParser.InterfaceDefinitionContext interfaceAST,
            CNamespaceContext namespace) throws CCompilerError {

        String name = interfaceAST.IDENTIFIER().getText();
        ArrayList<CMethod> methods = new ArrayList<>(interfaceAST.methodDeclaration().size());

        for (ADLGrammarParser.MethodDeclarationContext context : interfaceAST.methodDeclaration()) {
            methods.add(compileMethod(context, namespace));
        }

        return new CType(name, methods);
    }

    private static CMethod compileMethod(
            ADLGrammarParser.MethodDeclarationContext methodAST,
            CNamespaceContext namespace) throws CCompilerError {

        String name = methodAST.methodName().IDENTIFIER().getText();
        String returnTypeName = methodAST.typeName().IDENTIFIER().getText();

        CType returnType = namespace.getType(returnTypeName);
        if (returnType == null) {
            throw new CCompilerError(
                    "Unknown return type " + returnTypeName,
                    methodAST.typeName().getStart().getLine());
        }

        ArrayList<CArgument> arguments = new ArrayList<>();
        ADLGrammarParser.ArgumentsDefinitionListContext argumentsList = methodAST.argumentsDefinitionList();
        if (argumentsList != null) {
            for (ADLGrammarParser.ArgumentDefinitionContext context : argumentsList.argumentDefinition()) {
                arguments.add(compileArgument(context, namespace));
            }
        }

        return new CMethod(name, returnType, arguments);
    }

    private static CArgument compileArgument(
            ADLGrammarParser.ArgumentDefinitionContext argumentAST,
            CNamespaceContext namespace) throws CCompilerError {

        String name = argumentAST.variableName().IDENTIFIER().getText();
        String typeName = argumentAST.typeName().IDENTIFIER().getText();

        CType argumentType = namespace.getType(typeName);
        if (argumentType == null) {
            throw new CCompilerError(
                    "Unknown argument type " + typeName,
                    argumentAST.typeName().getStart().getLine());
        }

        return new CArgument(name, argumentType);
    }

    private CNamespaceContext mGlobalNamespace = new CNamespaceContext("<global>");

}
