package com.arch.desc.lang.compiler;

import com.arch.desc.lang.entity.*;
import com.arch.desc.lang.grammar.ADLGrammarParser;

import java.util.ArrayList;

public class CCodeCompiler {

    public CCodeCompiler(ADLGrammarParser.CodeContext code) {
        compileStatic(code);
        compileDynamic(code);
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
        ArrayList<IExecutionStatement> statements = new ArrayList<>(behaviorAST.behaviorBody().executionStatement().size());
        return new CExecutionSequence("", statements);
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
