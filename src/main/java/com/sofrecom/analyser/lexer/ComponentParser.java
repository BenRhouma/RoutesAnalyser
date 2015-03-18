// Generated from ./src/main/java/Component.g4 by ANTLR 4.5
package com.sofrecom.analyser.lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComponentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SLASH=12, ALPHA=13, DIGIT=14, WS=15, COMMENT=16, LINE_COMMENT=17;
	public static final int
		RULE_exp = 0, RULE_ins = 1, RULE_method = 2, RULE_route = 3, RULE_segment = 4, 
		RULE_invokation = 5, RULE_packageDec = 6, RULE_classDec = 7, RULE_methodDec = 8, 
		RULE_assign = 9, RULE_path = 10, RULE_params = 11, RULE_param = 12, RULE_paramName = 13, 
		RULE_paramType = 14, RULE_declarationUnit = 15;
	public static final String[] ruleNames = {
		"exp", "ins", "method", "route", "segment", "invokation", "packageDec", 
		"classDec", "methodDec", "assign", "path", "params", "param", "paramName", 
		"paramType", "declarationUnit"
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

	@Override
	public String getGrammarFileName() { return "Component.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ComponentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpContext extends ParserRuleContext {
		public List<InsContext> ins() {
			return getRuleContexts(InsContext.class);
		}
		public InsContext ins(int i) {
			return getRuleContext(InsContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(32);
				ins();
				}
				}
				setState(37);
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

	public static class InsContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public RouteContext route() {
			return getRuleContext(RouteContext.class,0);
		}
		public InvokationContext invokation() {
			return getRuleContext(InvokationContext.class,0);
		}
		public InsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterIns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitIns(this);
		}
	}

	public final InsContext ins() throws RecognitionException {
		InsContext _localctx = new InsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			method();
			setState(39);
			route();
			setState(40);
			invokation();
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

	public static class MethodContext extends ParserRuleContext {
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class RouteContext extends ParserRuleContext {
		public List<TerminalNode> SLASH() { return getTokens(ComponentParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ComponentParser.SLASH, i);
		}
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public RouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterRoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitRoute(this);
		}
	}

	public final RouteContext route() throws RecognitionException {
		RouteContext _localctx = new RouteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_route);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(SLASH);
				setState(46);
				_la = _input.LA(1);
				if (_la==T__2 || _la==T__3) {
					{
					setState(45);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(49);
				_la = _input.LA(1);
				if (_la==ALPHA) {
					{
					setState(48);
					segment();
					}
				}

				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
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

	public static class SegmentContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(ComponentParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(ComponentParser.ALPHA, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ComponentParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ComponentParser.DIGIT, i);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitSegment(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ALPHA);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHA || _la==DIGIT) {
				{
				{
				setState(56);
				_la = _input.LA(1);
				if ( !(_la==ALPHA || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(61);
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

	public static class InvokationContext extends ParserRuleContext {
		public PackageDecContext packageDec() {
			return getRuleContext(PackageDecContext.class,0);
		}
		public ClassDecContext classDec() {
			return getRuleContext(ClassDecContext.class,0);
		}
		public MethodDecContext methodDec() {
			return getRuleContext(MethodDecContext.class,0);
		}
		public InvokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterInvokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitInvokation(this);
		}
	}

	public final InvokationContext invokation() throws RecognitionException {
		InvokationContext _localctx = new InvokationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_invokation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			packageDec();
			setState(63);
			match(T__4);
			setState(64);
			classDec();
			setState(65);
			match(T__4);
			setState(66);
			methodDec();
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

	public static class PackageDecContext extends ParserRuleContext {
		public PackageDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterPackageDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitPackageDec(this);
		}
	}

	public final PackageDecContext packageDec() throws RecognitionException {
		PackageDecContext _localctx = new PackageDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_packageDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__5);
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

	public static class ClassDecContext extends ParserRuleContext {
		public DeclarationUnitContext declarationUnit() {
			return getRuleContext(DeclarationUnitContext.class,0);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitClassDec(this);
		}
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			declarationUnit();
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

	public static class MethodDecContext extends ParserRuleContext {
		public DeclarationUnitContext declarationUnit() {
			return getRuleContext(DeclarationUnitContext.class,0);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public MethodDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterMethodDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitMethodDec(this);
		}
	}

	public final MethodDecContext methodDec() throws RecognitionException {
		MethodDecContext _localctx = new MethodDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			declarationUnit();
			setState(88);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(73);
				match(T__6);
				setState(85);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(74);
					params();
					}
					break;
				case 2:
					{
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALPHA) {
						{
						{
						setState(75);
						assign();
						setState(78);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(76);
							match(T__7);
							setState(77);
							params();
							}
						}

						}
						}
						setState(84);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(87);
				match(T__8);
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

	public static class AssignContext extends ParserRuleContext {
		public DeclarationUnitContext declarationUnit() {
			return getRuleContext(DeclarationUnitContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			declarationUnit();
			setState(91);
			match(T__9);
			setState(92);
			match(T__10);
			setState(93);
			path();
			setState(94);
			match(T__10);
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

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> SLASH() { return getTokens(ComponentParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ComponentParser.SLASH, i);
		}
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				match(SLASH);
				setState(97);
				segment();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			param();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(103);
				match(T__7);
				setState(104);
				param();
				}
				}
				setState(109);
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

	public static class ParamContext extends ParserRuleContext {
		public ParamNameContext paramName() {
			return getRuleContext(ParamNameContext.class,0);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			paramName();
			setState(113);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(111);
				match(T__2);
				setState(112);
				paramType();
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

	public static class ParamNameContext extends ParserRuleContext {
		public DeclarationUnitContext declarationUnit() {
			return getRuleContext(DeclarationUnitContext.class,0);
		}
		public ParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitParamName(this);
		}
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			declarationUnit();
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

	public static class ParamTypeContext extends ParserRuleContext {
		public DeclarationUnitContext declarationUnit() {
			return getRuleContext(DeclarationUnitContext.class,0);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitParamType(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_paramType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			declarationUnit();
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

	public static class DeclarationUnitContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(ComponentParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(ComponentParser.ALPHA, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ComponentParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ComponentParser.DIGIT, i);
		}
		public DeclarationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).enterDeclarationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentListener ) ((ComponentListener)listener).exitDeclarationUnit(this);
		}
	}

	public final DeclarationUnitContext declarationUnit() throws RecognitionException {
		DeclarationUnitContext _localctx = new DeclarationUnitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declarationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ALPHA);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					_la = _input.LA(1);
					if ( !(_la==ALPHA || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\61\n\5\3\5\5"+
		"\5\64\n\5\6\5\66\n\5\r\5\16\5\67\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nQ\n\n\7"+
		"\nS\n\n\f\n\16\nV\13\n\5\nX\n\n\3\n\5\n[\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\6\fe\n\f\r\f\16\ff\3\r\3\r\3\r\7\rl\n\r\f\r\16\ro\13\r\3"+
		"\16\3\16\3\16\5\16t\n\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21|\n\21\f\21"+
		"\16\21\177\13\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2"+
		"\5\3\2\3\4\3\2\5\6\3\2\17\20}\2%\3\2\2\2\4(\3\2\2\2\6,\3\2\2\2\b\65\3"+
		"\2\2\2\n9\3\2\2\2\f@\3\2\2\2\16F\3\2\2\2\20H\3\2\2\2\22J\3\2\2\2\24\\"+
		"\3\2\2\2\26d\3\2\2\2\30h\3\2\2\2\32p\3\2\2\2\34u\3\2\2\2\36w\3\2\2\2 "+
		"y\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2"+
		"\2\2\'%\3\2\2\2()\5\6\4\2)*\5\b\5\2*+\5\f\7\2+\5\3\2\2\2,-\t\2\2\2-\7"+
		"\3\2\2\2.\60\7\16\2\2/\61\t\3\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\63\3\2"+
		"\2\2\62\64\5\n\6\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65.\3\2\2"+
		"\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3\2\2\29=\7\17\2\2:<\t\4"+
		"\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?=\3\2\2\2@A\5"+
		"\16\b\2AB\7\7\2\2BC\5\20\t\2CD\7\7\2\2DE\5\22\n\2E\r\3\2\2\2FG\7\b\2\2"+
		"G\17\3\2\2\2HI\5 \21\2I\21\3\2\2\2JZ\5 \21\2KW\7\t\2\2LX\5\30\r\2MP\5"+
		"\24\13\2NO\7\n\2\2OQ\5\30\r\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RM\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WL\3\2\2\2WT\3\2\2\2"+
		"XY\3\2\2\2Y[\7\13\2\2ZK\3\2\2\2Z[\3\2\2\2[\23\3\2\2\2\\]\5 \21\2]^\7\f"+
		"\2\2^_\7\r\2\2_`\5\26\f\2`a\7\r\2\2a\25\3\2\2\2bc\7\16\2\2ce\5\n\6\2d"+
		"b\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\27\3\2\2\2hm\5\32\16\2ij\7\n"+
		"\2\2jl\5\32\16\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\31\3\2\2\2o"+
		"m\3\2\2\2ps\5\34\17\2qr\7\5\2\2rt\5\36\20\2sq\3\2\2\2st\3\2\2\2t\33\3"+
		"\2\2\2uv\5 \21\2v\35\3\2\2\2wx\5 \21\2x\37\3\2\2\2y}\7\17\2\2z|\t\4\2"+
		"\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~!\3\2\2\2\177}\3\2\2\2\17"+
		"%\60\63\67=PTWZfms}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}