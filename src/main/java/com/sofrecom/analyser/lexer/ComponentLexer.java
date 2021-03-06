// Generated from ./src/main/java/Component.g4 by ANTLR 4.5
package com.sofrecom.analyser.lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComponentLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SLASH=12, ALPHA=13, DIGIT=14, WS=15, COMMENT=16, LINE_COMMENT=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "SLASH", "ALPHA", "DIGIT", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'GET'", "'POST'", "':'", "'*'", "'.'", "'controllers'", "'('", 
		"','", "')'", "'='", "'\"'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"SLASH", "ALPHA", "DIGIT", "WS", "COMMENT", "LINE_COMMENT"
	};
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


	public ComponentLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Component.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\7\21Y\n\21\f\21\16\21\\\13\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\7\22g\n\22\f\22\16\22j\13\22\3\22\3\22\7\22n\n\22\f\22"+
		"\16\22q\13\22\5\22s\n\22\3\22\3\22\3Z\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\6\16\2&&C"+
		"\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u2001\u3042\u3191\u3302\u3381\u3402"+
		"\u3d2f\u4e02\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2\u06fb\u0968"+
		"\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68"+
		"\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5)\3\2\2\2\7.\3\2\2\2\t\60"+
		"\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2"+
		"\2\25F\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37P\3\2"+
		"\2\2!T\3\2\2\2#r\3\2\2\2%&\7I\2\2&\'\7G\2\2\'(\7V\2\2(\4\3\2\2\2)*\7R"+
		"\2\2*+\7Q\2\2+,\7U\2\2,-\7V\2\2-\6\3\2\2\2./\7<\2\2/\b\3\2\2\2\60\61\7"+
		",\2\2\61\n\3\2\2\2\62\63\7\60\2\2\63\f\3\2\2\2\64\65\7e\2\2\65\66\7q\2"+
		"\2\66\67\7p\2\2\678\7v\2\289\7t\2\29:\7q\2\2:;\7n\2\2;<\7n\2\2<=\7g\2"+
		"\2=>\7t\2\2>?\7u\2\2?\16\3\2\2\2@A\7*\2\2A\20\3\2\2\2BC\7.\2\2C\22\3\2"+
		"\2\2DE\7+\2\2E\24\3\2\2\2FG\7?\2\2G\26\3\2\2\2HI\7$\2\2I\30\3\2\2\2JK"+
		"\7\61\2\2K\32\3\2\2\2LM\t\2\2\2M\34\3\2\2\2NO\t\3\2\2O\36\3\2\2\2PQ\t"+
		"\4\2\2QR\3\2\2\2RS\b\20\2\2S \3\2\2\2TU\7\61\2\2UV\7,\2\2VZ\3\2\2\2WY"+
		"\13\2\2\2XW\3\2\2\2Y\\\3\2\2\2Z[\3\2\2\2ZX\3\2\2\2[]\3\2\2\2\\Z\3\2\2"+
		"\2]^\7,\2\2^_\7\61\2\2_`\3\2\2\2`a\b\21\2\2a\"\3\2\2\2bc\7\61\2\2cd\7"+
		"\61\2\2dh\3\2\2\2eg\n\5\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2is"+
		"\3\2\2\2jh\3\2\2\2ko\7%\2\2ln\n\5\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op"+
		"\3\2\2\2ps\3\2\2\2qo\3\2\2\2rb\3\2\2\2rk\3\2\2\2st\3\2\2\2tu\b\22\2\2"+
		"u$\3\2\2\2\7\2Zhor\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}