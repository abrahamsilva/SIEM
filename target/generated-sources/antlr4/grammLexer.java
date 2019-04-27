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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, QUANTITATIVE=7, OBJECT=8, 
		RELOP=9, UNITSOFTIME=10, LOGICALOPERATOR=11, XML=12, NUMBER=13, NAME=14, 
		WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "QUANTITATIVE", "OBJECT", 
		"RELOP", "UNITSOFTIME", "LOGICALOPERATOR", "XML", "NUMBER", "NAME", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u011c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00a1\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c0"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00e6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fb\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0102\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010a\n\r\3\16"+
		"\6\16\u010d\n\16\r\16\16\16\u010e\3\17\6\17\u0112\n\17\r\17\16\17\u0113"+
		"\3\20\6\20\u0117\n\20\r\20\16\20\u0118\3\20\3\20\2\2\21\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\3"+
		"\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u0131\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5$\3\2\2\2\7\61\3\2\2\2\t8\3\2\2"+
		"\2\13s\3\2\2\2\rw\3\2\2\2\17\u00a0\3\2\2\2\21\u00bf\3\2\2\2\23\u00e5\3"+
		"\2\2\2\25\u00fa\3\2\2\2\27\u0101\3\2\2\2\31\u0109\3\2\2\2\33\u010c\3\2"+
		"\2\2\35\u0111\3\2\2\2\37\u0116\3\2\2\2!\"\7q\2\2\"#\7h\2\2#\4\3\2\2\2"+
		"$%\7g\2\2%&\7x\2\2&\'\7g\2\2\'(\7p\2\2()\7v\2\2)*\7u\2\2*+\7\"\2\2+,\7"+
		"q\2\2,-\7e\2\2-.\7e\2\2./\7w\2\2/\60\7t\2\2\60\6\3\2\2\2\61\62\7j\2\2"+
		"\62\63\7c\2\2\63\64\7x\2\2\64\65\7k\2\2\65\66\7p\2\2\66\67\7i\2\2\67\b"+
		"\3\2\2\289\7u\2\29:\7w\2\2:;\7d\2\2;<\7e\2\2<=\7j\2\2=>\7g\2\2>?\7e\2"+
		"\2?@\7m\2\2@A\7/\2\2AB\7X\2\2BC\7c\2\2CD\7n\2\2DE\7k\2\2EF\7f\2\2FG\7"+
		"c\2\2GH\7v\2\2HI\7k\2\2IJ\7q\2\2JK\7p\2\2KL\7\"\2\2LM\7H\2\2MN\7c\2\2"+
		"NO\7k\2\2OP\7n\2\2PQ\7g\2\2QR\7f\2\2RS\7\"\2\2ST\7C\2\2TU\7w\2\2UV\7v"+
		"\2\2VW\7j\2\2WX\7g\2\2XY\7p\2\2YZ\7v\2\2Z[\7k\2\2[\\\7e\2\2\\]\7c\2\2"+
		"]^\7v\2\2^_\7k\2\2_`\7q\2\2`a\7p\2\2ab\7\"\2\2bc\7U\2\2cd\7U\2\2de\7J"+
		"\2\2ef\7\"\2\2fg\7n\2\2gh\7q\2\2hi\7i\2\2ij\7k\2\2jk\7p\2\2kl\7\"\2\2"+
		"lm\7H\2\2mn\7c\2\2no\7k\2\2op\7n\2\2pq\7g\2\2qr\7f\2\2r\n\3\2\2\2st\7"+
		"h\2\2tu\7q\2\2uv\7t\2\2v\f\3\2\2\2wx\7k\2\2xy\7h\2\2y\16\3\2\2\2z{\7c"+
		"\2\2{|\7p\2\2|\u00a1\7{\2\2}~\7u\2\2~\177\7q\2\2\177\u0080\7o\2\2\u0080"+
		"\u00a1\7g\2\2\u0081\u0082\7q\2\2\u0082\u0083\7p\2\2\u0083\u00a1\7g\2\2"+
		"\u0084\u0085\7v\2\2\u0085\u0086\7y\2\2\u0086\u00a1\7q\2\2\u0087\u0088"+
		"\7v\2\2\u0088\u0089\7j\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u00a1\7g\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\u00a1\7n\2\2"+
		"\u008f\u0090\7p\2\2\u0090\u0091\7q\2\2\u0091\u0092\7p\2\2\u0092\u00a1"+
		"\7g\2\2\u0093\u0094\7f\2\2\u0094\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096"+
		"\u0097\7h\2\2\u0097\u0098\7g\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009b\7p\2\2\u009b\u00a1\7v\2\2\u009c\u009d\7u\2\2\u009d\u009e"+
		"\7c\2\2\u009e\u009f\7o\2\2\u009f\u00a1\7g\2\2\u00a0z\3\2\2\2\u00a0}\3"+
		"\2\2\2\u00a0\u0081\3\2\2\2\u00a0\u0084\3\2\2\2\u00a0\u0087\3\2\2\2\u00a0"+
		"\u008c\3\2\2\2\u00a0\u008f\3\2\2\2\u00a0\u0093\3\2\2\2\u00a0\u009c\3\2"+
		"\2\2\u00a1\20\3\2\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7o\2\2\u00a9\u00c0\7g\2\2\u00aa\u00ab\7k\2\2\u00ab\u00c0\7r\2\2"+
		"\u00ac\u00ad\7r\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7u\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00c0\7f\2\2\u00b4\u00b5\7k\2\2\u00b5\u00c0\7f\2\2\u00b6\u00b7\7u\2\2"+
		"\u00b7\u00b8\7q\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb"+
		"\7e\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00c0\7r\2\2\u00bf\u00a2\3\2\2\2\u00bf\u00aa\3\2\2\2\u00bf\u00ac\3\2"+
		"\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00b6\3\2\2\2\u00c0\22\3\2\2\2\u00c1\u00c2"+
		"\7n\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7u\2\2\u00c5"+
		"\u00c6\7\"\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7c\2"+
		"\2\u00c9\u00e6\7p\2\2\u00ca\u00cb\7i\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7j\2"+
		"\2\u00d4\u00d5\7c\2\2\u00d5\u00e6\7p\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7s\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\7v\2\2\u00de\u00e6\7q\2"+
		"\2\u00df\u00e0\7y\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3"+
		"\7j\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e6\7p\2\2\u00e5\u00c1\3\2\2\2\u00e5"+
		"\u00ca\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e5\u00df\3\2\2\2\u00e6\24\3\2\2"+
		"\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb"+
		"\7q\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7f\2\2\u00ed\u00fb\7u\2\2\u00ee"+
		"\u00ef\7o\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7w\2\2"+
		"\u00f2\u00f3\7v\2\2\u00f3\u00f4\7g\2\2\u00f4\u00fb\7u\2\2\u00f5\u00f6"+
		"\7j\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7t\2\2\u00f9"+
		"\u00fb\7u\2\2\u00fa\u00e7\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f5\3\2"+
		"\2\2\u00fb\26\3\2\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\u0102"+
		"\7f\2\2\u00ff\u0100\7q\2\2\u0100\u0102\7t\2\2\u0101\u00fc\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\30\3\2\2\2\u0103\u0104\7z\2\2\u0104\u0105\7o\2\2"+
		"\u0105\u010a\7n\2\2\u0106\u0107\7Z\2\2\u0107\u0108\7O\2\2\u0108\u010a"+
		"\7N\2\2\u0109\u0103\3\2\2\2\u0109\u0106\3\2\2\2\u010a\32\3\2\2\2\u010b"+
		"\u010d\t\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\34\3\2\2\2\u0110\u0112\t\3\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\36\3\2\2\2\u0115\u0117\t\4\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b"+
		"\b\20\2\2\u011b \3\2\2\2\f\2\u00a0\u00bf\u00e5\u00fa\u0101\u0109\u010e"+
		"\u0113\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}