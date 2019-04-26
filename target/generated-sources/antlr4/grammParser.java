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
		T__2=1, T__1=2, T__0=3, LOGICALOPERATOR=4, XML=5, NAME=6, EVENTS=7, CONDITION=8, 
		OBJECT=9, TIME=10, UNITSOFTIME=11, RELATIONALOPERATOR=12, QUANTITATIVE=13, 
		NUMBER=14, NEWLINE=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'of'", "'subcheck-Validation Failed Authentication SSH login Failed'", 
		"'if'", "LOGICALOPERATOR", "'XML'", "NAME", "EVENTS", "CONDITION", "OBJECT", 
		"TIME", "UNITSOFTIME", "RELATIONALOPERATOR", "QUANTITATIVE", "NUMBER", 
		"NEWLINE", "WS"
	};
	public static final int
		RULE_corrule = 0, RULE_body = 1, RULE_xml = 2, RULE_mainCondition = 3;
	public static final String[] ruleNames = {
		"corrule", "body", "xml", "mainCondition"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); match(T__0);
			setState(9); body();
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
		public TerminalNode NUMBER(int i) {
			return getToken(grammParser.NUMBER, i);
		}
		public TerminalNode EVENTS() { return getToken(grammParser.EVENTS, 0); }
		public TerminalNode NAME() { return getToken(grammParser.NAME, 0); }
		public List<TerminalNode> RELATIONALOPERATOR() { return getTokens(grammParser.RELATIONALOPERATOR); }
		public TerminalNode CONDITION() { return getToken(grammParser.CONDITION, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(grammParser.NUMBER); }
		public XmlContext xml() {
			return getRuleContext(XmlContext.class,0);
		}
		public TerminalNode LOGICALOPERATOR() { return getToken(grammParser.LOGICALOPERATOR, 0); }
		public TerminalNode RELATIONALOPERATOR(int i) {
			return getToken(grammParser.RELATIONALOPERATOR, i);
		}
		public TerminalNode UNITSOFTIME() { return getToken(grammParser.UNITSOFTIME, 0); }
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
			setState(11); match(QUANTITATIVE);
			setState(12); match(T__2);
			setState(13); mainCondition();
			{
			setState(14); match(LOGICALOPERATOR);
			setState(15); match(T__0);
			setState(16); match(RELATIONALOPERATOR);
			setState(17); match(NUMBER);
			setState(18); match(UNITSOFTIME);
			setState(19); match(RELATIONALOPERATOR);
			setState(20); match(NUMBER);
			setState(21); match(EVENTS);
			setState(22); match(CONDITION);
			setState(23); xml();
			setState(24); match(NAME);
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

	public static class XmlContext extends ParserRuleContext {
		public TerminalNode XML() { return getToken(grammParser.XML, 0); }
		public XmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterXml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitXml(this);
		}
	}

	public final XmlContext xml() throws RecognitionException {
		XmlContext _localctx = new XmlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_xml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(XML);
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
		enterRule(_localctx, 6, RULE_mainCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(T__1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22!\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\34\2\n\3\2"+
		"\2\2\4\r\3\2\2\2\6\34\3\2\2\2\b\36\3\2\2\2\n\13\7\5\2\2\13\f\5\4\3\2\f"+
		"\3\3\2\2\2\r\16\7\17\2\2\16\17\7\3\2\2\17\20\5\b\5\2\20\21\7\6\2\2\21"+
		"\22\7\5\2\2\22\23\7\16\2\2\23\24\7\20\2\2\24\25\7\r\2\2\25\26\7\16\2\2"+
		"\26\27\7\20\2\2\27\30\7\t\2\2\30\31\7\n\2\2\31\32\5\6\4\2\32\33\7\b\2"+
		"\2\33\5\3\2\2\2\34\35\7\7\2\2\35\7\3\2\2\2\36\37\7\4\2\2\37\t\3\2\2\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}