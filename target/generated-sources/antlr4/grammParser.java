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
		RULE_complement = 8, RULE_relopTime = 9, RULE_number = 10, RULE_units = 11, 
		RULE_name = 12, RULE_propertiesOperator = 13, RULE_object = 14, RULE_value = 15, 
		RULE_relop = 16, RULE_numberRelop = 17, RULE_events = 18, RULE_condition = 19;
	public static final String[] ruleNames = {
		"corrule", "body", "mainCondition", "mainConditionName", "mainBodyOperator", 
		"status", "qualifier", "statusAux", "complement", "relopTime", "number", 
		"units", "name", "propertiesOperator", "object", "value", "relop", "numberRelop", 
		"events", "condition"
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
			setState(40); match(T__0);
			setState(41); body();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(42); mainBodyOperator();
				setState(43); match(T__0);
				setState(44); complement();
				}
				}
				setState(50);
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
			setState(51); qualifier();
			setState(52); match(T__5);
			setState(53); mainCondition();
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
			setState(55); mainConditionName();
			setState(56); statusAux();
			setState(57); match(T__3);
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
			setState(59); match(T__6);
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
			setState(61); match(LOGICALOPERATOR);
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
			setState(63); match(STATUS);
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
			setState(65); match(QUANTITATIVE);
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
			setState(67); match(STATUS);
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
		public RelopTimeContext relopTime() {
			return getRuleContext(RelopTimeContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
			setState(69); relopTime();
			setState(70); number();
			setState(71); units();
			setState(72); events();
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

	public static class RelopTimeContext extends ParserRuleContext {
		public TerminalNode RELOP() { return getToken(grammParser.RELOP, 0); }
		public RelopTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relopTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterRelopTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitRelopTime(this);
		}
	}

	public final RelopTimeContext relopTime() throws RecognitionException {
		RelopTimeContext _localctx = new RelopTimeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relopTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(RELOP);
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
		enterRule(_localctx, 20, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(NUMBER);
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
		enterRule(_localctx, 22, RULE_units);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(UNITSOFTIME);
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
		enterRule(_localctx, 24, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(NAME);
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

	public static class PropertiesOperatorContext extends ParserRuleContext {
		public TerminalNode LOGICALOPERATOR() { return getToken(grammParser.LOGICALOPERATOR, 0); }
		public PropertiesOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterPropertiesOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitPropertiesOperator(this);
		}
	}

	public final PropertiesOperatorContext propertiesOperator() throws RecognitionException {
		PropertiesOperatorContext _localctx = new PropertiesOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertiesOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(LOGICALOPERATOR);
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
		enterRule(_localctx, 28, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(OBJECT);
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
		public TerminalNode QUANTITATIVE() { return getToken(grammParser.QUANTITATIVE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(QUANTITATIVE);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode RELOP() { return getToken(grammParser.RELOP, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(RELOP);
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

	public static class NumberRelopContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(grammParser.NUMBER, 0); }
		public NumberRelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRelop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterNumberRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitNumberRelop(this);
		}
	}

	public final NumberRelopContext numberRelop() throws RecognitionException {
		NumberRelopContext _localctx = new NumberRelopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numberRelop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(NUMBER);
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
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public NumberRelopContext numberRelop() {
			return getRuleContext(NumberRelopContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
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
		enterRule(_localctx, 36, RULE_events);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); relop();
			setState(93); numberRelop();
			setState(94); match(T__4);
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95); condition();
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==LOGICALOPERATOR );
			setState(100); match(XML);
			setState(101); match(T__1);
			setState(102); status();
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103); name();
				}
				}
				setState(106); 
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
		public List<PropertiesOperatorContext> propertiesOperator() {
			return getRuleContexts(PropertiesOperatorContext.class);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropertiesOperatorContext propertiesOperator(int i) {
			return getRuleContext(PropertiesOperatorContext.class,i);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
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
		enterRule(_localctx, 38, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(108); propertiesOperator();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114); match(T__2);
			setState(115); value();
			setState(116); object();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\7\2\61\n\2\f\2\16\2"+
		"\64\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\6\24"+
		"c\n\24\r\24\16\24d\3\24\3\24\3\24\3\24\6\24k\n\24\r\24\16\24l\3\25\7\25"+
		"p\n\25\f\25\16\25s\13\25\3\25\3\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\2h\2*\3\2\2\2\4\65\3\2\2\2\69\3\2\2\2"+
		"\b=\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16C\3\2\2\2\20E\3\2\2\2\22G\3\2\2\2"+
		"\24L\3\2\2\2\26N\3\2\2\2\30P\3\2\2\2\32R\3\2\2\2\34T\3\2\2\2\36V\3\2\2"+
		"\2 X\3\2\2\2\"Z\3\2\2\2$\\\3\2\2\2&^\3\2\2\2(q\3\2\2\2*+\7\t\2\2+\62\5"+
		"\4\3\2,-\5\n\6\2-.\7\t\2\2./\5\22\n\2/\61\3\2\2\2\60,\3\2\2\2\61\64\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\62\3\2\2\2\65\66\5"+
		"\16\b\2\66\67\7\4\2\2\678\5\6\4\28\5\3\2\2\29:\5\b\5\2:;\5\20\t\2;<\7"+
		"\6\2\2<\7\3\2\2\2=>\7\3\2\2>\t\3\2\2\2?@\7\17\2\2@\13\3\2\2\2AB\7\r\2"+
		"\2B\r\3\2\2\2CD\7\n\2\2D\17\3\2\2\2EF\7\r\2\2F\21\3\2\2\2GH\5\24\13\2"+
		"HI\5\26\f\2IJ\5\30\r\2JK\5&\24\2K\23\3\2\2\2LM\7\f\2\2M\25\3\2\2\2NO\7"+
		"\21\2\2O\27\3\2\2\2PQ\7\16\2\2Q\31\3\2\2\2RS\7\22\2\2S\33\3\2\2\2TU\7"+
		"\17\2\2U\35\3\2\2\2VW\7\13\2\2W\37\3\2\2\2XY\7\n\2\2Y!\3\2\2\2Z[\7\f\2"+
		"\2[#\3\2\2\2\\]\7\21\2\2]%\3\2\2\2^_\5\"\22\2_`\5$\23\2`b\7\5\2\2ac\5"+
		"(\25\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\20\2\2gh"+
		"\7\b\2\2hj\5\f\7\2ik\5\32\16\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2"+
		"m\'\3\2\2\2np\5\34\17\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2"+
		"\2\2sq\3\2\2\2tu\7\7\2\2uv\5 \21\2vw\5\36\20\2w)\3\2\2\2\6\62dlq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}