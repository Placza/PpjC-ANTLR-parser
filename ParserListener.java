// Generated from Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserParser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#lista_izraza_pridruzivanja}.
	 * @param ctx the parse tree
	 */
	void enterLista_izraza_pridruzivanja(ParserParser.Lista_izraza_pridruzivanjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#lista_izraza_pridruzivanja}.
	 * @param ctx the parse tree
	 */
	void exitLista_izraza_pridruzivanja(ParserParser.Lista_izraza_pridruzivanjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#inicijalizator}.
	 * @param ctx the parse tree
	 */
	void enterInicijalizator(ParserParser.InicijalizatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#inicijalizator}.
	 * @param ctx the parse tree
	 */
	void exitInicijalizator(ParserParser.InicijalizatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#izravni_deklarator}.
	 * @param ctx the parse tree
	 */
	void enterIzravni_deklarator(ParserParser.Izravni_deklaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#izravni_deklarator}.
	 * @param ctx the parse tree
	 */
	void exitIzravni_deklarator(ParserParser.Izravni_deklaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#init_deklarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_deklarator(ParserParser.Init_deklaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#init_deklarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_deklarator(ParserParser.Init_deklaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#lista_init_deklaratora}.
	 * @param ctx the parse tree
	 */
	void enterLista_init_deklaratora(ParserParser.Lista_init_deklaratoraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#lista_init_deklaratora}.
	 * @param ctx the parse tree
	 */
	void exitLista_init_deklaratora(ParserParser.Lista_init_deklaratoraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#deklaracija}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracija(ParserParser.DeklaracijaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#deklaracija}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracija(ParserParser.DeklaracijaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#lista_deklaracija}.
	 * @param ctx the parse tree
	 */
	void enterLista_deklaracija(ParserParser.Lista_deklaracijaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#lista_deklaracija}.
	 * @param ctx the parse tree
	 */
	void exitLista_deklaracija(ParserParser.Lista_deklaracijaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#deklaracija_parametra}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracija_parametra(ParserParser.Deklaracija_parametraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#deklaracija_parametra}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracija_parametra(ParserParser.Deklaracija_parametraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#lista_parametara}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametara(ParserParser.Lista_parametaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#lista_parametara}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametara(ParserParser.Lista_parametaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#definicija_funkcije}.
	 * @param ctx the parse tree
	 */
	void enterDefinicija_funkcije(ParserParser.Definicija_funkcijeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#definicija_funkcije}.
	 * @param ctx the parse tree
	 */
	void exitDefinicija_funkcije(ParserParser.Definicija_funkcijeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#vanjska_deklaracija}.
	 * @param ctx the parse tree
	 */
	void enterVanjska_deklaracija(ParserParser.Vanjska_deklaracijaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#vanjska_deklaracija}.
	 * @param ctx the parse tree
	 */
	void exitVanjska_deklaracija(ParserParser.Vanjska_deklaracijaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#prijevodna_jedinica}.
	 * @param ctx the parse tree
	 */
	void enterPrijevodna_jedinica(ParserParser.Prijevodna_jedinicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#prijevodna_jedinica}.
	 * @param ctx the parse tree
	 */
	void exitPrijevodna_jedinica(ParserParser.Prijevodna_jedinicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#naredba_skoka}.
	 * @param ctx the parse tree
	 */
	void enterNaredba_skoka(ParserParser.Naredba_skokaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#naredba_skoka}.
	 * @param ctx the parse tree
	 */
	void exitNaredba_skoka(ParserParser.Naredba_skokaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#naredba_petlje}.
	 * @param ctx the parse tree
	 */
	void enterNaredba_petlje(ParserParser.Naredba_petljeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#naredba_petlje}.
	 * @param ctx the parse tree
	 */
	void exitNaredba_petlje(ParserParser.Naredba_petljeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#naredba_grananja}.
	 * @param ctx the parse tree
	 */
	void enterNaredba_grananja(ParserParser.Naredba_grananjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#naredba_grananja}.
	 * @param ctx the parse tree
	 */
	void exitNaredba_grananja(ParserParser.Naredba_grananjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#izraz_naredba}.
	 * @param ctx the parse tree
	 */
	void enterIzraz_naredba(ParserParser.Izraz_naredbaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#izraz_naredba}.
	 * @param ctx the parse tree
	 */
	void exitIzraz_naredba(ParserParser.Izraz_naredbaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#naredba}.
	 * @param ctx the parse tree
	 */
	void enterNaredba(ParserParser.NaredbaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#naredba}.
	 * @param ctx the parse tree
	 */
	void exitNaredba(ParserParser.NaredbaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#lista_naredbi}.
	 * @param ctx the parse tree
	 */
	void enterLista_naredbi(ParserParser.Lista_naredbiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#lista_naredbi}.
	 * @param ctx the parse tree
	 */
	void exitLista_naredbi(ParserParser.Lista_naredbiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#slozena_naredba}.
	 * @param ctx the parse tree
	 */
	void enterSlozena_naredba(ParserParser.Slozena_naredbaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#slozena_naredba}.
	 * @param ctx the parse tree
	 */
	void exitSlozena_naredba(ParserParser.Slozena_naredbaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code izraz2}
	 * labeled alternative in {@link ParserParser#izraz}.
	 * @param ctx the parse tree
	 */
	void enterIzraz2(ParserParser.Izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code izraz2}
	 * labeled alternative in {@link ParserParser#izraz}.
	 * @param ctx the parse tree
	 */
	void exitIzraz2(ParserParser.Izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code izraz1}
	 * labeled alternative in {@link ParserParser#izraz}.
	 * @param ctx the parse tree
	 */
	void enterIzraz1(ParserParser.Izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code izraz1}
	 * labeled alternative in {@link ParserParser#izraz}.
	 * @param ctx the parse tree
	 */
	void exitIzraz1(ParserParser.Izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code izraz_pridruzivanja1}
	 * labeled alternative in {@link ParserParser#izraz_pridruzivanja}.
	 * @param ctx the parse tree
	 */
	void enterIzraz_pridruzivanja1(ParserParser.Izraz_pridruzivanja1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code izraz_pridruzivanja1}
	 * labeled alternative in {@link ParserParser#izraz_pridruzivanja}.
	 * @param ctx the parse tree
	 */
	void exitIzraz_pridruzivanja1(ParserParser.Izraz_pridruzivanja1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code izraz_pridruzivanja2}
	 * labeled alternative in {@link ParserParser#izraz_pridruzivanja}.
	 * @param ctx the parse tree
	 */
	void enterIzraz_pridruzivanja2(ParserParser.Izraz_pridruzivanja2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code izraz_pridruzivanja2}
	 * labeled alternative in {@link ParserParser#izraz_pridruzivanja}.
	 * @param ctx the parse tree
	 */
	void exitIzraz_pridruzivanja2(ParserParser.Izraz_pridruzivanja2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code log_ili_izraz1}
	 * labeled alternative in {@link ParserParser#log_ili_izraz}.
	 * @param ctx the parse tree
	 */
	void enterLog_ili_izraz1(ParserParser.Log_ili_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code log_ili_izraz1}
	 * labeled alternative in {@link ParserParser#log_ili_izraz}.
	 * @param ctx the parse tree
	 */
	void exitLog_ili_izraz1(ParserParser.Log_ili_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code log_ili_izraz2}
	 * labeled alternative in {@link ParserParser#log_ili_izraz}.
	 * @param ctx the parse tree
	 */
	void enterLog_ili_izraz2(ParserParser.Log_ili_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code log_ili_izraz2}
	 * labeled alternative in {@link ParserParser#log_ili_izraz}.
	 * @param ctx the parse tree
	 */
	void exitLog_ili_izraz2(ParserParser.Log_ili_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code log_i_izraz2}
	 * labeled alternative in {@link ParserParser#log_i_izraz}.
	 * @param ctx the parse tree
	 */
	void enterLog_i_izraz2(ParserParser.Log_i_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code log_i_izraz2}
	 * labeled alternative in {@link ParserParser#log_i_izraz}.
	 * @param ctx the parse tree
	 */
	void exitLog_i_izraz2(ParserParser.Log_i_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code log_i_izraz1}
	 * labeled alternative in {@link ParserParser#log_i_izraz}.
	 * @param ctx the parse tree
	 */
	void enterLog_i_izraz1(ParserParser.Log_i_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code log_i_izraz1}
	 * labeled alternative in {@link ParserParser#log_i_izraz}.
	 * @param ctx the parse tree
	 */
	void exitLog_i_izraz1(ParserParser.Log_i_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_ili_izraz2}
	 * labeled alternative in {@link ParserParser#bin_ili_izraz}.
	 * @param ctx the parse tree
	 */
	void enterBin_ili_izraz2(ParserParser.Bin_ili_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_ili_izraz2}
	 * labeled alternative in {@link ParserParser#bin_ili_izraz}.
	 * @param ctx the parse tree
	 */
	void exitBin_ili_izraz2(ParserParser.Bin_ili_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_ili_izraz1}
	 * labeled alternative in {@link ParserParser#bin_ili_izraz}.
	 * @param ctx the parse tree
	 */
	void enterBin_ili_izraz1(ParserParser.Bin_ili_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_ili_izraz1}
	 * labeled alternative in {@link ParserParser#bin_ili_izraz}.
	 * @param ctx the parse tree
	 */
	void exitBin_ili_izraz1(ParserParser.Bin_ili_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_xili_izraz1}
	 * labeled alternative in {@link ParserParser#bin_xili_izraz}.
	 * @param ctx the parse tree
	 */
	void enterBin_xili_izraz1(ParserParser.Bin_xili_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_xili_izraz1}
	 * labeled alternative in {@link ParserParser#bin_xili_izraz}.
	 * @param ctx the parse tree
	 */
	void exitBin_xili_izraz1(ParserParser.Bin_xili_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_xili_izraz2}
	 * labeled alternative in {@link ParserParser#bin_xili_izraz}.
	 * @param ctx the parse tree
	 */
	void enterBin_xili_izraz2(ParserParser.Bin_xili_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_xili_izraz2}
	 * labeled alternative in {@link ParserParser#bin_xili_izraz}.
	 * @param ctx the parse tree
	 */
	void exitBin_xili_izraz2(ParserParser.Bin_xili_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_i_izraz2}
	 * labeled alternative in {@link ParserParser#bin_i_izraz}.
	 * @param ctx the parse tree
	 */
	void enterBin_i_izraz2(ParserParser.Bin_i_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_i_izraz2}
	 * labeled alternative in {@link ParserParser#bin_i_izraz}.
	 * @param ctx the parse tree
	 */
	void exitBin_i_izraz2(ParserParser.Bin_i_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_i_izraz1}
	 * labeled alternative in {@link ParserParser#bin_i_izraz}.
	 * @param ctx the parse tree
	 */
	void enterBin_i_izraz1(ParserParser.Bin_i_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_i_izraz1}
	 * labeled alternative in {@link ParserParser#bin_i_izraz}.
	 * @param ctx the parse tree
	 */
	void exitBin_i_izraz1(ParserParser.Bin_i_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code jednakosni_izraz2}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterJednakosni_izraz2(ParserParser.Jednakosni_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code jednakosni_izraz2}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitJednakosni_izraz2(ParserParser.Jednakosni_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code jednakosni_izraz1}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterJednakosni_izraz1(ParserParser.Jednakosni_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code jednakosni_izraz1}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitJednakosni_izraz1(ParserParser.Jednakosni_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code jednakosni_izraz3}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterJednakosni_izraz3(ParserParser.Jednakosni_izraz3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code jednakosni_izraz3}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitJednakosni_izraz3(ParserParser.Jednakosni_izraz3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code odnosni_izraz4}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterOdnosni_izraz4(ParserParser.Odnosni_izraz4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code odnosni_izraz4}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitOdnosni_izraz4(ParserParser.Odnosni_izraz4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code odnosni_izraz3}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterOdnosni_izraz3(ParserParser.Odnosni_izraz3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code odnosni_izraz3}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitOdnosni_izraz3(ParserParser.Odnosni_izraz3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code odnosni_izraz5}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterOdnosni_izraz5(ParserParser.Odnosni_izraz5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code odnosni_izraz5}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitOdnosni_izraz5(ParserParser.Odnosni_izraz5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code odnosni_izraz2}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterOdnosni_izraz2(ParserParser.Odnosni_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code odnosni_izraz2}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitOdnosni_izraz2(ParserParser.Odnosni_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code odnosni_izraz1}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterOdnosni_izraz1(ParserParser.Odnosni_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code odnosni_izraz1}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitOdnosni_izraz1(ParserParser.Odnosni_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code aditivni_izraz3}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterAditivni_izraz3(ParserParser.Aditivni_izraz3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code aditivni_izraz3}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitAditivni_izraz3(ParserParser.Aditivni_izraz3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code aditivni_izraz1}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterAditivni_izraz1(ParserParser.Aditivni_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code aditivni_izraz1}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitAditivni_izraz1(ParserParser.Aditivni_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code aditivni_izraz2}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterAditivni_izraz2(ParserParser.Aditivni_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code aditivni_izraz2}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitAditivni_izraz2(ParserParser.Aditivni_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplikativni_izraz3}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterMultiplikativni_izraz3(ParserParser.Multiplikativni_izraz3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplikativni_izraz3}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitMultiplikativni_izraz3(ParserParser.Multiplikativni_izraz3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplikativni_izraz4}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterMultiplikativni_izraz4(ParserParser.Multiplikativni_izraz4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplikativni_izraz4}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitMultiplikativni_izraz4(ParserParser.Multiplikativni_izraz4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplikativni_izraz1}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterMultiplikativni_izraz1(ParserParser.Multiplikativni_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplikativni_izraz1}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitMultiplikativni_izraz1(ParserParser.Multiplikativni_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplikativni_izraz2}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterMultiplikativni_izraz2(ParserParser.Multiplikativni_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplikativni_izraz2}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitMultiplikativni_izraz2(ParserParser.Multiplikativni_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code specifikator_tipa1}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 */
	void enterSpecifikator_tipa1(ParserParser.Specifikator_tipa1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code specifikator_tipa1}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 */
	void exitSpecifikator_tipa1(ParserParser.Specifikator_tipa1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code specifikator_tipa2}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 */
	void enterSpecifikator_tipa2(ParserParser.Specifikator_tipa2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code specifikator_tipa2}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 */
	void exitSpecifikator_tipa2(ParserParser.Specifikator_tipa2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code specifikator_tipa3}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 */
	void enterSpecifikator_tipa3(ParserParser.Specifikator_tipa3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code specifikator_tipa3}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 */
	void exitSpecifikator_tipa3(ParserParser.Specifikator_tipa3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ime_tipa1}
	 * labeled alternative in {@link ParserParser#ime_tipa}.
	 * @param ctx the parse tree
	 */
	void enterIme_tipa1(ParserParser.Ime_tipa1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ime_tipa1}
	 * labeled alternative in {@link ParserParser#ime_tipa}.
	 * @param ctx the parse tree
	 */
	void exitIme_tipa1(ParserParser.Ime_tipa1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ime_tipa2}
	 * labeled alternative in {@link ParserParser#ime_tipa}.
	 * @param ctx the parse tree
	 */
	void enterIme_tipa2(ParserParser.Ime_tipa2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ime_tipa2}
	 * labeled alternative in {@link ParserParser#ime_tipa}.
	 * @param ctx the parse tree
	 */
	void exitIme_tipa2(ParserParser.Ime_tipa2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cast_izraz1}
	 * labeled alternative in {@link ParserParser#cast_izraz}.
	 * @param ctx the parse tree
	 */
	void enterCast_izraz1(ParserParser.Cast_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cast_izraz1}
	 * labeled alternative in {@link ParserParser#cast_izraz}.
	 * @param ctx the parse tree
	 */
	void exitCast_izraz1(ParserParser.Cast_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cast_izraz2}
	 * labeled alternative in {@link ParserParser#cast_izraz}.
	 * @param ctx the parse tree
	 */
	void enterCast_izraz2(ParserParser.Cast_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cast_izraz2}
	 * labeled alternative in {@link ParserParser#cast_izraz}.
	 * @param ctx the parse tree
	 */
	void exitCast_izraz2(ParserParser.Cast_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unarni_operator1}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnarni_operator1(ParserParser.Unarni_operator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unarni_operator1}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnarni_operator1(ParserParser.Unarni_operator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unarni_operator2}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnarni_operator2(ParserParser.Unarni_operator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unarni_operator2}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnarni_operator2(ParserParser.Unarni_operator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unarni_operator3}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnarni_operator3(ParserParser.Unarni_operator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unarni_operator3}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnarni_operator3(ParserParser.Unarni_operator3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unarni_operator4}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnarni_operator4(ParserParser.Unarni_operator4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unarni_operator4}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnarni_operator4(ParserParser.Unarni_operator4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unarni_izraz1}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterUnarni_izraz1(ParserParser.Unarni_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unarni_izraz1}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitUnarni_izraz1(ParserParser.Unarni_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unarni_izraz2}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterUnarni_izraz2(ParserParser.Unarni_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unarni_izraz2}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitUnarni_izraz2(ParserParser.Unarni_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unarni_izraz3}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterUnarni_izraz3(ParserParser.Unarni_izraz3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unarni_izraz3}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitUnarni_izraz3(ParserParser.Unarni_izraz3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unarni_izraz4}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterUnarni_izraz4(ParserParser.Unarni_izraz4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unarni_izraz4}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitUnarni_izraz4(ParserParser.Unarni_izraz4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lista_argumenata1}
	 * labeled alternative in {@link ParserParser#lista_argumenata}.
	 * @param ctx the parse tree
	 */
	void enterLista_argumenata1(ParserParser.Lista_argumenata1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lista_argumenata1}
	 * labeled alternative in {@link ParserParser#lista_argumenata}.
	 * @param ctx the parse tree
	 */
	void exitLista_argumenata1(ParserParser.Lista_argumenata1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lista_argumenata2}
	 * labeled alternative in {@link ParserParser#lista_argumenata}.
	 * @param ctx the parse tree
	 */
	void enterLista_argumenata2(ParserParser.Lista_argumenata2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lista_argumenata2}
	 * labeled alternative in {@link ParserParser#lista_argumenata}.
	 * @param ctx the parse tree
	 */
	void exitLista_argumenata2(ParserParser.Lista_argumenata2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfiks_izraz3}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPostfiks_izraz3(ParserParser.Postfiks_izraz3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfiks_izraz3}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPostfiks_izraz3(ParserParser.Postfiks_izraz3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfiks_izraz2}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPostfiks_izraz2(ParserParser.Postfiks_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfiks_izraz2}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPostfiks_izraz2(ParserParser.Postfiks_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfiks_izraz5}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPostfiks_izraz5(ParserParser.Postfiks_izraz5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfiks_izraz5}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPostfiks_izraz5(ParserParser.Postfiks_izraz5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfiks_izraz4}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPostfiks_izraz4(ParserParser.Postfiks_izraz4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfiks_izraz4}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPostfiks_izraz4(ParserParser.Postfiks_izraz4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfiks_izraz1}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPostfiks_izraz1(ParserParser.Postfiks_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfiks_izraz1}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPostfiks_izraz1(ParserParser.Postfiks_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfiks_izraz6}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPostfiks_izraz6(ParserParser.Postfiks_izraz6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfiks_izraz6}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPostfiks_izraz6(ParserParser.Postfiks_izraz6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primarni_izraz1}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPrimarni_izraz1(ParserParser.Primarni_izraz1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primarni_izraz1}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPrimarni_izraz1(ParserParser.Primarni_izraz1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primarni_izraz2}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPrimarni_izraz2(ParserParser.Primarni_izraz2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primarni_izraz2}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPrimarni_izraz2(ParserParser.Primarni_izraz2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primarni_izraz3}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPrimarni_izraz3(ParserParser.Primarni_izraz3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primarni_izraz3}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPrimarni_izraz3(ParserParser.Primarni_izraz3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primarni_izraz4}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPrimarni_izraz4(ParserParser.Primarni_izraz4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primarni_izraz4}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPrimarni_izraz4(ParserParser.Primarni_izraz4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primarni_izraz5}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void enterPrimarni_izraz5(ParserParser.Primarni_izraz5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primarni_izraz5}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 */
	void exitPrimarni_izraz5(ParserParser.Primarni_izraz5Context ctx);
}