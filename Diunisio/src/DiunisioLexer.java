// Generated from /Users/Sunny/Documents/Unal/201901/Lenguajes de Programacion/Conferencias/Diunisio/Diunisio/src/Diunisio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiunisioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, ALGORITMO=2, TERMINA=3, ENTONCES=4, O=5, Y=6, IGUAL=7, DIFERENTE=8, 
		MAYOR=9, MENOR=10, MAY_IGUAL=11, MEN_IGUAL=12, SUMA=13, MENOS=14, MULT=15, 
		DIV=16, MOD=17, POTENCIA=18, NO=19, DEF=20, RETORNAR=21, INT=22, FLOAT=23, 
		STRING=24, BOOL=25, MATRIZ=26, VECTOR=27, PCOMA=28, ASIGNAR=29, PAREN_AP=30, 
		PAREN_CI=31, LLAVEIZ=32, LLAVEDE=33, ANGIZ=34, ANGDE=35, COMA=36, DOSPUNTOS=37, 
		VERDADERO=38, FALSO=39, NULO=40, SI=41, SI_NO=42, MIENTRAS=43, SELECCIONAR=44, 
		CASO=45, ROMPER=46, HACER=47, PARA=48, DEFECTO=49, IDENTIFICADOR=50, ENTERO=51, 
		REAL=52, COMPLEJO=53, CADENA=54, ESPACIO=55, OTRO=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", 
			"DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", 
			"MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", "INT", "FLOAT", 
			"STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", "PAREN_AP", 
			"PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", "DOSPUNTOS", 
			"VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", "SELECCIONAR", 
			"CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "IDENTIFICADOR", "ENTERO", 
			"REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'ALGORITMO'", "'.'", "'entonces'", "'||'", "'&&'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'^'", "'!'", "'def'", "'retornar'", "'entero'", "'decimal'", "'cadena'", 
			"'booleano'", "'matriz'", "'vector'", "';'", "'='", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "','", "':'", "'verdadero'", "'falso'", "'nulo'", 
			"'si'", "'si_no'", "'mientras'", "'seleccionar'", "'caso'", "'romper'", 
			"'hacer'", "'para'", "'defecto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", 
			"DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", 
			"MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", "INT", "FLOAT", 
			"STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", "PAREN_AP", 
			"PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", "DOSPUNTOS", 
			"VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", "SELECCIONAR", 
			"CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "IDENTIFICADOR", "ENTERO", 
			"REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
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


	public DiunisioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Diunisio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\7\2v\n\2\f\2\16"+
		"\2y\13\2\3\2\3\2\3\2\3\2\7\2\177\n\2\f\2\16\2\u0082\13\2\3\2\3\2\5\2\u0086"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\7\63\u0165\n\63\f\63\16\63\u0168\13\63\3\64\6\64\u016b"+
		"\n\64\r\64\16\64\u016c\3\65\7\65\u0170\n\65\f\65\16\65\u0173\13\65\3\65"+
		"\3\65\7\65\u0177\n\65\f\65\16\65\u017a\13\65\3\65\3\65\5\65\u017e\n\65"+
		"\3\65\6\65\u0181\n\65\r\65\16\65\u0182\5\65\u0185\n\65\3\66\3\66\5\66"+
		"\u0189\n\66\3\66\3\66\3\66\5\66\u018e\n\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\7\67\u0196\n\67\f\67\16\67\u0199\13\67\3\67\3\67\38\38\38\38\39\3"+
		"9\3\u0080\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:\3\2\13\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\3\2\62"+
		";\4\2GGgg\4\2--//\5\2--//~~\5\2\f\f\17\17$$\5\2\13\f\17\17\"\"\2\u01b0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\3\u0085\3\2\2\2\5\u0089\3\2\2\2\7\u0093\3\2\2"+
		"\2\t\u0095\3\2\2\2\13\u009e\3\2\2\2\r\u00a1\3\2\2\2\17\u00a4\3\2\2\2\21"+
		"\u00a7\3\2\2\2\23\u00aa\3\2\2\2\25\u00ac\3\2\2\2\27\u00ae\3\2\2\2\31\u00b1"+
		"\3\2\2\2\33\u00b4\3\2\2\2\35\u00b6\3\2\2\2\37\u00b8\3\2\2\2!\u00ba\3\2"+
		"\2\2#\u00bc\3\2\2\2%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00c6"+
		"\3\2\2\2-\u00cf\3\2\2\2/\u00d6\3\2\2\2\61\u00de\3\2\2\2\63\u00e5\3\2\2"+
		"\2\65\u00ee\3\2\2\2\67\u00f5\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0100"+
		"\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E\u0108\3\2\2\2G"+
		"\u010a\3\2\2\2I\u010c\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2\2\2O\u011a\3\2"+
		"\2\2Q\u0120\3\2\2\2S\u0125\3\2\2\2U\u0128\3\2\2\2W\u012e\3\2\2\2Y\u0137"+
		"\3\2\2\2[\u0143\3\2\2\2]\u0148\3\2\2\2_\u014f\3\2\2\2a\u0155\3\2\2\2c"+
		"\u015a\3\2\2\2e\u0162\3\2\2\2g\u016a\3\2\2\2i\u0171\3\2\2\2k\u0188\3\2"+
		"\2\2m\u0191\3\2\2\2o\u019c\3\2\2\2q\u01a0\3\2\2\2sw\7%\2\2tv\n\2\2\2u"+
		"t\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0086\3\2\2\2yw\3\2\2\2z{\7\61"+
		"\2\2{|\7,\2\2|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0084\7,\2\2\u0084\u0086\7\61\2\2\u0085s\3\2\2\2\u0085z\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\2\2\2\u0088\4\3\2\2\2\u0089\u008a"+
		"\7C\2\2\u008a\u008b\7N\2\2\u008b\u008c\7I\2\2\u008c\u008d\7Q\2\2\u008d"+
		"\u008e\7T\2\2\u008e\u008f\7K\2\2\u008f\u0090\7V\2\2\u0090\u0091\7O\2\2"+
		"\u0091\u0092\7Q\2\2\u0092\6\3\2\2\2\u0093\u0094\7\60\2\2\u0094\b\3\2\2"+
		"\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b\7e\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7u\2\2\u009d\n\3\2\2\2\u009e\u009f\7~\2\2\u009f\u00a0\7~\2\2\u00a0"+
		"\f\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\u00a3\7(\2\2\u00a3\16\3\2\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5\u00a6\7?\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8"+
		"\u00a9\7?\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\24\3\2\2\2\u00ac"+
		"\u00ad\7>\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7@\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\30\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3\32\3\2\2\2\u00b4"+
		"\u00b5\7-\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7\36\3\2\2\2\u00b8"+
		"\u00b9\7,\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\"\3\2\2\2\u00bc"+
		"\u00bd\7\'\2\2\u00bd$\3\2\2\2\u00be\u00bf\7`\2\2\u00bf&\3\2\2\2\u00c0"+
		"\u00c1\7#\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7p\2\2"+
		"\u00cc\u00cd\7c\2\2\u00cd\u00ce\7t\2\2\u00ce,\3\2\2\2\u00cf\u00d0\7g\2"+
		"\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7t\2\2\u00d4\u00d5\7q\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7o\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7n\2\2\u00dd\60\3\2\2\2\u00de\u00df\7e\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2"+
		"\u00e3\u00e4\7c\2\2\u00e4\62\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7"+
		"q\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7c\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7q\2\2\u00ed\64\3\2\2\2\u00ee\u00ef"+
		"\7o\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2"+
		"\u00f3\7k\2\2\u00f3\u00f4\7|\2\2\u00f4\66\3\2\2\2\u00f5\u00f6\7x\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7q\2\2"+
		"\u00fa\u00fb\7t\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7=\2\2\u00fd:\3\2\2\2\u00fe"+
		"\u00ff\7?\2\2\u00ff<\3\2\2\2\u0100\u0101\7*\2\2\u0101>\3\2\2\2\u0102\u0103"+
		"\7+\2\2\u0103@\3\2\2\2\u0104\u0105\7}\2\2\u0105B\3\2\2\2\u0106\u0107\7"+
		"\177\2\2\u0107D\3\2\2\2\u0108\u0109\7]\2\2\u0109F\3\2\2\2\u010a\u010b"+
		"\7_\2\2\u010bH\3\2\2\2\u010c\u010d\7.\2\2\u010dJ\3\2\2\2\u010e\u010f\7"+
		"<\2\2\u010fL\3\2\2\2\u0110\u0111\7x\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7t\2\2\u0113\u0114\7f\2\2\u0114\u0115\7c\2\2\u0115\u0116\7f\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118\u0119\7q\2\2\u0119N\3\2\2\2\u011a"+
		"\u011b\7h\2\2\u011b\u011c\7c\2\2\u011c\u011d\7n\2\2\u011d\u011e\7u\2\2"+
		"\u011e\u011f\7q\2\2\u011fP\3\2\2\2\u0120\u0121\7p\2\2\u0121\u0122\7w\2"+
		"\2\u0122\u0123\7n\2\2\u0123\u0124\7q\2\2\u0124R\3\2\2\2\u0125\u0126\7"+
		"u\2\2\u0126\u0127\7k\2\2\u0127T\3\2\2\2\u0128\u0129\7u\2\2\u0129\u012a"+
		"\7k\2\2\u012a\u012b\7a\2\2\u012b\u012c\7p\2\2\u012c\u012d\7q\2\2\u012d"+
		"V\3\2\2\2\u012e\u012f\7o\2\2\u012f\u0130\7k\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7p\2\2\u0132\u0133\7v\2\2\u0133\u0134\7t\2\2\u0134\u0135\7c\2\2"+
		"\u0135\u0136\7u\2\2\u0136X\3\2\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2"+
		"\2\u0139\u013a\7n\2\2\u013a\u013b\7g\2\2\u013b\u013c\7e\2\2\u013c\u013d"+
		"\7e\2\2\u013d\u013e\7k\2\2\u013e\u013f\7q\2\2\u013f\u0140\7p\2\2\u0140"+
		"\u0141\7c\2\2\u0141\u0142\7t\2\2\u0142Z\3\2\2\2\u0143\u0144\7e\2\2\u0144"+
		"\u0145\7c\2\2\u0145\u0146\7u\2\2\u0146\u0147\7q\2\2\u0147\\\3\2\2\2\u0148"+
		"\u0149\7t\2\2\u0149\u014a\7q\2\2\u014a\u014b\7o\2\2\u014b\u014c\7r\2\2"+
		"\u014c\u014d\7g\2\2\u014d\u014e\7t\2\2\u014e^\3\2\2\2\u014f\u0150\7j\2"+
		"\2\u0150\u0151\7c\2\2\u0151\u0152\7e\2\2\u0152\u0153\7g\2\2\u0153\u0154"+
		"\7t\2\2\u0154`\3\2\2\2\u0155\u0156\7r\2\2\u0156\u0157\7c\2\2\u0157\u0158"+
		"\7t\2\2\u0158\u0159\7c\2\2\u0159b\3\2\2\2\u015a\u015b\7f\2\2\u015b\u015c"+
		"\7g\2\2\u015c\u015d\7h\2\2\u015d\u015e\7g\2\2\u015e\u015f\7e\2\2\u015f"+
		"\u0160\7v\2\2\u0160\u0161\7q\2\2\u0161d\3\2\2\2\u0162\u0166\t\3\2\2\u0163"+
		"\u0165\t\4\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167f\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b"+
		"\t\5\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016dh\3\2\2\2\u016e\u0170\t\5\2\2\u016f\u016e\3\2\2\2"+
		"\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0178\7\60\2\2\u0175\u0177\t\5\2\2"+
		"\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u0184\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\t\6\2\2\u017c"+
		"\u017e\t\7\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u0181\t\5\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u017b\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185j\3\2\2\2\u0186\u0189\5g\64\2\u0187\u0189"+
		"\5i\65\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018d\t\b\2\2\u018b\u018e\5g\64\2\u018c\u018e\5i\65\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\7k\2\2\u0190l\3\2\2\2\u0191\u0197\7$\2\2\u0192\u0196\n\t\2\2\u0193"+
		"\u0194\7$\2\2\u0194\u0196\7$\2\2\u0195\u0192\3\2\2\2\u0195\u0193\3\2\2"+
		"\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7$\2\2\u019bn\3\2\2\2\u019c\u019d"+
		"\t\n\2\2\u019d\u019e\3\2\2\2\u019e\u019f\b8\2\2\u019fp\3\2\2\2\u01a0\u01a1"+
		"\13\2\2\2\u01a1r\3\2\2\2\21\2w\u0080\u0085\u0166\u016c\u0171\u0178\u017d"+
		"\u0182\u0184\u0188\u018d\u0195\u0197\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}