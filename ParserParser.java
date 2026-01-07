// Generated from Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		D_UGL_ZAGRADA=1, L_UGL_ZAGRADA=2, D_VIT_ZAGRADA=3, L_VIT_ZAGRADA=4, D_ZAGRADA=5, 
		L_ZAGRADA=6, TOCKAZAREZ=7, ZAREZ=8, OP_BIN_XILI=9, OP_BIN_ILI=10, OP_BIN_I=11, 
		OP_ILI=12, OP_I=13, OP_TILDA=14, OP_NEG=15, OP_NEQ=16, OP_EQ=17, OP_GTE=18, 
		OP_GT=19, OP_LTE=20, OP_LT=21, OP_PRIDRUZI=22, OP_MOD=23, OP_DIJELI=24, 
		OP_PUTA=25, MINUS=26, PLUS=27, OP_DEC=28, OP_INC=29, KR_WHILE=30, KR_VOID=31, 
		KR_RETURN=32, KR_INT=33, KR_IF=34, KR_FOR=35, KR_ELSE=36, KR_CONTINUE=37, 
		KR_CONST=38, KR_CHAR=39, KR_BREAK=40, BROJ=41, WS=42, IDN=43, ZNAK=44, 
		NIZ_ZNAKOVA=45;
	public static final int
		RULE_program = 0, RULE_lista_izraza_pridruzivanja = 1, RULE_inicijalizator = 2, 
		RULE_izravni_deklarator = 3, RULE_init_deklarator = 4, RULE_lista_init_deklaratora = 5, 
		RULE_deklaracija = 6, RULE_lista_deklaracija = 7, RULE_deklaracija_parametra = 8, 
		RULE_lista_parametara = 9, RULE_definicija_funkcije = 10, RULE_vanjska_deklaracija = 11, 
		RULE_prijevodna_jedinica = 12, RULE_naredba_skoka = 13, RULE_naredba_petlje = 14, 
		RULE_naredba_grananja = 15, RULE_izraz_naredba = 16, RULE_naredba = 17, 
		RULE_lista_naredbi = 18, RULE_slozena_naredba = 19, RULE_izraz = 20, RULE_izraz_pridruzivanja = 21, 
		RULE_log_ili_izraz = 22, RULE_log_i_izraz = 23, RULE_bin_ili_izraz = 24, 
		RULE_bin_xili_izraz = 25, RULE_bin_i_izraz = 26, RULE_jednakosni_izraz = 27, 
		RULE_odnosni_izraz = 28, RULE_aditivni_izraz = 29, RULE_multiplikativni_izraz = 30, 
		RULE_specifikator_tipa = 31, RULE_ime_tipa = 32, RULE_cast_izraz = 33, 
		RULE_unarni_operator = 34, RULE_unarni_izraz = 35, RULE_lista_argumenata = 36, 
		RULE_postfiks_izraz = 37, RULE_primarni_izraz = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "lista_izraza_pridruzivanja", "inicijalizator", "izravni_deklarator", 
			"init_deklarator", "lista_init_deklaratora", "deklaracija", "lista_deklaracija", 
			"deklaracija_parametra", "lista_parametara", "definicija_funkcije", "vanjska_deklaracija", 
			"prijevodna_jedinica", "naredba_skoka", "naredba_petlje", "naredba_grananja", 
			"izraz_naredba", "naredba", "lista_naredbi", "slozena_naredba", "izraz", 
			"izraz_pridruzivanja", "log_ili_izraz", "log_i_izraz", "bin_ili_izraz", 
			"bin_xili_izraz", "bin_i_izraz", "jednakosni_izraz", "odnosni_izraz", 
			"aditivni_izraz", "multiplikativni_izraz", "specifikator_tipa", "ime_tipa", 
			"cast_izraz", "unarni_operator", "unarni_izraz", "lista_argumenata", 
			"postfiks_izraz", "primarni_izraz"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "']'", "'['", "'}'", "'{'", "')'", "'('", "';'", "','", "'^'", 
			"'|'", "'&'", "'||'", "'&&'", "'~'", "'!'", "'!='", "'=='", "'>='", "'>'", 
			"'<='", "'<'", "'='", "'%'", "'/'", "'*'", "'-'", "'+'", "'--'", "'++'", 
			"'while'", "'void'", "'return'", "'int'", "'if'", "'for'", "'else'", 
			"'continue'", "'const'", "'char'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "D_UGL_ZAGRADA", "L_UGL_ZAGRADA", "D_VIT_ZAGRADA", "L_VIT_ZAGRADA", 
			"D_ZAGRADA", "L_ZAGRADA", "TOCKAZAREZ", "ZAREZ", "OP_BIN_XILI", "OP_BIN_ILI", 
			"OP_BIN_I", "OP_ILI", "OP_I", "OP_TILDA", "OP_NEG", "OP_NEQ", "OP_EQ", 
			"OP_GTE", "OP_GT", "OP_LTE", "OP_LT", "OP_PRIDRUZI", "OP_MOD", "OP_DIJELI", 
			"OP_PUTA", "MINUS", "PLUS", "OP_DEC", "OP_INC", "KR_WHILE", "KR_VOID", 
			"KR_RETURN", "KR_INT", "KR_IF", "KR_FOR", "KR_ELSE", "KR_CONTINUE", "KR_CONST", 
			"KR_CHAR", "KR_BREAK", "BROJ", "WS", "IDN", "ZNAK", "NIZ_ZNAKOVA"
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
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Prijevodna_jedinicaContext prijevodna_jedinica() {
			return getRuleContext(Prijevodna_jedinicaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParserParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			prijevodna_jedinica(0);
			setState(79);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_izraza_pridruzivanjaContext extends ParserRuleContext {
		public Lista_izraza_pridruzivanjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_izraza_pridruzivanja; }
	 
		public Lista_izraza_pridruzivanjaContext() { }
		public void copyFrom(Lista_izraza_pridruzivanjaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_izraza_pridruzivanja1Context extends Lista_izraza_pridruzivanjaContext {
		public Izraz_pridruzivanjaContext izraz_pridruzivanja() {
			return getRuleContext(Izraz_pridruzivanjaContext.class,0);
		}
		public Lista_izraza_pridruzivanja1Context(Lista_izraza_pridruzivanjaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_izraza_pridruzivanja1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_izraza_pridruzivanja2Context extends Lista_izraza_pridruzivanjaContext {
		public Lista_izraza_pridruzivanjaContext lista_izraza_pridruzivanja() {
			return getRuleContext(Lista_izraza_pridruzivanjaContext.class,0);
		}
		public TerminalNode ZAREZ() { return getToken(ParserParser.ZAREZ, 0); }
		public Izraz_pridruzivanjaContext izraz_pridruzivanja() {
			return getRuleContext(Izraz_pridruzivanjaContext.class,0);
		}
		public Lista_izraza_pridruzivanja2Context(Lista_izraza_pridruzivanjaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_izraza_pridruzivanja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_izraza_pridruzivanjaContext lista_izraza_pridruzivanja() throws RecognitionException {
		return lista_izraza_pridruzivanja(0);
	}

	private Lista_izraza_pridruzivanjaContext lista_izraza_pridruzivanja(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_izraza_pridruzivanjaContext _localctx = new Lista_izraza_pridruzivanjaContext(_ctx, _parentState);
		Lista_izraza_pridruzivanjaContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_lista_izraza_pridruzivanja, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Lista_izraza_pridruzivanja1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(82);
			izraz_pridruzivanja();
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_izraza_pridruzivanja2Context(new Lista_izraza_pridruzivanjaContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lista_izraza_pridruzivanja);
					setState(84);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(85);
					match(ZAREZ);
					setState(86);
					izraz_pridruzivanja();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicijalizatorContext extends ParserRuleContext {
		public InicijalizatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicijalizator; }
	 
		public InicijalizatorContext() { }
		public void copyFrom(InicijalizatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Inicijalizator1Context extends InicijalizatorContext {
		public Izraz_pridruzivanjaContext izraz_pridruzivanja() {
			return getRuleContext(Izraz_pridruzivanjaContext.class,0);
		}
		public Inicijalizator1Context(InicijalizatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInicijalizator1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Inicijalizator2Context extends InicijalizatorContext {
		public TerminalNode L_VIT_ZAGRADA() { return getToken(ParserParser.L_VIT_ZAGRADA, 0); }
		public Lista_izraza_pridruzivanjaContext lista_izraza_pridruzivanja() {
			return getRuleContext(Lista_izraza_pridruzivanjaContext.class,0);
		}
		public TerminalNode D_VIT_ZAGRADA() { return getToken(ParserParser.D_VIT_ZAGRADA, 0); }
		public Inicijalizator2Context(InicijalizatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInicijalizator2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicijalizatorContext inicijalizator() throws RecognitionException {
		InicijalizatorContext _localctx = new InicijalizatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicijalizator);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ZAGRADA:
			case OP_TILDA:
			case OP_NEG:
			case MINUS:
			case PLUS:
			case OP_DEC:
			case OP_INC:
			case BROJ:
			case IDN:
			case ZNAK:
			case NIZ_ZNAKOVA:
				_localctx = new Inicijalizator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				izraz_pridruzivanja();
				}
				break;
			case L_VIT_ZAGRADA:
				_localctx = new Inicijalizator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(L_VIT_ZAGRADA);
				setState(94);
				lista_izraza_pridruzivanja(0);
				setState(95);
				match(D_VIT_ZAGRADA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Izravni_deklaratorContext extends ParserRuleContext {
		public Izravni_deklaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_izravni_deklarator; }
	 
		public Izravni_deklaratorContext() { }
		public void copyFrom(Izravni_deklaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izravni_deklarator3Context extends Izravni_deklaratorContext {
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public TerminalNode KR_VOID() { return getToken(ParserParser.KR_VOID, 0); }
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public Izravni_deklarator3Context(Izravni_deklaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzravni_deklarator3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izravni_deklarator4Context extends Izravni_deklaratorContext {
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public Lista_parametaraContext lista_parametara() {
			return getRuleContext(Lista_parametaraContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public Izravni_deklarator4Context(Izravni_deklaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzravni_deklarator4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izravni_deklarator1Context extends Izravni_deklaratorContext {
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public Izravni_deklarator1Context(Izravni_deklaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzravni_deklarator1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izravni_deklarator2Context extends Izravni_deklaratorContext {
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public TerminalNode L_UGL_ZAGRADA() { return getToken(ParserParser.L_UGL_ZAGRADA, 0); }
		public TerminalNode BROJ() { return getToken(ParserParser.BROJ, 0); }
		public TerminalNode D_UGL_ZAGRADA() { return getToken(ParserParser.D_UGL_ZAGRADA, 0); }
		public Izravni_deklarator2Context(Izravni_deklaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzravni_deklarator2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Izravni_deklaratorContext izravni_deklarator() throws RecognitionException {
		Izravni_deklaratorContext _localctx = new Izravni_deklaratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_izravni_deklarator);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Izravni_deklarator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(IDN);
				}
				break;
			case 2:
				_localctx = new Izravni_deklarator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(IDN);
				setState(101);
				match(L_UGL_ZAGRADA);
				setState(102);
				match(BROJ);
				setState(103);
				match(D_UGL_ZAGRADA);
				}
				break;
			case 3:
				_localctx = new Izravni_deklarator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(IDN);
				setState(105);
				match(L_ZAGRADA);
				setState(106);
				match(KR_VOID);
				setState(107);
				match(D_ZAGRADA);
				}
				break;
			case 4:
				_localctx = new Izravni_deklarator4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(IDN);
				setState(109);
				match(L_ZAGRADA);
				setState(110);
				lista_parametara(0);
				setState(111);
				match(D_ZAGRADA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Init_deklaratorContext extends ParserRuleContext {
		public Init_deklaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_deklarator; }
	 
		public Init_deklaratorContext() { }
		public void copyFrom(Init_deklaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Init_deklarator1Context extends Init_deklaratorContext {
		public Izravni_deklaratorContext izravni_deklarator() {
			return getRuleContext(Izravni_deklaratorContext.class,0);
		}
		public Init_deklarator1Context(Init_deklaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInit_deklarator1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Init_deklarator2Context extends Init_deklaratorContext {
		public Izravni_deklaratorContext izravni_deklarator() {
			return getRuleContext(Izravni_deklaratorContext.class,0);
		}
		public TerminalNode OP_PRIDRUZI() { return getToken(ParserParser.OP_PRIDRUZI, 0); }
		public InicijalizatorContext inicijalizator() {
			return getRuleContext(InicijalizatorContext.class,0);
		}
		public Init_deklarator2Context(Init_deklaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInit_deklarator2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_deklaratorContext init_deklarator() throws RecognitionException {
		Init_deklaratorContext _localctx = new Init_deklaratorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_init_deklarator);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Init_deklarator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				izravni_deklarator();
				}
				break;
			case 2:
				_localctx = new Init_deklarator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				izravni_deklarator();
				setState(117);
				match(OP_PRIDRUZI);
				setState(118);
				inicijalizator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_init_deklaratoraContext extends ParserRuleContext {
		public Lista_init_deklaratoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_init_deklaratora; }
	 
		public Lista_init_deklaratoraContext() { }
		public void copyFrom(Lista_init_deklaratoraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_init_deklaratora2Context extends Lista_init_deklaratoraContext {
		public Lista_init_deklaratoraContext lista_init_deklaratora() {
			return getRuleContext(Lista_init_deklaratoraContext.class,0);
		}
		public TerminalNode ZAREZ() { return getToken(ParserParser.ZAREZ, 0); }
		public Init_deklaratorContext init_deklarator() {
			return getRuleContext(Init_deklaratorContext.class,0);
		}
		public Lista_init_deklaratora2Context(Lista_init_deklaratoraContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_init_deklaratora2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_init_deklaratora1Context extends Lista_init_deklaratoraContext {
		public Init_deklaratorContext init_deklarator() {
			return getRuleContext(Init_deklaratorContext.class,0);
		}
		public Lista_init_deklaratora1Context(Lista_init_deklaratoraContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_init_deklaratora1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_init_deklaratoraContext lista_init_deklaratora() throws RecognitionException {
		return lista_init_deklaratora(0);
	}

	private Lista_init_deklaratoraContext lista_init_deklaratora(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_init_deklaratoraContext _localctx = new Lista_init_deklaratoraContext(_ctx, _parentState);
		Lista_init_deklaratoraContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_lista_init_deklaratora, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Lista_init_deklaratora1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(123);
			init_deklarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_init_deklaratora2Context(new Lista_init_deklaratoraContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lista_init_deklaratora);
					setState(125);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(126);
					match(ZAREZ);
					setState(127);
					init_deklarator();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeklaracijaContext extends ParserRuleContext {
		public Ime_tipaContext ime_tipa() {
			return getRuleContext(Ime_tipaContext.class,0);
		}
		public Lista_init_deklaratoraContext lista_init_deklaratora() {
			return getRuleContext(Lista_init_deklaratoraContext.class,0);
		}
		public TerminalNode TOCKAZAREZ() { return getToken(ParserParser.TOCKAZAREZ, 0); }
		public DeklaracijaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracija; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeklaracija(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeklaracijaContext deklaracija() throws RecognitionException {
		DeklaracijaContext _localctx = new DeklaracijaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deklaracija);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			ime_tipa();
			setState(134);
			lista_init_deklaratora(0);
			setState(135);
			match(TOCKAZAREZ);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_deklaracijaContext extends ParserRuleContext {
		public Lista_deklaracijaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_deklaracija; }
	 
		public Lista_deklaracijaContext() { }
		public void copyFrom(Lista_deklaracijaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_deklaracija1Context extends Lista_deklaracijaContext {
		public DeklaracijaContext deklaracija() {
			return getRuleContext(DeklaracijaContext.class,0);
		}
		public Lista_deklaracija1Context(Lista_deklaracijaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_deklaracija1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_deklaracija2Context extends Lista_deklaracijaContext {
		public Lista_deklaracijaContext lista_deklaracija() {
			return getRuleContext(Lista_deklaracijaContext.class,0);
		}
		public DeklaracijaContext deklaracija() {
			return getRuleContext(DeklaracijaContext.class,0);
		}
		public Lista_deklaracija2Context(Lista_deklaracijaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_deklaracija2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_deklaracijaContext lista_deklaracija() throws RecognitionException {
		return lista_deklaracija(0);
	}

	private Lista_deklaracijaContext lista_deklaracija(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_deklaracijaContext _localctx = new Lista_deklaracijaContext(_ctx, _parentState);
		Lista_deklaracijaContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_lista_deklaracija, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Lista_deklaracija1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(138);
			deklaracija();
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_deklaracija2Context(new Lista_deklaracijaContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lista_deklaracija);
					setState(140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(141);
					deklaracija();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Deklaracija_parametraContext extends ParserRuleContext {
		public Deklaracija_parametraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracija_parametra; }
	 
		public Deklaracija_parametraContext() { }
		public void copyFrom(Deklaracija_parametraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Deklaracija_parametra1Context extends Deklaracija_parametraContext {
		public Ime_tipaContext ime_tipa() {
			return getRuleContext(Ime_tipaContext.class,0);
		}
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public Deklaracija_parametra1Context(Deklaracija_parametraContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeklaracija_parametra1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Deklaracija_parametra2Context extends Deklaracija_parametraContext {
		public Ime_tipaContext ime_tipa() {
			return getRuleContext(Ime_tipaContext.class,0);
		}
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public TerminalNode L_UGL_ZAGRADA() { return getToken(ParserParser.L_UGL_ZAGRADA, 0); }
		public TerminalNode D_UGL_ZAGRADA() { return getToken(ParserParser.D_UGL_ZAGRADA, 0); }
		public Deklaracija_parametra2Context(Deklaracija_parametraContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeklaracija_parametra2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracija_parametraContext deklaracija_parametra() throws RecognitionException {
		Deklaracija_parametraContext _localctx = new Deklaracija_parametraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_deklaracija_parametra);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Deklaracija_parametra1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				ime_tipa();
				setState(148);
				match(IDN);
				}
				break;
			case 2:
				_localctx = new Deklaracija_parametra2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				ime_tipa();
				setState(151);
				match(IDN);
				setState(152);
				match(L_UGL_ZAGRADA);
				setState(153);
				match(D_UGL_ZAGRADA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_parametaraContext extends ParserRuleContext {
		public Lista_parametaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametara; }
	 
		public Lista_parametaraContext() { }
		public void copyFrom(Lista_parametaraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_parametara2Context extends Lista_parametaraContext {
		public Lista_parametaraContext lista_parametara() {
			return getRuleContext(Lista_parametaraContext.class,0);
		}
		public TerminalNode ZAREZ() { return getToken(ParserParser.ZAREZ, 0); }
		public Deklaracija_parametraContext deklaracija_parametra() {
			return getRuleContext(Deklaracija_parametraContext.class,0);
		}
		public Lista_parametara2Context(Lista_parametaraContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_parametara2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_parametara1Context extends Lista_parametaraContext {
		public Deklaracija_parametraContext deklaracija_parametra() {
			return getRuleContext(Deklaracija_parametraContext.class,0);
		}
		public Lista_parametara1Context(Lista_parametaraContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_parametara1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametaraContext lista_parametara() throws RecognitionException {
		return lista_parametara(0);
	}

	private Lista_parametaraContext lista_parametara(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_parametaraContext _localctx = new Lista_parametaraContext(_ctx, _parentState);
		Lista_parametaraContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_lista_parametara, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Lista_parametara1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(158);
			deklaracija_parametra();
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametara2Context(new Lista_parametaraContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametara);
					setState(160);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(161);
					match(ZAREZ);
					setState(162);
					deklaracija_parametra();
					}
					} 
				}
				setState(167);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Definicija_funkcijeContext extends ParserRuleContext {
		public Definicija_funkcijeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicija_funkcije; }
	 
		public Definicija_funkcijeContext() { }
		public void copyFrom(Definicija_funkcijeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Definicija_funkcije1Context extends Definicija_funkcijeContext {
		public Ime_tipaContext ime_tipa() {
			return getRuleContext(Ime_tipaContext.class,0);
		}
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public TerminalNode KR_VOID() { return getToken(ParserParser.KR_VOID, 0); }
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public Slozena_naredbaContext slozena_naredba() {
			return getRuleContext(Slozena_naredbaContext.class,0);
		}
		public Definicija_funkcije1Context(Definicija_funkcijeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDefinicija_funkcije1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Definicija_funkcije2Context extends Definicija_funkcijeContext {
		public Ime_tipaContext ime_tipa() {
			return getRuleContext(Ime_tipaContext.class,0);
		}
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public Lista_parametaraContext lista_parametara() {
			return getRuleContext(Lista_parametaraContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public Slozena_naredbaContext slozena_naredba() {
			return getRuleContext(Slozena_naredbaContext.class,0);
		}
		public Definicija_funkcije2Context(Definicija_funkcijeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDefinicija_funkcije2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicija_funkcijeContext definicija_funkcije() throws RecognitionException {
		Definicija_funkcijeContext _localctx = new Definicija_funkcijeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_definicija_funkcije);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Definicija_funkcije1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				ime_tipa();
				setState(169);
				match(IDN);
				setState(170);
				match(L_ZAGRADA);
				setState(171);
				match(KR_VOID);
				setState(172);
				match(D_ZAGRADA);
				setState(173);
				slozena_naredba();
				}
				break;
			case 2:
				_localctx = new Definicija_funkcije2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				ime_tipa();
				setState(176);
				match(IDN);
				setState(177);
				match(L_ZAGRADA);
				setState(178);
				lista_parametara(0);
				setState(179);
				match(D_ZAGRADA);
				setState(180);
				slozena_naredba();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Vanjska_deklaracijaContext extends ParserRuleContext {
		public Vanjska_deklaracijaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vanjska_deklaracija; }
	 
		public Vanjska_deklaracijaContext() { }
		public void copyFrom(Vanjska_deklaracijaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Vanjska_deklaracija2Context extends Vanjska_deklaracijaContext {
		public DeklaracijaContext deklaracija() {
			return getRuleContext(DeklaracijaContext.class,0);
		}
		public Vanjska_deklaracija2Context(Vanjska_deklaracijaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVanjska_deklaracija2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Vanjska_deklaracija1Context extends Vanjska_deklaracijaContext {
		public Definicija_funkcijeContext definicija_funkcije() {
			return getRuleContext(Definicija_funkcijeContext.class,0);
		}
		public Vanjska_deklaracija1Context(Vanjska_deklaracijaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVanjska_deklaracija1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vanjska_deklaracijaContext vanjska_deklaracija() throws RecognitionException {
		Vanjska_deklaracijaContext _localctx = new Vanjska_deklaracijaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vanjska_deklaracija);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new Vanjska_deklaracija1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				definicija_funkcije();
				}
				break;
			case 2:
				_localctx = new Vanjska_deklaracija2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				deklaracija();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Prijevodna_jedinicaContext extends ParserRuleContext {
		public Prijevodna_jedinicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prijevodna_jedinica; }
	 
		public Prijevodna_jedinicaContext() { }
		public void copyFrom(Prijevodna_jedinicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Prijevodna_jedinica2Context extends Prijevodna_jedinicaContext {
		public Prijevodna_jedinicaContext prijevodna_jedinica() {
			return getRuleContext(Prijevodna_jedinicaContext.class,0);
		}
		public Vanjska_deklaracijaContext vanjska_deklaracija() {
			return getRuleContext(Vanjska_deklaracijaContext.class,0);
		}
		public Prijevodna_jedinica2Context(Prijevodna_jedinicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrijevodna_jedinica2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Prijevodna_jedinica1Context extends Prijevodna_jedinicaContext {
		public Vanjska_deklaracijaContext vanjska_deklaracija() {
			return getRuleContext(Vanjska_deklaracijaContext.class,0);
		}
		public Prijevodna_jedinica1Context(Prijevodna_jedinicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrijevodna_jedinica1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prijevodna_jedinicaContext prijevodna_jedinica() throws RecognitionException {
		return prijevodna_jedinica(0);
	}

	private Prijevodna_jedinicaContext prijevodna_jedinica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Prijevodna_jedinicaContext _localctx = new Prijevodna_jedinicaContext(_ctx, _parentState);
		Prijevodna_jedinicaContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_prijevodna_jedinica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Prijevodna_jedinica1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(189);
			vanjska_deklaracija();
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Prijevodna_jedinica2Context(new Prijevodna_jedinicaContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_prijevodna_jedinica);
					setState(191);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(192);
					vanjska_deklaracija();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_skokaContext extends ParserRuleContext {
		public Naredba_skokaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naredba_skoka; }
	 
		public Naredba_skokaContext() { }
		public void copyFrom(Naredba_skokaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_skoka1Context extends Naredba_skokaContext {
		public TerminalNode KR_CONTINUE() { return getToken(ParserParser.KR_CONTINUE, 0); }
		public TerminalNode TOCKAZAREZ() { return getToken(ParserParser.TOCKAZAREZ, 0); }
		public Naredba_skoka1Context(Naredba_skokaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_skoka1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_skoka2Context extends Naredba_skokaContext {
		public TerminalNode KR_BREAK() { return getToken(ParserParser.KR_BREAK, 0); }
		public TerminalNode TOCKAZAREZ() { return getToken(ParserParser.TOCKAZAREZ, 0); }
		public Naredba_skoka2Context(Naredba_skokaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_skoka2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_skoka3Context extends Naredba_skokaContext {
		public TerminalNode KR_RETURN() { return getToken(ParserParser.KR_RETURN, 0); }
		public TerminalNode TOCKAZAREZ() { return getToken(ParserParser.TOCKAZAREZ, 0); }
		public Naredba_skoka3Context(Naredba_skokaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_skoka3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_skoka4Context extends Naredba_skokaContext {
		public TerminalNode KR_RETURN() { return getToken(ParserParser.KR_RETURN, 0); }
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode TOCKAZAREZ() { return getToken(ParserParser.TOCKAZAREZ, 0); }
		public Naredba_skoka4Context(Naredba_skokaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_skoka4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naredba_skokaContext naredba_skoka() throws RecognitionException {
		Naredba_skokaContext _localctx = new Naredba_skokaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_naredba_skoka);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Naredba_skoka1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(KR_CONTINUE);
				setState(199);
				match(TOCKAZAREZ);
				}
				break;
			case 2:
				_localctx = new Naredba_skoka2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(KR_BREAK);
				setState(201);
				match(TOCKAZAREZ);
				}
				break;
			case 3:
				_localctx = new Naredba_skoka3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(KR_RETURN);
				setState(203);
				match(TOCKAZAREZ);
				}
				break;
			case 4:
				_localctx = new Naredba_skoka4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(KR_RETURN);
				setState(205);
				izraz(0);
				setState(206);
				match(TOCKAZAREZ);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_petljeContext extends ParserRuleContext {
		public Naredba_petljeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naredba_petlje; }
	 
		public Naredba_petljeContext() { }
		public void copyFrom(Naredba_petljeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_petlje3Context extends Naredba_petljeContext {
		public TerminalNode KR_FOR() { return getToken(ParserParser.KR_FOR, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public List<Izraz_naredbaContext> izraz_naredba() {
			return getRuleContexts(Izraz_naredbaContext.class);
		}
		public Izraz_naredbaContext izraz_naredba(int i) {
			return getRuleContext(Izraz_naredbaContext.class,i);
		}
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public NaredbaContext naredba() {
			return getRuleContext(NaredbaContext.class,0);
		}
		public Naredba_petlje3Context(Naredba_petljeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_petlje3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_petlje2Context extends Naredba_petljeContext {
		public TerminalNode KR_FOR() { return getToken(ParserParser.KR_FOR, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public List<Izraz_naredbaContext> izraz_naredba() {
			return getRuleContexts(Izraz_naredbaContext.class);
		}
		public Izraz_naredbaContext izraz_naredba(int i) {
			return getRuleContext(Izraz_naredbaContext.class,i);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public NaredbaContext naredba() {
			return getRuleContext(NaredbaContext.class,0);
		}
		public Naredba_petlje2Context(Naredba_petljeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_petlje2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_petlje1Context extends Naredba_petljeContext {
		public TerminalNode KR_WHILE() { return getToken(ParserParser.KR_WHILE, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public NaredbaContext naredba() {
			return getRuleContext(NaredbaContext.class,0);
		}
		public Naredba_petlje1Context(Naredba_petljeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_petlje1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naredba_petljeContext naredba_petlje() throws RecognitionException {
		Naredba_petljeContext _localctx = new Naredba_petljeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_naredba_petlje);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Naredba_petlje1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(KR_WHILE);
				setState(211);
				match(L_ZAGRADA);
				setState(212);
				izraz(0);
				setState(213);
				match(D_ZAGRADA);
				setState(214);
				naredba();
				}
				break;
			case 2:
				_localctx = new Naredba_petlje2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(KR_FOR);
				setState(217);
				match(L_ZAGRADA);
				setState(218);
				izraz_naredba();
				setState(219);
				izraz_naredba();
				setState(220);
				match(D_ZAGRADA);
				setState(221);
				naredba();
				}
				break;
			case 3:
				_localctx = new Naredba_petlje3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(KR_FOR);
				setState(224);
				match(L_ZAGRADA);
				setState(225);
				izraz_naredba();
				setState(226);
				izraz_naredba();
				setState(227);
				izraz(0);
				setState(228);
				match(D_ZAGRADA);
				setState(229);
				naredba();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_grananjaContext extends ParserRuleContext {
		public Naredba_grananjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naredba_grananja; }
	 
		public Naredba_grananjaContext() { }
		public void copyFrom(Naredba_grananjaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_grananja1Context extends Naredba_grananjaContext {
		public TerminalNode KR_IF() { return getToken(ParserParser.KR_IF, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public NaredbaContext naredba() {
			return getRuleContext(NaredbaContext.class,0);
		}
		public Naredba_grananja1Context(Naredba_grananjaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_grananja1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba_grananja2Context extends Naredba_grananjaContext {
		public TerminalNode KR_IF() { return getToken(ParserParser.KR_IF, 0); }
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public List<NaredbaContext> naredba() {
			return getRuleContexts(NaredbaContext.class);
		}
		public NaredbaContext naredba(int i) {
			return getRuleContext(NaredbaContext.class,i);
		}
		public TerminalNode KR_ELSE() { return getToken(ParserParser.KR_ELSE, 0); }
		public Naredba_grananja2Context(Naredba_grananjaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba_grananja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naredba_grananjaContext naredba_grananja() throws RecognitionException {
		Naredba_grananjaContext _localctx = new Naredba_grananjaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_naredba_grananja);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Naredba_grananja1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(KR_IF);
				setState(234);
				match(L_ZAGRADA);
				setState(235);
				izraz(0);
				setState(236);
				match(D_ZAGRADA);
				setState(237);
				naredba();
				}
				break;
			case 2:
				_localctx = new Naredba_grananja2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(KR_IF);
				setState(240);
				match(L_ZAGRADA);
				setState(241);
				izraz(0);
				setState(242);
				match(D_ZAGRADA);
				setState(243);
				naredba();
				setState(244);
				match(KR_ELSE);
				setState(245);
				naredba();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Izraz_naredbaContext extends ParserRuleContext {
		public Izraz_naredbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_izraz_naredba; }
	 
		public Izraz_naredbaContext() { }
		public void copyFrom(Izraz_naredbaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izraz_naredba1Context extends Izraz_naredbaContext {
		public TerminalNode TOCKAZAREZ() { return getToken(ParserParser.TOCKAZAREZ, 0); }
		public Izraz_naredba1Context(Izraz_naredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzraz_naredba1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izraz_naredba2Context extends Izraz_naredbaContext {
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode TOCKAZAREZ() { return getToken(ParserParser.TOCKAZAREZ, 0); }
		public Izraz_naredba2Context(Izraz_naredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzraz_naredba2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Izraz_naredbaContext izraz_naredba() throws RecognitionException {
		Izraz_naredbaContext _localctx = new Izraz_naredbaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_izraz_naredba);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOCKAZAREZ:
				_localctx = new Izraz_naredba1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(TOCKAZAREZ);
				}
				break;
			case L_ZAGRADA:
			case OP_TILDA:
			case OP_NEG:
			case MINUS:
			case PLUS:
			case OP_DEC:
			case OP_INC:
			case BROJ:
			case IDN:
			case ZNAK:
			case NIZ_ZNAKOVA:
				_localctx = new Izraz_naredba2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				izraz(0);
				setState(251);
				match(TOCKAZAREZ);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NaredbaContext extends ParserRuleContext {
		public NaredbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naredba; }
	 
		public NaredbaContext() { }
		public void copyFrom(NaredbaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba1Context extends NaredbaContext {
		public Slozena_naredbaContext slozena_naredba() {
			return getRuleContext(Slozena_naredbaContext.class,0);
		}
		public Naredba1Context(NaredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba2Context extends NaredbaContext {
		public Izraz_naredbaContext izraz_naredba() {
			return getRuleContext(Izraz_naredbaContext.class,0);
		}
		public Naredba2Context(NaredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba3Context extends NaredbaContext {
		public Naredba_grananjaContext naredba_grananja() {
			return getRuleContext(Naredba_grananjaContext.class,0);
		}
		public Naredba3Context(NaredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba4Context extends NaredbaContext {
		public Naredba_petljeContext naredba_petlje() {
			return getRuleContext(Naredba_petljeContext.class,0);
		}
		public Naredba4Context(NaredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Naredba5Context extends NaredbaContext {
		public Naredba_skokaContext naredba_skoka() {
			return getRuleContext(Naredba_skokaContext.class,0);
		}
		public Naredba5Context(NaredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNaredba5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaredbaContext naredba() throws RecognitionException {
		NaredbaContext _localctx = new NaredbaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_naredba);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_VIT_ZAGRADA:
				_localctx = new Naredba1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				slozena_naredba();
				}
				break;
			case L_ZAGRADA:
			case TOCKAZAREZ:
			case OP_TILDA:
			case OP_NEG:
			case MINUS:
			case PLUS:
			case OP_DEC:
			case OP_INC:
			case BROJ:
			case IDN:
			case ZNAK:
			case NIZ_ZNAKOVA:
				_localctx = new Naredba2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				izraz_naredba();
				}
				break;
			case KR_IF:
				_localctx = new Naredba3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				naredba_grananja();
				}
				break;
			case KR_WHILE:
			case KR_FOR:
				_localctx = new Naredba4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				naredba_petlje();
				}
				break;
			case KR_RETURN:
			case KR_CONTINUE:
			case KR_BREAK:
				_localctx = new Naredba5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				naredba_skoka();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_naredbiContext extends ParserRuleContext {
		public Lista_naredbiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_naredbi; }
	 
		public Lista_naredbiContext() { }
		public void copyFrom(Lista_naredbiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_naredbi1Context extends Lista_naredbiContext {
		public NaredbaContext naredba() {
			return getRuleContext(NaredbaContext.class,0);
		}
		public Lista_naredbi1Context(Lista_naredbiContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_naredbi1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_naredbi2Context extends Lista_naredbiContext {
		public Lista_naredbiContext lista_naredbi() {
			return getRuleContext(Lista_naredbiContext.class,0);
		}
		public NaredbaContext naredba() {
			return getRuleContext(NaredbaContext.class,0);
		}
		public Lista_naredbi2Context(Lista_naredbiContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_naredbi2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_naredbiContext lista_naredbi() throws RecognitionException {
		return lista_naredbi(0);
	}

	private Lista_naredbiContext lista_naredbi(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_naredbiContext _localctx = new Lista_naredbiContext(_ctx, _parentState);
		Lista_naredbiContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_lista_naredbi, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Lista_naredbi1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(263);
			naredba();
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_naredbi2Context(new Lista_naredbiContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lista_naredbi);
					setState(265);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(266);
					naredba();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Slozena_naredbaContext extends ParserRuleContext {
		public Slozena_naredbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slozena_naredba; }
	 
		public Slozena_naredbaContext() { }
		public void copyFrom(Slozena_naredbaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slozena_naredba1Context extends Slozena_naredbaContext {
		public TerminalNode L_VIT_ZAGRADA() { return getToken(ParserParser.L_VIT_ZAGRADA, 0); }
		public Lista_naredbiContext lista_naredbi() {
			return getRuleContext(Lista_naredbiContext.class,0);
		}
		public TerminalNode D_VIT_ZAGRADA() { return getToken(ParserParser.D_VIT_ZAGRADA, 0); }
		public Slozena_naredba1Context(Slozena_naredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSlozena_naredba1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slozena_naredba2Context extends Slozena_naredbaContext {
		public TerminalNode L_VIT_ZAGRADA() { return getToken(ParserParser.L_VIT_ZAGRADA, 0); }
		public Lista_deklaracijaContext lista_deklaracija() {
			return getRuleContext(Lista_deklaracijaContext.class,0);
		}
		public Lista_naredbiContext lista_naredbi() {
			return getRuleContext(Lista_naredbiContext.class,0);
		}
		public TerminalNode D_VIT_ZAGRADA() { return getToken(ParserParser.D_VIT_ZAGRADA, 0); }
		public Slozena_naredba2Context(Slozena_naredbaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSlozena_naredba2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slozena_naredbaContext slozena_naredba() throws RecognitionException {
		Slozena_naredbaContext _localctx = new Slozena_naredbaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_slozena_naredba);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Slozena_naredba1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(L_VIT_ZAGRADA);
				setState(273);
				lista_naredbi(0);
				setState(274);
				match(D_VIT_ZAGRADA);
				}
				break;
			case 2:
				_localctx = new Slozena_naredba2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(L_VIT_ZAGRADA);
				setState(277);
				lista_deklaracija(0);
				setState(278);
				lista_naredbi(0);
				setState(279);
				match(D_VIT_ZAGRADA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IzrazContext extends ParserRuleContext {
		public IzrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_izraz; }
	 
		public IzrazContext() { }
		public void copyFrom(IzrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izraz2Context extends IzrazContext {
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode ZAREZ() { return getToken(ParserParser.ZAREZ, 0); }
		public Izraz_pridruzivanjaContext izraz_pridruzivanja() {
			return getRuleContext(Izraz_pridruzivanjaContext.class,0);
		}
		public Izraz2Context(IzrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izraz1Context extends IzrazContext {
		public Izraz_pridruzivanjaContext izraz_pridruzivanja() {
			return getRuleContext(Izraz_pridruzivanjaContext.class,0);
		}
		public Izraz1Context(IzrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzraz1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IzrazContext izraz() throws RecognitionException {
		return izraz(0);
	}

	private IzrazContext izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IzrazContext _localctx = new IzrazContext(_ctx, _parentState);
		IzrazContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(284);
			izraz_pridruzivanja();
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Izraz2Context(new IzrazContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_izraz);
					setState(286);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(287);
					match(ZAREZ);
					setState(288);
					izraz_pridruzivanja();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Izraz_pridruzivanjaContext extends ParserRuleContext {
		public Izraz_pridruzivanjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_izraz_pridruzivanja; }
	 
		public Izraz_pridruzivanjaContext() { }
		public void copyFrom(Izraz_pridruzivanjaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izraz_pridruzivanja1Context extends Izraz_pridruzivanjaContext {
		public Log_ili_izrazContext log_ili_izraz() {
			return getRuleContext(Log_ili_izrazContext.class,0);
		}
		public Izraz_pridruzivanja1Context(Izraz_pridruzivanjaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzraz_pridruzivanja1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Izraz_pridruzivanja2Context extends Izraz_pridruzivanjaContext {
		public Postfiks_izrazContext postfiks_izraz() {
			return getRuleContext(Postfiks_izrazContext.class,0);
		}
		public TerminalNode OP_PRIDRUZI() { return getToken(ParserParser.OP_PRIDRUZI, 0); }
		public Izraz_pridruzivanjaContext izraz_pridruzivanja() {
			return getRuleContext(Izraz_pridruzivanjaContext.class,0);
		}
		public Izraz_pridruzivanja2Context(Izraz_pridruzivanjaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIzraz_pridruzivanja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Izraz_pridruzivanjaContext izraz_pridruzivanja() throws RecognitionException {
		Izraz_pridruzivanjaContext _localctx = new Izraz_pridruzivanjaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_izraz_pridruzivanja);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Izraz_pridruzivanja1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				log_ili_izraz(0);
				}
				break;
			case 2:
				_localctx = new Izraz_pridruzivanja2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				postfiks_izraz(0);
				setState(296);
				match(OP_PRIDRUZI);
				setState(297);
				izraz_pridruzivanja();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Log_ili_izrazContext extends ParserRuleContext {
		public Log_ili_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_ili_izraz; }
	 
		public Log_ili_izrazContext() { }
		public void copyFrom(Log_ili_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Log_ili_izraz1Context extends Log_ili_izrazContext {
		public Log_i_izrazContext log_i_izraz() {
			return getRuleContext(Log_i_izrazContext.class,0);
		}
		public Log_ili_izraz1Context(Log_ili_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLog_ili_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Log_ili_izraz2Context extends Log_ili_izrazContext {
		public Log_ili_izrazContext log_ili_izraz() {
			return getRuleContext(Log_ili_izrazContext.class,0);
		}
		public TerminalNode OP_ILI() { return getToken(ParserParser.OP_ILI, 0); }
		public Log_i_izrazContext log_i_izraz() {
			return getRuleContext(Log_i_izrazContext.class,0);
		}
		public Log_ili_izraz2Context(Log_ili_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLog_ili_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_ili_izrazContext log_ili_izraz() throws RecognitionException {
		return log_ili_izraz(0);
	}

	private Log_ili_izrazContext log_ili_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Log_ili_izrazContext _localctx = new Log_ili_izrazContext(_ctx, _parentState);
		Log_ili_izrazContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_log_ili_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Log_ili_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(302);
			log_i_izraz(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Log_ili_izraz2Context(new Log_ili_izrazContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_log_ili_izraz);
					setState(304);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(305);
					match(OP_ILI);
					setState(306);
					log_i_izraz(0);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Log_i_izrazContext extends ParserRuleContext {
		public Log_i_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_i_izraz; }
	 
		public Log_i_izrazContext() { }
		public void copyFrom(Log_i_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Log_i_izraz2Context extends Log_i_izrazContext {
		public Log_i_izrazContext log_i_izraz() {
			return getRuleContext(Log_i_izrazContext.class,0);
		}
		public TerminalNode OP_I() { return getToken(ParserParser.OP_I, 0); }
		public Bin_ili_izrazContext bin_ili_izraz() {
			return getRuleContext(Bin_ili_izrazContext.class,0);
		}
		public Log_i_izraz2Context(Log_i_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLog_i_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Log_i_izraz1Context extends Log_i_izrazContext {
		public Bin_ili_izrazContext bin_ili_izraz() {
			return getRuleContext(Bin_ili_izrazContext.class,0);
		}
		public Log_i_izraz1Context(Log_i_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLog_i_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_i_izrazContext log_i_izraz() throws RecognitionException {
		return log_i_izraz(0);
	}

	private Log_i_izrazContext log_i_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Log_i_izrazContext _localctx = new Log_i_izrazContext(_ctx, _parentState);
		Log_i_izrazContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_log_i_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Log_i_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(313);
			bin_ili_izraz(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Log_i_izraz2Context(new Log_i_izrazContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_log_i_izraz);
					setState(315);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(316);
					match(OP_I);
					setState(317);
					bin_ili_izraz(0);
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_ili_izrazContext extends ParserRuleContext {
		public Bin_ili_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_ili_izraz; }
	 
		public Bin_ili_izrazContext() { }
		public void copyFrom(Bin_ili_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bin_ili_izraz2Context extends Bin_ili_izrazContext {
		public Bin_ili_izrazContext bin_ili_izraz() {
			return getRuleContext(Bin_ili_izrazContext.class,0);
		}
		public TerminalNode OP_BIN_ILI() { return getToken(ParserParser.OP_BIN_ILI, 0); }
		public Bin_xili_izrazContext bin_xili_izraz() {
			return getRuleContext(Bin_xili_izrazContext.class,0);
		}
		public Bin_ili_izraz2Context(Bin_ili_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBin_ili_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bin_ili_izraz1Context extends Bin_ili_izrazContext {
		public Bin_xili_izrazContext bin_xili_izraz() {
			return getRuleContext(Bin_xili_izrazContext.class,0);
		}
		public Bin_ili_izraz1Context(Bin_ili_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBin_ili_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_ili_izrazContext bin_ili_izraz() throws RecognitionException {
		return bin_ili_izraz(0);
	}

	private Bin_ili_izrazContext bin_ili_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bin_ili_izrazContext _localctx = new Bin_ili_izrazContext(_ctx, _parentState);
		Bin_ili_izrazContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_bin_ili_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Bin_ili_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(324);
			bin_xili_izraz(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bin_ili_izraz2Context(new Bin_ili_izrazContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bin_ili_izraz);
					setState(326);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(327);
					match(OP_BIN_ILI);
					setState(328);
					bin_xili_izraz(0);
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_xili_izrazContext extends ParserRuleContext {
		public Bin_xili_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_xili_izraz; }
	 
		public Bin_xili_izrazContext() { }
		public void copyFrom(Bin_xili_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bin_xili_izraz1Context extends Bin_xili_izrazContext {
		public Bin_i_izrazContext bin_i_izraz() {
			return getRuleContext(Bin_i_izrazContext.class,0);
		}
		public Bin_xili_izraz1Context(Bin_xili_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBin_xili_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bin_xili_izraz2Context extends Bin_xili_izrazContext {
		public Bin_xili_izrazContext bin_xili_izraz() {
			return getRuleContext(Bin_xili_izrazContext.class,0);
		}
		public TerminalNode OP_BIN_XILI() { return getToken(ParserParser.OP_BIN_XILI, 0); }
		public Bin_i_izrazContext bin_i_izraz() {
			return getRuleContext(Bin_i_izrazContext.class,0);
		}
		public Bin_xili_izraz2Context(Bin_xili_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBin_xili_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_xili_izrazContext bin_xili_izraz() throws RecognitionException {
		return bin_xili_izraz(0);
	}

	private Bin_xili_izrazContext bin_xili_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bin_xili_izrazContext _localctx = new Bin_xili_izrazContext(_ctx, _parentState);
		Bin_xili_izrazContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_bin_xili_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Bin_xili_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(335);
			bin_i_izraz(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bin_xili_izraz2Context(new Bin_xili_izrazContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bin_xili_izraz);
					setState(337);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(338);
					match(OP_BIN_XILI);
					setState(339);
					bin_i_izraz(0);
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_i_izrazContext extends ParserRuleContext {
		public Bin_i_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_i_izraz; }
	 
		public Bin_i_izrazContext() { }
		public void copyFrom(Bin_i_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bin_i_izraz2Context extends Bin_i_izrazContext {
		public Bin_i_izrazContext bin_i_izraz() {
			return getRuleContext(Bin_i_izrazContext.class,0);
		}
		public TerminalNode OP_BIN_I() { return getToken(ParserParser.OP_BIN_I, 0); }
		public Jednakosni_izrazContext jednakosni_izraz() {
			return getRuleContext(Jednakosni_izrazContext.class,0);
		}
		public Bin_i_izraz2Context(Bin_i_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBin_i_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bin_i_izraz1Context extends Bin_i_izrazContext {
		public Jednakosni_izrazContext jednakosni_izraz() {
			return getRuleContext(Jednakosni_izrazContext.class,0);
		}
		public Bin_i_izraz1Context(Bin_i_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBin_i_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_i_izrazContext bin_i_izraz() throws RecognitionException {
		return bin_i_izraz(0);
	}

	private Bin_i_izrazContext bin_i_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bin_i_izrazContext _localctx = new Bin_i_izrazContext(_ctx, _parentState);
		Bin_i_izrazContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_bin_i_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Bin_i_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(346);
			jednakosni_izraz(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bin_i_izraz2Context(new Bin_i_izrazContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bin_i_izraz);
					setState(348);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(349);
					match(OP_BIN_I);
					setState(350);
					jednakosni_izraz(0);
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jednakosni_izrazContext extends ParserRuleContext {
		public Jednakosni_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jednakosni_izraz; }
	 
		public Jednakosni_izrazContext() { }
		public void copyFrom(Jednakosni_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jednakosni_izraz2Context extends Jednakosni_izrazContext {
		public Jednakosni_izrazContext jednakosni_izraz() {
			return getRuleContext(Jednakosni_izrazContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(ParserParser.OP_EQ, 0); }
		public Odnosni_izrazContext odnosni_izraz() {
			return getRuleContext(Odnosni_izrazContext.class,0);
		}
		public Jednakosni_izraz2Context(Jednakosni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJednakosni_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jednakosni_izraz1Context extends Jednakosni_izrazContext {
		public Odnosni_izrazContext odnosni_izraz() {
			return getRuleContext(Odnosni_izrazContext.class,0);
		}
		public Jednakosni_izraz1Context(Jednakosni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJednakosni_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jednakosni_izraz3Context extends Jednakosni_izrazContext {
		public Jednakosni_izrazContext jednakosni_izraz() {
			return getRuleContext(Jednakosni_izrazContext.class,0);
		}
		public TerminalNode OP_NEQ() { return getToken(ParserParser.OP_NEQ, 0); }
		public Odnosni_izrazContext odnosni_izraz() {
			return getRuleContext(Odnosni_izrazContext.class,0);
		}
		public Jednakosni_izraz3Context(Jednakosni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJednakosni_izraz3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jednakosni_izrazContext jednakosni_izraz() throws RecognitionException {
		return jednakosni_izraz(0);
	}

	private Jednakosni_izrazContext jednakosni_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Jednakosni_izrazContext _localctx = new Jednakosni_izrazContext(_ctx, _parentState);
		Jednakosni_izrazContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_jednakosni_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Jednakosni_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(357);
			odnosni_izraz(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new Jednakosni_izraz2Context(new Jednakosni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jednakosni_izraz);
						setState(359);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(360);
						match(OP_EQ);
						setState(361);
						odnosni_izraz(0);
						}
						break;
					case 2:
						{
						_localctx = new Jednakosni_izraz3Context(new Jednakosni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jednakosni_izraz);
						setState(362);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(363);
						match(OP_NEQ);
						setState(364);
						odnosni_izraz(0);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Odnosni_izrazContext extends ParserRuleContext {
		public Odnosni_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_odnosni_izraz; }
	 
		public Odnosni_izrazContext() { }
		public void copyFrom(Odnosni_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Odnosni_izraz4Context extends Odnosni_izrazContext {
		public Odnosni_izrazContext odnosni_izraz() {
			return getRuleContext(Odnosni_izrazContext.class,0);
		}
		public TerminalNode OP_LTE() { return getToken(ParserParser.OP_LTE, 0); }
		public Aditivni_izrazContext aditivni_izraz() {
			return getRuleContext(Aditivni_izrazContext.class,0);
		}
		public Odnosni_izraz4Context(Odnosni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOdnosni_izraz4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Odnosni_izraz3Context extends Odnosni_izrazContext {
		public Odnosni_izrazContext odnosni_izraz() {
			return getRuleContext(Odnosni_izrazContext.class,0);
		}
		public TerminalNode OP_GT() { return getToken(ParserParser.OP_GT, 0); }
		public Aditivni_izrazContext aditivni_izraz() {
			return getRuleContext(Aditivni_izrazContext.class,0);
		}
		public Odnosni_izraz3Context(Odnosni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOdnosni_izraz3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Odnosni_izraz5Context extends Odnosni_izrazContext {
		public Odnosni_izrazContext odnosni_izraz() {
			return getRuleContext(Odnosni_izrazContext.class,0);
		}
		public TerminalNode OP_GTE() { return getToken(ParserParser.OP_GTE, 0); }
		public Aditivni_izrazContext aditivni_izraz() {
			return getRuleContext(Aditivni_izrazContext.class,0);
		}
		public Odnosni_izraz5Context(Odnosni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOdnosni_izraz5(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Odnosni_izraz2Context extends Odnosni_izrazContext {
		public Odnosni_izrazContext odnosni_izraz() {
			return getRuleContext(Odnosni_izrazContext.class,0);
		}
		public TerminalNode OP_LT() { return getToken(ParserParser.OP_LT, 0); }
		public Aditivni_izrazContext aditivni_izraz() {
			return getRuleContext(Aditivni_izrazContext.class,0);
		}
		public Odnosni_izraz2Context(Odnosni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOdnosni_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Odnosni_izraz1Context extends Odnosni_izrazContext {
		public Aditivni_izrazContext aditivni_izraz() {
			return getRuleContext(Aditivni_izrazContext.class,0);
		}
		public Odnosni_izraz1Context(Odnosni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOdnosni_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Odnosni_izrazContext odnosni_izraz() throws RecognitionException {
		return odnosni_izraz(0);
	}

	private Odnosni_izrazContext odnosni_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Odnosni_izrazContext _localctx = new Odnosni_izrazContext(_ctx, _parentState);
		Odnosni_izrazContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_odnosni_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Odnosni_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(371);
			aditivni_izraz(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new Odnosni_izraz2Context(new Odnosni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_odnosni_izraz);
						setState(373);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(374);
						match(OP_LT);
						setState(375);
						aditivni_izraz(0);
						}
						break;
					case 2:
						{
						_localctx = new Odnosni_izraz3Context(new Odnosni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_odnosni_izraz);
						setState(376);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(377);
						match(OP_GT);
						setState(378);
						aditivni_izraz(0);
						}
						break;
					case 3:
						{
						_localctx = new Odnosni_izraz4Context(new Odnosni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_odnosni_izraz);
						setState(379);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(380);
						match(OP_LTE);
						setState(381);
						aditivni_izraz(0);
						}
						break;
					case 4:
						{
						_localctx = new Odnosni_izraz5Context(new Odnosni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_odnosni_izraz);
						setState(382);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(383);
						match(OP_GTE);
						setState(384);
						aditivni_izraz(0);
						}
						break;
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aditivni_izrazContext extends ParserRuleContext {
		public Aditivni_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aditivni_izraz; }
	 
		public Aditivni_izrazContext() { }
		public void copyFrom(Aditivni_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Aditivni_izraz3Context extends Aditivni_izrazContext {
		public Aditivni_izrazContext aditivni_izraz() {
			return getRuleContext(Aditivni_izrazContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ParserParser.MINUS, 0); }
		public Multiplikativni_izrazContext multiplikativni_izraz() {
			return getRuleContext(Multiplikativni_izrazContext.class,0);
		}
		public Aditivni_izraz3Context(Aditivni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAditivni_izraz3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Aditivni_izraz1Context extends Aditivni_izrazContext {
		public Multiplikativni_izrazContext multiplikativni_izraz() {
			return getRuleContext(Multiplikativni_izrazContext.class,0);
		}
		public Aditivni_izraz1Context(Aditivni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAditivni_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Aditivni_izraz2Context extends Aditivni_izrazContext {
		public Aditivni_izrazContext aditivni_izraz() {
			return getRuleContext(Aditivni_izrazContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ParserParser.PLUS, 0); }
		public Multiplikativni_izrazContext multiplikativni_izraz() {
			return getRuleContext(Multiplikativni_izrazContext.class,0);
		}
		public Aditivni_izraz2Context(Aditivni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAditivni_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aditivni_izrazContext aditivni_izraz() throws RecognitionException {
		return aditivni_izraz(0);
	}

	private Aditivni_izrazContext aditivni_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Aditivni_izrazContext _localctx = new Aditivni_izrazContext(_ctx, _parentState);
		Aditivni_izrazContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_aditivni_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Aditivni_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(391);
			multiplikativni_izraz(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Aditivni_izraz2Context(new Aditivni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aditivni_izraz);
						setState(393);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(394);
						match(PLUS);
						setState(395);
						multiplikativni_izraz(0);
						}
						break;
					case 2:
						{
						_localctx = new Aditivni_izraz3Context(new Aditivni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aditivni_izraz);
						setState(396);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(397);
						match(MINUS);
						setState(398);
						multiplikativni_izraz(0);
						}
						break;
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplikativni_izrazContext extends ParserRuleContext {
		public Multiplikativni_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplikativni_izraz; }
	 
		public Multiplikativni_izrazContext() { }
		public void copyFrom(Multiplikativni_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Multiplikativni_izraz3Context extends Multiplikativni_izrazContext {
		public Multiplikativni_izrazContext multiplikativni_izraz() {
			return getRuleContext(Multiplikativni_izrazContext.class,0);
		}
		public TerminalNode OP_DIJELI() { return getToken(ParserParser.OP_DIJELI, 0); }
		public Cast_izrazContext cast_izraz() {
			return getRuleContext(Cast_izrazContext.class,0);
		}
		public Multiplikativni_izraz3Context(Multiplikativni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMultiplikativni_izraz3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Multiplikativni_izraz4Context extends Multiplikativni_izrazContext {
		public Multiplikativni_izrazContext multiplikativni_izraz() {
			return getRuleContext(Multiplikativni_izrazContext.class,0);
		}
		public TerminalNode OP_MOD() { return getToken(ParserParser.OP_MOD, 0); }
		public Cast_izrazContext cast_izraz() {
			return getRuleContext(Cast_izrazContext.class,0);
		}
		public Multiplikativni_izraz4Context(Multiplikativni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMultiplikativni_izraz4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Multiplikativni_izraz1Context extends Multiplikativni_izrazContext {
		public Cast_izrazContext cast_izraz() {
			return getRuleContext(Cast_izrazContext.class,0);
		}
		public Multiplikativni_izraz1Context(Multiplikativni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMultiplikativni_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Multiplikativni_izraz2Context extends Multiplikativni_izrazContext {
		public Multiplikativni_izrazContext multiplikativni_izraz() {
			return getRuleContext(Multiplikativni_izrazContext.class,0);
		}
		public TerminalNode OP_PUTA() { return getToken(ParserParser.OP_PUTA, 0); }
		public Cast_izrazContext cast_izraz() {
			return getRuleContext(Cast_izrazContext.class,0);
		}
		public Multiplikativni_izraz2Context(Multiplikativni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMultiplikativni_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplikativni_izrazContext multiplikativni_izraz() throws RecognitionException {
		return multiplikativni_izraz(0);
	}

	private Multiplikativni_izrazContext multiplikativni_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplikativni_izrazContext _localctx = new Multiplikativni_izrazContext(_ctx, _parentState);
		Multiplikativni_izrazContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_multiplikativni_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Multiplikativni_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(405);
			cast_izraz();
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(416);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplikativni_izraz2Context(new Multiplikativni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplikativni_izraz);
						setState(407);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(408);
						match(OP_PUTA);
						setState(409);
						cast_izraz();
						}
						break;
					case 2:
						{
						_localctx = new Multiplikativni_izraz3Context(new Multiplikativni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplikativni_izraz);
						setState(410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(411);
						match(OP_DIJELI);
						setState(412);
						cast_izraz();
						}
						break;
					case 3:
						{
						_localctx = new Multiplikativni_izraz4Context(new Multiplikativni_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplikativni_izraz);
						setState(413);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(414);
						match(OP_MOD);
						setState(415);
						cast_izraz();
						}
						break;
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Specifikator_tipaContext extends ParserRuleContext {
		public Specifikator_tipaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifikator_tipa; }
	 
		public Specifikator_tipaContext() { }
		public void copyFrom(Specifikator_tipaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Specifikator_tipa3Context extends Specifikator_tipaContext {
		public TerminalNode KR_INT() { return getToken(ParserParser.KR_INT, 0); }
		public Specifikator_tipa3Context(Specifikator_tipaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSpecifikator_tipa3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Specifikator_tipa2Context extends Specifikator_tipaContext {
		public TerminalNode KR_CHAR() { return getToken(ParserParser.KR_CHAR, 0); }
		public Specifikator_tipa2Context(Specifikator_tipaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSpecifikator_tipa2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Specifikator_tipa1Context extends Specifikator_tipaContext {
		public TerminalNode KR_VOID() { return getToken(ParserParser.KR_VOID, 0); }
		public Specifikator_tipa1Context(Specifikator_tipaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSpecifikator_tipa1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specifikator_tipaContext specifikator_tipa() throws RecognitionException {
		Specifikator_tipaContext _localctx = new Specifikator_tipaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_specifikator_tipa);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KR_VOID:
				_localctx = new Specifikator_tipa1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(KR_VOID);
				}
				break;
			case KR_CHAR:
				_localctx = new Specifikator_tipa2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(KR_CHAR);
				}
				break;
			case KR_INT:
				_localctx = new Specifikator_tipa3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(KR_INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ime_tipaContext extends ParserRuleContext {
		public Ime_tipaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ime_tipa; }
	 
		public Ime_tipaContext() { }
		public void copyFrom(Ime_tipaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ime_tipa2Context extends Ime_tipaContext {
		public TerminalNode KR_CONST() { return getToken(ParserParser.KR_CONST, 0); }
		public Specifikator_tipaContext specifikator_tipa() {
			return getRuleContext(Specifikator_tipaContext.class,0);
		}
		public Ime_tipa2Context(Ime_tipaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIme_tipa2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ime_tipa1Context extends Ime_tipaContext {
		public Specifikator_tipaContext specifikator_tipa() {
			return getRuleContext(Specifikator_tipaContext.class,0);
		}
		public Ime_tipa1Context(Ime_tipaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIme_tipa1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ime_tipaContext ime_tipa() throws RecognitionException {
		Ime_tipaContext _localctx = new Ime_tipaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ime_tipa);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KR_VOID:
			case KR_INT:
			case KR_CHAR:
				_localctx = new Ime_tipa1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				specifikator_tipa();
				}
				break;
			case KR_CONST:
				_localctx = new Ime_tipa2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(KR_CONST);
				setState(428);
				specifikator_tipa();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cast_izrazContext extends ParserRuleContext {
		public Cast_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_izraz; }
	 
		public Cast_izrazContext() { }
		public void copyFrom(Cast_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cast_izraz1Context extends Cast_izrazContext {
		public Unarni_izrazContext unarni_izraz() {
			return getRuleContext(Unarni_izrazContext.class,0);
		}
		public Cast_izraz1Context(Cast_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCast_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cast_izraz2Context extends Cast_izrazContext {
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public Ime_tipaContext ime_tipa() {
			return getRuleContext(Ime_tipaContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public Cast_izrazContext cast_izraz() {
			return getRuleContext(Cast_izrazContext.class,0);
		}
		public Cast_izraz2Context(Cast_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCast_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_izrazContext cast_izraz() throws RecognitionException {
		Cast_izrazContext _localctx = new Cast_izrazContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cast_izraz);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new Cast_izraz1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				unarni_izraz();
				}
				break;
			case 2:
				_localctx = new Cast_izraz2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(L_ZAGRADA);
				setState(433);
				ime_tipa();
				setState(434);
				match(D_ZAGRADA);
				setState(435);
				cast_izraz();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_operatorContext extends ParserRuleContext {
		public Unarni_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarni_operator; }
	 
		public Unarni_operatorContext() { }
		public void copyFrom(Unarni_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_operator1Context extends Unarni_operatorContext {
		public TerminalNode PLUS() { return getToken(ParserParser.PLUS, 0); }
		public Unarni_operator1Context(Unarni_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarni_operator1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_operator4Context extends Unarni_operatorContext {
		public TerminalNode OP_NEG() { return getToken(ParserParser.OP_NEG, 0); }
		public Unarni_operator4Context(Unarni_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarni_operator4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_operator2Context extends Unarni_operatorContext {
		public TerminalNode MINUS() { return getToken(ParserParser.MINUS, 0); }
		public Unarni_operator2Context(Unarni_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarni_operator2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_operator3Context extends Unarni_operatorContext {
		public TerminalNode OP_TILDA() { return getToken(ParserParser.OP_TILDA, 0); }
		public Unarni_operator3Context(Unarni_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarni_operator3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unarni_operatorContext unarni_operator() throws RecognitionException {
		Unarni_operatorContext _localctx = new Unarni_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unarni_operator);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new Unarni_operator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new Unarni_operator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(MINUS);
				}
				break;
			case OP_TILDA:
				_localctx = new Unarni_operator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(OP_TILDA);
				}
				break;
			case OP_NEG:
				_localctx = new Unarni_operator4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				match(OP_NEG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_izrazContext extends ParserRuleContext {
		public Unarni_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarni_izraz; }
	 
		public Unarni_izrazContext() { }
		public void copyFrom(Unarni_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_izraz4Context extends Unarni_izrazContext {
		public Unarni_operatorContext unarni_operator() {
			return getRuleContext(Unarni_operatorContext.class,0);
		}
		public Cast_izrazContext cast_izraz() {
			return getRuleContext(Cast_izrazContext.class,0);
		}
		public Unarni_izraz4Context(Unarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarni_izraz4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_izraz3Context extends Unarni_izrazContext {
		public TerminalNode OP_DEC() { return getToken(ParserParser.OP_DEC, 0); }
		public Unarni_izrazContext unarni_izraz() {
			return getRuleContext(Unarni_izrazContext.class,0);
		}
		public Unarni_izraz3Context(Unarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarni_izraz3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_izraz2Context extends Unarni_izrazContext {
		public TerminalNode OP_INC() { return getToken(ParserParser.OP_INC, 0); }
		public Unarni_izrazContext unarni_izraz() {
			return getRuleContext(Unarni_izrazContext.class,0);
		}
		public Unarni_izraz2Context(Unarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarni_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unarni_izraz1Context extends Unarni_izrazContext {
		public Postfiks_izrazContext postfiks_izraz() {
			return getRuleContext(Postfiks_izrazContext.class,0);
		}
		public Unarni_izraz1Context(Unarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarni_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unarni_izrazContext unarni_izraz() throws RecognitionException {
		Unarni_izrazContext _localctx = new Unarni_izrazContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unarni_izraz);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ZAGRADA:
			case BROJ:
			case IDN:
			case ZNAK:
			case NIZ_ZNAKOVA:
				_localctx = new Unarni_izraz1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				postfiks_izraz(0);
				}
				break;
			case OP_INC:
				_localctx = new Unarni_izraz2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(OP_INC);
				setState(447);
				unarni_izraz();
				}
				break;
			case OP_DEC:
				_localctx = new Unarni_izraz3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(OP_DEC);
				setState(449);
				unarni_izraz();
				}
				break;
			case OP_TILDA:
			case OP_NEG:
			case MINUS:
			case PLUS:
				_localctx = new Unarni_izraz4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				unarni_operator();
				setState(451);
				cast_izraz();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_argumenataContext extends ParserRuleContext {
		public Lista_argumenataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_argumenata; }
	 
		public Lista_argumenataContext() { }
		public void copyFrom(Lista_argumenataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_argumenata1Context extends Lista_argumenataContext {
		public Izraz_pridruzivanjaContext izraz_pridruzivanja() {
			return getRuleContext(Izraz_pridruzivanjaContext.class,0);
		}
		public Lista_argumenata1Context(Lista_argumenataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_argumenata1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lista_argumenata2Context extends Lista_argumenataContext {
		public Lista_argumenataContext lista_argumenata() {
			return getRuleContext(Lista_argumenataContext.class,0);
		}
		public TerminalNode ZAREZ() { return getToken(ParserParser.ZAREZ, 0); }
		public Izraz_pridruzivanjaContext izraz_pridruzivanja() {
			return getRuleContext(Izraz_pridruzivanjaContext.class,0);
		}
		public Lista_argumenata2Context(Lista_argumenataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLista_argumenata2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_argumenataContext lista_argumenata() throws RecognitionException {
		return lista_argumenata(0);
	}

	private Lista_argumenataContext lista_argumenata(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_argumenataContext _localctx = new Lista_argumenataContext(_ctx, _parentState);
		Lista_argumenataContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_lista_argumenata, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Lista_argumenata1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(456);
			izraz_pridruzivanja();
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_argumenata2Context(new Lista_argumenataContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lista_argumenata);
					setState(458);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(459);
					match(ZAREZ);
					setState(460);
					izraz_pridruzivanja();
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Postfiks_izrazContext extends ParserRuleContext {
		public Postfiks_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfiks_izraz; }
	 
		public Postfiks_izrazContext() { }
		public void copyFrom(Postfiks_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Postfiks_izraz3Context extends Postfiks_izrazContext {
		public Postfiks_izrazContext postfiks_izraz() {
			return getRuleContext(Postfiks_izrazContext.class,0);
		}
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public Postfiks_izraz3Context(Postfiks_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostfiks_izraz3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Postfiks_izraz2Context extends Postfiks_izrazContext {
		public Postfiks_izrazContext postfiks_izraz() {
			return getRuleContext(Postfiks_izrazContext.class,0);
		}
		public TerminalNode L_UGL_ZAGRADA() { return getToken(ParserParser.L_UGL_ZAGRADA, 0); }
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode D_UGL_ZAGRADA() { return getToken(ParserParser.D_UGL_ZAGRADA, 0); }
		public Postfiks_izraz2Context(Postfiks_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostfiks_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Postfiks_izraz5Context extends Postfiks_izrazContext {
		public Postfiks_izrazContext postfiks_izraz() {
			return getRuleContext(Postfiks_izrazContext.class,0);
		}
		public TerminalNode OP_INC() { return getToken(ParserParser.OP_INC, 0); }
		public Postfiks_izraz5Context(Postfiks_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostfiks_izraz5(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Postfiks_izraz4Context extends Postfiks_izrazContext {
		public Postfiks_izrazContext postfiks_izraz() {
			return getRuleContext(Postfiks_izrazContext.class,0);
		}
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public Lista_argumenataContext lista_argumenata() {
			return getRuleContext(Lista_argumenataContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public Postfiks_izraz4Context(Postfiks_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostfiks_izraz4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Postfiks_izraz1Context extends Postfiks_izrazContext {
		public Primarni_izrazContext primarni_izraz() {
			return getRuleContext(Primarni_izrazContext.class,0);
		}
		public Postfiks_izraz1Context(Postfiks_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostfiks_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Postfiks_izraz6Context extends Postfiks_izrazContext {
		public Postfiks_izrazContext postfiks_izraz() {
			return getRuleContext(Postfiks_izrazContext.class,0);
		}
		public TerminalNode OP_DEC() { return getToken(ParserParser.OP_DEC, 0); }
		public Postfiks_izraz6Context(Postfiks_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostfiks_izraz6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfiks_izrazContext postfiks_izraz() throws RecognitionException {
		return postfiks_izraz(0);
	}

	private Postfiks_izrazContext postfiks_izraz(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfiks_izrazContext _localctx = new Postfiks_izrazContext(_ctx, _parentState);
		Postfiks_izrazContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_postfiks_izraz, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Postfiks_izraz1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(467);
			primarni_izraz();
			}
			_ctx.stop = _input.LT(-1);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(486);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new Postfiks_izraz2Context(new Postfiks_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfiks_izraz);
						setState(469);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(470);
						match(L_UGL_ZAGRADA);
						setState(471);
						izraz(0);
						setState(472);
						match(D_UGL_ZAGRADA);
						}
						break;
					case 2:
						{
						_localctx = new Postfiks_izraz3Context(new Postfiks_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfiks_izraz);
						setState(474);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(475);
						match(L_ZAGRADA);
						setState(476);
						match(D_ZAGRADA);
						}
						break;
					case 3:
						{
						_localctx = new Postfiks_izraz4Context(new Postfiks_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfiks_izraz);
						setState(477);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(478);
						match(L_ZAGRADA);
						setState(479);
						lista_argumenata(0);
						setState(480);
						match(D_ZAGRADA);
						}
						break;
					case 4:
						{
						_localctx = new Postfiks_izraz5Context(new Postfiks_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfiks_izraz);
						setState(482);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(483);
						match(OP_INC);
						}
						break;
					case 5:
						{
						_localctx = new Postfiks_izraz6Context(new Postfiks_izrazContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfiks_izraz);
						setState(484);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(485);
						match(OP_DEC);
						}
						break;
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primarni_izrazContext extends ParserRuleContext {
		public Primarni_izrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primarni_izraz; }
	 
		public Primarni_izrazContext() { }
		public void copyFrom(Primarni_izrazContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Primarni_izraz5Context extends Primarni_izrazContext {
		public TerminalNode L_ZAGRADA() { return getToken(ParserParser.L_ZAGRADA, 0); }
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode D_ZAGRADA() { return getToken(ParserParser.D_ZAGRADA, 0); }
		public Primarni_izraz5Context(Primarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimarni_izraz5(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Primarni_izraz4Context extends Primarni_izrazContext {
		public TerminalNode NIZ_ZNAKOVA() { return getToken(ParserParser.NIZ_ZNAKOVA, 0); }
		public Primarni_izraz4Context(Primarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimarni_izraz4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Primarni_izraz3Context extends Primarni_izrazContext {
		public TerminalNode ZNAK() { return getToken(ParserParser.ZNAK, 0); }
		public Primarni_izraz3Context(Primarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimarni_izraz3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Primarni_izraz2Context extends Primarni_izrazContext {
		public TerminalNode BROJ() { return getToken(ParserParser.BROJ, 0); }
		public Primarni_izraz2Context(Primarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimarni_izraz2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Primarni_izraz1Context extends Primarni_izrazContext {
		public TerminalNode IDN() { return getToken(ParserParser.IDN, 0); }
		public Primarni_izraz1Context(Primarni_izrazContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimarni_izraz1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primarni_izrazContext primarni_izraz() throws RecognitionException {
		Primarni_izrazContext _localctx = new Primarni_izrazContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primarni_izraz);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDN:
				_localctx = new Primarni_izraz1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(IDN);
				}
				break;
			case BROJ:
				_localctx = new Primarni_izraz2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(BROJ);
				}
				break;
			case ZNAK:
				_localctx = new Primarni_izraz3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(ZNAK);
				}
				break;
			case NIZ_ZNAKOVA:
				_localctx = new Primarni_izraz4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				match(NIZ_ZNAKOVA);
				}
				break;
			case L_ZAGRADA:
				_localctx = new Primarni_izraz5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
				match(L_ZAGRADA);
				setState(496);
				izraz(0);
				setState(497);
				match(D_ZAGRADA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return lista_izraza_pridruzivanja_sempred((Lista_izraza_pridruzivanjaContext)_localctx, predIndex);
		case 5:
			return lista_init_deklaratora_sempred((Lista_init_deklaratoraContext)_localctx, predIndex);
		case 7:
			return lista_deklaracija_sempred((Lista_deklaracijaContext)_localctx, predIndex);
		case 9:
			return lista_parametara_sempred((Lista_parametaraContext)_localctx, predIndex);
		case 12:
			return prijevodna_jedinica_sempred((Prijevodna_jedinicaContext)_localctx, predIndex);
		case 18:
			return lista_naredbi_sempred((Lista_naredbiContext)_localctx, predIndex);
		case 20:
			return izraz_sempred((IzrazContext)_localctx, predIndex);
		case 22:
			return log_ili_izraz_sempred((Log_ili_izrazContext)_localctx, predIndex);
		case 23:
			return log_i_izraz_sempred((Log_i_izrazContext)_localctx, predIndex);
		case 24:
			return bin_ili_izraz_sempred((Bin_ili_izrazContext)_localctx, predIndex);
		case 25:
			return bin_xili_izraz_sempred((Bin_xili_izrazContext)_localctx, predIndex);
		case 26:
			return bin_i_izraz_sempred((Bin_i_izrazContext)_localctx, predIndex);
		case 27:
			return jednakosni_izraz_sempred((Jednakosni_izrazContext)_localctx, predIndex);
		case 28:
			return odnosni_izraz_sempred((Odnosni_izrazContext)_localctx, predIndex);
		case 29:
			return aditivni_izraz_sempred((Aditivni_izrazContext)_localctx, predIndex);
		case 30:
			return multiplikativni_izraz_sempred((Multiplikativni_izrazContext)_localctx, predIndex);
		case 36:
			return lista_argumenata_sempred((Lista_argumenataContext)_localctx, predIndex);
		case 37:
			return postfiks_izraz_sempred((Postfiks_izrazContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lista_izraza_pridruzivanja_sempred(Lista_izraza_pridruzivanjaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_init_deklaratora_sempred(Lista_init_deklaratoraContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_deklaracija_sempred(Lista_deklaracijaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_parametara_sempred(Lista_parametaraContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean prijevodna_jedinica_sempred(Prijevodna_jedinicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_naredbi_sempred(Lista_naredbiContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean izraz_sempred(IzrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean log_ili_izraz_sempred(Log_ili_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean log_i_izraz_sempred(Log_i_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bin_ili_izraz_sempred(Bin_ili_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bin_xili_izraz_sempred(Bin_xili_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bin_i_izraz_sempred(Bin_i_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean jednakosni_izraz_sempred(Jednakosni_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean odnosni_izraz_sempred(Odnosni_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean aditivni_izraz_sempred(Aditivni_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplikativni_izraz_sempred(Multiplikativni_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_argumenata_sempred(Lista_argumenataContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfiks_izraz_sempred(Postfiks_izrazContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 5);
		case 25:
			return precpred(_ctx, 4);
		case 26:
			return precpred(_ctx, 3);
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u01f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001X\b\u0001\n\u0001\f\u0001[\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002b\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003r\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004y\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0081\b\u0005\n\u0005\f\u0005\u0084\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u008f\b\u0007\n\u0007\f\u0007\u0092\t\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009c"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a4\b\t"+
		"\n\t\f\t\u00a7\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b7"+
		"\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u00bb\b\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00c2\b\f\n\f\f\f\u00c5\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00d1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e8\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00f8\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00fe\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0105\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u010c\b\u0012"+
		"\n\u0012\f\u0012\u010f\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u011a\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0122\b\u0014\n\u0014\f\u0014\u0125\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u012c\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0134\b\u0016\n\u0016\f\u0016\u0137\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u013f\b\u0017\n\u0017\f\u0017\u0142\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u014a\b\u0018"+
		"\n\u0018\f\u0018\u014d\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0155\b\u0019\n\u0019\f\u0019"+
		"\u0158\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0160\b\u001a\n\u001a\f\u001a\u0163\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u016e\b\u001b\n\u001b\f\u001b"+
		"\u0171\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0182\b\u001c"+
		"\n\u001c\f\u001c\u0185\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0190\b\u001d\n\u001d\f\u001d\u0193\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01a1\b\u001e"+
		"\n\u001e\f\u001e\u01a4\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01a9\b\u001f\u0001 \u0001 \u0001 \u0003 \u01ae\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u01b6\b!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u01bc\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u01c6\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u01ce\b$\n$\f$\u01d1\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u01e7\b%\n%\f%\u01ea\t%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01f4\b&\u0001&\u0000\u0012"+
		"\u0002\n\u000e\u0012\u0018$(,.02468:<HJ\'\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJL\u0000\u0000\u020e\u0000N\u0001\u0000\u0000\u0000\u0002Q\u0001"+
		"\u0000\u0000\u0000\u0004a\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000"+
		"\u0000\bx\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000\u0000\f\u0085\u0001"+
		"\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u009b\u0001"+
		"\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00b6\u0001"+
		"\u0000\u0000\u0000\u0016\u00ba\u0001\u0000\u0000\u0000\u0018\u00bc\u0001"+
		"\u0000\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c\u00e7\u0001"+
		"\u0000\u0000\u0000\u001e\u00f7\u0001\u0000\u0000\u0000 \u00fd\u0001\u0000"+
		"\u0000\u0000\"\u0104\u0001\u0000\u0000\u0000$\u0106\u0001\u0000\u0000"+
		"\u0000&\u0119\u0001\u0000\u0000\u0000(\u011b\u0001\u0000\u0000\u0000*"+
		"\u012b\u0001\u0000\u0000\u0000,\u012d\u0001\u0000\u0000\u0000.\u0138\u0001"+
		"\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u014e\u0001\u0000\u0000"+
		"\u00004\u0159\u0001\u0000\u0000\u00006\u0164\u0001\u0000\u0000\u00008"+
		"\u0172\u0001\u0000\u0000\u0000:\u0186\u0001\u0000\u0000\u0000<\u0194\u0001"+
		"\u0000\u0000\u0000>\u01a8\u0001\u0000\u0000\u0000@\u01ad\u0001\u0000\u0000"+
		"\u0000B\u01b5\u0001\u0000\u0000\u0000D\u01bb\u0001\u0000\u0000\u0000F"+
		"\u01c5\u0001\u0000\u0000\u0000H\u01c7\u0001\u0000\u0000\u0000J\u01d2\u0001"+
		"\u0000\u0000\u0000L\u01f3\u0001\u0000\u0000\u0000NO\u0003\u0018\f\u0000"+
		"OP\u0005\u0000\u0000\u0001P\u0001\u0001\u0000\u0000\u0000QR\u0006\u0001"+
		"\uffff\uffff\u0000RS\u0003*\u0015\u0000SY\u0001\u0000\u0000\u0000TU\n"+
		"\u0001\u0000\u0000UV\u0005\b\u0000\u0000VX\u0003*\u0015\u0000WT\u0001"+
		"\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\u0003\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\b\u0003*\u0015\u0000]^\u0005\u0004\u0000\u0000^_\u0003\u0002"+
		"\u0001\u0000_`\u0005\u0003\u0000\u0000`b\u0001\u0000\u0000\u0000a\\\u0001"+
		"\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000b\u0005\u0001\u0000\u0000"+
		"\u0000cr\u0005+\u0000\u0000de\u0005+\u0000\u0000ef\u0005\u0002\u0000\u0000"+
		"fg\u0005)\u0000\u0000gr\u0005\u0001\u0000\u0000hi\u0005+\u0000\u0000i"+
		"j\u0005\u0006\u0000\u0000jk\u0005\u001f\u0000\u0000kr\u0005\u0005\u0000"+
		"\u0000lm\u0005+\u0000\u0000mn\u0005\u0006\u0000\u0000no\u0003\u0012\t"+
		"\u0000op\u0005\u0005\u0000\u0000pr\u0001\u0000\u0000\u0000qc\u0001\u0000"+
		"\u0000\u0000qd\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000ql\u0001"+
		"\u0000\u0000\u0000r\u0007\u0001\u0000\u0000\u0000sy\u0003\u0006\u0003"+
		"\u0000tu\u0003\u0006\u0003\u0000uv\u0005\u0016\u0000\u0000vw\u0003\u0004"+
		"\u0002\u0000wy\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xt\u0001"+
		"\u0000\u0000\u0000y\t\u0001\u0000\u0000\u0000z{\u0006\u0005\uffff\uffff"+
		"\u0000{|\u0003\b\u0004\u0000|\u0082\u0001\u0000\u0000\u0000}~\n\u0001"+
		"\u0000\u0000~\u007f\u0005\b\u0000\u0000\u007f\u0081\u0003\b\u0004\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u000b\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0003@ \u0000\u0086\u0087\u0003\n\u0005\u0000\u0087\u0088\u0005"+
		"\u0007\u0000\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u008a\u0006\u0007"+
		"\uffff\uffff\u0000\u008a\u008b\u0003\f\u0006\u0000\u008b\u0090\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\n\u0001\u0000\u0000\u008d\u008f\u0003\f\u0006"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u000f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0003@ \u0000\u0094\u0095\u0005+\u0000\u0000\u0095"+
		"\u009c\u0001\u0000\u0000\u0000\u0096\u0097\u0003@ \u0000\u0097\u0098\u0005"+
		"+\u0000\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099\u009a\u0005\u0001"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000"+
		"\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009c\u0011\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0006\t\uffff\uffff\u0000\u009e\u009f\u0003\u0010"+
		"\b\u0000\u009f\u00a5\u0001\u0000\u0000\u0000\u00a0\u00a1\n\u0001\u0000"+
		"\u0000\u00a1\u00a2\u0005\b\u0000\u0000\u00a2\u00a4\u0003\u0010\b\u0000"+
		"\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u0013\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0003@ \u0000\u00a9\u00aa\u0005+\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0006\u0000\u0000\u00ab\u00ac\u0005\u001f\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0005\u0000\u0000\u00ad\u00ae\u0003&\u0013\u0000\u00ae\u00b7\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0003@ \u0000\u00b0\u00b1\u0005+\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b3\u0003\u0012\t\u0000"+
		"\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b5\u0003&\u0013\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00a8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00af\u0001\u0000\u0000\u0000\u00b7\u0015\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0003\u0014\n\u0000\u00b9\u00bb\u0003\f\u0006\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u0017"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0006\f\uffff\uffff\u0000\u00bd\u00be"+
		"\u0003\u0016\u000b\u0000\u00be\u00c3\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\n\u0001\u0000\u0000\u00c0\u00c2\u0003\u0016\u000b\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u0019\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005"+
		"%\u0000\u0000\u00c7\u00d1\u0005\u0007\u0000\u0000\u00c8\u00c9\u0005(\u0000"+
		"\u0000\u00c9\u00d1\u0005\u0007\u0000\u0000\u00ca\u00cb\u0005 \u0000\u0000"+
		"\u00cb\u00d1\u0005\u0007\u0000\u0000\u00cc\u00cd\u0005 \u0000\u0000\u00cd"+
		"\u00ce\u0003(\u0014\u0000\u00ce\u00cf\u0005\u0007\u0000\u0000\u00cf\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000\u00d0\u00c8"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d1\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005\u001e\u0000\u0000\u00d3\u00d4\u0005\u0006\u0000\u0000\u00d4\u00d5"+
		"\u0003(\u0014\u0000\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6\u00d7\u0003"+
		"\"\u0011\u0000\u00d7\u00e8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005#"+
		"\u0000\u0000\u00d9\u00da\u0005\u0006\u0000\u0000\u00da\u00db\u0003 \u0010"+
		"\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00dd\u0005\u0005\u0000\u0000"+
		"\u00dd\u00de\u0003\"\u0011\u0000\u00de\u00e8\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005#\u0000\u0000\u00e0\u00e1\u0005\u0006\u0000\u0000\u00e1\u00e2"+
		"\u0003 \u0010\u0000\u00e2\u00e3\u0003 \u0010\u0000\u00e3\u00e4\u0003("+
		"\u0014\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5\u00e6\u0003\"\u0011"+
		"\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00d2\u0001\u0000\u0000"+
		"\u0000\u00e7\u00d8\u0001\u0000\u0000\u0000\u00e7\u00df\u0001\u0000\u0000"+
		"\u0000\u00e8\u001d\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\"\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0006\u0000\u0000\u00eb\u00ec\u0003(\u0014\u0000\u00ec"+
		"\u00ed\u0005\u0005\u0000\u0000\u00ed\u00ee\u0003\"\u0011\u0000\u00ee\u00f8"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\"\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0006\u0000\u0000\u00f1\u00f2\u0003(\u0014\u0000\u00f2\u00f3\u0005\u0005"+
		"\u0000\u0000\u00f3\u00f4\u0003\"\u0011\u0000\u00f4\u00f5\u0005$\u0000"+
		"\u0000\u00f5\u00f6\u0003\"\u0011\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f7\u00e9\u0001\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f8\u001f\u0001\u0000\u0000\u0000\u00f9\u00fe\u0005\u0007\u0000\u0000"+
		"\u00fa\u00fb\u0003(\u0014\u0000\u00fb\u00fc\u0005\u0007\u0000\u0000\u00fc"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fe!\u0001\u0000\u0000\u0000\u00ff\u0105"+
		"\u0003&\u0013\u0000\u0100\u0105\u0003 \u0010\u0000\u0101\u0105\u0003\u001e"+
		"\u000f\u0000\u0102\u0105\u0003\u001c\u000e\u0000\u0103\u0105\u0003\u001a"+
		"\r\u0000\u0104\u00ff\u0001\u0000\u0000\u0000\u0104\u0100\u0001\u0000\u0000"+
		"\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105#\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0006\u0012\uffff\uffff\u0000\u0107\u0108\u0003\"\u0011\u0000"+
		"\u0108\u010d\u0001\u0000\u0000\u0000\u0109\u010a\n\u0001\u0000\u0000\u010a"+
		"\u010c\u0003\"\u0011\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f"+
		"\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e%\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005\u0004\u0000\u0000\u0111\u0112\u0003"+
		"$\u0012\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u011a\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005\u0004\u0000\u0000\u0115\u0116\u0003\u000e"+
		"\u0007\u0000\u0116\u0117\u0003$\u0012\u0000\u0117\u0118\u0005\u0003\u0000"+
		"\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0110\u0001\u0000\u0000"+
		"\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u011a\'\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0006\u0014\uffff\uffff\u0000\u011c\u011d\u0003*\u0015\u0000"+
		"\u011d\u0123\u0001\u0000\u0000\u0000\u011e\u011f\n\u0001\u0000\u0000\u011f"+
		"\u0120\u0005\b\u0000\u0000\u0120\u0122\u0003*\u0015\u0000\u0121\u011e"+
		"\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124)\u0001"+
		"\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u012c\u0003"+
		",\u0016\u0000\u0127\u0128\u0003J%\u0000\u0128\u0129\u0005\u0016\u0000"+
		"\u0000\u0129\u012a\u0003*\u0015\u0000\u012a\u012c\u0001\u0000\u0000\u0000"+
		"\u012b\u0126\u0001\u0000\u0000\u0000\u012b\u0127\u0001\u0000\u0000\u0000"+
		"\u012c+\u0001\u0000\u0000\u0000\u012d\u012e\u0006\u0016\uffff\uffff\u0000"+
		"\u012e\u012f\u0003.\u0017\u0000\u012f\u0135\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\n\u0001\u0000\u0000\u0131\u0132\u0005\f\u0000\u0000\u0132\u0134"+
		"\u0003.\u0017\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0134\u0137\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136-\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0006\u0017\uffff\uffff\u0000\u0139\u013a\u0003"+
		"0\u0018\u0000\u013a\u0140\u0001\u0000\u0000\u0000\u013b\u013c\n\u0001"+
		"\u0000\u0000\u013c\u013d\u0005\r\u0000\u0000\u013d\u013f\u00030\u0018"+
		"\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000"+
		"\u0000\u0141/\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0006\u0018\uffff\uffff\u0000\u0144\u0145\u00032\u0019\u0000"+
		"\u0145\u014b\u0001\u0000\u0000\u0000\u0146\u0147\n\u0001\u0000\u0000\u0147"+
		"\u0148\u0005\n\u0000\u0000\u0148\u014a\u00032\u0019\u0000\u0149\u0146"+
		"\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c1\u0001"+
		"\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u0006"+
		"\u0019\uffff\uffff\u0000\u014f\u0150\u00034\u001a\u0000\u0150\u0156\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\n\u0001\u0000\u0000\u0152\u0153\u0005\t"+
		"\u0000\u0000\u0153\u0155\u00034\u001a\u0000\u0154\u0151\u0001\u0000\u0000"+
		"\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u01573\u0001\u0000\u0000\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015a\u0006\u001a\uffff\uffff"+
		"\u0000\u015a\u015b\u00036\u001b\u0000\u015b\u0161\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\n\u0001\u0000\u0000\u015d\u015e\u0005\u000b\u0000\u0000\u015e"+
		"\u0160\u00036\u001b\u0000\u015f\u015c\u0001\u0000\u0000\u0000\u0160\u0163"+
		"\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u01625\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0006\u001b\uffff\uffff\u0000\u0165\u0166"+
		"\u00038\u001c\u0000\u0166\u016f\u0001\u0000\u0000\u0000\u0167\u0168\n"+
		"\u0002\u0000\u0000\u0168\u0169\u0005\u0011\u0000\u0000\u0169\u016e\u0003"+
		"8\u001c\u0000\u016a\u016b\n\u0001\u0000\u0000\u016b\u016c\u0005\u0010"+
		"\u0000\u0000\u016c\u016e\u00038\u001c\u0000\u016d\u0167\u0001\u0000\u0000"+
		"\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u01707\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0006\u001c\uffff\uffff\u0000\u0173\u0174\u0003:\u001d\u0000"+
		"\u0174\u0183\u0001\u0000\u0000\u0000\u0175\u0176\n\u0004\u0000\u0000\u0176"+
		"\u0177\u0005\u0015\u0000\u0000\u0177\u0182\u0003:\u001d\u0000\u0178\u0179"+
		"\n\u0003\u0000\u0000\u0179\u017a\u0005\u0013\u0000\u0000\u017a\u0182\u0003"+
		":\u001d\u0000\u017b\u017c\n\u0002\u0000\u0000\u017c\u017d\u0005\u0014"+
		"\u0000\u0000\u017d\u0182\u0003:\u001d\u0000\u017e\u017f\n\u0001\u0000"+
		"\u0000\u017f\u0180\u0005\u0012\u0000\u0000\u0180\u0182\u0003:\u001d\u0000"+
		"\u0181\u0175\u0001\u0000\u0000\u0000\u0181\u0178\u0001\u0000\u0000\u0000"+
		"\u0181\u017b\u0001\u0000\u0000\u0000\u0181\u017e\u0001\u0000\u0000\u0000"+
		"\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u01849\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0186\u0187\u0006\u001d\uffff\uffff\u0000"+
		"\u0187\u0188\u0003<\u001e\u0000\u0188\u0191\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\n\u0002\u0000\u0000\u018a\u018b\u0005\u001b\u0000\u0000\u018b\u0190"+
		"\u0003<\u001e\u0000\u018c\u018d\n\u0001\u0000\u0000\u018d\u018e\u0005"+
		"\u001a\u0000\u0000\u018e\u0190\u0003<\u001e\u0000\u018f\u0189\u0001\u0000"+
		"\u0000\u0000\u018f\u018c\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192;\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0006\u001e\uffff\uffff\u0000\u0195\u0196\u0003B!\u0000"+
		"\u0196\u01a2\u0001\u0000\u0000\u0000\u0197\u0198\n\u0003\u0000\u0000\u0198"+
		"\u0199\u0005\u0019\u0000\u0000\u0199\u01a1\u0003B!\u0000\u019a\u019b\n"+
		"\u0002\u0000\u0000\u019b\u019c\u0005\u0018\u0000\u0000\u019c\u01a1\u0003"+
		"B!\u0000\u019d\u019e\n\u0001\u0000\u0000\u019e\u019f\u0005\u0017\u0000"+
		"\u0000\u019f\u01a1\u0003B!\u0000\u01a0\u0197\u0001\u0000\u0000\u0000\u01a0"+
		"\u019a\u0001\u0000\u0000\u0000\u01a0\u019d\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a3=\u0001\u0000\u0000\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a9\u0005\u001f\u0000\u0000\u01a6\u01a9"+
		"\u0005\'\u0000\u0000\u01a7\u01a9\u0005!\u0000\u0000\u01a8\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a9?\u0001\u0000\u0000\u0000\u01aa\u01ae\u0003>\u001f"+
		"\u0000\u01ab\u01ac\u0005&\u0000\u0000\u01ac\u01ae\u0003>\u001f\u0000\u01ad"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae"+
		"A\u0001\u0000\u0000\u0000\u01af\u01b6\u0003F#\u0000\u01b0\u01b1\u0005"+
		"\u0006\u0000\u0000\u01b1\u01b2\u0003@ \u0000\u01b2\u01b3\u0005\u0005\u0000"+
		"\u0000\u01b3\u01b4\u0003B!\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5"+
		"\u01af\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000\u0000\u01b6"+
		"C\u0001\u0000\u0000\u0000\u01b7\u01bc\u0005\u001b\u0000\u0000\u01b8\u01bc"+
		"\u0005\u001a\u0000\u0000\u01b9\u01bc\u0005\u000e\u0000\u0000\u01ba\u01bc"+
		"\u0005\u000f\u0000\u0000\u01bb\u01b7\u0001\u0000\u0000\u0000\u01bb\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bcE\u0001\u0000\u0000\u0000\u01bd\u01c6\u0003"+
		"J%\u0000\u01be\u01bf\u0005\u001d\u0000\u0000\u01bf\u01c6\u0003F#\u0000"+
		"\u01c0\u01c1\u0005\u001c\u0000\u0000\u01c1\u01c6\u0003F#\u0000\u01c2\u01c3"+
		"\u0003D\"\u0000\u01c3\u01c4\u0003B!\u0000\u01c4\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c5\u01bd\u0001\u0000\u0000\u0000\u01c5\u01be\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c0\u0001\u0000\u0000\u0000\u01c5\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c6G\u0001\u0000\u0000\u0000\u01c7\u01c8\u0006$\uffff\uffff\u0000"+
		"\u01c8\u01c9\u0003*\u0015\u0000\u01c9\u01cf\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\n\u0001\u0000\u0000\u01cb\u01cc\u0005\b\u0000\u0000\u01cc\u01ce"+
		"\u0003*\u0015\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0I\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0006%\uffff\uffff\u0000\u01d3\u01d4\u0003L&"+
		"\u0000\u01d4\u01e8\u0001\u0000\u0000\u0000\u01d5\u01d6\n\u0005\u0000\u0000"+
		"\u01d6\u01d7\u0005\u0002\u0000\u0000\u01d7\u01d8\u0003(\u0014\u0000\u01d8"+
		"\u01d9\u0005\u0001\u0000\u0000\u01d9\u01e7\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\n\u0004\u0000\u0000\u01db\u01dc\u0005\u0006\u0000\u0000\u01dc\u01e7"+
		"\u0005\u0005\u0000\u0000\u01dd\u01de\n\u0003\u0000\u0000\u01de\u01df\u0005"+
		"\u0006\u0000\u0000\u01df\u01e0\u0003H$\u0000\u01e0\u01e1\u0005\u0005\u0000"+
		"\u0000\u01e1\u01e7\u0001\u0000\u0000\u0000\u01e2\u01e3\n\u0002\u0000\u0000"+
		"\u01e3\u01e7\u0005\u001d\u0000\u0000\u01e4\u01e5\n\u0001\u0000\u0000\u01e5"+
		"\u01e7\u0005\u001c\u0000\u0000\u01e6\u01d5\u0001\u0000\u0000\u0000\u01e6"+
		"\u01da\u0001\u0000\u0000\u0000\u01e6\u01dd\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7"+
		"\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e9K\u0001\u0000\u0000\u0000\u01ea\u01e8"+
		"\u0001\u0000\u0000\u0000\u01eb\u01f4\u0005+\u0000\u0000\u01ec\u01f4\u0005"+
		")\u0000\u0000\u01ed\u01f4\u0005,\u0000\u0000\u01ee\u01f4\u0005-\u0000"+
		"\u0000\u01ef\u01f0\u0005\u0006\u0000\u0000\u01f0\u01f1\u0003(\u0014\u0000"+
		"\u01f1\u01f2\u0005\u0005\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f3\u01eb\u0001\u0000\u0000\u0000\u01f3\u01ec\u0001\u0000\u0000\u0000"+
		"\u01f3\u01ed\u0001\u0000\u0000\u0000\u01f3\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f3\u01ef\u0001\u0000\u0000\u0000\u01f4M\u0001\u0000\u0000\u0000*Y"+
		"aqx\u0082\u0090\u009b\u00a5\u00b6\u00ba\u00c3\u00d0\u00e7\u00f7\u00fd"+
		"\u0104\u010d\u0119\u0123\u012b\u0135\u0140\u014b\u0156\u0161\u016d\u016f"+
		"\u0181\u0183\u018f\u0191\u01a0\u01a2\u01a8\u01ad\u01b5\u01bb\u01c5\u01cf"+
		"\u01e6\u01e8\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}