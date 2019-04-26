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
		T__2=1, T__1=2, T__0=3, LOGICALOPERATOR=4, XML=5, NAME=6, EVENTS=7, CONDITION=8, 
		OBJECT=9, TIME=10, UNITSOFTIME=11, RELATIONALOPERATOR=12, QUANTITATIVE=13, 
		NUMBER=14, NEWLINE=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "LOGICALOPERATOR", "XML", "NAME", "EVENTS", "CONDITION", 
		"OBJECT", "TIME", "UNITSOFTIME", "RELATIONALOPERATOR", "QUANTITATIVE", 
		"NUMBER", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u012a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5j"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\6\7q\n\7\r\7\16\7r\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00cd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00f0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0118\n\16\3\17\6\17\u011b\n\17\r\17\16\17\u011c\3\20\6\20\u0120"+
		"\n\20\r\20\16\20\u0121\3\21\6\21\u0125\n\21\r\21\16\21\u0126\3\21\3\21"+
		"\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22\3\2\6\5\2\62;C\\c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\u0140\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\3#\3\2\2\2\5&\3\2\2\2\7a\3\2\2\2\ti\3\2\2\2\13k\3\2\2\2\rp\3\2\2"+
		"\2\17t\3\2\2\2\21\u0085\3\2\2\2\23\u00b3\3\2\2\2\25\u00b5\3\2\2\2\27\u00cc"+
		"\3\2\2\2\31\u00ef\3\2\2\2\33\u0117\3\2\2\2\35\u011a\3\2\2\2\37\u011f\3"+
		"\2\2\2!\u0124\3\2\2\2#$\7q\2\2$%\7h\2\2%\4\3\2\2\2&\'\7u\2\2\'(\7w\2\2"+
		"()\7d\2\2)*\7e\2\2*+\7j\2\2+,\7g\2\2,-\7e\2\2-.\7m\2\2./\7/\2\2/\60\7"+
		"X\2\2\60\61\7c\2\2\61\62\7n\2\2\62\63\7k\2\2\63\64\7f\2\2\64\65\7c\2\2"+
		"\65\66\7v\2\2\66\67\7k\2\2\678\7q\2\289\7p\2\29:\7\"\2\2:;\7H\2\2;<\7"+
		"c\2\2<=\7k\2\2=>\7n\2\2>?\7g\2\2?@\7f\2\2@A\7\"\2\2AB\7C\2\2BC\7w\2\2"+
		"CD\7v\2\2DE\7j\2\2EF\7g\2\2FG\7p\2\2GH\7v\2\2HI\7k\2\2IJ\7e\2\2JK\7c\2"+
		"\2KL\7v\2\2LM\7k\2\2MN\7q\2\2NO\7p\2\2OP\7\"\2\2PQ\7U\2\2QR\7U\2\2RS\7"+
		"J\2\2ST\7\"\2\2TU\7n\2\2UV\7q\2\2VW\7i\2\2WX\7k\2\2XY\7p\2\2YZ\7\"\2\2"+
		"Z[\7H\2\2[\\\7c\2\2\\]\7k\2\2]^\7n\2\2^_\7g\2\2_`\7f\2\2`\6\3\2\2\2ab"+
		"\7k\2\2bc\7h\2\2c\b\3\2\2\2de\7c\2\2ef\7p\2\2fj\7f\2\2gh\7q\2\2hj\7t\2"+
		"\2id\3\2\2\2ig\3\2\2\2j\n\3\2\2\2kl\7Z\2\2lm\7O\2\2mn\7N\2\2n\f\3\2\2"+
		"\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\16\3\2\2\2tu\5\31"+
		"\r\2uv\5\35\17\2vw\7g\2\2wx\7x\2\2xy\7g\2\2yz\7p\2\2z{\7v\2\2{|\7u\2\2"+
		"|}\7\"\2\2}~\7q\2\2~\177\7e\2\2\177\u0080\7e\2\2\u0080\u0081\7w\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5\21\t\2\u0084\20\3\2\2"+
		"\2\u0085\u0086\7j\2\2\u0086\u0087\7c\2\2\u0087\u0088\7x\2\2\u0088\u0089"+
		"\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7i\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\5\33\16\2\u008d\u0093\5\23\n\2\u008e\u008f\5\t\5\2\u008f\u0090"+
		"\5\21\t\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\22\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\7w\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7t\2\2\u009a\u009b\7p\2\2\u009b\u009c\7c\2\2\u009c\u009d\7o\2\2"+
		"\u009d\u00b4\7g\2\2\u009e\u009f\7k\2\2\u009f\u00b4\7r\2\2\u00a0\u00a1"+
		"\7r\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7y\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\u00b4\7f\2\2"+
		"\u00a8\u00a9\7k\2\2\u00a9\u00b4\7f\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac"+
		"\7q\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b4\7r\2"+
		"\2\u00b3\u0096\3\2\2\2\u00b3\u009e\3\2\2\2\u00b3\u00a0\3\2\2\2\u00b3\u00a8"+
		"\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b4\24\3\2\2\2\u00b5\u00b6\5\31\r\2\u00b6"+
		"\u00b7\5\35\17\2\u00b7\u00b8\5\27\f\2\u00b8\26\3\2\2\2\u00b9\u00ba\7u"+
		"\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7p\2\2\u00be\u00bf\7f\2\2\u00bf\u00cd\7u\2\2\u00c0\u00c1\7o\2\2\u00c1"+
		"\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7v\2\2"+
		"\u00c5\u00c6\7g\2\2\u00c6\u00cd\7u\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9"+
		"\7q\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cd\7u\2\2\u00cc"+
		"\u00b9\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\30\3\2\2"+
		"\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7u\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7c\2\2\u00d5"+
		"\u00f0\7p\2\2\u00d6\u00d7\7i\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7g\2\2"+
		"\u00d9\u00da\7c\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00f0\7p\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7s\2\2\u00e3\u00e4\7w\2\2"+
		"\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00f0\7q\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7k\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7k\2\2\u00ee\u00f0\7p\2\2"+
		"\u00ef\u00ce\3\2\2\2\u00ef\u00d6\3\2\2\2\u00ef\u00e1\3\2\2\2\u00ef\u00e9"+
		"\3\2\2\2\u00f0\32\3\2\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f3"+
		"\u0118\7{\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7o\2\2"+
		"\u00f7\u0118\7g\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\u0118"+
		"\7g\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7y\2\2\u00fd\u0118\7q\2\2\u00fe"+
		"\u00ff\7v\2\2\u00ff\u0100\7j\2\2\u0100\u0101\7t\2\2\u0101\u0102\7g\2\2"+
		"\u0102\u0118\7g\2\2\u0103\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105\u0118"+
		"\7n\2\2\u0106\u0107\7p\2\2\u0107\u0108\7q\2\2\u0108\u0109\7p\2\2\u0109"+
		"\u0118\7g\2\2\u010a\u010b\7f\2\2\u010b\u010c\7k\2\2\u010c\u010d\7h\2\2"+
		"\u010d\u010e\7h\2\2\u010e\u010f\7g\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7g\2\2\u0111\u0112\7p\2\2\u0112\u0118\7v\2\2\u0113\u0114\7u\2\2\u0114"+
		"\u0115\7c\2\2\u0115\u0116\7o\2\2\u0116\u0118\7g\2\2\u0117\u00f1\3\2\2"+
		"\2\u0117\u00f4\3\2\2\2\u0117\u00f8\3\2\2\2\u0117\u00fb\3\2\2\2\u0117\u00fe"+
		"\3\2\2\2\u0117\u0103\3\2\2\2\u0117\u0106\3\2\2\2\u0117\u010a\3\2\2\2\u0117"+
		"\u0113\3\2\2\2\u0118\34\3\2\2\2\u0119\u011b\t\3\2\2\u011a\u0119\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\36"+
		"\3\2\2\2\u011e\u0120\t\4\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122 \3\2\2\2\u0123\u0125\t\5\2\2"+
		"\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\21\2\2\u0129\"\3\2\2\2\r\2"+
		"ir\u0093\u00b3\u00cc\u00ef\u0117\u011c\u0121\u0126\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}