// Generated from gramm.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, QUANTITATIVE=4, OBJECT=5, RELOP=6, UNITSOFTIME=7, 
		LOGICALOPERATOR=8, NUMBER=9, NAME=10, XML=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "QUANTITATIVE", "OBJECT", "RELOP", "UNITSOFTIME", 
		"LOGICALOPERATOR", "NUMBER", "NAME", "XML", "WS"
	};


	public grammLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramm.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u00fa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00a2\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c8\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00dd\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00e4\n\t\3\n\6\n\u00e7\n\n\r\n\16\n\u00e8\3\13\6\13\u00ec"+
		"\n\13\r\13\16\13\u00ed\3\f\3\f\3\f\3\f\3\r\6\r\u00f5\n\r\r\r\16\r\u00f6"+
		"\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\5\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u010e\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3"+
		"\33\3\2\2\2\5\36\3\2\2\2\7Y\3\2\2\2\t\u0082\3\2\2\2\13\u00a1\3\2\2\2\r"+
		"\u00c7\3\2\2\2\17\u00dc\3\2\2\2\21\u00e3\3\2\2\2\23\u00e6\3\2\2\2\25\u00eb"+
		"\3\2\2\2\27\u00ef\3\2\2\2\31\u00f4\3\2\2\2\33\34\7q\2\2\34\35\7h\2\2\35"+
		"\4\3\2\2\2\36\37\7u\2\2\37 \7w\2\2 !\7d\2\2!\"\7e\2\2\"#\7j\2\2#$\7g\2"+
		"\2$%\7e\2\2%&\7m\2\2&\'\7/\2\2\'(\7X\2\2()\7c\2\2)*\7n\2\2*+\7k\2\2+,"+
		"\7f\2\2,-\7c\2\2-.\7v\2\2./\7k\2\2/\60\7q\2\2\60\61\7p\2\2\61\62\7\"\2"+
		"\2\62\63\7H\2\2\63\64\7c\2\2\64\65\7k\2\2\65\66\7n\2\2\66\67\7g\2\2\67"+
		"8\7f\2\289\7\"\2\29:\7C\2\2:;\7w\2\2;<\7v\2\2<=\7j\2\2=>\7g\2\2>?\7p\2"+
		"\2?@\7v\2\2@A\7k\2\2AB\7e\2\2BC\7c\2\2CD\7v\2\2DE\7k\2\2EF\7q\2\2FG\7"+
		"p\2\2GH\7\"\2\2HI\7U\2\2IJ\7U\2\2JK\7J\2\2KL\7\"\2\2LM\7n\2\2MN\7q\2\2"+
		"NO\7i\2\2OP\7k\2\2PQ\7p\2\2QR\7\"\2\2RS\7H\2\2ST\7c\2\2TU\7k\2\2UV\7n"+
		"\2\2VW\7g\2\2WX\7f\2\2X\6\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\b\3\2\2\2\\]\7c\2"+
		"\2]^\7p\2\2^\u0083\7{\2\2_`\7u\2\2`a\7q\2\2ab\7o\2\2b\u0083\7g\2\2cd\7"+
		"q\2\2de\7p\2\2e\u0083\7g\2\2fg\7v\2\2gh\7y\2\2h\u0083\7q\2\2ij\7v\2\2"+
		"jk\7j\2\2kl\7t\2\2lm\7g\2\2m\u0083\7g\2\2no\7c\2\2op\7n\2\2p\u0083\7n"+
		"\2\2qr\7p\2\2rs\7q\2\2st\7p\2\2t\u0083\7g\2\2uv\7f\2\2vw\7k\2\2wx\7h\2"+
		"\2xy\7h\2\2yz\7g\2\2z{\7t\2\2{|\7g\2\2|}\7p\2\2}\u0083\7v\2\2~\177\7u"+
		"\2\2\177\u0080\7c\2\2\u0080\u0081\7o\2\2\u0081\u0083\7g\2\2\u0082\\\3"+
		"\2\2\2\u0082_\3\2\2\2\u0082c\3\2\2\2\u0082f\3\2\2\2\u0082i\3\2\2\2\u0082"+
		"n\3\2\2\2\u0082q\3\2\2\2\u0082u\3\2\2\2\u0082~\3\2\2\2\u0083\n\3\2\2\2"+
		"\u0084\u0085\7w\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7p\2\2\u0089\u008a\7c\2\2\u008a\u008b\7o\2\2\u008b"+
		"\u00a2\7g\2\2\u008c\u008d\7k\2\2\u008d\u00a2\7r\2\2\u008e\u008f\7r\2\2"+
		"\u008f\u0090\7c\2\2\u0090\u0091\7u\2\2\u0091\u0092\7u\2\2\u0092\u0093"+
		"\7y\2\2\u0093\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095\u00a2\7f\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u00a2\7f\2\2\u0098\u0099\7u\2\2\u0099\u009a\7q\2\2"+
		"\u009a\u009b\7w\2\2\u009b\u009c\7t\2\2\u009c\u009d\7e\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7\"\2\2\u009f\u00a0\7k\2\2\u00a0\u00a2\7r\2\2\u00a1"+
		"\u0084\3\2\2\2\u00a1\u008c\3\2\2\2\u00a1\u008e\3\2\2\2\u00a1\u0096\3\2"+
		"\2\2\u00a1\u0098\3\2\2\2\u00a2\f\3\2\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7c\2\2\u00ab\u00c8\7p\2\2"+
		"\u00ac\u00ad\7i\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00b4\7\"\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7c\2"+
		"\2\u00b7\u00c8\7p\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7s\2\2\u00ba\u00bb"+
		"\7w\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be"+
		"\u00bf\7\"\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c8\7q\2\2\u00c1\u00c2\7y\2"+
		"\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c8\7p\2\2\u00c7\u00a3\3\2\2\2\u00c7\u00ac\3\2\2\2\u00c7"+
		"\u00b8\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8\16\3\2\2\2\u00c9\u00ca\7u\2\2"+
		"\u00ca\u00cb\7g\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce"+
		"\7p\2\2\u00ce\u00cf\7f\2\2\u00cf\u00dd\7u\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7v\2\2"+
		"\u00d5\u00d6\7g\2\2\u00d6\u00dd\7u\2\2\u00d7\u00d8\7j\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7t\2\2\u00db\u00dd\7u\2\2\u00dc"+
		"\u00c9\3\2\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\20\3\2\2"+
		"\2\u00de\u00df\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e4\7f\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\u00e4\7t\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\22\3\2\2\2\u00e5\u00e7\t\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\24\3\2\2\2\u00ea\u00ec"+
		"\t\3\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\26\3\2\2\2\u00ef\u00f0\7Z\2\2\u00f0\u00f1\7O\2\2"+
		"\u00f1\u00f2\7N\2\2\u00f2\30\3\2\2\2\u00f3\u00f5\t\4\2\2\u00f4\u00f3\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\b\r\2\2\u00f9\32\3\2\2\2\13\2\u0082\u00a1\u00c7"+
		"\u00dc\u00e3\u00e8\u00ed\u00f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}