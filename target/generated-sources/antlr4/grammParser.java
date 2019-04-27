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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, QUANTITATIVE=7, OBJECT=8, 
		RELOP=9, UNITSOFTIME=10, LOGICALOPERATOR=11, XML=12, NUMBER=13, NAME=14, 
		WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'of'", "'events occur'", "'having'", "'subcheck-Validation Failed Authentication SSH login Failed'", 
		"'for'", "'if'", "QUANTITATIVE", "OBJECT", "RELOP", "UNITSOFTIME", "LOGICALOPERATOR", 
		"XML", "NUMBER", "NAME", "WS"
	};
	public static final int
		RULE_corrule = 0, RULE_body = 1, RULE_mainCondition = 2, RULE_complement = 3, 
		RULE_number = 4, RULE_units = 5, RULE_name = 6, RULE_events = 7, RULE_condition = 8;
	public static final String[] ruleNames = {
		"corrule", "body", "mainCondition", "complement", "number", "units", "name", 
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
		public ComplementContext complement(int i) {
			return getRuleContext(ComplementContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> LOGICALOPERATOR() { return getTokens(grammParser.LOGICALOPERATOR); }
		public TerminalNode LOGICALOPERATOR(int i) {
			return getToken(grammParser.LOGICALOPERATOR, i);
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
			setState(18); match(T__0);
			setState(19); body();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(20); match(LOGICALOPERATOR);
				setState(21); match(T__0);
				setState(22); complement();
				}
				}
				setState(27);
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
		public TerminalNode QUANTITATIVE() { return getToken(grammParser.QUANTITATIVE, 0); }
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
			setState(28); match(QUANTITATIVE);
			setState(29); match(T__5);
			setState(30); mainCondition();
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
			setState(32); match(T__2);
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
		enterRule(_localctx, 6, RULE_complement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(RELOP);
			setState(35); number();
			setState(36); units();
			setState(37); events();
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
		enterRule(_localctx, 8, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(NUMBER);
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
		enterRule(_localctx, 10, RULE_units);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(UNITSOFTIME);
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
		enterRule(_localctx, 12, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(NAME);
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
		enterRule(_localctx, 14, RULE_events);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(RELOP);
			setState(46); match(NUMBER);
			setState(47); match(T__4);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); condition();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==LOGICALOPERATOR );
			setState(53); match(XML);
			setState(54); match(T__1);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55); name();
				}
				}
				setState(58); 
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
		public TerminalNode OBJECT() { return getToken(grammParser.OBJECT, 0); }
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
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(60); match(LOGICALOPERATOR);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(T__3);
			setState(67); match(QUANTITATIVE);
			setState(68); match(OBJECT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\6\t\64\n\t\r\t\16\t"+
		"\65\3\t\3\t\3\t\6\t;\n\t\r\t\16\t<\3\n\7\n@\n\n\f\n\16\nC\13\n\3\n\3\n"+
		"\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2C\2\24\3\2\2\2\4\36\3\2\2"+
		"\2\6\"\3\2\2\2\b$\3\2\2\2\n)\3\2\2\2\f+\3\2\2\2\16-\3\2\2\2\20/\3\2\2"+
		"\2\22A\3\2\2\2\24\25\7\b\2\2\25\33\5\4\3\2\26\27\7\r\2\2\27\30\7\b\2\2"+
		"\30\32\5\b\5\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\3\3\2\2\2\35\33\3\2\2\2\36\37\7\t\2\2\37 \7\3\2\2 !\5\6\4\2!\5\3\2"+
		"\2\2\"#\7\6\2\2#\7\3\2\2\2$%\7\13\2\2%&\5\n\6\2&\'\5\f\7\2\'(\5\20\t\2"+
		"(\t\3\2\2\2)*\7\17\2\2*\13\3\2\2\2+,\7\f\2\2,\r\3\2\2\2-.\7\20\2\2.\17"+
		"\3\2\2\2/\60\7\13\2\2\60\61\7\17\2\2\61\63\7\4\2\2\62\64\5\22\n\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7"+
		"\16\2\28:\7\7\2\29;\5\16\b\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"\21\3\2\2\2>@\7\r\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2"+
		"\2CA\3\2\2\2DE\7\5\2\2EF\7\t\2\2FG\7\n\2\2G\23\3\2\2\2\6\33\65<A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}