package com.arch.desc.lang.compiler;

import com.arch.desc.lang.entity.*;
import com.arch.desc.lang.grammar.ADLGrammarParser;

import java.util.ArrayList;

public class CCodeCompiler {

    public CCodeCompiler(ADLGrammarParser.CodeContext code) {
        compileStatic(code);
        compileDynamic(code);
    }

    public CNamespaceContext getGlobalNamespace() {
        return mGlobalNamespace;
    }

    private void compileStatic(ADLGrammarParser.CodeContext code) {
        mGlobalNamespace.addType(new CType("void"));

        for (ADLGrammarParser.InterfaceDefinitionContext context : code.interfaceDefinition()) {
            mGlobalNamespace.addType(compileInterface(context, mGlobalNamespace));
        }
    }

    private void compileDynamic(ADLGrammarParser.CodeContext code) {
        for (ADLGrammarParser.BehaviorDefinitionContext context : code.behaviorDefinition()) {
            mGlobalNamespace.addExecutionSequence(compileBehavior(context, mGlobalNamespace));
        }
    }

    private static CExecutionSequence compileBehavior(
            ADLGrammarParser.BehaviorDefinitionContext behaviorAST,
            CNamespaceContext namespace) {
        CExecutionContext executionContext = new CExecutionContext();

        return compileBehaviorBody(behaviorAST.behaviorBody(), executionContext, namespace);
    }

    private static CExecutionSequence compileBehaviorBody(
            ADLGrammarParser.BehaviorBodyContext behaviorAST,
            CExecutionContext executionContext,
            CNamespaceContext namespace) {
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
            CNamespaceContext namespace) {

        String variableName = methodCallAST.variableName().IDENTIFIER().getText();
        CVariable variable = context.getVariable(variableName);

        String methodName = methodCallAST.methodName().IDENTIFIER().getText();
        CMethod method = variable.getType().getMethod(methodName);

        ArrayList<CVariable> arguments = new ArrayList<>();
        if (methodCallAST.argumentsList() != null) {
            for (ADLGrammarParser.VariableNameContext argContext : methodCallAST.argumentsList().variableName()) {
                String argumentName = argContext.IDENTIFIER().getText();
                arguments.add(context.getVariable(argumentName));
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
            CNamespaceContext namespace) {
        String name = variableDefinitionAST.variableName().IDENTIFIER().getText();
        String typeName = variableDefinitionAST.typeName().IDENTIFIER().getText();

        CType type = namespace.getType(typeName);

        CVariable variable = new CVariable(name, type);
        CMethodCall initializationCall =
                variableDefinitionAST.methodCall() == null
                        ? null
                        : compileMethodCall(variableDefinitionAST.methodCall(), context, namespace);

        context.addVariable(variable);

        return new CVariableDefinition(variable, initializationCall);
    }

    private static CType compileInterface(
            ADLGrammarParser.InterfaceDefinitionContext interfaceAST,
            CNamespaceContext namespace) {

        String name = interfaceAST.IDENTIFIER().getText();
        ArrayList<CMethod> methods = new ArrayList<>(interfaceAST.methodDeclaration().size());

        for (ADLGrammarParser.MethodDeclarationContext context : interfaceAST.methodDeclaration()) {
            methods.add(compileMethod(context, namespace));
        }

        return new CType(name, methods);
    }

    private static CMethod compileMethod(
            ADLGrammarParser.MethodDeclarationContext methodAST,
            CNamespaceContext namespace) {

        String name = methodAST.methodName().IDENTIFIER().getText();
        String returnTypeName = methodAST.typeName().IDENTIFIER().getText();

        CType returnType = namespace.getType(returnTypeName);

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
            CNamespaceContext namespace) {

        String name = argumentAST.variableName().IDENTIFIER().getText();
        String typeName = argumentAST.typeName().IDENTIFIER().getText();

        CType returnType = namespace.getType(typeName);

        return new CArgument(name, returnType);
    }

    private CNamespaceContext mGlobalNamespace = new CNamespaceContext("<global>");

}
