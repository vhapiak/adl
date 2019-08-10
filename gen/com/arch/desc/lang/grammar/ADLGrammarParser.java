// Generated from C:/Users/vhapiak/IdeaProjects/ArchDescLang/grammar\ADLGrammar.g4 by ANTLR 4.7.2
package com.arch.desc.lang.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ADLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTERFACE=1, BEHAVIOR=2, LBRACE=3, RBRACE=4, LPAREN=5, RPAREN=6, SEMI=7, 
		COMA=8, DOT=9, EQ=10, WS=11, IDENTIFIER=12;
	public static final int
		RULE_code = 0, RULE_behaviorDefinition = 1, RULE_behaviorBody = 2, RULE_executionStatement = 3, 
		RULE_variableDefinition = 4, RULE_methodCall = 5, RULE_argumentsList = 6, 
		RULE_interfaceDefinition = 7, RULE_methodDeclaration = 8, RULE_argumentsDefinitionList = 9, 
		RULE_argumentDefinition = 10, RULE_methodName = 11, RULE_variableName = 12, 
		RULE_typeName = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "behaviorDefinition", "behaviorBody", "executionStatement", "variableDefinition", 
			"methodCall", "argumentsList", "interfaceDefinition", "methodDeclaration", 
			"argumentsDefinitionList", "argumentDefinition", "methodName", "variableName", 
			"typeName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'interface'", "'behavior'", "'{'", "'}'", "'('", "')'", "';'", 
			"','", "'.'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTERFACE", "BEHAVIOR", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"SEMI", "COMA", "DOT", "EQ", "WS", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ADLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ADLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ADLGrammarParser.EOF, 0); }
		public List<InterfaceDefinitionContext> interfaceDefinition() {
			return getRuleContexts(InterfaceDefinitionContext.class);
		}
		public InterfaceDefinitionContext interfaceDefinition(int i) {
			return getRuleContext(InterfaceDefinitionContext.class,i);
		}
		public List<BehaviorDefinitionContext> behaviorDefinition() {
			return getRuleContexts(BehaviorDefinitionContext.class);
		}
		public BehaviorDefinitionContext behaviorDefinition(int i) {
			return getRuleContext(BehaviorDefinitionContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERFACE || _la==BEHAVIOR) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTERFACE:
					{
					setState(28);
					interfaceDefinition();
					}
					break;
				case BEHAVIOR:
					{
					setState(29);
					behaviorDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BehaviorDefinitionContext extends ParserRuleContext {
		public TerminalNode BEHAVIOR() { return getToken(ADLGrammarParser.BEHAVIOR, 0); }
		public BehaviorBodyContext behaviorBody() {
			return getRuleContext(BehaviorBodyContext.class,0);
		}
		public BehaviorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterBehaviorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitBehaviorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitBehaviorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BehaviorDefinitionContext behaviorDefinition() throws RecognitionException {
		BehaviorDefinitionContext _localctx = new BehaviorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_behaviorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(BEHAVIOR);
			setState(38);
			behaviorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BehaviorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ADLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ADLGrammarParser.RBRACE, 0); }
		public List<ExecutionStatementContext> executionStatement() {
			return getRuleContexts(ExecutionStatementContext.class);
		}
		public ExecutionStatementContext executionStatement(int i) {
			return getRuleContext(ExecutionStatementContext.class,i);
		}
		public BehaviorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterBehaviorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitBehaviorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitBehaviorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BehaviorBodyContext behaviorBody() throws RecognitionException {
		BehaviorBodyContext _localctx = new BehaviorBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_behaviorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(LBRACE);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				executionStatement();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(46);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ADLGrammarParser.SEMI, 0); }
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ExecutionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterExecutionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitExecutionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitExecutionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecutionStatementContext executionStatement() throws RecognitionException {
		ExecutionStatementContext _localctx = new ExecutionStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_executionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(48);
				variableDefinition();
				}
				break;
			case 2:
				{
				setState(49);
				methodCall();
				}
				break;
			}
			setState(52);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ADLGrammarParser.EQ, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			typeName();
			setState(55);
			variableName();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(56);
				match(EQ);
				setState(57);
				methodCall();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ADLGrammarParser.DOT, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ADLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ADLGrammarParser.RPAREN, 0); }
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public BehaviorBodyContext behaviorBody() {
			return getRuleContext(BehaviorBodyContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			variableName();
			setState(61);
			match(DOT);
			setState(62);
			methodName();
			setState(63);
			match(LPAREN);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(64);
				argumentsList();
				}
			}

			setState(67);
			match(RPAREN);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(68);
				behaviorBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsListContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ADLGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ADLGrammarParser.COMA, i);
		}
		public ArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitArgumentsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsListContext argumentsList() throws RecognitionException {
		ArgumentsListContext _localctx = new ArgumentsListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			variableName();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(72);
				match(COMA);
				setState(73);
				variableName();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ADLGrammarParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ADLGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(ADLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ADLGrammarParser.RBRACE, 0); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterInterfaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitInterfaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitInterfaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(INTERFACE);
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(LBRACE);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(82);
				methodDeclaration();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ADLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ADLGrammarParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ADLGrammarParser.SEMI, 0); }
		public ArgumentsDefinitionListContext argumentsDefinitionList() {
			return getRuleContext(ArgumentsDefinitionListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			typeName();
			setState(91);
			methodName();
			setState(92);
			match(LPAREN);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(93);
				argumentsDefinitionList();
				}
			}

			setState(96);
			match(RPAREN);
			setState(97);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsDefinitionListContext extends ParserRuleContext {
		public List<ArgumentDefinitionContext> argumentDefinition() {
			return getRuleContexts(ArgumentDefinitionContext.class);
		}
		public ArgumentDefinitionContext argumentDefinition(int i) {
			return getRuleContext(ArgumentDefinitionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ADLGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ADLGrammarParser.COMA, i);
		}
		public ArgumentsDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterArgumentsDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitArgumentsDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitArgumentsDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsDefinitionListContext argumentsDefinitionList() throws RecognitionException {
		ArgumentsDefinitionListContext _localctx = new ArgumentsDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argumentsDefinitionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			argumentDefinition();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(100);
				match(COMA);
				setState(101);
				argumentDefinition();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentDefinitionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ArgumentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterArgumentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitArgumentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitArgumentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDefinitionContext argumentDefinition() throws RecognitionException {
		ArgumentDefinitionContext _localctx = new ArgumentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			typeName();
			setState(108);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ADLGrammarParser.IDENTIFIER, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ADLGrammarParser.IDENTIFIER, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ADLGrammarParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADLGrammarListener ) ((ADLGrammarListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ADLGrammarVisitor ) return ((ADLGrammarVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\5\3\5\5\5\65\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\7\3\7"+
		"\5\7H\n\7\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\t\3\t\3\t\3\t\7\tV\n\t"+
		"\f\t\16\tY\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\na\n\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\7\13i\n\13\f\13\16\13l\13\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2s\2\"\3\2\2"+
		"\2\4\'\3\2\2\2\6*\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\f>\3\2\2\2\16I\3\2\2"+
		"\2\20Q\3\2\2\2\22\\\3\2\2\2\24e\3\2\2\2\26m\3\2\2\2\30p\3\2\2\2\32r\3"+
		"\2\2\2\34t\3\2\2\2\36!\5\20\t\2\37!\5\4\3\2 \36\3\2\2\2 \37\3\2\2\2!$"+
		"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\2\2\3&\3\3\2\2"+
		"\2\'(\7\4\2\2()\5\6\4\2)\5\3\2\2\2*,\7\5\2\2+-\5\b\5\2,+\3\2\2\2-.\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\6\2\2\61\7\3\2\2\2\62\65"+
		"\5\n\6\2\63\65\5\f\7\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\7\t\2\2\67\t\3\2\2\289\5\34\17\29<\5\32\16\2:;\7\f\2\2;=\5\f\7\2<:\3"+
		"\2\2\2<=\3\2\2\2=\13\3\2\2\2>?\5\32\16\2?@\7\13\2\2@A\5\30\r\2AC\7\7\2"+
		"\2BD\5\16\b\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\7\b\2\2FH\5\6\4\2GF\3\2"+
		"\2\2GH\3\2\2\2H\r\3\2\2\2IN\5\32\16\2JK\7\n\2\2KM\5\32\16\2LJ\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\17\3\2\2\2PN\3\2\2\2QR\7\3\2\2RS\7\16"+
		"\2\2SW\7\5\2\2TV\5\22\n\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3"+
		"\2\2\2YW\3\2\2\2Z[\7\6\2\2[\21\3\2\2\2\\]\5\34\17\2]^\5\30\r\2^`\7\7\2"+
		"\2_a\5\24\13\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\b\2\2cd\7\t\2\2d\23\3"+
		"\2\2\2ej\5\26\f\2fg\7\n\2\2gi\5\26\f\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2j"+
		"k\3\2\2\2k\25\3\2\2\2lj\3\2\2\2mn\5\34\17\2no\5\32\16\2o\27\3\2\2\2pq"+
		"\7\16\2\2q\31\3\2\2\2rs\7\16\2\2s\33\3\2\2\2tu\7\16\2\2u\35\3\2\2\2\r"+
		" \".\64<CGNW`j";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}