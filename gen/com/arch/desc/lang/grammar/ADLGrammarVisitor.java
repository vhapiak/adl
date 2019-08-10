// Generated from C:/Users/vhapiak/IdeaProjects/ArchDescLang/grammar\ADLGrammar.g4 by ANTLR 4.7.2
package com.arch.desc.lang.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ADLGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ADLGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(ADLGrammarParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#behaviorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorDefinition(ADLGrammarParser.BehaviorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#behaviorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorBody(ADLGrammarParser.BehaviorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#executionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutionStatement(ADLGrammarParser.ExecutionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(ADLGrammarParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ADLGrammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#argumentsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsList(ADLGrammarParser.ArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefinition(ADLGrammarParser.InterfaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ADLGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#argumentsDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsDefinitionList(ADLGrammarParser.ArgumentsDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#argumentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDefinition(ADLGrammarParser.ArgumentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(ADLGrammarParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(ADLGrammarParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ADLGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ADLGrammarParser.TypeNameContext ctx);
}