// Generated from gramm.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, QUANTITATIVE=8, 
		OBJECT=9, RELOP=10, STATUS=11, UNITSOFTIME=12, LOGICALOPERATOR=13, XML=14, 
		NUMBER=15, NAME=16, WS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'subcheck-Validation'", "'of'", "'events occur'", "'Authentication SSH login Failed'", 
		"'having'", "'for'", "'if'", "QUANTITATIVE", "OBJECT", "RELOP", "STATUS", 
		"UNITSOFTIME", "LOGICALOPERATOR", "XML", "NUMBER", "NAME", "WS"
	};
	public static final int
		RULE_corrule = 0, RULE_body = 1, RULE_mainCondition = 2, RULE_mainConditionName = 3, 
		RULE_mainBodyOperator = 4, RULE_status = 5, RULE_qualifier = 6, RULE_statusAux = 7, 
		RULE_complement = 8, RULE_number = 9, RULE_units = 10, RULE_name = 11, 
		RULE_object = 12, RULE_events = 13, RULE_condition = 14;
	public static final String[] ruleNames = {
		"corrule", "body", "mainCondition", "mainConditionName", "mainBodyOperator", 
		"status", "qualifier", "statusAux", "complement", "number", "units", "name", 
		"object", "events", "condition"
	};

	@Override
	public String getGrammarFileName() { return "gramm.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CorruleContext extends ParserRuleContext {
		public List<ComplementContext> complement() {
			return getRuleContexts(ComplementContext.class);
		}
		public MainBodyOperatorContext mainBodyOperator(int i) {
			return getRuleContext(MainBodyOperatorContext.class,i);
		}
		public List<MainBodyOperatorContext> mainBodyOperator() {
			return getRuleContexts(MainBodyOperatorContext.class);
		}
		public ComplementContext complement(int i) {
			return getRuleContext(ComplementContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public CorruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterCorrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitCorrule(this);
		}
	}

	public final CorruleContext corrule() throws RecognitionException {
		CorruleContext _localctx = new CorruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_corrule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(T__0);
			setState(31); body();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(32); mainBodyOperator();
				setState(33); match(T__0);
				setState(34); complement();
				}
				}
				setState(40);
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

	public static class BodyContext extends ParserRuleContext {
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public MainConditionContext mainCondition() {
			return getRuleContext(MainConditionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); qualifier();
			setState(42); match(T__5);
			setState(43); mainCondition();
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

	public static class MainConditionContext extends ParserRuleContext {
		public StatusAuxContext statusAux() {
			return getRuleContext(StatusAuxContext.class,0);
		}
		public MainConditionNameContext mainConditionName() {
			return getRuleContext(MainConditionNameContext.class,0);
		}
		public MainConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterMainCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitMainCondition(this);
		}
	}

	public final MainConditionContext mainCondition() throws RecognitionException {
		MainConditionContext _localctx = new MainConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); mainConditionName();
			setState(46); statusAux();
			setState(47); match(T__3);
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

	public static class MainConditionNameContext extends ParserRuleContext {
		public MainConditionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainConditionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterMainConditionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitMainConditionName(this);
		}
	}

	public final MainConditionNameContext mainConditionName() throws RecognitionException {
		MainConditionNameContext _localctx = new MainConditionNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainConditionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(T__6);
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

	public static class MainBodyOperatorContext extends ParserRuleContext {
		public TerminalNode LOGICALOPERATOR() { return getToken(grammParser.LOGICALOPERATOR, 0); }
		public MainBodyOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBodyOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterMainBodyOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitMainBodyOperator(this);
		}
	}

	public final MainBodyOperatorContext mainBodyOperator() throws RecognitionException {
		MainBodyOperatorContext _localctx = new MainBodyOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainBodyOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(LOGICALOPERATOR);
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

	public static class StatusContext extends ParserRuleContext {
		public TerminalNode STATUS() { return getToken(grammParser.STATUS, 0); }
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitStatus(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(STATUS);
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

	public static class QualifierContext extends ParserRuleContext {
		public TerminalNode QUANTITATIVE() { return getToken(grammParser.QUANTITATIVE, 0); }
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitQualifier(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(QUANTITATIVE);
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

	public static class StatusAuxContext extends ParserRuleContext {
		public TerminalNode STATUS() { return getToken(grammParser.STATUS, 0); }
		public StatusAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterStatusAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitStatusAux(this);
		}
	}

	public final StatusAuxContext statusAux() throws RecognitionException {
		StatusAuxContext _localctx = new StatusAuxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statusAux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(STATUS);
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

	public static class ComplementContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RELOP() { return getToken(grammParser.RELOP, 0); }
		public EventsContext events() {
			return getRuleContext(EventsContext.class,0);
		}
		public UnitsContext units() {
			return getRuleContext(UnitsContext.class,0);
		}
		public ComplementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterComplement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitComplement(this);
		}
	}

	public final ComplementContext complement() throws RecognitionException {
		ComplementContext _localctx = new ComplementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_complement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(RELOP);
			setState(60); number();
			setState(61); units();
			setState(62); events();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(grammParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(NUMBER);
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

	public static class UnitsContext extends ParserRuleContext {
		public TerminalNode UNITSOFTIME() { return getToken(grammParser.UNITSOFTIME, 0); }
		public UnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_units; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitUnits(this);
		}
	}

	public final UnitsContext units() throws RecognitionException {
		UnitsContext _localctx = new UnitsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_units);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(UNITSOFTIME);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(grammParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(NAME);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(grammParser.OBJECT, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(OBJECT);
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

	public static class EventsContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(grammParser.RELOP, 0); }
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public TerminalNode NUMBER() { return getToken(grammParser.NUMBER, 0); }
		public TerminalNode XML() { return getToken(grammParser.XML, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public EventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_events; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitEvents(this);
		}
	}

	public final EventsContext events() throws RecognitionException {
		EventsContext _localctx = new EventsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_events);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(RELOP);
			setState(73); match(NUMBER);
			setState(74); match(T__4);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75); condition();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==LOGICALOPERATOR );
			setState(80); match(XML);
			setState(81); match(T__1);
			setState(82); status();
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83); name();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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

	public static class ConditionContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<TerminalNode> LOGICALOPERATOR() { return getTokens(grammParser.LOGICALOPERATOR); }
		public TerminalNode QUANTITATIVE() { return getToken(grammParser.QUANTITATIVE, 0); }
		public TerminalNode LOGICALOPERATOR(int i) {
			return getToken(grammParser.LOGICALOPERATOR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(88); match(LOGICALOPERATOR);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); match(T__2);
			setState(95); match(QUANTITATIVE);
			setState(96); object();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\6\17O\n\17\r\17\16\17P\3\17\3\17\3\17"+
		"\3\17\6\17W\n\17\r\17\16\17X\3\20\7\20\\\n\20\f\20\16\20_\13\20\3\20\3"+
		"\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2Y"+
		"\2 \3\2\2\2\4+\3\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2"+
		"\2\169\3\2\2\2\20;\3\2\2\2\22=\3\2\2\2\24B\3\2\2\2\26D\3\2\2\2\30F\3\2"+
		"\2\2\32H\3\2\2\2\34J\3\2\2\2\36]\3\2\2\2 !\7\t\2\2!(\5\4\3\2\"#\5\n\6"+
		"\2#$\7\t\2\2$%\5\22\n\2%\'\3\2\2\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3"+
		"\2\2\2)\3\3\2\2\2*(\3\2\2\2+,\5\16\b\2,-\7\4\2\2-.\5\6\4\2.\5\3\2\2\2"+
		"/\60\5\b\5\2\60\61\5\20\t\2\61\62\7\6\2\2\62\7\3\2\2\2\63\64\7\3\2\2\64"+
		"\t\3\2\2\2\65\66\7\17\2\2\66\13\3\2\2\2\678\7\r\2\28\r\3\2\2\29:\7\n\2"+
		"\2:\17\3\2\2\2;<\7\r\2\2<\21\3\2\2\2=>\7\f\2\2>?\5\24\13\2?@\5\26\f\2"+
		"@A\5\34\17\2A\23\3\2\2\2BC\7\21\2\2C\25\3\2\2\2DE\7\16\2\2E\27\3\2\2\2"+
		"FG\7\22\2\2G\31\3\2\2\2HI\7\13\2\2I\33\3\2\2\2JK\7\f\2\2KL\7\21\2\2LN"+
		"\7\5\2\2MO\5\36\20\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2"+
		"RS\7\20\2\2ST\7\b\2\2TV\5\f\7\2UW\5\30\r\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y\35\3\2\2\2Z\\\7\17\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^"+
		"\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\7\2\2ab\7\n\2\2bc\5\32\16\2c\37\3\2\2"+
		"\2\6(PX]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}