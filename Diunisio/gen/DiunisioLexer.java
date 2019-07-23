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
		COMENTARIO=1, CLASE=2, CONSTRUCTOR=3, EXTIENDE=4, NUEVO=5, DEFINE=6, ABSTRACTA=7, 
		FINAL=8, PUBLICA=9, ALGORITMO=10, TERMINA=11, ENTONCES=12, O=13, Y=14, 
		IGUAL=15, DIFERENTE=16, MAYOR=17, MENOR=18, MAY_IGUAL=19, MEN_IGUAL=20, 
		SUMA=21, MENOS=22, MULT=23, DIV=24, MOD=25, POTENCIA=26, NO=27, DEF=28, 
		RETORNAR=29, INT=30, FLOAT=31, STRING=32, BOOL=33, MATRIZ=34, VECTOR=35, 
		PCOMA=36, ASIGNAR=37, PAREN_AP=38, PAREN_CI=39, LLAVEIZ=40, LLAVEDE=41, 
		ANGIZ=42, ANGDE=43, COMA=44, DOSPUNTOS=45, VERDADERO=46, FALSO=47, NULO=48, 
		SI=49, SI_NO=50, MIENTRAS=51, SELECCIONAR=52, CASO=53, ROMPER=54, HACER=55, 
		PARA=56, DEFECTO=57, IDENTIFICADOR=58, ENTERO=59, REAL=60, COMPLEJO=61, 
		CADENA=62, ESPACIO=63, OTRO=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMENTARIO", "CLASE", "CONSTRUCTOR", "EXTIENDE", "NUEVO", "DEFINE", 
			"ABSTRACTA", "FINAL", "PUBLICA", "ALGORITMO", "TERMINA", "ENTONCES", 
			"O", "Y", "IGUAL", "DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", 
			"SUMA", "MENOS", "MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", 
			"INT", "FLOAT", "STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", 
			"PAREN_AP", "PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", 
			"DOSPUNTOS", "VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", 
			"SELECCIONAR", "CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "IDENTIFICADOR", 
			"ENTERO", "REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'CLASE'", "'CONSTRUCTOR'", "'EXTIENDE'", "'NUEVO'", "'->'", 
			"'ABSTRACTA'", "'FINAL'", "'PUBLICA'", "'ALGORITMO'", "'.'", "'entonces'", 
			"'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'def'", "'retornar'", "'entero'", 
			"'decimal'", "'cadena'", "'booleano'", "'matriz'", "'vector'", "';'", 
			"'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "':'", "'verdadero'", 
			"'falso'", "'nulo'", "'si'", "'si_no'", "'mientras'", "'seleccionar'", 
			"'caso'", "'romper'", "'hacer'", "'para'", "'defecto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO", "CLASE", "CONSTRUCTOR", "EXTIENDE", "NUEVO", "DEFINE", 
			"ABSTRACTA", "FINAL", "PUBLICA", "ALGORITMO", "TERMINA", "ENTONCES", 
			"O", "Y", "IGUAL", "DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", 
			"SUMA", "MENOS", "MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", 
			"INT", "FLOAT", "STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", 
			"PAREN_AP", "PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", 
			"DOSPUNTOS", "VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", 
			"SELECCIONAR", "CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "IDENTIFICADOR", 
			"ENTERO", "REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\7\2\u0086\n\2\f\2\16\2\u0089\13\2\3\2"+
		"\3\2\3\2\3\2\7\2\u008f\n\2\f\2\16\2\u0092\13\2\3\2\3\2\5\2\u0096\n\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\3"+
		"8\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\7;\u01b1\n;\f;\16;\u01b4"+
		"\13;\3<\6<\u01b7\n<\r<\16<\u01b8\3=\7=\u01bc\n=\f=\16=\u01bf\13=\3=\3"+
		"=\7=\u01c3\n=\f=\16=\u01c6\13=\3=\3=\5=\u01ca\n=\3=\6=\u01cd\n=\r=\16"+
		"=\u01ce\5=\u01d1\n=\3>\3>\5>\u01d5\n>\3>\3>\3>\5>\u01da\n>\3>\3>\3?\3"+
		"?\3?\3?\7?\u01e2\n?\f?\16?\u01e5\13?\3?\3?\3@\3@\3@\3@\3A\3A\3\u0090\2"+
		"B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\3\2\13\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\62;\4\2GGgg\4\2--//\5\2--//~~\5\2\f\f\17\17$$\5\2\13\f\17\17"+
		"\"\"\2\u01fc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0095"+
		"\3\2\2\2\5\u0099\3\2\2\2\7\u009f\3\2\2\2\t\u00ab\3\2\2\2\13\u00b4\3\2"+
		"\2\2\r\u00ba\3\2\2\2\17\u00bd\3\2\2\2\21\u00c7\3\2\2\2\23\u00cd\3\2\2"+
		"\2\25\u00d5\3\2\2\2\27\u00df\3\2\2\2\31\u00e1\3\2\2\2\33\u00ea\3\2\2\2"+
		"\35\u00ed\3\2\2\2\37\u00f0\3\2\2\2!\u00f3\3\2\2\2#\u00f6\3\2\2\2%\u00f8"+
		"\3\2\2\2\'\u00fa\3\2\2\2)\u00fd\3\2\2\2+\u0100\3\2\2\2-\u0102\3\2\2\2"+
		"/\u0104\3\2\2\2\61\u0106\3\2\2\2\63\u0108\3\2\2\2\65\u010a\3\2\2\2\67"+
		"\u010c\3\2\2\29\u010e\3\2\2\2;\u0112\3\2\2\2=\u011b\3\2\2\2?\u0122\3\2"+
		"\2\2A\u012a\3\2\2\2C\u0131\3\2\2\2E\u013a\3\2\2\2G\u0141\3\2\2\2I\u0148"+
		"\3\2\2\2K\u014a\3\2\2\2M\u014c\3\2\2\2O\u014e\3\2\2\2Q\u0150\3\2\2\2S"+
		"\u0152\3\2\2\2U\u0154\3\2\2\2W\u0156\3\2\2\2Y\u0158\3\2\2\2[\u015a\3\2"+
		"\2\2]\u015c\3\2\2\2_\u0166\3\2\2\2a\u016c\3\2\2\2c\u0171\3\2\2\2e\u0174"+
		"\3\2\2\2g\u017a\3\2\2\2i\u0183\3\2\2\2k\u018f\3\2\2\2m\u0194\3\2\2\2o"+
		"\u019b\3\2\2\2q\u01a1\3\2\2\2s\u01a6\3\2\2\2u\u01ae\3\2\2\2w\u01b6\3\2"+
		"\2\2y\u01bd\3\2\2\2{\u01d4\3\2\2\2}\u01dd\3\2\2\2\177\u01e8\3\2\2\2\u0081"+
		"\u01ec\3\2\2\2\u0083\u0087\7%\2\2\u0084\u0086\n\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0096\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7"+
		",\2\2\u008c\u0090\3\2\2\2\u008d\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7,\2\2\u0094\u0096\7\61\2\2\u0095"+
		"\u0083\3\2\2\2\u0095\u008a\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\2"+
		"\2\2\u0098\4\3\2\2\2\u0099\u009a\7E\2\2\u009a\u009b\7N\2\2\u009b\u009c"+
		"\7C\2\2\u009c\u009d\7U\2\2\u009d\u009e\7G\2\2\u009e\6\3\2\2\2\u009f\u00a0"+
		"\7E\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3\7U\2\2\u00a3"+
		"\u00a4\7V\2\2\u00a4\u00a5\7T\2\2\u00a5\u00a6\7W\2\2\u00a6\u00a7\7E\2\2"+
		"\u00a7\u00a8\7V\2\2\u00a8\u00a9\7Q\2\2\u00a9\u00aa\7T\2\2\u00aa\b\3\2"+
		"\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\7Z\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af"+
		"\7K\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1\7P\2\2\u00b1\u00b2\7F\2\2\u00b2"+
		"\u00b3\7G\2\2\u00b3\n\3\2\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6\7W\2\2\u00b6"+
		"\u00b7\7G\2\2\u00b7\u00b8\7X\2\2\u00b8\u00b9\7Q\2\2\u00b9\f\3\2\2\2\u00ba"+
		"\u00bb\7/\2\2\u00bb\u00bc\7@\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7C\2\2\u00be"+
		"\u00bf\7D\2\2\u00bf\u00c0\7U\2\2\u00c0\u00c1\7V\2\2\u00c1\u00c2\7T\2\2"+
		"\u00c2\u00c3\7C\2\2\u00c3\u00c4\7E\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6"+
		"\7C\2\2\u00c6\20\3\2\2\2\u00c7\u00c8\7H\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca"+
		"\7P\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cc\7N\2\2\u00cc\22\3\2\2\2\u00cd\u00ce"+
		"\7R\2\2\u00ce\u00cf\7W\2\2\u00cf\u00d0\7D\2\2\u00d0\u00d1\7N\2\2\u00d1"+
		"\u00d2\7K\2\2\u00d2\u00d3\7E\2\2\u00d3\u00d4\7C\2\2\u00d4\24\3\2\2\2\u00d5"+
		"\u00d6\7C\2\2\u00d6\u00d7\7N\2\2\u00d7\u00d8\7I\2\2\u00d8\u00d9\7Q\2\2"+
		"\u00d9\u00da\7T\2\2\u00da\u00db\7K\2\2\u00db\u00dc\7V\2\2\u00dc\u00dd"+
		"\7O\2\2\u00dd\u00de\7Q\2\2\u00de\26\3\2\2\2\u00df\u00e0\7\60\2\2\u00e0"+
		"\30\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"\u00e5\7q\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7u\2\2\u00e9\32\3\2\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ec\7"+
		"~\2\2\u00ec\34\3\2\2\2\u00ed\u00ee\7(\2\2\u00ee\u00ef\7(\2\2\u00ef\36"+
		"\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1\u00f2\7?\2\2\u00f2 \3\2\2\2\u00f3\u00f4"+
		"\7#\2\2\u00f4\u00f5\7?\2\2\u00f5\"\3\2\2\2\u00f6\u00f7\7@\2\2\u00f7$\3"+
		"\2\2\2\u00f8\u00f9\7>\2\2\u00f9&\3\2\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc"+
		"\7?\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7?\2\2\u00ff*\3"+
		"\2\2\2\u0100\u0101\7-\2\2\u0101,\3\2\2\2\u0102\u0103\7/\2\2\u0103.\3\2"+
		"\2\2\u0104\u0105\7,\2\2\u0105\60\3\2\2\2\u0106\u0107\7\61\2\2\u0107\62"+
		"\3\2\2\2\u0108\u0109\7\'\2\2\u0109\64\3\2\2\2\u010a\u010b\7`\2\2\u010b"+
		"\66\3\2\2\2\u010c\u010d\7#\2\2\u010d8\3\2\2\2\u010e\u010f\7f\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7h\2\2\u0111:\3\2\2\2\u0112\u0113\7t\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\7v\2\2\u0115\u0116\7q\2\2\u0116\u0117\7t\2\2"+
		"\u0117\u0118\7p\2\2\u0118\u0119\7c\2\2\u0119\u011a\7t\2\2\u011a<\3\2\2"+
		"\2\u011b\u011c\7g\2\2\u011c\u011d\7p\2\2\u011d\u011e\7v\2\2\u011e\u011f"+
		"\7g\2\2\u011f\u0120\7t\2\2\u0120\u0121\7q\2\2\u0121>\3\2\2\2\u0122\u0123"+
		"\7f\2\2\u0123\u0124\7g\2\2\u0124\u0125\7e\2\2\u0125\u0126\7k\2\2\u0126"+
		"\u0127\7o\2\2\u0127\u0128\7c\2\2\u0128\u0129\7n\2\2\u0129@\3\2\2\2\u012a"+
		"\u012b\7e\2\2\u012b\u012c\7c\2\2\u012c\u012d\7f\2\2\u012d\u012e\7g\2\2"+
		"\u012e\u012f\7p\2\2\u012f\u0130\7c\2\2\u0130B\3\2\2\2\u0131\u0132\7d\2"+
		"\2\u0132\u0133\7q\2\2\u0133\u0134\7q\2\2\u0134\u0135\7n\2\2\u0135\u0136"+
		"\7g\2\2\u0136\u0137\7c\2\2\u0137\u0138\7p\2\2\u0138\u0139\7q\2\2\u0139"+
		"D\3\2\2\2\u013a\u013b\7o\2\2\u013b\u013c\7c\2\2\u013c\u013d\7v\2\2\u013d"+
		"\u013e\7t\2\2\u013e\u013f\7k\2\2\u013f\u0140\7|\2\2\u0140F\3\2\2\2\u0141"+
		"\u0142\7x\2\2\u0142\u0143\7g\2\2\u0143\u0144\7e\2\2\u0144\u0145\7v\2\2"+
		"\u0145\u0146\7q\2\2\u0146\u0147\7t\2\2\u0147H\3\2\2\2\u0148\u0149\7=\2"+
		"\2\u0149J\3\2\2\2\u014a\u014b\7?\2\2\u014bL\3\2\2\2\u014c\u014d\7*\2\2"+
		"\u014dN\3\2\2\2\u014e\u014f\7+\2\2\u014fP\3\2\2\2\u0150\u0151\7}\2\2\u0151"+
		"R\3\2\2\2\u0152\u0153\7\177\2\2\u0153T\3\2\2\2\u0154\u0155\7]\2\2\u0155"+
		"V\3\2\2\2\u0156\u0157\7_\2\2\u0157X\3\2\2\2\u0158\u0159\7.\2\2\u0159Z"+
		"\3\2\2\2\u015a\u015b\7<\2\2\u015b\\\3\2\2\2\u015c\u015d\7x\2\2\u015d\u015e"+
		"\7g\2\2\u015e\u015f\7t\2\2\u015f\u0160\7f\2\2\u0160\u0161\7c\2\2\u0161"+
		"\u0162\7f\2\2\u0162\u0163\7g\2\2\u0163\u0164\7t\2\2\u0164\u0165\7q\2\2"+
		"\u0165^\3\2\2\2\u0166\u0167\7h\2\2\u0167\u0168\7c\2\2\u0168\u0169\7n\2"+
		"\2\u0169\u016a\7u\2\2\u016a\u016b\7q\2\2\u016b`\3\2\2\2\u016c\u016d\7"+
		"p\2\2\u016d\u016e\7w\2\2\u016e\u016f\7n\2\2\u016f\u0170\7q\2\2\u0170b"+
		"\3\2\2\2\u0171\u0172\7u\2\2\u0172\u0173\7k\2\2\u0173d\3\2\2\2\u0174\u0175"+
		"\7u\2\2\u0175\u0176\7k\2\2\u0176\u0177\7a\2\2\u0177\u0178\7p\2\2\u0178"+
		"\u0179\7q\2\2\u0179f\3\2\2\2\u017a\u017b\7o\2\2\u017b\u017c\7k\2\2\u017c"+
		"\u017d\7g\2\2\u017d\u017e\7p\2\2\u017e\u017f\7v\2\2\u017f\u0180\7t\2\2"+
		"\u0180\u0181\7c\2\2\u0181\u0182\7u\2\2\u0182h\3\2\2\2\u0183\u0184\7u\2"+
		"\2\u0184\u0185\7g\2\2\u0185\u0186\7n\2\2\u0186\u0187\7g\2\2\u0187\u0188"+
		"\7e\2\2\u0188\u0189\7e\2\2\u0189\u018a\7k\2\2\u018a\u018b\7q\2\2\u018b"+
		"\u018c\7p\2\2\u018c\u018d\7c\2\2\u018d\u018e\7t\2\2\u018ej\3\2\2\2\u018f"+
		"\u0190\7e\2\2\u0190\u0191\7c\2\2\u0191\u0192\7u\2\2\u0192\u0193\7q\2\2"+
		"\u0193l\3\2\2\2\u0194\u0195\7t\2\2\u0195\u0196\7q\2\2\u0196\u0197\7o\2"+
		"\2\u0197\u0198\7r\2\2\u0198\u0199\7g\2\2\u0199\u019a\7t\2\2\u019an\3\2"+
		"\2\2\u019b\u019c\7j\2\2\u019c\u019d\7c\2\2\u019d\u019e\7e\2\2\u019e\u019f"+
		"\7g\2\2\u019f\u01a0\7t\2\2\u01a0p\3\2\2\2\u01a1\u01a2\7r\2\2\u01a2\u01a3"+
		"\7c\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7c\2\2\u01a5r\3\2\2\2\u01a6\u01a7"+
		"\7f\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7h\2\2\u01a9\u01aa\7g\2\2\u01aa"+
		"\u01ab\7e\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7q\2\2\u01adt\3\2\2\2\u01ae"+
		"\u01b2\t\3\2\2\u01af\u01b1\t\4\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3v\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b5\u01b7\t\5\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9x\3\2\2\2\u01ba\u01bc\t\5\2\2"+
		"\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c4\7\60\2\2"+
		"\u01c1\u01c3\t\5\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01d0\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c9\t\6\2\2\u01c8\u01ca\t\7\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01cd\t\5\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2"+
		"\2\2\u01d0\u01c7\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1z\3\2\2\2\u01d2\u01d5"+
		"\5w<\2\u01d3\u01d5\5y=\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d9\t\b\2\2\u01d7\u01da\5w<\2\u01d8\u01da\5y=\2"+
		"\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dc\7k\2\2\u01dc|\3\2\2\2\u01dd\u01e3\7$\2\2\u01de\u01e2"+
		"\n\t\2\2\u01df\u01e0\7$\2\2\u01e0\u01e2\7$\2\2\u01e1\u01de\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7$\2\2\u01e7"+
		"~\3\2\2\2\u01e8\u01e9\t\n\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\b@\2\2\u01eb"+
		"\u0080\3\2\2\2\u01ec\u01ed\13\2\2\2\u01ed\u0082\3\2\2\2\21\2\u0087\u0090"+
		"\u0095\u01b2\u01b8\u01bd\u01c4\u01c9\u01ce\u01d0\u01d4\u01d9\u01e1\u01e3"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}