// Generated from C:/Users/vhapiak/IdeaProjects/ArchDescLang/grammar\ADLGrammar.g4 by ANTLR 4.7.2
package com.arch.desc.lang.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ADLGrammarParser}.
 */
public interface ADLGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ADLGrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ADLGrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#behaviorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorDefinition(ADLGrammarParser.BehaviorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#behaviorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorDefinition(ADLGrammarParser.BehaviorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#behaviorBody}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorBody(ADLGrammarParser.BehaviorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#behaviorBody}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorBody(ADLGrammarParser.BehaviorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#executionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecutionStatement(ADLGrammarParser.ExecutionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#executionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecutionStatement(ADLGrammarParser.ExecutionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(ADLGrammarParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(ADLGrammarParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ADLGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ADLGrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsList(ADLGrammarParser.ArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsList(ADLGrammarParser.ArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(ADLGrammarParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(ADLGrammarParser.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ADLGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ADLGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#argumentsDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDefinitionList(ADLGrammarParser.ArgumentsDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#argumentsDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDefinitionList(ADLGrammarParser.ArgumentsDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#argumentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDefinition(ADLGrammarParser.ArgumentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#argumentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDefinition(ADLGrammarParser.ArgumentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(ADLGrammarParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(ADLGrammarParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(ADLGrammarParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(ADLGrammarParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADLGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ADLGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADLGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ADLGrammarParser.TypeNameContext ctx);
}