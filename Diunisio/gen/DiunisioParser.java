// Generated from /Users/Sunny/Documents/Unal/201901/Lenguajes de Programacion/Conferencias/Diunisio/Diunisio/src/Diunisio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiunisioParser extends Parser {
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
	public static final int
		RULE_inicio = 0, RULE_clase = 1, RULE_extiende = 2, RULE_lista_atrb = 3, 
		RULE_atrb = 4, RULE_lista_metd = 5, RULE_constructor = 6, RULE_instancia = 7, 
		RULE_atribinstancia = 8, RULE_metodoinstancia = 9, RULE_modificadoracceso = 10, 
		RULE_algoritmo = 11, RULE_lista_ids = 12, RULE_exp_simple = 13, RULE_expresion = 14, 
		RULE_variable = 15, RULE_termino = 16, RULE_factor = 17, RULE_lista_parsv = 18, 
		RULE_conjunto = 19, RULE_tipo = 20, RULE_bloque = 21, RULE_sec_proposiciones = 22, 
		RULE_proposicion = 23, RULE_asignacion = 24, RULE_si_senten = 25, RULE_bloque_condicional = 26, 
		RULE_mientras_senten = 27, RULE_hacer_mientras_senten = 28, RULE_seleccionar_senten = 29, 
		RULE_casos = 30, RULE_para_senten = 31, RULE_fun_senten = 32, RULE_proc_senten = 33, 
		RULE_funcion = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "clase", "extiende", "lista_atrb", "atrb", "lista_metd", "constructor", 
			"instancia", "atribinstancia", "metodoinstancia", "modificadoracceso", 
			"algoritmo", "lista_ids", "exp_simple", "expresion", "variable", "termino", 
			"factor", "lista_parsv", "conjunto", "tipo", "bloque", "sec_proposiciones", 
			"proposicion", "asignacion", "si_senten", "bloque_condicional", "mientras_senten", 
			"hacer_mientras_senten", "seleccionar_senten", "casos", "para_senten", 
			"fun_senten", "proc_senten", "funcion"
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

	@Override
	public String getGrammarFileName() { return "Diunisio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiunisioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public ClaseContext clase() {
			return getRuleContext(ClaseContext.class,0);
		}
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				clase();
				}
				break;
			case ALGORITMO:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				algoritmo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClaseContext extends ParserRuleContext {
		public TerminalNode CLASE() { return getToken(DiunisioParser.CLASE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public List<Lista_atrbContext> lista_atrb() {
			return getRuleContexts(Lista_atrbContext.class);
		}
		public Lista_atrbContext lista_atrb(int i) {
			return getRuleContext(Lista_atrbContext.class,i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Lista_metdContext lista_metd() {
			return getRuleContext(Lista_metdContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ModificadoraccesoContext modificadoracceso() {
			return getRuleContext(ModificadoraccesoContext.class,0);
		}
		public ExtiendeContext extiende() {
			return getRuleContext(ExtiendeContext.class,0);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitClase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(CLASE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACTA) | (1L << FINAL) | (1L << PUBLICA))) != 0)) {
				{
				setState(75);
				modificadoracceso();
				}
			}

			setState(78);
			match(IDENTIFICADOR);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTIENDE) {
				{
				setState(79);
				extiende();
				}
			}

			setState(82);
			match(LLAVEIZ);
			setState(83);
			lista_atrb();
			setState(84);
			constructor();
			setState(85);
			lista_atrb();
			setState(86);
			lista_metd();
			setState(87);
			match(LLAVEDE);
			setState(88);
			bloque();
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

	public static class ExtiendeContext extends ParserRuleContext {
		public TerminalNode EXTIENDE() { return getToken(DiunisioParser.EXTIENDE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public ExtiendeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extiende; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterExtiende(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitExtiende(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitExtiende(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtiendeContext extiende() throws RecognitionException {
		ExtiendeContext _localctx = new ExtiendeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_extiende);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(EXTIENDE);
			setState(91);
			match(IDENTIFICADOR);
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

	public static class Lista_atrbContext extends ParserRuleContext {
		public AtrbContext atrb() {
			return getRuleContext(AtrbContext.class,0);
		}
		public Lista_atrbContext lista_atrb() {
			return getRuleContext(Lista_atrbContext.class,0);
		}
		public Lista_atrbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_atrb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLista_atrb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLista_atrb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLista_atrb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_atrbContext lista_atrb() throws RecognitionException {
		Lista_atrbContext _localctx = new Lista_atrbContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_atrb);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				atrb();
				setState(94);
				lista_atrb();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << MATRIZ) | (1L << VECTOR))) != 0)) {
					{
					setState(96);
					atrb();
					}
				}

				}
				break;
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

	public static class AtrbContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public AtrbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAtrb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAtrb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAtrb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrbContext atrb() throws RecognitionException {
		AtrbContext _localctx = new AtrbContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atrb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			tipo();
			setState(102);
			variable();
			setState(103);
			match(PCOMA);
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

	public static class Lista_metdContext extends ParserRuleContext {
		public Fun_sentenContext fun_senten() {
			return getRuleContext(Fun_sentenContext.class,0);
		}
		public Lista_metdContext lista_metd() {
			return getRuleContext(Lista_metdContext.class,0);
		}
		public Lista_metdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_metd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLista_metd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLista_metd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLista_metd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_metdContext lista_metd() throws RecognitionException {
		Lista_metdContext _localctx = new Lista_metdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista_metd);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				fun_senten();
				setState(106);
				lista_metd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEF) {
					{
					setState(108);
					fun_senten();
					}
				}

				}
				break;
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(DiunisioParser.CONSTRUCTOR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(CONSTRUCTOR);
			setState(114);
			match(IDENTIFICADOR);
			setState(115);
			match(PAREN_AP);
			setState(116);
			lista_parsv();
			setState(117);
			match(PAREN_CI);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					bloque();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class InstanciaContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public TerminalNode NUEVO() { return getToken(DiunisioParser.NUEVO, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public InstanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instancia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterInstancia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitInstancia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitInstancia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanciaContext instancia() throws RecognitionException {
		InstanciaContext _localctx = new InstanciaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFICADOR);
			setState(125);
			match(IDENTIFICADOR);
			setState(126);
			match(ASIGNAR);
			setState(127);
			match(NUEVO);
			setState(128);
			match(IDENTIFICADOR);
			setState(129);
			match(PAREN_AP);
			setState(130);
			lista_parsv();
			setState(131);
			match(PAREN_CI);
			setState(132);
			match(PCOMA);
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

	public static class AtribinstanciaContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public TerminalNode DEFINE() { return getToken(DiunisioParser.DEFINE, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public AtribinstanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribinstancia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAtribinstancia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAtribinstancia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAtribinstancia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribinstanciaContext atribinstancia() throws RecognitionException {
		AtribinstanciaContext _localctx = new AtribinstanciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atribinstancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IDENTIFICADOR);
			setState(135);
			match(DEFINE);
			setState(136);
			match(IDENTIFICADOR);
			setState(137);
			match(ASIGNAR);
			setState(138);
			termino();
			setState(139);
			match(PCOMA);
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

	public static class MetodoinstanciaContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public TerminalNode DEFINE() { return getToken(DiunisioParser.DEFINE, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public MetodoinstanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoinstancia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterMetodoinstancia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitMetodoinstancia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitMetodoinstancia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoinstanciaContext metodoinstancia() throws RecognitionException {
		MetodoinstanciaContext _localctx = new MetodoinstanciaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_metodoinstancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENTIFICADOR);
			setState(142);
			match(DEFINE);
			setState(143);
			match(IDENTIFICADOR);
			setState(144);
			lista_parsv();
			setState(145);
			match(PCOMA);
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

	public static class ModificadoraccesoContext extends ParserRuleContext {
		public TerminalNode ABSTRACTA() { return getToken(DiunisioParser.ABSTRACTA, 0); }
		public TerminalNode FINAL() { return getToken(DiunisioParser.FINAL, 0); }
		public TerminalNode PUBLICA() { return getToken(DiunisioParser.PUBLICA, 0); }
		public ModificadoraccesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificadoracceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterModificadoracceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitModificadoracceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitModificadoracceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificadoraccesoContext modificadoracceso() throws RecognitionException {
		ModificadoraccesoContext _localctx = new ModificadoraccesoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modificadoracceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACTA) | (1L << FINAL) | (1L << PUBLICA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode ALGORITMO() { return getToken(DiunisioParser.ALGORITMO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TERMINA() { return getToken(DiunisioParser.TERMINA, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ALGORITMO);
			setState(150);
			match(IDENTIFICADOR);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_AP) {
				{
				setState(151);
				match(PAREN_AP);
				setState(152);
				lista_ids();
				setState(153);
				match(PAREN_CI);
				}
			}

			setState(157);
			match(DOSPUNTOS);
			setState(158);
			bloque();
			setState(159);
			match(TERMINA);
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

	public static class Lista_idsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public Lista_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLista_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLista_ids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLista_ids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_idsContext lista_ids() throws RecognitionException {
		Lista_idsContext _localctx = new Lista_idsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lista_ids);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(IDENTIFICADOR);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(162);
					match(COMA);
					setState(163);
					match(IDENTIFICADOR);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAREN_CI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exp_simpleContext extends ParserRuleContext {
		public Token op;
		public Token op2;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Exp_simpleContext exp_simple() {
			return getRuleContext(Exp_simpleContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(DiunisioParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(DiunisioParser.SUMA, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(DiunisioParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(DiunisioParser.MENOS, i);
		}
		public List<TerminalNode> O() { return getTokens(DiunisioParser.O); }
		public TerminalNode O(int i) {
			return getToken(DiunisioParser.O, i);
		}
		public Exp_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterExp_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitExp_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitExp_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_simpleContext exp_simple() throws RecognitionException {
		Exp_simpleContext _localctx = new Exp_simpleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp_simple);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(PAREN_AP);
				setState(173);
				exp_simple();
				setState(174);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUMA || _la==MENOS) {
					{
					setState(176);
					((Exp_simpleContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==MENOS) ) {
						((Exp_simpleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(179);
				termino();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << SUMA) | (1L << MENOS))) != 0)) {
					{
					{
					setState(180);
					((Exp_simpleContext)_localctx).op2 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << SUMA) | (1L << MENOS))) != 0)) ) {
						((Exp_simpleContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(181);
					termino();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				termino();
				}
				break;
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

	public static class ExpresionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<Exp_simpleContext> exp_simple() {
			return getRuleContexts(Exp_simpleContext.class);
		}
		public Exp_simpleContext exp_simple(int i) {
			return getRuleContext(Exp_simpleContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(DiunisioParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(DiunisioParser.DIFERENTE, 0); }
		public TerminalNode MEN_IGUAL() { return getToken(DiunisioParser.MEN_IGUAL, 0); }
		public TerminalNode MAY_IGUAL() { return getToken(DiunisioParser.MAY_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(DiunisioParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(DiunisioParser.MAYOR, 0); }
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expresion);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(PAREN_AP);
				setState(191);
				expresion();
				setState(192);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				exp_simple();
				setState(195);
				((ExpresionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAYOR) | (1L << MENOR) | (1L << MAY_IGUAL) | (1L << MEN_IGUAL))) != 0)) ) {
					((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				exp_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(PAREN_AP);
				setState(199);
				exp_simple();
				setState(200);
				match(PAREN_CI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				exp_simple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				match(NO);
				setState(204);
				expresion();
				}
				break;
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(IDENTIFICADOR);
				setState(208);
				conjunto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(IDENTIFICADOR);
				}
				break;
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

	public static class TerminoContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(DiunisioParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(DiunisioParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(DiunisioParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DiunisioParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(DiunisioParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(DiunisioParser.MOD, i);
		}
		public List<TerminalNode> Y() { return getTokens(DiunisioParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(DiunisioParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(DiunisioParser.O); }
		public TerminalNode O(int i) {
			return getToken(DiunisioParser.O, i);
		}
		public List<TerminalNode> POTENCIA() { return getTokens(DiunisioParser.POTENCIA); }
		public TerminalNode POTENCIA(int i) {
			return getToken(DiunisioParser.POTENCIA, i);
		}
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termino);
		int _la;
		try {
			int _alt;
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(PAREN_AP);
				setState(213);
				termino();
				setState(214);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				factor();
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(217);
						((TerminoContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << Y) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << POTENCIA))) != 0)) ) {
							((TerminoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						factor();
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(NO);
				setState(225);
				termino();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				factor();
				}
				break;
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(DiunisioParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(DiunisioParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(DiunisioParser.CADENA, 0); }
		public TerminalNode COMPLEJO() { return getToken(DiunisioParser.COMPLEJO, 0); }
		public TerminalNode NULO() { return getToken(DiunisioParser.NULO, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public List<TerminalNode> ANGIZ() { return getTokens(DiunisioParser.ANGIZ); }
		public TerminalNode ANGIZ(int i) {
			return getToken(DiunisioParser.ANGIZ, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> ANGDE() { return getTokens(DiunisioParser.ANGDE); }
		public TerminalNode ANGDE(int i) {
			return getToken(DiunisioParser.ANGDE, i);
		}
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public TerminalNode VERDADERO() { return getToken(DiunisioParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(DiunisioParser.FALSO, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(COMPLEJO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				match(NULO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				match(IDENTIFICADOR);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_AP) {
					{
					setState(236);
					lista_parsv();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				match(IDENTIFICADOR);
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					match(ANGIZ);
					setState(241);
					factor();
					setState(242);
					match(ANGDE);
					}
					}
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ANGIZ );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(248);
				match(IDENTIFICADOR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(249);
				match(NO);
				setState(250);
				factor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
				match(VERDADERO);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(252);
				match(FALSO);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(253);
				conjunto();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(254);
				match(PAREN_AP);
				setState(255);
				expresion();
				setState(256);
				match(PAREN_CI);
				}
				break;
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

	public static class Lista_parsvContext extends ParserRuleContext {
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public Lista_parsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parsv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLista_parsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLista_parsv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLista_parsv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parsvContext lista_parsv() throws RecognitionException {
		Lista_parsvContext _localctx = new Lista_parsvContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lista_parsv);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(PAREN_AP);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(261);
					expresion();
					}
					break;
				case 2:
					{
					setState(262);
					variable();
					}
					break;
				case 3:
					{
					setState(263);
					match(IDENTIFICADOR);
					}
					break;
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(266);
					match(COMA);
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(267);
						expresion();
						}
						break;
					case 2:
						{
						setState(268);
						variable();
						}
						break;
					case 3:
						{
						setState(269);
						match(IDENTIFICADOR);
						}
						break;
					}
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(PAREN_AP);
				setState(279);
				match(PAREN_CI);
				}
				break;
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

	public static class ConjuntoContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public ConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitConjunto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitConjunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuntoContext conjunto() throws RecognitionException {
		ConjuntoContext _localctx = new ConjuntoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conjunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(LLAVEIZ);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << MENOS) | (1L << NO) | (1L << PAREN_AP) | (1L << LLAVEIZ) | (1L << VERDADERO) | (1L << FALSO) | (1L << NULO) | (1L << IDENTIFICADOR) | (1L << ENTERO) | (1L << REAL) | (1L << COMPLEJO) | (1L << CADENA))) != 0)) {
				{
				setState(283);
				expresion();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(284);
					match(COMA);
					setState(285);
					expresion();
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(293);
			match(LLAVEDE);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiunisioParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DiunisioParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(DiunisioParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(DiunisioParser.BOOL, 0); }
		public TerminalNode MATRIZ() { return getToken(DiunisioParser.MATRIZ, 0); }
		public TerminalNode VECTOR() { return getToken(DiunisioParser.VECTOR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << MATRIZ) | (1L << VECTOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bloque);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(LLAVEIZ);
				setState(298);
				match(LLAVEDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(LLAVEIZ);
				setState(300);
				sec_proposiciones();
				setState(301);
				match(LLAVEDE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				sec_proposiciones();
				}
				break;
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

	public static class Sec_proposicionesContext extends ParserRuleContext {
		public List<ProposicionContext> proposicion() {
			return getRuleContexts(ProposicionContext.class);
		}
		public ProposicionContext proposicion(int i) {
			return getRuleContext(ProposicionContext.class,i);
		}
		public Sec_proposicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sec_proposiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSec_proposiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSec_proposiciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSec_proposiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sec_proposicionesContext sec_proposiciones() throws RecognitionException {
		Sec_proposicionesContext _localctx = new Sec_proposicionesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sec_proposiciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					proposicion();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(312);
			proposicion();
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

	public static class ProposicionContext extends ParserRuleContext {
		public Token OTRO;
		public TerminalNode RETORNAR() { return getToken(DiunisioParser.RETORNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public Fun_sentenContext fun_senten() {
			return getRuleContext(Fun_sentenContext.class,0);
		}
		public Proc_sentenContext proc_senten() {
			return getRuleContext(Proc_sentenContext.class,0);
		}
		public Si_sentenContext si_senten() {
			return getRuleContext(Si_sentenContext.class,0);
		}
		public Seleccionar_sentenContext seleccionar_senten() {
			return getRuleContext(Seleccionar_sentenContext.class,0);
		}
		public Mientras_sentenContext mientras_senten() {
			return getRuleContext(Mientras_sentenContext.class,0);
		}
		public Para_sentenContext para_senten() {
			return getRuleContext(Para_sentenContext.class,0);
		}
		public Hacer_mientras_sentenContext hacer_mientras_senten() {
			return getRuleContext(Hacer_mientras_sentenContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public TerminalNode OTRO() { return getToken(DiunisioParser.OTRO, 0); }
		public InstanciaContext instancia() {
			return getRuleContext(InstanciaContext.class,0);
		}
		public AtribinstanciaContext atribinstancia() {
			return getRuleContext(AtribinstanciaContext.class,0);
		}
		public MetodoinstanciaContext metodoinstancia() {
			return getRuleContext(MetodoinstanciaContext.class,0);
		}
		public ProposicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterProposicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitProposicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitProposicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProposicionContext proposicion() throws RecognitionException {
		ProposicionContext _localctx = new ProposicionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_proposicion);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(RETORNAR);
				setState(315);
				expresion();
				setState(316);
				match(PCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				fun_senten();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				proc_senten();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				si_senten();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				seleccionar_senten();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				mientras_senten();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(323);
				para_senten();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(324);
				hacer_mientras_senten();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(325);
				asignacion();
				setState(326);
				match(PCOMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(328);
				match(IDENTIFICADOR);
				setState(329);
				lista_parsv();
				setState(330);
				match(PCOMA);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(332);
				match(LLAVEIZ);
				setState(333);
				sec_proposiciones();
				setState(334);
				match(LLAVEDE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(336);
				((ProposicionContext)_localctx).OTRO = match(OTRO);
				System.err.println("Caracter desconocido: " + (((ProposicionContext)_localctx).OTRO!=null?((ProposicionContext)_localctx).OTRO.getText():null));
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(338);
				instancia();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(339);
				atribinstancia();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(340);
				metodoinstancia();
				}
				break;
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsigVecContext extends AsignacionContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public AsigVecContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAsigVec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAsigVec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAsigVec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigNumContext extends AsignacionContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsigNumContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAsigNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAsigNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAsigNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_asignacion);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new AsigNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(IDENTIFICADOR);
				setState(344);
				match(ASIGNAR);
				setState(345);
				expresion();
				}
				break;
			case 2:
				_localctx = new AsigVecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(IDENTIFICADOR);
				setState(347);
				match(ASIGNAR);
				setState(348);
				conjunto();
				}
				break;
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

	public static class Si_sentenContext extends ParserRuleContext {
		public List<TerminalNode> SI() { return getTokens(DiunisioParser.SI); }
		public TerminalNode SI(int i) {
			return getToken(DiunisioParser.SI, i);
		}
		public List<Bloque_condicionalContext> bloque_condicional() {
			return getRuleContexts(Bloque_condicionalContext.class);
		}
		public Bloque_condicionalContext bloque_condicional(int i) {
			return getRuleContext(Bloque_condicionalContext.class,i);
		}
		public List<TerminalNode> SI_NO() { return getTokens(DiunisioParser.SI_NO); }
		public TerminalNode SI_NO(int i) {
			return getToken(DiunisioParser.SI_NO, i);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(DiunisioParser.ENTONCES, 0); }
		public Si_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSi_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSi_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSi_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Si_sentenContext si_senten() throws RecognitionException {
		Si_sentenContext _localctx = new Si_sentenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_si_senten);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(SI);
			setState(352);
			bloque_condicional();
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					match(SI_NO);
					setState(354);
					match(SI);
					setState(355);
					bloque_condicional();
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(361);
				match(SI_NO);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTONCES) {
					{
					setState(362);
					match(ENTONCES);
					}
				}

				setState(365);
				bloque();
				}
				break;
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

	public static class Bloque_condicionalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(DiunisioParser.ENTONCES, 0); }
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bloque_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			expresion();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTONCES) {
				{
				setState(369);
				match(ENTONCES);
				}
			}

			setState(372);
			bloque();
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

	public static class Mientras_sentenContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(DiunisioParser.MIENTRAS, 0); }
		public Bloque_condicionalContext bloque_condicional() {
			return getRuleContext(Bloque_condicionalContext.class,0);
		}
		public Mientras_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterMientras_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitMientras_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitMientras_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mientras_sentenContext mientras_senten() throws RecognitionException {
		Mientras_sentenContext _localctx = new Mientras_sentenContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(MIENTRAS);
			setState(375);
			bloque_condicional();
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

	public static class Hacer_mientras_sentenContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(DiunisioParser.HACER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(DiunisioParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Hacer_mientras_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer_mientras_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterHacer_mientras_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitHacer_mientras_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitHacer_mientras_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hacer_mientras_sentenContext hacer_mientras_senten() throws RecognitionException {
		Hacer_mientras_sentenContext _localctx = new Hacer_mientras_sentenContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_hacer_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(HACER);
			setState(378);
			bloque();
			setState(379);
			match(MIENTRAS);
			setState(380);
			expresion();
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

	public static class Seleccionar_sentenContext extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(DiunisioParser.SELECCIONAR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public Seleccionar_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSeleccionar_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSeleccionar_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSeleccionar_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seleccionar_sentenContext seleccionar_senten() throws RecognitionException {
		Seleccionar_sentenContext _localctx = new Seleccionar_sentenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_seleccionar_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(SELECCIONAR);
			setState(383);
			match(IDENTIFICADOR);
			setState(384);
			match(LLAVEIZ);
			setState(385);
			casos();
			setState(386);
			match(LLAVEDE);
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

	public static class CasosContext extends ParserRuleContext {
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
	 
		public CasosContext() { }
		public void copyFrom(CasosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CasosDefContext extends CasosContext {
		public TerminalNode DEFECTO() { return getToken(DiunisioParser.DEFECTO, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public CasosDefContext(CasosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterCasosDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitCasosDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitCasosDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CasosGenContext extends CasosContext {
		public TerminalNode CASO() { return getToken(DiunisioParser.CASO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode ROMPER() { return getToken(DiunisioParser.ROMPER, 0); }
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public CasosGenContext(CasosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterCasosGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitCasosGen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitCasosGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_casos);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasosGenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(CASO);
				setState(389);
				expresion();
				setState(390);
				match(DOSPUNTOS);
				setState(391);
				sec_proposiciones();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROMPER) {
					{
					setState(392);
					match(ROMPER);
					setState(393);
					match(PCOMA);
					}
				}

				setState(396);
				casos();
				}
				break;
			case DEFECTO:
				_localctx = new CasosDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(DEFECTO);
				setState(399);
				match(DOSPUNTOS);
				setState(400);
				sec_proposiciones();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Para_sentenContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(DiunisioParser.PARA, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PCOMA() { return getTokens(DiunisioParser.PCOMA); }
		public TerminalNode PCOMA(int i) {
			return getToken(DiunisioParser.PCOMA, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public Para_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterPara_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitPara_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitPara_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_sentenContext para_senten() throws RecognitionException {
		Para_sentenContext _localctx = new Para_sentenContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_para_senten);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(PARA);
				setState(404);
				asignacion();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(405);
					match(COMA);
					setState(406);
					asignacion();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				match(PCOMA);
				setState(413);
				expresion();
				setState(414);
				match(PCOMA);
				setState(415);
				asignacion();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(416);
					match(COMA);
					setState(417);
					asignacion();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(PARA);
				setState(426);
				match(PAREN_AP);
				setState(427);
				asignacion();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(428);
					match(COMA);
					setState(429);
					asignacion();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435);
				match(PCOMA);
				setState(436);
				expresion();
				setState(437);
				match(PCOMA);
				setState(438);
				asignacion();
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(439);
					match(COMA);
					setState(440);
					asignacion();
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446);
				match(PAREN_CI);
				setState(447);
				bloque();
				}
				break;
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

	public static class Fun_sentenContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(DiunisioParser.DEF, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Fun_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFun_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFun_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFun_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_sentenContext fun_senten() throws RecognitionException {
		Fun_sentenContext _localctx = new Fun_sentenContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fun_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(DEF);
			setState(452);
			tipo();
			setState(453);
			match(IDENTIFICADOR);
			setState(454);
			match(PAREN_AP);
			setState(455);
			lista_ids();
			setState(456);
			match(PAREN_CI);
			setState(457);
			bloque();
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

	public static class Proc_sentenContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(DiunisioParser.DEF, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Proc_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterProc_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitProc_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitProc_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_sentenContext proc_senten() throws RecognitionException {
		Proc_sentenContext _localctx = new Proc_sentenContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_proc_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(DEF);
			setState(460);
			match(IDENTIFICADOR);
			setState(461);
			match(PAREN_AP);
			setState(462);
			lista_ids();
			setState(463);
			match(PAREN_CI);
			setState(464);
			bloque();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(LLAVEIZ);
			setState(467);
			sec_proposiciones();
			setState(468);
			match(PCOMA);
			setState(469);
			match(LLAVEDE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u01da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\5\2K\n\2\3\3\3\3\5\3O\n\3\3\3\3\3\5\3"+
		"S\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5"+
		"d\n\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7p\n\7\5\7r\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\7\16\u00a7\n\16\f\16\16\16\u00aa\13\16\3\16\5\16\u00ad\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\17\3\17\3\17\7\17\u00b9\n\17"+
		"\f\17\16\17\u00bc\13\17\3\17\5\17\u00bf\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d0\n\20\3\21"+
		"\3\21\3\21\5\21\u00d5\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00de"+
		"\n\22\f\22\16\22\u00e1\13\22\3\22\3\22\3\22\5\22\u00e6\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f0\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\6\23\u00f7\n\23\r\23\16\23\u00f8\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u0105\n\23\3\24\3\24\3\24\3\24\5\24\u010b\n\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0111\n\24\7\24\u0113\n\24\f\24\16\24\u0116\13\24"+
		"\3\24\3\24\3\24\5\24\u011b\n\24\3\25\3\25\3\25\3\25\7\25\u0121\n\25\f"+
		"\25\16\25\u0124\13\25\5\25\u0126\n\25\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u0133\n\27\3\30\7\30\u0136\n\30\f\30\16\30"+
		"\u0139\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u0158\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0160\n\32\3\33\3\33\3\33\3\33\3\33\7\33\u0167\n\33\f\33\16\33\u016a"+
		"\13\33\3\33\3\33\5\33\u016e\n\33\3\33\5\33\u0171\n\33\3\34\3\34\5\34\u0175"+
		"\n\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u018d\n \3 \3 \3 \3 \3 \5 \u0194"+
		"\n \3!\3!\3!\3!\7!\u019a\n!\f!\16!\u019d\13!\3!\3!\3!\3!\3!\3!\7!\u01a5"+
		"\n!\f!\16!\u01a8\13!\3!\3!\3!\3!\3!\3!\3!\7!\u01b1\n!\f!\16!\u01b4\13"+
		"!\3!\3!\3!\3!\3!\3!\7!\u01bc\n!\f!\16!\u01bf\13!\3!\3!\3!\5!\u01c4\n!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDF\2\b\3\2\t\13\3\2\27\30\4\2\17\17\27\30\3\2\21\26\4\2\17\20\31\34"+
		"\3\2 %\2\u0202\2J\3\2\2\2\4L\3\2\2\2\6\\\3\2\2\2\be\3\2\2\2\ng\3\2\2\2"+
		"\fq\3\2\2\2\16s\3\2\2\2\20~\3\2\2\2\22\u0088\3\2\2\2\24\u008f\3\2\2\2"+
		"\26\u0095\3\2\2\2\30\u0097\3\2\2\2\32\u00ac\3\2\2\2\34\u00be\3\2\2\2\36"+
		"\u00cf\3\2\2\2 \u00d4\3\2\2\2\"\u00e5\3\2\2\2$\u0104\3\2\2\2&\u011a\3"+
		"\2\2\2(\u011c\3\2\2\2*\u0129\3\2\2\2,\u0132\3\2\2\2.\u0137\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u015f\3\2\2\2\64\u0161\3\2\2\2\66\u0172\3\2\2\28\u0178"+
		"\3\2\2\2:\u017b\3\2\2\2<\u0180\3\2\2\2>\u0193\3\2\2\2@\u01c3\3\2\2\2B"+
		"\u01c5\3\2\2\2D\u01cd\3\2\2\2F\u01d4\3\2\2\2HK\5\4\3\2IK\5\30\r\2JH\3"+
		"\2\2\2JI\3\2\2\2K\3\3\2\2\2LN\7\4\2\2MO\5\26\f\2NM\3\2\2\2NO\3\2\2\2O"+
		"P\3\2\2\2PR\7<\2\2QS\5\6\4\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7*\2\2UV"+
		"\5\b\5\2VW\5\16\b\2WX\5\b\5\2XY\5\f\7\2YZ\7+\2\2Z[\5,\27\2[\5\3\2\2\2"+
		"\\]\7\6\2\2]^\7<\2\2^\7\3\2\2\2_`\5\n\6\2`a\5\b\5\2af\3\2\2\2bd\5\n\6"+
		"\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2e_\3\2\2\2ec\3\2\2\2f\t\3\2\2\2gh\5*\26"+
		"\2hi\5 \21\2ij\7&\2\2j\13\3\2\2\2kl\5B\"\2lm\5\f\7\2mr\3\2\2\2np\5B\""+
		"\2on\3\2\2\2op\3\2\2\2pr\3\2\2\2qk\3\2\2\2qo\3\2\2\2r\r\3\2\2\2st\7\5"+
		"\2\2tu\7<\2\2uv\7(\2\2vw\5&\24\2w{\7)\2\2xz\5,\27\2yx\3\2\2\2z}\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}{\3\2\2\2~\177\7<\2\2\177\u0080\7<"+
		"\2\2\u0080\u0081\7\'\2\2\u0081\u0082\7\7\2\2\u0082\u0083\7<\2\2\u0083"+
		"\u0084\7(\2\2\u0084\u0085\5&\24\2\u0085\u0086\7)\2\2\u0086\u0087\7&\2"+
		"\2\u0087\21\3\2\2\2\u0088\u0089\7<\2\2\u0089\u008a\7\b\2\2\u008a\u008b"+
		"\7<\2\2\u008b\u008c\7\'\2\2\u008c\u008d\5\"\22\2\u008d\u008e\7&\2\2\u008e"+
		"\23\3\2\2\2\u008f\u0090\7<\2\2\u0090\u0091\7\b\2\2\u0091\u0092\7<\2\2"+
		"\u0092\u0093\5&\24\2\u0093\u0094\7&\2\2\u0094\25\3\2\2\2\u0095\u0096\t"+
		"\2\2\2\u0096\27\3\2\2\2\u0097\u0098\7\f\2\2\u0098\u009d\7<\2\2\u0099\u009a"+
		"\7(\2\2\u009a\u009b\5\32\16\2\u009b\u009c\7)\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7/"+
		"\2\2\u00a0\u00a1\5,\27\2\u00a1\u00a2\7\r\2\2\u00a2\31\3\2\2\2\u00a3\u00a8"+
		"\7<\2\2\u00a4\u00a5\7.\2\2\u00a5\u00a7\7<\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\5\34\17"+
		"\2\u00b0\u00b1\7)\2\2\u00b1\u00bf\3\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00ba\5\"\22\2"+
		"\u00b6\u00b7\t\4\2\2\u00b7\u00b9\5\"\22\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bf\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00bf\5\"\22\2\u00be\u00ae\3\2\2\2\u00be\u00b3\3"+
		"\2\2\2\u00be\u00bd\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7(\2\2\u00c1\u00c2"+
		"\5\36\20\2\u00c2\u00c3\7)\2\2\u00c3\u00d0\3\2\2\2\u00c4\u00c5\5\34\17"+
		"\2\u00c5\u00c6\t\5\2\2\u00c6\u00c7\5\34\17\2\u00c7\u00d0\3\2\2\2\u00c8"+
		"\u00c9\7(\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\7)\2\2\u00cb\u00d0\3\2"+
		"\2\2\u00cc\u00d0\5\34\17\2\u00cd\u00ce\7\35\2\2\u00ce\u00d0\5\36\20\2"+
		"\u00cf\u00c0\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00cc"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\37\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2"+
		"\u00d5\5(\25\2\u00d3\u00d5\7<\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5!\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7\u00d8\5\"\22\2\u00d8\u00d9"+
		"\7)\2\2\u00d9\u00e6\3\2\2\2\u00da\u00df\5$\23\2\u00db\u00dc\t\6\2\2\u00dc"+
		"\u00de\5$\23\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e6\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e3\7\35\2\2\u00e3\u00e6\5\"\22\2\u00e4\u00e6\5$\23\2\u00e5\u00d6\3"+
		"\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"#\3\2\2\2\u00e7\u0105\7=\2\2\u00e8\u0105\7>\2\2\u00e9\u0105\7@\2\2\u00ea"+
		"\u0105\7?\2\2\u00eb\u0105\7\62\2\2\u00ec\u0105\5 \21\2\u00ed\u00ef\7<"+
		"\2\2\u00ee\u00f0\5&\24\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u0105\3\2\2\2\u00f1\u00f6\7<\2\2\u00f2\u00f3\7,\2\2\u00f3\u00f4\5$\23"+
		"\2\u00f4\u00f5\7-\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0105\3\2\2\2\u00fa"+
		"\u0105\7<\2\2\u00fb\u00fc\7\35\2\2\u00fc\u0105\5$\23\2\u00fd\u0105\7\60"+
		"\2\2\u00fe\u0105\7\61\2\2\u00ff\u0105\5(\25\2\u0100\u0101\7(\2\2\u0101"+
		"\u0102\5\36\20\2\u0102\u0103\7)\2\2\u0103\u0105\3\2\2\2\u0104\u00e7\3"+
		"\2\2\2\u0104\u00e8\3\2\2\2\u0104\u00e9\3\2\2\2\u0104\u00ea\3\2\2\2\u0104"+
		"\u00eb\3\2\2\2\u0104\u00ec\3\2\2\2\u0104\u00ed\3\2\2\2\u0104\u00f1\3\2"+
		"\2\2\u0104\u00fa\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u00fd\3\2\2\2\u0104"+
		"\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0105%\3\2\2\2"+
		"\u0106\u010a\7(\2\2\u0107\u010b\5\36\20\2\u0108\u010b\5 \21\2\u0109\u010b"+
		"\7<\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u0114\3\2\2\2\u010c\u0110\7.\2\2\u010d\u0111\5\36\20\2\u010e\u0111\5"+
		" \21\2\u010f\u0111\7<\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u010c\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u011b\7)\2\2\u0118\u0119\7(\2\2\u0119\u011b\7)\2"+
		"\2\u011a\u0106\3\2\2\2\u011a\u0118\3\2\2\2\u011b\'\3\2\2\2\u011c\u0125"+
		"\7*\2\2\u011d\u0122\5\36\20\2\u011e\u011f\7.\2\2\u011f\u0121\5\36\20\2"+
		"\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u011d\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7+\2\2\u0128)\3\2\2\2\u0129"+
		"\u012a\t\7\2\2\u012a+\3\2\2\2\u012b\u012c\7*\2\2\u012c\u0133\7+\2\2\u012d"+
		"\u012e\7*\2\2\u012e\u012f\5.\30\2\u012f\u0130\7+\2\2\u0130\u0133\3\2\2"+
		"\2\u0131\u0133\5.\30\2\u0132\u012b\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133-\3\2\2\2\u0134\u0136\5\60\31\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u013b\5\60\31\2\u013b/\3\2\2\2\u013c\u013d"+
		"\7\37\2\2\u013d\u013e\5\36\20\2\u013e\u013f\7&\2\2\u013f\u0158\3\2\2\2"+
		"\u0140\u0158\5B\"\2\u0141\u0158\5D#\2\u0142\u0158\5\64\33\2\u0143\u0158"+
		"\5<\37\2\u0144\u0158\58\35\2\u0145\u0158\5@!\2\u0146\u0158\5:\36\2\u0147"+
		"\u0148\5\62\32\2\u0148\u0149\7&\2\2\u0149\u0158\3\2\2\2\u014a\u014b\7"+
		"<\2\2\u014b\u014c\5&\24\2\u014c\u014d\7&\2\2\u014d\u0158\3\2\2\2\u014e"+
		"\u014f\7*\2\2\u014f\u0150\5.\30\2\u0150\u0151\7+\2\2\u0151\u0158\3\2\2"+
		"\2\u0152\u0153\7B\2\2\u0153\u0158\b\31\1\2\u0154\u0158\5\20\t\2\u0155"+
		"\u0158\5\22\n\2\u0156\u0158\5\24\13\2\u0157\u013c\3\2\2\2\u0157\u0140"+
		"\3\2\2\2\u0157\u0141\3\2\2\2\u0157\u0142\3\2\2\2\u0157\u0143\3\2\2\2\u0157"+
		"\u0144\3\2\2\2\u0157\u0145\3\2\2\2\u0157\u0146\3\2\2\2\u0157\u0147\3\2"+
		"\2\2\u0157\u014a\3\2\2\2\u0157\u014e\3\2\2\2\u0157\u0152\3\2\2\2\u0157"+
		"\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\61\3\2\2"+
		"\2\u0159\u015a\7<\2\2\u015a\u015b\7\'\2\2\u015b\u0160\5\36\20\2\u015c"+
		"\u015d\7<\2\2\u015d\u015e\7\'\2\2\u015e\u0160\5(\25\2\u015f\u0159\3\2"+
		"\2\2\u015f\u015c\3\2\2\2\u0160\63\3\2\2\2\u0161\u0162\7\63\2\2\u0162\u0168"+
		"\5\66\34\2\u0163\u0164\7\64\2\2\u0164\u0165\7\63\2\2\u0165\u0167\5\66"+
		"\34\2\u0166\u0163\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u0170\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\7\64"+
		"\2\2\u016c\u016e\7\16\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\5,\27\2\u0170\u016b\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\65\3\2\2\2\u0172\u0174\5\36\20\2\u0173\u0175\7\16\2\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5,"+
		"\27\2\u0177\67\3\2\2\2\u0178\u0179\7\65\2\2\u0179\u017a\5\66\34\2\u017a"+
		"9\3\2\2\2\u017b\u017c\79\2\2\u017c\u017d\5,\27\2\u017d\u017e\7\65\2\2"+
		"\u017e\u017f\5\36\20\2\u017f;\3\2\2\2\u0180\u0181\7\66\2\2\u0181\u0182"+
		"\7<\2\2\u0182\u0183\7*\2\2\u0183\u0184\5> \2\u0184\u0185\7+\2\2\u0185"+
		"=\3\2\2\2\u0186\u0187\7\67\2\2\u0187\u0188\5\36\20\2\u0188\u0189\7/\2"+
		"\2\u0189\u018c\5.\30\2\u018a\u018b\78\2\2\u018b\u018d\7&\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5> \2\u018f"+
		"\u0194\3\2\2\2\u0190\u0191\7;\2\2\u0191\u0192\7/\2\2\u0192\u0194\5.\30"+
		"\2\u0193\u0186\3\2\2\2\u0193\u0190\3\2\2\2\u0194?\3\2\2\2\u0195\u0196"+
		"\7:\2\2\u0196\u019b\5\62\32\2\u0197\u0198\7.\2\2\u0198\u019a\5\62\32\2"+
		"\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7&\2\2\u019f"+
		"\u01a0\5\36\20\2\u01a0\u01a1\7&\2\2\u01a1\u01a6\5\62\32\2\u01a2\u01a3"+
		"\7.\2\2\u01a3\u01a5\5\62\32\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2"+
		"\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01aa\5,\27\2\u01aa\u01c4\3\2\2\2\u01ab\u01ac\7:\2\2\u01ac"+
		"\u01ad\7(\2\2\u01ad\u01b2\5\62\32\2\u01ae\u01af\7.\2\2\u01af\u01b1\5\62"+
		"\32\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7&"+
		"\2\2\u01b6\u01b7\5\36\20\2\u01b7\u01b8\7&\2\2\u01b8\u01bd\5\62\32\2\u01b9"+
		"\u01ba\7.\2\2\u01ba\u01bc\5\62\32\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3"+
		"\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c1\7)\2\2\u01c1\u01c2\5,\27\2\u01c2\u01c4\3\2"+
		"\2\2\u01c3\u0195\3\2\2\2\u01c3\u01ab\3\2\2\2\u01c4A\3\2\2\2\u01c5\u01c6"+
		"\7\36\2\2\u01c6\u01c7\5*\26\2\u01c7\u01c8\7<\2\2\u01c8\u01c9\7(\2\2\u01c9"+
		"\u01ca\5\32\16\2\u01ca\u01cb\7)\2\2\u01cb\u01cc\5,\27\2\u01ccC\3\2\2\2"+
		"\u01cd\u01ce\7\36\2\2\u01ce\u01cf\7<\2\2\u01cf\u01d0\7(\2\2\u01d0\u01d1"+
		"\5\32\16\2\u01d1\u01d2\7)\2\2\u01d2\u01d3\5,\27\2\u01d3E\3\2\2\2\u01d4"+
		"\u01d5\7*\2\2\u01d5\u01d6\5.\30\2\u01d6\u01d7\7&\2\2\u01d7\u01d8\7+\2"+
		"\2\u01d8G\3\2\2\2,JNRceoq{\u009d\u00a8\u00ac\u00b3\u00ba\u00be\u00cf\u00d4"+
		"\u00df\u00e5\u00ef\u00f8\u0104\u010a\u0110\u0114\u011a\u0122\u0125\u0132"+
		"\u0137\u0157\u015f\u0168\u016d\u0170\u0174\u018c\u0193\u019b\u01a6\u01b2"+
		"\u01bd\u01c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}