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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, QUANTITATIVE=8, 
		OBJECT=9, RELOP=10, STATUS=11, UNITSOFTIME=12, LOGICALOPERATOR=13, XML=14, 
		NUMBER=15, NAME=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "QUANTITATIVE", 
		"OBJECT", "RELOP", "STATUS", "UNITSOFTIME", "LOGICALOPERATOR", "XML", 
		"NUMBER", "NAME", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u0132\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u009e\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e3\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00fc\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0111\n\r\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0118\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0120\n\17\3\20\6\20"+
		"\u0123\n\20\r\20\16\20\u0124\3\21\6\21\u0128\n\21\r\21\16\21\u0129\3\22"+
		"\6\22\u012d\n\22\r\22\16\22\u012e\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5"+
		"\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u0149\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\59\3\2\2"+
		"\2\7<\3\2\2\2\tI\3\2\2\2\13i\3\2\2\2\rp\3\2\2\2\17t\3\2\2\2\21\u009d\3"+
		"\2\2\2\23\u00bc\3\2\2\2\25\u00e2\3\2\2\2\27\u00fb\3\2\2\2\31\u0110\3\2"+
		"\2\2\33\u0117\3\2\2\2\35\u011f\3\2\2\2\37\u0122\3\2\2\2!\u0127\3\2\2\2"+
		"#\u012c\3\2\2\2%&\7u\2\2&\'\7w\2\2\'(\7d\2\2()\7e\2\2)*\7j\2\2*+\7g\2"+
		"\2+,\7e\2\2,-\7m\2\2-.\7/\2\2./\7X\2\2/\60\7c\2\2\60\61\7n\2\2\61\62\7"+
		"k\2\2\62\63\7f\2\2\63\64\7c\2\2\64\65\7v\2\2\65\66\7k\2\2\66\67\7q\2\2"+
		"\678\7p\2\28\4\3\2\2\29:\7q\2\2:;\7h\2\2;\6\3\2\2\2<=\7g\2\2=>\7x\2\2"+
		">?\7g\2\2?@\7p\2\2@A\7v\2\2AB\7u\2\2BC\7\"\2\2CD\7q\2\2DE\7e\2\2EF\7e"+
		"\2\2FG\7w\2\2GH\7t\2\2H\b\3\2\2\2IJ\7C\2\2JK\7w\2\2KL\7v\2\2LM\7j\2\2"+
		"MN\7g\2\2NO\7p\2\2OP\7v\2\2PQ\7k\2\2QR\7e\2\2RS\7c\2\2ST\7v\2\2TU\7k\2"+
		"\2UV\7q\2\2VW\7p\2\2WX\7\"\2\2XY\7U\2\2YZ\7U\2\2Z[\7J\2\2[\\\7\"\2\2\\"+
		"]\7n\2\2]^\7q\2\2^_\7i\2\2_`\7k\2\2`a\7p\2\2ab\7\"\2\2bc\7H\2\2cd\7c\2"+
		"\2de\7k\2\2ef\7n\2\2fg\7g\2\2gh\7f\2\2h\n\3\2\2\2ij\7j\2\2jk\7c\2\2kl"+
		"\7x\2\2lm\7k\2\2mn\7p\2\2no\7i\2\2o\f\3\2\2\2pq\7h\2\2qr\7q\2\2rs\7t\2"+
		"\2s\16\3\2\2\2tu\7k\2\2uv\7h\2\2v\20\3\2\2\2wx\7c\2\2xy\7p\2\2y\u009e"+
		"\7{\2\2z{\7u\2\2{|\7q\2\2|}\7o\2\2}\u009e\7g\2\2~\177\7q\2\2\177\u0080"+
		"\7p\2\2\u0080\u009e\7g\2\2\u0081\u0082\7v\2\2\u0082\u0083\7y\2\2\u0083"+
		"\u009e\7q\2\2\u0084\u0085\7v\2\2\u0085\u0086\7j\2\2\u0086\u0087\7t\2\2"+
		"\u0087\u0088\7g\2\2\u0088\u009e\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7n\2\2\u008b\u009e\7n\2\2\u008c\u008d\7p\2\2\u008d\u008e\7q\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u009e\7g\2\2\u0090\u0091\7f\2\2\u0091\u0092\7k\2\2"+
		"\u0092\u0093\7h\2\2\u0093\u0094\7h\2\2\u0094\u0095\7g\2\2\u0095\u0096"+
		"\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7p\2\2\u0098\u009e\7v\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7c\2\2\u009b\u009c\7o\2\2\u009c\u009e\7g\2\2"+
		"\u009dw\3\2\2\2\u009dz\3\2\2\2\u009d~\3\2\2\2\u009d\u0081\3\2\2\2\u009d"+
		"\u0084\3\2\2\2\u009d\u0089\3\2\2\2\u009d\u008c\3\2\2\2\u009d\u0090\3\2"+
		"\2\2\u009d\u0099\3\2\2\2\u009e\22\3\2\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1"+
		"\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00a6\7o\2\2\u00a6\u00bd\7g\2\2\u00a7\u00a8\7k\2\2"+
		"\u00a8\u00bd\7r\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac"+
		"\7u\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00bd\7f\2\2\u00b1\u00b2\7k\2\2\u00b2\u00bd\7f\2\2"+
		"\u00b3\u00b4\7u\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7\"\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bd\7r\2\2\u00bc\u009f\3\2\2\2\u00bc\u00a7\3\2\2"+
		"\2\u00bc\u00a9\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bd\24"+
		"\3\2\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7j\2"+
		"\2\u00c5\u00c6\7c\2\2\u00c6\u00e3\7p\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9"+
		"\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\7v\2"+
		"\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7c\2\2\u00d2\u00e3\7p\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7s\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\7v\2"+
		"\2\u00db\u00e3\7q\2\2\u00dc\u00dd\7y\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7v\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e3\7p\2\2\u00e2"+
		"\u00be\3\2\2\2\u00e2\u00c7\3\2\2\2\u00e2\u00d3\3\2\2\2\u00e2\u00dc\3\2"+
		"\2\2\u00e3\26\3\2\2\2\u00e4\u00e5\7H\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9\u00fc\7f\2\2\u00ea"+
		"\u00eb\7C\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7r\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7g\2\2\u00f1\u00fc"+
		"\7f\2\2\u00f2\u00f3\7U\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7e\2\2\u00f5"+
		"\u00f6\7e\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7f\2\2"+
		"\u00f9\u00fa\7g\2\2\u00fa\u00fc\7f\2\2\u00fb\u00e4\3\2\2\2\u00fb\u00ea"+
		"\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fc\30\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7q\2\2\u0101\u0102\7p\2\2"+
		"\u0102\u0103\7f\2\2\u0103\u0111\7u\2\2\u0104\u0105\7o\2\2\u0105\u0106"+
		"\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108\7w\2\2\u0108\u0109\7v\2\2\u0109"+
		"\u010a\7g\2\2\u010a\u0111\7u\2\2\u010b\u010c\7j\2\2\u010c\u010d\7q\2\2"+
		"\u010d\u010e\7w\2\2\u010e\u010f\7t\2\2\u010f\u0111\7u\2\2\u0110\u00fd"+
		"\3\2\2\2\u0110\u0104\3\2\2\2\u0110\u010b\3\2\2\2\u0111\32\3\2\2\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\7p\2\2\u0114\u0118\7f\2\2\u0115\u0116\7q\2\2"+
		"\u0116\u0118\7t\2\2\u0117\u0112\3\2\2\2\u0117\u0115\3\2\2\2\u0118\34\3"+
		"\2\2\2\u0119\u011a\7z\2\2\u011a\u011b\7o\2\2\u011b\u0120\7n\2\2\u011c"+
		"\u011d\7Z\2\2\u011d\u011e\7O\2\2\u011e\u0120\7N\2\2\u011f\u0119\3\2\2"+
		"\2\u011f\u011c\3\2\2\2\u0120\36\3\2\2\2\u0121\u0123\t\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		" \3\2\2\2\u0126\u0128\t\3\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\"\3\2\2\2\u012b\u012d\t"+
		"\4\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\22\2\2\u0131$\3\2\2\2"+
		"\r\2\u009d\u00bc\u00e2\u00fb\u0110\u0117\u011f\u0124\u0129\u012e\3\b\2"+
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