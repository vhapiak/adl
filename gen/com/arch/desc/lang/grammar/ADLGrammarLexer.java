// Generated from C:/Users/vhapiak/IdeaProjects/ArchDescLang/grammar\ADLGrammar.g4 by ANTLR 4.7.2
package com.arch.desc.lang.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ADLGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTERFACE=1, BEHAVIOR=2, LBRACE=3, RBRACE=4, LPAREN=5, RPAREN=6, SEMI=7, 
		COMA=8, DOT=9, EQ=10, WS=11, IDENTIFIER=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTERFACE", "BEHAVIOR", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMI", 
			"COMA", "DOT", "EQ", "WS", "IDENTIFIER"
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


	public ADLGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ADLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\6\f@\n\f\r\f\16\fA\3\f\3\f\3\r\3\r\7\rH\n\r"+
		"\f\r\16\rK\13\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\3\2\5\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\2M\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\3\33\3\2\2\2\5%\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64"+
		"\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25<\3\2\2\2\27?\3\2\2\2"+
		"\31E\3\2\2\2\33\34\7k\2\2\34\35\7p\2\2\35\36\7v\2\2\36\37\7g\2\2\37 \7"+
		"t\2\2 !\7h\2\2!\"\7c\2\2\"#\7e\2\2#$\7g\2\2$\4\3\2\2\2%&\7d\2\2&\'\7g"+
		"\2\2\'(\7j\2\2()\7c\2\2)*\7x\2\2*+\7k\2\2+,\7q\2\2,-\7t\2\2-\6\3\2\2\2"+
		"./\7}\2\2/\b\3\2\2\2\60\61\7\177\2\2\61\n\3\2\2\2\62\63\7*\2\2\63\f\3"+
		"\2\2\2\64\65\7+\2\2\65\16\3\2\2\2\66\67\7=\2\2\67\20\3\2\2\289\7.\2\2"+
		"9\22\3\2\2\2:;\7\60\2\2;\24\3\2\2\2<=\7?\2\2=\26\3\2\2\2>@\t\2\2\2?>\3"+
		"\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\b\f\2\2D\30\3\2\2\2E"+
		"I\t\3\2\2FH\t\4\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\32\3\2\2"+
		"\2KI\3\2\2\2\5\2AI\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}