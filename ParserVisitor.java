// Generated from Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_izraza_pridruzivanja1}
	 * labeled alternative in {@link ParserParser#lista_izraza_pridruzivanja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_izraza_pridruzivanja1(ParserParser.Lista_izraza_pridruzivanja1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_izraza_pridruzivanja2}
	 * labeled alternative in {@link ParserParser#lista_izraza_pridruzivanja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_izraza_pridruzivanja2(ParserParser.Lista_izraza_pridruzivanja2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code inicijalizator1}
	 * labeled alternative in {@link ParserParser#inicijalizator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicijalizator1(ParserParser.Inicijalizator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code inicijalizator2}
	 * labeled alternative in {@link ParserParser#inicijalizator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicijalizator2(ParserParser.Inicijalizator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izravni_deklarator1}
	 * labeled alternative in {@link ParserParser#izravni_deklarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzravni_deklarator1(ParserParser.Izravni_deklarator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izravni_deklarator2}
	 * labeled alternative in {@link ParserParser#izravni_deklarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzravni_deklarator2(ParserParser.Izravni_deklarator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izravni_deklarator3}
	 * labeled alternative in {@link ParserParser#izravni_deklarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzravni_deklarator3(ParserParser.Izravni_deklarator3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izravni_deklarator4}
	 * labeled alternative in {@link ParserParser#izravni_deklarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzravni_deklarator4(ParserParser.Izravni_deklarator4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code init_deklarator1}
	 * labeled alternative in {@link ParserParser#init_deklarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_deklarator1(ParserParser.Init_deklarator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code init_deklarator2}
	 * labeled alternative in {@link ParserParser#init_deklarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_deklarator2(ParserParser.Init_deklarator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_init_deklaratora2}
	 * labeled alternative in {@link ParserParser#lista_init_deklaratora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_init_deklaratora2(ParserParser.Lista_init_deklaratora2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_init_deklaratora1}
	 * labeled alternative in {@link ParserParser#lista_init_deklaratora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_init_deklaratora1(ParserParser.Lista_init_deklaratora1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#deklaracija}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracija(ParserParser.DeklaracijaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_deklaracija1}
	 * labeled alternative in {@link ParserParser#lista_deklaracija}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_deklaracija1(ParserParser.Lista_deklaracija1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_deklaracija2}
	 * labeled alternative in {@link ParserParser#lista_deklaracija}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_deklaracija2(ParserParser.Lista_deklaracija2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code deklaracija_parametra1}
	 * labeled alternative in {@link ParserParser#deklaracija_parametra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracija_parametra1(ParserParser.Deklaracija_parametra1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code deklaracija_parametra2}
	 * labeled alternative in {@link ParserParser#deklaracija_parametra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracija_parametra2(ParserParser.Deklaracija_parametra2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_parametara2}
	 * labeled alternative in {@link ParserParser#lista_parametara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametara2(ParserParser.Lista_parametara2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_parametara1}
	 * labeled alternative in {@link ParserParser#lista_parametara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametara1(ParserParser.Lista_parametara1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code definicija_funkcije1}
	 * labeled alternative in {@link ParserParser#definicija_funkcije}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicija_funkcije1(ParserParser.Definicija_funkcije1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code definicija_funkcije2}
	 * labeled alternative in {@link ParserParser#definicija_funkcije}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicija_funkcije2(ParserParser.Definicija_funkcije2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code vanjska_deklaracija1}
	 * labeled alternative in {@link ParserParser#vanjska_deklaracija}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVanjska_deklaracija1(ParserParser.Vanjska_deklaracija1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code vanjska_deklaracija2}
	 * labeled alternative in {@link ParserParser#vanjska_deklaracija}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVanjska_deklaracija2(ParserParser.Vanjska_deklaracija2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code prijevodna_jedinica2}
	 * labeled alternative in {@link ParserParser#prijevodna_jedinica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrijevodna_jedinica2(ParserParser.Prijevodna_jedinica2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code prijevodna_jedinica1}
	 * labeled alternative in {@link ParserParser#prijevodna_jedinica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrijevodna_jedinica1(ParserParser.Prijevodna_jedinica1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_skoka1}
	 * labeled alternative in {@link ParserParser#naredba_skoka}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_skoka1(ParserParser.Naredba_skoka1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_skoka2}
	 * labeled alternative in {@link ParserParser#naredba_skoka}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_skoka2(ParserParser.Naredba_skoka2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_skoka3}
	 * labeled alternative in {@link ParserParser#naredba_skoka}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_skoka3(ParserParser.Naredba_skoka3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_skoka4}
	 * labeled alternative in {@link ParserParser#naredba_skoka}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_skoka4(ParserParser.Naredba_skoka4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_petlje1}
	 * labeled alternative in {@link ParserParser#naredba_petlje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_petlje1(ParserParser.Naredba_petlje1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_petlje2}
	 * labeled alternative in {@link ParserParser#naredba_petlje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_petlje2(ParserParser.Naredba_petlje2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_petlje3}
	 * labeled alternative in {@link ParserParser#naredba_petlje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_petlje3(ParserParser.Naredba_petlje3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_grananja1}
	 * labeled alternative in {@link ParserParser#naredba_grananja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_grananja1(ParserParser.Naredba_grananja1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba_grananja2}
	 * labeled alternative in {@link ParserParser#naredba_grananja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba_grananja2(ParserParser.Naredba_grananja2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izraz_naredba1}
	 * labeled alternative in {@link ParserParser#izraz_naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzraz_naredba1(ParserParser.Izraz_naredba1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izraz_naredba2}
	 * labeled alternative in {@link ParserParser#izraz_naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzraz_naredba2(ParserParser.Izraz_naredba2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba1}
	 * labeled alternative in {@link ParserParser#naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba1(ParserParser.Naredba1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba2}
	 * labeled alternative in {@link ParserParser#naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba2(ParserParser.Naredba2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba3}
	 * labeled alternative in {@link ParserParser#naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba3(ParserParser.Naredba3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba4}
	 * labeled alternative in {@link ParserParser#naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba4(ParserParser.Naredba4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code naredba5}
	 * labeled alternative in {@link ParserParser#naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaredba5(ParserParser.Naredba5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_naredbi1}
	 * labeled alternative in {@link ParserParser#lista_naredbi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_naredbi1(ParserParser.Lista_naredbi1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_naredbi2}
	 * labeled alternative in {@link ParserParser#lista_naredbi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_naredbi2(ParserParser.Lista_naredbi2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code slozena_naredba1}
	 * labeled alternative in {@link ParserParser#slozena_naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlozena_naredba1(ParserParser.Slozena_naredba1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code slozena_naredba2}
	 * labeled alternative in {@link ParserParser#slozena_naredba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlozena_naredba2(ParserParser.Slozena_naredba2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izraz2}
	 * labeled alternative in {@link ParserParser#izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzraz2(ParserParser.Izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izraz1}
	 * labeled alternative in {@link ParserParser#izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzraz1(ParserParser.Izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izraz_pridruzivanja1}
	 * labeled alternative in {@link ParserParser#izraz_pridruzivanja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzraz_pridruzivanja1(ParserParser.Izraz_pridruzivanja1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code izraz_pridruzivanja2}
	 * labeled alternative in {@link ParserParser#izraz_pridruzivanja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzraz_pridruzivanja2(ParserParser.Izraz_pridruzivanja2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code log_ili_izraz1}
	 * labeled alternative in {@link ParserParser#log_ili_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_ili_izraz1(ParserParser.Log_ili_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code log_ili_izraz2}
	 * labeled alternative in {@link ParserParser#log_ili_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_ili_izraz2(ParserParser.Log_ili_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code log_i_izraz2}
	 * labeled alternative in {@link ParserParser#log_i_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_i_izraz2(ParserParser.Log_i_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code log_i_izraz1}
	 * labeled alternative in {@link ParserParser#log_i_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_i_izraz1(ParserParser.Log_i_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_ili_izraz2}
	 * labeled alternative in {@link ParserParser#bin_ili_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_ili_izraz2(ParserParser.Bin_ili_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_ili_izraz1}
	 * labeled alternative in {@link ParserParser#bin_ili_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_ili_izraz1(ParserParser.Bin_ili_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_xili_izraz1}
	 * labeled alternative in {@link ParserParser#bin_xili_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_xili_izraz1(ParserParser.Bin_xili_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_xili_izraz2}
	 * labeled alternative in {@link ParserParser#bin_xili_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_xili_izraz2(ParserParser.Bin_xili_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_i_izraz2}
	 * labeled alternative in {@link ParserParser#bin_i_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_i_izraz2(ParserParser.Bin_i_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_i_izraz1}
	 * labeled alternative in {@link ParserParser#bin_i_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_i_izraz1(ParserParser.Bin_i_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code jednakosni_izraz2}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJednakosni_izraz2(ParserParser.Jednakosni_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code jednakosni_izraz1}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJednakosni_izraz1(ParserParser.Jednakosni_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code jednakosni_izraz3}
	 * labeled alternative in {@link ParserParser#jednakosni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJednakosni_izraz3(ParserParser.Jednakosni_izraz3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code odnosni_izraz4}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdnosni_izraz4(ParserParser.Odnosni_izraz4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code odnosni_izraz3}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdnosni_izraz3(ParserParser.Odnosni_izraz3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code odnosni_izraz5}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdnosni_izraz5(ParserParser.Odnosni_izraz5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code odnosni_izraz2}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdnosni_izraz2(ParserParser.Odnosni_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code odnosni_izraz1}
	 * labeled alternative in {@link ParserParser#odnosni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdnosni_izraz1(ParserParser.Odnosni_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code aditivni_izraz3}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAditivni_izraz3(ParserParser.Aditivni_izraz3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code aditivni_izraz1}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAditivni_izraz1(ParserParser.Aditivni_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code aditivni_izraz2}
	 * labeled alternative in {@link ParserParser#aditivni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAditivni_izraz2(ParserParser.Aditivni_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplikativni_izraz3}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplikativni_izraz3(ParserParser.Multiplikativni_izraz3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplikativni_izraz4}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplikativni_izraz4(ParserParser.Multiplikativni_izraz4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplikativni_izraz1}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplikativni_izraz1(ParserParser.Multiplikativni_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplikativni_izraz2}
	 * labeled alternative in {@link ParserParser#multiplikativni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplikativni_izraz2(ParserParser.Multiplikativni_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code specifikator_tipa1}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifikator_tipa1(ParserParser.Specifikator_tipa1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code specifikator_tipa2}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifikator_tipa2(ParserParser.Specifikator_tipa2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code specifikator_tipa3}
	 * labeled alternative in {@link ParserParser#specifikator_tipa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifikator_tipa3(ParserParser.Specifikator_tipa3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ime_tipa1}
	 * labeled alternative in {@link ParserParser#ime_tipa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIme_tipa1(ParserParser.Ime_tipa1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ime_tipa2}
	 * labeled alternative in {@link ParserParser#ime_tipa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIme_tipa2(ParserParser.Ime_tipa2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cast_izraz1}
	 * labeled alternative in {@link ParserParser#cast_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_izraz1(ParserParser.Cast_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cast_izraz2}
	 * labeled alternative in {@link ParserParser#cast_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_izraz2(ParserParser.Cast_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unarni_operator1}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarni_operator1(ParserParser.Unarni_operator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unarni_operator2}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarni_operator2(ParserParser.Unarni_operator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unarni_operator3}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarni_operator3(ParserParser.Unarni_operator3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unarni_operator4}
	 * labeled alternative in {@link ParserParser#unarni_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarni_operator4(ParserParser.Unarni_operator4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unarni_izraz1}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarni_izraz1(ParserParser.Unarni_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unarni_izraz2}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarni_izraz2(ParserParser.Unarni_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unarni_izraz3}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarni_izraz3(ParserParser.Unarni_izraz3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unarni_izraz4}
	 * labeled alternative in {@link ParserParser#unarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarni_izraz4(ParserParser.Unarni_izraz4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_argumenata1}
	 * labeled alternative in {@link ParserParser#lista_argumenata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_argumenata1(ParserParser.Lista_argumenata1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lista_argumenata2}
	 * labeled alternative in {@link ParserParser#lista_argumenata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_argumenata2(ParserParser.Lista_argumenata2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfiks_izraz3}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfiks_izraz3(ParserParser.Postfiks_izraz3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfiks_izraz2}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfiks_izraz2(ParserParser.Postfiks_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfiks_izraz5}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfiks_izraz5(ParserParser.Postfiks_izraz5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfiks_izraz4}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfiks_izraz4(ParserParser.Postfiks_izraz4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfiks_izraz1}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfiks_izraz1(ParserParser.Postfiks_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfiks_izraz6}
	 * labeled alternative in {@link ParserParser#postfiks_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfiks_izraz6(ParserParser.Postfiks_izraz6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primarni_izraz1}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarni_izraz1(ParserParser.Primarni_izraz1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primarni_izraz2}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarni_izraz2(ParserParser.Primarni_izraz2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primarni_izraz3}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarni_izraz3(ParserParser.Primarni_izraz3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primarni_izraz4}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarni_izraz4(ParserParser.Primarni_izraz4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primarni_izraz5}
	 * labeled alternative in {@link ParserParser#primarni_izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarni_izraz5(ParserParser.Primarni_izraz5Context ctx);
}