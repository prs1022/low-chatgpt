// Generated from /Users/upuphone/java/low-chatgpt/src/main/resources/Sense.g4 by ANTLR 4.10.1
package com.prs.sense;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SenseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, INT=29, FLOAT=30, BOOLEAN=31, 
		STRING=32, FUNCTION=33, ID=34, ID_PATH=35, MACROARG=36, NAMESPACE=37, 
		LINECOMMENT=38, BLOCKCOMMENT=39, SPACES=40, SCRIPT=41, REGEX=42;
	public static final int
		RULE_sense = 0, RULE_nsSentence = 1, RULE_importSentence = 2, RULE_primeSentence = 3, 
		RULE_productionSentence = 4, RULE_exclusion = 5, RULE_annotation = 6, 
		RULE_assigns = 7, RULE_assign = 8, RULE_criteria = 9, RULE_catExpr = 10, 
		RULE_catUnit = 11, RULE_catBranch = 12, RULE_cat = 13, RULE_wordAttrExpr = 14, 
		RULE_wordAttrBranch = 15, RULE_wordAttr = 16, RULE_wordAttrUnit = 17, 
		RULE_value = 18, RULE_array = 19, RULE_dict = 20, RULE_dictItem = 21, 
		RULE_expr = 22, RULE_unit = 23, RULE_idList = 24, RULE_qualifiedName = 25, 
		RULE_namespace = 26, RULE_rep = 27, RULE_repUnit = 28, RULE_branch = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"sense", "nsSentence", "importSentence", "primeSentence", "productionSentence", 
			"exclusion", "annotation", "assigns", "assign", "criteria", "catExpr", 
			"catUnit", "catBranch", "cat", "wordAttrExpr", "wordAttrBranch", "wordAttr", 
			"wordAttrUnit", "value", "array", "dict", "dictItem", "expr", "unit", 
			"idList", "qualifiedName", "namespace", "rep", "repUnit", "branch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'namespace'", "';'", "'import'", "'::'", "','", "'<'", "'>'", 
			"':'", "'!'", "'@'", "'('", "')'", "'='", "'['", "']'", "'&'", "'|'", 
			"'*'", "'{'", "'}'", "'^'", "'=='", "'!='", "'.'", "'${'", "'~'", "'+'", 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT", "FLOAT", "BOOLEAN", "STRING", "FUNCTION", 
			"ID", "ID_PATH", "MACROARG", "NAMESPACE", "LINECOMMENT", "BLOCKCOMMENT", 
			"SPACES", "SCRIPT", "REGEX"
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
	public String getGrammarFileName() { return "Sense.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SenseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SenseContext extends ParserRuleContext {
		public NsSentenceContext nsSentence() {
			return getRuleContext(NsSentenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SenseParser.EOF, 0); }
		public List<ImportSentenceContext> importSentence() {
			return getRuleContexts(ImportSentenceContext.class);
		}
		public ImportSentenceContext importSentence(int i) {
			return getRuleContext(ImportSentenceContext.class,i);
		}
		public List<PrimeSentenceContext> primeSentence() {
			return getRuleContexts(PrimeSentenceContext.class);
		}
		public PrimeSentenceContext primeSentence(int i) {
			return getRuleContext(PrimeSentenceContext.class,i);
		}
		public List<ProductionSentenceContext> productionSentence() {
			return getRuleContexts(ProductionSentenceContext.class);
		}
		public ProductionSentenceContext productionSentence(int i) {
			return getRuleContext(ProductionSentenceContext.class,i);
		}
		public SenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterSense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitSense(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitSense(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenseContext sense() throws RecognitionException {
		SenseContext _localctx = new SenseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sense);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			nsSentence();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(61);
				importSentence();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(67);
					primeSentence();
					}
					break;
				case 2:
					{
					setState(68);
					productionSentence();
					}
					break;
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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

	public static class NsSentenceContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public NsSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nsSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterNsSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitNsSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitNsSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NsSentenceContext nsSentence() throws RecognitionException {
		NsSentenceContext _localctx = new NsSentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nsSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			namespace();
			setState(78);
			match(T__1);
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

	public static class ImportSentenceContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SenseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SenseParser.ID, i);
		}
		public ImportSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterImportSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitImportSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitImportSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSentenceContext importSentence() throws RecognitionException {
		ImportSentenceContext _localctx = new ImportSentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			{
			setState(81);
			namespace();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(82);
				match(T__3);
				setState(83);
				match(ID);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(84);
					match(T__4);
					setState(85);
					match(ID);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			setState(93);
			match(T__1);
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

	public static class PrimeSentenceContext extends ParserRuleContext {
		public Token name;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public ExclusionContext exclusion() {
			return getRuleContext(ExclusionContext.class,0);
		}
		public PrimeSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primeSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterPrimeSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitPrimeSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitPrimeSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeSentenceContext primeSentence() throws RecognitionException {
		PrimeSentenceContext _localctx = new PrimeSentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primeSentence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					annotation();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(101);
				criteria();
				}
			}

			setState(104);
			match(T__5);
			setState(105);
			((PrimeSentenceContext)_localctx).name = match(ID);
			setState(106);
			match(T__6);
			setState(107);
			match(T__7);
			setState(108);
			expr();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(109);
				exclusion();
				}
			}

			setState(112);
			match(T__1);
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

	public static class ProductionSentenceContext extends ParserRuleContext {
		public Token name;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExclusionContext exclusion() {
			return getRuleContext(ExclusionContext.class,0);
		}
		public ProductionSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productionSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterProductionSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitProductionSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitProductionSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductionSentenceContext productionSentence() throws RecognitionException {
		ProductionSentenceContext _localctx = new ProductionSentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_productionSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(114);
				annotation();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			((ProductionSentenceContext)_localctx).name = match(ID);
			setState(121);
			match(T__7);
			setState(122);
			expr();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(123);
				exclusion();
				}
			}

			setState(126);
			match(T__1);
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

	public static class ExclusionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterExclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitExclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitExclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusionContext exclusion() throws RecognitionException {
		ExclusionContext _localctx = new ExclusionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__8);
			setState(129);
			expr();
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public AssignsContext assigns() {
			return getRuleContext(AssignsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__9);
			setState(132);
			match(ID);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(133);
				assigns();
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

	public static class AssignsContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public AssignsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterAssigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitAssigns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitAssigns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignsContext assigns() throws RecognitionException {
		AssignsContext _localctx = new AssignsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__10);
			setState(137);
			assign();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(138);
				match(T__4);
				setState(139);
				assign();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__11);
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
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			match(T__12);
			setState(149);
			value();
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

	public static class CriteriaContext extends ParserRuleContext {
		public CatExprContext catExpr() {
			return getRuleContext(CatExprContext.class,0);
		}
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		CriteriaContext _localctx = new CriteriaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_criteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__9);
			setState(152);
			match(T__13);
			setState(153);
			catExpr();
			setState(154);
			match(T__14);
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

	public static class CatExprContext extends ParserRuleContext {
		public CatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catExpr; }
	 
		public CatExprContext() { }
		public void copyFrom(CatExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CatExprAndContext extends CatExprContext {
		public List<CatUnitContext> catUnit() {
			return getRuleContexts(CatUnitContext.class);
		}
		public CatUnitContext catUnit(int i) {
			return getRuleContext(CatUnitContext.class,i);
		}
		public CatExprAndContext(CatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterCatExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitCatExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitCatExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CatExprOrContext extends CatExprContext {
		public List<CatBranchContext> catBranch() {
			return getRuleContexts(CatBranchContext.class);
		}
		public CatBranchContext catBranch(int i) {
			return getRuleContext(CatBranchContext.class,i);
		}
		public CatExprOrContext(CatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterCatExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitCatExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitCatExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CatExprUnitContext extends CatExprContext {
		public CatUnitContext catUnit() {
			return getRuleContext(CatUnitContext.class,0);
		}
		public CatExprUnitContext(CatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterCatExprUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitCatExprUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitCatExprUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatExprContext catExpr() throws RecognitionException {
		CatExprContext _localctx = new CatExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_catExpr);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CatExprAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				catUnit();
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					match(T__15);
					setState(158);
					catUnit();
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__15 );
				}
				break;
			case 2:
				_localctx = new CatExprOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				catBranch();
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					match(T__16);
					setState(165);
					catBranch();
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__16 );
				}
				break;
			case 3:
				_localctx = new CatExprUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				catUnit();
				}
				break;
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

	public static class CatUnitContext extends ParserRuleContext {
		public Token not;
		public CatContext cat() {
			return getRuleContext(CatContext.class,0);
		}
		public CatUnitContext catUnit() {
			return getRuleContext(CatUnitContext.class,0);
		}
		public CatExprContext catExpr() {
			return getRuleContext(CatExprContext.class,0);
		}
		public CatUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterCatUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitCatUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitCatUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatUnitContext catUnit() throws RecognitionException {
		CatUnitContext _localctx = new CatUnitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_catUnit);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case ID:
			case ID_PATH:
			case MACROARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				cat();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				((CatUnitContext)_localctx).not = match(T__8);
				setState(175);
				catUnit();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__10);
				setState(177);
				catExpr();
				setState(178);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CatBranchContext extends ParserRuleContext {
		public List<CatUnitContext> catUnit() {
			return getRuleContexts(CatUnitContext.class);
		}
		public CatUnitContext catUnit(int i) {
			return getRuleContext(CatUnitContext.class,i);
		}
		public CatBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterCatBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitCatBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitCatBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatBranchContext catBranch() throws RecognitionException {
		CatBranchContext _localctx = new CatBranchContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_catBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			catUnit();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(183);
				match(T__15);
				setState(184);
				catUnit();
				}
				}
				setState(189);
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

	public static class CatContext extends ParserRuleContext {
		public Token catName;
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public TerminalNode ID_PATH() { return getToken(SenseParser.ID_PATH, 0); }
		public TerminalNode MACROARG() { return getToken(SenseParser.MACROARG, 0); }
		public WordAttrExprContext wordAttrExpr() {
			return getRuleContext(WordAttrExprContext.class,0);
		}
		public CatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterCat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitCat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitCat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatContext cat() throws RecognitionException {
		CatContext _localctx = new CatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((CatContext)_localctx).catName = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << ID) | (1L << ID_PATH) | (1L << MACROARG))) != 0)) ) {
				((CatContext)_localctx).catName = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(191);
				match(T__18);
				setState(192);
				wordAttrExpr();
				setState(193);
				match(T__19);
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

	public static class WordAttrExprContext extends ParserRuleContext {
		public WordAttrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordAttrExpr; }
	 
		public WordAttrExprContext() { }
		public void copyFrom(WordAttrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordAttrExprOrContext extends WordAttrExprContext {
		public List<WordAttrBranchContext> wordAttrBranch() {
			return getRuleContexts(WordAttrBranchContext.class);
		}
		public WordAttrBranchContext wordAttrBranch(int i) {
			return getRuleContext(WordAttrBranchContext.class,i);
		}
		public WordAttrExprOrContext(WordAttrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterWordAttrExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitWordAttrExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitWordAttrExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WordAttrExprAndContext extends WordAttrExprContext {
		public List<WordAttrUnitContext> wordAttrUnit() {
			return getRuleContexts(WordAttrUnitContext.class);
		}
		public WordAttrUnitContext wordAttrUnit(int i) {
			return getRuleContext(WordAttrUnitContext.class,i);
		}
		public WordAttrExprAndContext(WordAttrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterWordAttrExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitWordAttrExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitWordAttrExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WordAttrExprUnitContext extends WordAttrExprContext {
		public WordAttrUnitContext wordAttrUnit() {
			return getRuleContext(WordAttrUnitContext.class,0);
		}
		public WordAttrExprUnitContext(WordAttrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterWordAttrExprUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitWordAttrExprUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitWordAttrExprUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordAttrExprContext wordAttrExpr() throws RecognitionException {
		WordAttrExprContext _localctx = new WordAttrExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_wordAttrExpr);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new WordAttrExprAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				wordAttrUnit();
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(198);
					match(T__15);
					setState(199);
					wordAttrUnit();
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__15 );
				}
				break;
			case 2:
				_localctx = new WordAttrExprOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				wordAttrBranch();
				{
				setState(205);
				match(T__16);
				setState(206);
				wordAttrBranch();
				}
				}
				break;
			case 3:
				_localctx = new WordAttrExprUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				wordAttrUnit();
				}
				break;
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

	public static class WordAttrBranchContext extends ParserRuleContext {
		public List<WordAttrUnitContext> wordAttrUnit() {
			return getRuleContexts(WordAttrUnitContext.class);
		}
		public WordAttrUnitContext wordAttrUnit(int i) {
			return getRuleContext(WordAttrUnitContext.class,i);
		}
		public WordAttrBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordAttrBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterWordAttrBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitWordAttrBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitWordAttrBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordAttrBranchContext wordAttrBranch() throws RecognitionException {
		WordAttrBranchContext _localctx = new WordAttrBranchContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_wordAttrBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			wordAttrUnit();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(212);
				match(T__15);
				setState(213);
				wordAttrUnit();
				}
				}
				setState(218);
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

	public static class WordAttrContext extends ParserRuleContext {
		public Token attrName;
		public Token attrValue;
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public List<TerminalNode> MACROARG() { return getTokens(SenseParser.MACROARG); }
		public TerminalNode MACROARG(int i) {
			return getToken(SenseParser.MACROARG, i);
		}
		public TerminalNode STRING() { return getToken(SenseParser.STRING, 0); }
		public WordAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterWordAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitWordAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitWordAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordAttrContext wordAttr() throws RecognitionException {
		WordAttrContext _localctx = new WordAttrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wordAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			((WordAttrContext)_localctx).attrName = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==MACROARG) ) {
				((WordAttrContext)_localctx).attrName = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(220);
				match(T__12);
				setState(221);
				((WordAttrContext)_localctx).attrValue = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==MACROARG) ) {
					((WordAttrContext)_localctx).attrValue = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class WordAttrUnitContext extends ParserRuleContext {
		public Token not;
		public WordAttrContext wordAttr() {
			return getRuleContext(WordAttrContext.class,0);
		}
		public WordAttrUnitContext wordAttrUnit() {
			return getRuleContext(WordAttrUnitContext.class,0);
		}
		public WordAttrExprContext wordAttrExpr() {
			return getRuleContext(WordAttrExprContext.class,0);
		}
		public WordAttrUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordAttrUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterWordAttrUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitWordAttrUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitWordAttrUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordAttrUnitContext wordAttrUnit() throws RecognitionException {
		WordAttrUnitContext _localctx = new WordAttrUnitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_wordAttrUnit);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case MACROARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				wordAttr();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				((WordAttrUnitContext)_localctx).not = match(T__8);
				setState(226);
				wordAttrUnit();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(T__10);
				setState(228);
				wordAttrExpr();
				setState(229);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SenseParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SenseParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(SenseParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(SenseParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(FLOAT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(BOOLEAN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(STRING);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				array();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				dict();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__13);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__18) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(242);
				value();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(243);
					match(T__4);
					setState(244);
					value();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(252);
			match(T__14);
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

	public static class DictContext extends ParserRuleContext {
		public List<DictItemContext> dictItem() {
			return getRuleContexts(DictItemContext.class);
		}
		public DictItemContext dictItem(int i) {
			return getRuleContext(DictItemContext.class,i);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dict);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__18);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==ID) {
				{
				setState(255);
				dictItem();
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(256);
						match(T__4);
						setState(257);
						dictItem();
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(263);
					match(T__4);
					}
				}

				}
			}

			setState(268);
			match(T__19);
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

	public static class DictItemContext extends ParserRuleContext {
		public Token key;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SenseParser.STRING, 0); }
		public DictItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterDictItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitDictItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitDictItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictItemContext dictItem() throws RecognitionException {
		DictItemContext _localctx = new DictItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dictItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			((DictItemContext)_localctx).key = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
				((DictItemContext)_localctx).key = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(271);
			match(T__7);
			setState(272);
			value();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSequenceContext extends ExprContext {
		public List<RepUnitContext> repUnit() {
			return getRuleContexts(RepUnitContext.class);
		}
		public RepUnitContext repUnit(int i) {
			return getRuleContext(RepUnitContext.class,i);
		}
		public ExprSequenceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterExprSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitExprSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitExprSequence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUnitContext extends ExprContext {
		public RepUnitContext repUnit() {
			return getRuleContext(RepUnitContext.class,0);
		}
		public ExprUnitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterExprUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitExprUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitExprUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprChoiceContext extends ExprContext {
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public ExprChoiceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterExprChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitExprChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitExprChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new ExprSequenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				repUnit();
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					repUnit();
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__10) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << STRING) | (1L << ID) | (1L << NAMESPACE) | (1L << REGEX))) != 0) );
				}
				break;
			case 2:
				_localctx = new ExprChoiceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				branch();
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(281);
					match(T__16);
					setState(282);
					branch();
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__16 );
				}
				break;
			case 3:
				_localctx = new ExprUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				repUnit();
				}
				break;
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

	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	 
		public UnitContext() { }
		public void copyFrom(UnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnitTagsContext extends UnitContext {
		public List<TerminalNode> ID() { return getTokens(SenseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SenseParser.ID, i);
		}
		public UnitTagsContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitTags(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitCharListContext extends UnitContext {
		public TerminalNode STRING() { return getToken(SenseParser.STRING, 0); }
		public UnitCharListContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitCharList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitCharList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitCharList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitNoskipContext extends UnitContext {
		public UnitNoskipContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitNoskip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitNoskip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitNoskip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitParenthesisContext extends UnitContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnitParenthesisContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitRegexContext extends UnitContext {
		public TerminalNode REGEX() { return getToken(SenseParser.REGEX, 0); }
		public UnitRegexContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitRegex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitLookaheadLiteralContext extends UnitContext {
		public Token op;
		public TerminalNode STRING() { return getToken(SenseParser.STRING, 0); }
		public UnitLookaheadLiteralContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitLookaheadLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitLookaheadLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitLookaheadLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitLiteralContext extends UnitContext {
		public TerminalNode STRING() { return getToken(SenseParser.STRING, 0); }
		public UnitLiteralContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitPrimeContext extends UnitContext {
		public Token alias;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public UnitPrimeContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitPrime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitPrime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitPrime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitReferenceContext extends UnitContext {
		public Token alias;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public UnitReferenceContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitAnyCharContext extends UnitContext {
		public UnitAnyCharContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterUnitAnyChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitUnitAnyChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitUnitAnyChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unit);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new UnitLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(STRING);
				}
				break;
			case T__20:
				_localctx = new UnitCharListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__20);
				setState(292);
				match(STRING);
				}
				break;
			case T__21:
			case T__22:
				_localctx = new UnitLookaheadLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				((UnitLookaheadLiteralContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
					((UnitLookaheadLiteralContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				match(STRING);
				}
				break;
			case ID:
			case NAMESPACE:
				_localctx = new UnitReferenceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				qualifiedName();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(296);
					match(T__12);
					setState(297);
					((UnitReferenceContext)_localctx).alias = match(ID);
					}
				}

				}
				break;
			case T__5:
				_localctx = new UnitPrimeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				match(T__5);
				setState(301);
				qualifiedName();
				setState(302);
				match(T__6);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(303);
					match(T__12);
					setState(304);
					((UnitPrimeContext)_localctx).alias = match(ID);
					}
				}

				}
				break;
			case T__10:
				_localctx = new UnitParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				match(T__10);
				setState(308);
				expr();
				setState(309);
				match(T__11);
				}
				break;
			case T__23:
				_localctx = new UnitAnyCharContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new UnitTagsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				match(T__24);
				setState(313);
				match(ID);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(314);
					match(T__16);
					setState(315);
					match(ID);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(T__19);
				}
				break;
			case REGEX:
				_localctx = new UnitRegexContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(322);
				match(REGEX);
				}
				break;
			case T__25:
				_localctx = new UnitNoskipContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(323);
				match(T__25);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SenseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SenseParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(ID);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(327);
				match(T__4);
				setState(328);
				match(ID);
				}
				}
				setState(333);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(334);
				namespace();
				setState(335);
				match(T__3);
				}
				break;
			}
			setState(339);
			match(ID);
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenseParser.ID, 0); }
		public TerminalNode NAMESPACE() { return getToken(SenseParser.NAMESPACE, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NAMESPACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class RepContext extends ParserRuleContext {
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
	 
		public RepContext() { }
		public void copyFrom(RepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RepZeroOrOneContext extends RepContext {
		public RepZeroOrOneContext(RepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterRepZeroOrOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitRepZeroOrOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitRepZeroOrOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepOneOrMoreContext extends RepContext {
		public RepOneOrMoreContext(RepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterRepOneOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitRepOneOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitRepOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepRangeContext extends RepContext {
		public Token minCount;
		public Token sep;
		public Token maxCount;
		public List<TerminalNode> INT() { return getTokens(SenseParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SenseParser.INT, i);
		}
		public RepRangeContext(RepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterRepRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitRepRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitRepRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepPreferContext extends RepContext {
		public RepPreferContext(RepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterRepPrefer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitRepPrefer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitRepPrefer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepZeroOrMoreContext extends RepContext {
		public RepZeroOrMoreContext(RepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterRepZeroOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitRepZeroOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitRepZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rep);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new RepOneOrMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(T__26);
				}
				break;
			case T__17:
				_localctx = new RepZeroOrMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(T__17);
				}
				break;
			case T__27:
				_localctx = new RepZeroOrOneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(T__27);
				}
				break;
			case T__15:
				_localctx = new RepPreferContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				match(T__15);
				}
				break;
			case T__18:
				_localctx = new RepRangeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				match(T__18);
				setState(357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(348);
					((RepRangeContext)_localctx).minCount = match(INT);
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(349);
						((RepRangeContext)_localctx).sep = match(T__4);
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT) {
							{
							setState(350);
							((RepRangeContext)_localctx).maxCount = match(INT);
							}
						}

						}
					}

					}
					break;
				case T__4:
					{
					setState(355);
					match(T__4);
					setState(356);
					((RepRangeContext)_localctx).maxCount = match(INT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(359);
				match(T__19);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RepUnitContext extends ParserRuleContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public RepUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterRepUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitRepUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitRepUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepUnitContext repUnit() throws RecognitionException {
		RepUnitContext _localctx = new RepUnitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_repUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			unit();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				setState(363);
				rep();
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

	public static class BranchContext extends ParserRuleContext {
		public List<RepUnitContext> repUnit() {
			return getRuleContexts(RepUnitContext.class);
		}
		public RepUnitContext repUnit(int i) {
			return getRuleContext(RepUnitContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenseListener ) ((SenseListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenseVisitor ) return ((SenseVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(366);
				repUnit();
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__10) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << STRING) | (1L << ID) | (1L << NAMESPACE) | (1L << REGEX))) != 0) );
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
		"\u0004\u0001*\u0174\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002W\b\u0002"+
		"\n\u0002\f\u0002Z\t\u0002\u0003\u0002\\\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0005\u0003a\b\u0003\n\u0003\f\u0003d\t\u0003\u0001\u0003"+
		"\u0003\u0003g\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003o\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0005\u0004t\b\u0004\n\u0004\f\u0004w\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004}\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0087\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u008d\b\u0007\n\u0007\f\u0007\u0090\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\n\u00a0\b\n\u000b\n\f"+
		"\n\u00a1\u0001\n\u0001\n\u0001\n\u0004\n\u00a7\b\n\u000b\n\f\n\u00a8\u0001"+
		"\n\u0003\n\u00ac\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b5\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ba\b\f\n\f\f\f\u00bd\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00c4\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u00c9\b\u000e\u000b\u000e\f\u000e\u00ca\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d2\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d7\b\u000f\n\u000f\f\u000f"+
		"\u00da\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00df\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00e8\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f0\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00f6\b\u0013\n"+
		"\u0013\f\u0013\u00f9\t\u0013\u0003\u0013\u00fb\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0103"+
		"\b\u0014\n\u0014\f\u0014\u0106\t\u0014\u0001\u0014\u0003\u0014\u0109\b"+
		"\u0014\u0003\u0014\u010b\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0004\u0016\u0115"+
		"\b\u0016\u000b\u0016\f\u0016\u0116\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0004\u0016\u011c\b\u0016\u000b\u0016\f\u0016\u011d\u0001\u0016\u0003"+
		"\u0016\u0121\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u012b\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0132"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u013d\b\u0017\n"+
		"\u0017\f\u0017\u0140\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0145\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u014a"+
		"\b\u0018\n\u0018\f\u0018\u014d\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0152\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0160\b\u001b\u0003\u001b\u0162\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0166\b\u001b\u0001\u001b\u0003"+
		"\u001b\u0169\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u016d\b\u001c"+
		"\u0001\u001d\u0004\u001d\u0170\b\u001d\u000b\u001d\f\u001d\u0171\u0001"+
		"\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0006\u0002"+
		"\u0000\u0012\u0012\"$\u0002\u0000\"\"$$\u0002\u0000  $$\u0002\u0000  "+
		"\"\"\u0001\u0000\u0016\u0017\u0002\u0000\"\"%%\u0195\u0000<\u0001\u0000"+
		"\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000"+
		"\u0006b\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\n\u0080\u0001"+
		"\u0000\u0000\u0000\f\u0083\u0001\u0000\u0000\u0000\u000e\u0088\u0001\u0000"+
		"\u0000\u0000\u0010\u0093\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000"+
		"\u0000\u0000\u0014\u00ab\u0001\u0000\u0000\u0000\u0016\u00b4\u0001\u0000"+
		"\u0000\u0000\u0018\u00b6\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000"+
		"\u0000\u0000\u001c\u00d1\u0001\u0000\u0000\u0000\u001e\u00d3\u0001\u0000"+
		"\u0000\u0000 \u00db\u0001\u0000\u0000\u0000\"\u00e7\u0001\u0000\u0000"+
		"\u0000$\u00ef\u0001\u0000\u0000\u0000&\u00f1\u0001\u0000\u0000\u0000("+
		"\u00fe\u0001\u0000\u0000\u0000*\u010e\u0001\u0000\u0000\u0000,\u0120\u0001"+
		"\u0000\u0000\u0000.\u0144\u0001\u0000\u0000\u00000\u0146\u0001\u0000\u0000"+
		"\u00002\u0151\u0001\u0000\u0000\u00004\u0155\u0001\u0000\u0000\u00006"+
		"\u0168\u0001\u0000\u0000\u00008\u016a\u0001\u0000\u0000\u0000:\u016f\u0001"+
		"\u0000\u0000\u0000<@\u0003\u0002\u0001\u0000=?\u0003\u0004\u0002\u0000"+
		">=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AG\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CF\u0003\u0006\u0003\u0000DF\u0003\b\u0004\u0000EC\u0001\u0000"+
		"\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JK\u0005\u0000\u0000\u0001K\u0001\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u00034\u001a\u0000NO\u0005\u0002"+
		"\u0000\u0000O\u0003\u0001\u0000\u0000\u0000PQ\u0005\u0003\u0000\u0000"+
		"Q[\u00034\u001a\u0000RS\u0005\u0004\u0000\u0000SX\u0005\"\u0000\u0000"+
		"TU\u0005\u0005\u0000\u0000UW\u0005\"\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[R\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005"+
		"\u0002\u0000\u0000^\u0005\u0001\u0000\u0000\u0000_a\u0003\f\u0006\u0000"+
		"`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000eg\u0003\u0012\t\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0006\u0000\u0000ij\u0005"+
		"\"\u0000\u0000jk\u0005\u0007\u0000\u0000kl\u0005\b\u0000\u0000ln\u0003"+
		",\u0016\u0000mo\u0003\n\u0005\u0000nm\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005\u0002\u0000\u0000"+
		"q\u0007\u0001\u0000\u0000\u0000rt\u0003\f\u0006\u0000sr\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005"+
		"\"\u0000\u0000yz\u0005\b\u0000\u0000z|\u0003,\u0016\u0000{}\u0003\n\u0005"+
		"\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u0002\u0000\u0000\u007f\t\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\t\u0000\u0000\u0081\u0082\u0003,\u0016\u0000"+
		"\u0082\u000b\u0001\u0000\u0000\u0000\u0083\u0084\u0005\n\u0000\u0000\u0084"+
		"\u0086\u0005\"\u0000\u0000\u0085\u0087\u0003\u000e\u0007\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\r\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005\u000b\u0000\u0000\u0089\u008e\u0003"+
		"\u0010\b\u0000\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008d\u0003\u0010"+
		"\b\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\f\u0000\u0000\u0092\u000f\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005\"\u0000\u0000\u0094\u0095\u0005\r\u0000\u0000\u0095"+
		"\u0096\u0003$\u0012\u0000\u0096\u0011\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\n\u0000\u0000\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u009a\u0003"+
		"\u0014\n\u0000\u009a\u009b\u0005\u000f\u0000\u0000\u009b\u0013\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0003\u0016\u000b\u0000\u009d\u009e\u0005\u0010"+
		"\u0000\u0000\u009e\u00a0\u0003\u0016\u000b\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00ac\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0003\u0018\f\u0000\u00a4\u00a5\u0005\u0011\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0018\f\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0003\u0016\u000b\u0000\u00ab\u009c\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a3\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u0015\u0001\u0000\u0000\u0000\u00ad\u00b5\u0003\u001a\r\u0000\u00ae"+
		"\u00af\u0005\t\u0000\u0000\u00af\u00b5\u0003\u0016\u000b\u0000\u00b0\u00b1"+
		"\u0005\u000b\u0000\u0000\u00b1\u00b2\u0003\u0014\n\u0000\u00b2\u00b3\u0005"+
		"\f\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b5\u0017\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003\u0016"+
		"\u000b\u0000\u00b7\u00b8\u0005\u0010\u0000\u0000\u00b8\u00ba\u0003\u0016"+
		"\u000b\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u0019\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00c3\u0007\u0000\u0000\u0000\u00bf\u00c0\u0005\u0013"+
		"\u0000\u0000\u00c0\u00c1\u0003\u001c\u000e\u0000\u00c1\u00c2\u0005\u0014"+
		"\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u001b\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c8\u0003\"\u0011\u0000\u00c6\u00c7\u0005\u0010\u0000"+
		"\u0000\u00c7\u00c9\u0003\"\u0011\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00d2\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0003\u001e\u000f\u0000\u00cd\u00ce\u0005\u0011\u0000\u0000"+
		"\u00ce\u00cf\u0003\u001e\u000f\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d2\u0003\"\u0011\u0000\u00d1\u00c5\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u001d\u0001\u0000\u0000\u0000\u00d3\u00d8\u0003\"\u0011\u0000\u00d4\u00d5"+
		"\u0005\u0010\u0000\u0000\u00d5\u00d7\u0003\"\u0011\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u001f\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0007"+
		"\u0001\u0000\u0000\u00dc\u00dd\u0005\r\u0000\u0000\u00dd\u00df\u0007\u0002"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df!\u0001\u0000\u0000\u0000\u00e0\u00e8\u0003 \u0010\u0000"+
		"\u00e1\u00e2\u0005\t\u0000\u0000\u00e2\u00e8\u0003\"\u0011\u0000\u00e3"+
		"\u00e4\u0005\u000b\u0000\u0000\u00e4\u00e5\u0003\u001c\u000e\u0000\u00e5"+
		"\u00e6\u0005\f\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e8#\u0001\u0000\u0000\u0000\u00e9\u00f0\u0005"+
		"\u001d\u0000\u0000\u00ea\u00f0\u0005\u001e\u0000\u0000\u00eb\u00f0\u0005"+
		"\u001f\u0000\u0000\u00ec\u00f0\u0005 \u0000\u0000\u00ed\u00f0\u0003&\u0013"+
		"\u0000\u00ee\u00f0\u0003(\u0014\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ea\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0%\u0001\u0000\u0000\u0000\u00f1"+
		"\u00fa\u0005\u000e\u0000\u0000\u00f2\u00f7\u0003$\u0012\u0000\u00f3\u00f4"+
		"\u0005\u0005\u0000\u0000\u00f4\u00f6\u0003$\u0012\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f2\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005\u000f\u0000\u0000\u00fd\'\u0001\u0000"+
		"\u0000\u0000\u00fe\u010a\u0005\u0013\u0000\u0000\u00ff\u0104\u0003*\u0015"+
		"\u0000\u0100\u0101\u0005\u0005\u0000\u0000\u0101\u0103\u0003*\u0015\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"+
		"\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0107\u0109\u0005\u0005\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000"+
		"\u010a\u00ff\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0014\u0000\u0000"+
		"\u010d)\u0001\u0000\u0000\u0000\u010e\u010f\u0007\u0003\u0000\u0000\u010f"+
		"\u0110\u0005\b\u0000\u0000\u0110\u0111\u0003$\u0012\u0000\u0111+\u0001"+
		"\u0000\u0000\u0000\u0112\u0114\u00038\u001c\u0000\u0113\u0115\u00038\u001c"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0121\u0001\u0000\u0000\u0000\u0118\u011b\u0003:\u001d\u0000"+
		"\u0119\u011a\u0005\u0011\u0000\u0000\u011a\u011c\u0003:\u001d\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"\u0121\u0001\u0000\u0000\u0000\u011f\u0121\u00038\u001c\u0000\u0120\u0112"+
		"\u0001\u0000\u0000\u0000\u0120\u0118\u0001\u0000\u0000\u0000\u0120\u011f"+
		"\u0001\u0000\u0000\u0000\u0121-\u0001\u0000\u0000\u0000\u0122\u0145\u0005"+
		" \u0000\u0000\u0123\u0124\u0005\u0015\u0000\u0000\u0124\u0145\u0005 \u0000"+
		"\u0000\u0125\u0126\u0007\u0004\u0000\u0000\u0126\u0145\u0005 \u0000\u0000"+
		"\u0127\u012a\u00032\u0019\u0000\u0128\u0129\u0005\r\u0000\u0000\u0129"+
		"\u012b\u0005\"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b\u0145\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0005\u0006\u0000\u0000\u012d\u012e\u00032\u0019\u0000\u012e\u0131\u0005"+
		"\u0007\u0000\u0000\u012f\u0130\u0005\r\u0000\u0000\u0130\u0132\u0005\""+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0145\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u000b"+
		"\u0000\u0000\u0134\u0135\u0003,\u0016\u0000\u0135\u0136\u0005\f\u0000"+
		"\u0000\u0136\u0145\u0001\u0000\u0000\u0000\u0137\u0145\u0005\u0018\u0000"+
		"\u0000\u0138\u0139\u0005\u0019\u0000\u0000\u0139\u013e\u0005\"\u0000\u0000"+
		"\u013a\u013b\u0005\u0011\u0000\u0000\u013b\u013d\u0005\"\u0000\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0141\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141"+
		"\u0145\u0005\u0014\u0000\u0000\u0142\u0145\u0005*\u0000\u0000\u0143\u0145"+
		"\u0005\u001a\u0000\u0000\u0144\u0122\u0001\u0000\u0000\u0000\u0144\u0123"+
		"\u0001\u0000\u0000\u0000\u0144\u0125\u0001\u0000\u0000\u0000\u0144\u0127"+
		"\u0001\u0000\u0000\u0000\u0144\u012c\u0001\u0000\u0000\u0000\u0144\u0133"+
		"\u0001\u0000\u0000\u0000\u0144\u0137\u0001\u0000\u0000\u0000\u0144\u0138"+
		"\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0143"+
		"\u0001\u0000\u0000\u0000\u0145/\u0001\u0000\u0000\u0000\u0146\u014b\u0005"+
		"\"\u0000\u0000\u0147\u0148\u0005\u0005\u0000\u0000\u0148\u014a\u0005\""+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c1\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u00034\u001a\u0000\u014f\u0150\u0005\u0004\u0000\u0000"+
		"\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014e\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0005\"\u0000\u0000\u01543\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0007\u0005\u0000\u0000\u01565\u0001\u0000\u0000\u0000\u0157\u0169"+
		"\u0005\u001b\u0000\u0000\u0158\u0169\u0005\u0012\u0000\u0000\u0159\u0169"+
		"\u0005\u001c\u0000\u0000\u015a\u0169\u0005\u0010\u0000\u0000\u015b\u0165"+
		"\u0005\u0013\u0000\u0000\u015c\u0161\u0005\u001d\u0000\u0000\u015d\u015f"+
		"\u0005\u0005\u0000\u0000\u015e\u0160\u0005\u001d\u0000\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162"+
		"\u0001\u0000\u0000\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0166\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0005\u0005\u0000\u0000\u0164\u0166\u0005\u001d\u0000\u0000\u0165\u015c"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0005\u0014\u0000\u0000\u0168\u0157"+
		"\u0001\u0000\u0000\u0000\u0168\u0158\u0001\u0000\u0000\u0000\u0168\u0159"+
		"\u0001\u0000\u0000\u0000\u0168\u015a\u0001\u0000\u0000\u0000\u0168\u015b"+
		"\u0001\u0000\u0000\u0000\u01697\u0001\u0000\u0000\u0000\u016a\u016c\u0003"+
		".\u0017\u0000\u016b\u016d\u00036\u001b\u0000\u016c\u016b\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d9\u0001\u0000\u0000\u0000"+
		"\u016e\u0170\u00038\u001c\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172;\u0001\u0000\u0000\u0000,@EGX[bf"+
		"nu|\u0086\u008e\u00a1\u00a8\u00ab\u00b4\u00bb\u00c3\u00ca\u00d1\u00d8"+
		"\u00de\u00e7\u00ef\u00f7\u00fa\u0104\u0108\u010a\u0116\u011d\u0120\u012a"+
		"\u0131\u013e\u0144\u014b\u0151\u015f\u0161\u0165\u0168\u016c\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}