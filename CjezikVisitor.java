public class CjezikVisitor extends ParserBaseVisitor<Integer> {

    private int space = -1;


    private void inline() {
        for (int i = 0; i < this.space; i++) {
            System.out.print(" ");
        }
    }

    private void inc() {
        this.space++;
    }

    private void dec() {
        this.space--;
    } 

    private void printTerm(String name, String node) {
        this.inline();
        System.out.print(" ");
        System.out.print(name + " " + "0" + " " + node);
        System.out.println();
    }

    
	
	@Override public Integer visitProgram(ParserParser.ProgramContext ctx) {
        visit(ctx.prijevodna_jedinica());
        return 0;
    }
	@Override public Integer visitLista_izraza_pridruzivanja1(ParserParser.Lista_izraza_pridruzivanja1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<lista_izraza_pridruzivanja>");
        visit(ctx.izraz_pridruzivanja());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_izraza_pridruzivanja2(ParserParser.Lista_izraza_pridruzivanja2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<lista_izraza_pridruzivanja>");
        visit(ctx.lista_izraza_pridruzivanja());
        this.printTerm("ZAREZ", ctx.ZAREZ().toString());
        visit(ctx.izraz_pridruzivanja());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitInicijalizator1(ParserParser.Inicijalizator1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<inicijalizator>");
        visit(ctx.izraz_pridruzivanja());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitInicijalizator2(ParserParser.Inicijalizator2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<inicijalizator>");
        this.printTerm("L_VIT_ZAGRADA", ctx.L_VIT_ZAGRADA().toString());
        visit(ctx.lista_izraza_pridruzivanja());
        this.printTerm("D_VIT_ZAGRADA", ctx.D_VIT_ZAGRADA().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitIzravni_deklarator1(ParserParser.Izravni_deklarator1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<izravni_deklarator>");
        this.printTerm("IDN", ctx.IDN().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitIzravni_deklarator2(ParserParser.Izravni_deklarator2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<izravni_deklarator>");
        this.printTerm("IDN", ctx.IDN().toString());
        this.printTerm("L_UGL_ZAGRADA", ctx.L_UGL_ZAGRADA().toString());
        this.printTerm("BROJ", ctx.BROJ().toString());
        this.printTerm("D_UGL_ZAGRADA", ctx.D_UGL_ZAGRADA().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitIzravni_deklarator3(ParserParser.Izravni_deklarator3Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<izravni_deklarator>");
        this.printTerm("IDN", ctx.IDN().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        this.printTerm("KR_VOID", ctx.KR_VOID().toString());
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitIzravni_deklarator4(ParserParser.Izravni_deklarator4Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<izravni_deklarator>");
        this.printTerm("IDN", ctx.IDN().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.lista_parametara());
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitInit_deklarator1(ParserParser.Init_deklarator1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<init_deklarator>");
        visit(ctx.izravni_deklarator());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitInit_deklarator2(ParserParser.Init_deklarator2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<init_deklarator>");
        visit(ctx.izravni_deklarator());
        this.printTerm("OP_PRIDRUZI", ctx.OP_PRIDRUZI().toString());
        visit(ctx.inicijalizator());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_init_deklaratora2(ParserParser.Lista_init_deklaratora2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<lista_init_deklaratora>");
        visit(ctx.lista_init_deklaratora());
        this.printTerm("ZAREZ", ctx.ZAREZ().toString());
        visit(ctx.init_deklarator());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_init_deklaratora1(ParserParser.Lista_init_deklaratora1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<lista_init_deklaratora>");
        visit(ctx.init_deklarator());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitDeklaracija(ParserParser.DeklaracijaContext ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<deklaracija>");
        visit(ctx.ime_tipa());
        visit(ctx.lista_init_deklaratora());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_deklaracija1(ParserParser.Lista_deklaracija1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<list_deklaracija>");
        visit(ctx.deklaracija());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_deklaracija2(ParserParser.Lista_deklaracija2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<list_deklaracija>");
        visit(ctx.lista_deklaracija());
        visit(ctx.deklaracija());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitDeklaracija_parametra1(ParserParser.Deklaracija_parametra1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<deklaracija_parametara>");
        visit(ctx.ime_tipa());
        this.printTerm("IDN", ctx.IDN().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitDeklaracija_parametra2(ParserParser.Deklaracija_parametra2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<deklaracija_parametara>");
        visit(ctx.ime_tipa());
        this.printTerm("IDN", ctx.IDN().toString());
        this.printTerm("L_UGL_ZAGRADA", ctx.L_UGL_ZAGRADA().toString());
        this.printTerm("D_UGL_ZAGRADA", ctx.D_UGL_ZAGRADA().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_parametara2(ParserParser.Lista_parametara2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<lista_parametara>");
        visit(ctx.lista_parametara());
        this.printTerm("ZAREZ", ctx.ZAREZ().toString());
        visit(ctx.deklaracija_parametra());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_parametara1(ParserParser.Lista_parametara1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<lista_parametara>");
        visit(ctx.deklaracija_parametra());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitDefinicija_funkcije1(ParserParser.Definicija_funkcije1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<definicija_funkcije>");
        visit(ctx.ime_tipa());
        this.printTerm("IDN", ctx.IDN().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        this.printTerm("KR_VOID", ctx.KR_VOID().toString());
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        visit(ctx.slozena_naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitDefinicija_funkcije2(ParserParser.Definicija_funkcije2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<definicija_funkcije>");
        visit(ctx.ime_tipa());
        this.printTerm("IDN", ctx.IDN().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.lista_parametara());
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        visit(ctx.slozena_naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitVanjska_deklaracija1(ParserParser.Vanjska_deklaracija1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<vanjska_deklaracija>");
        visit(ctx.definicija_funkcije());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitVanjska_deklaracija2(ParserParser.Vanjska_deklaracija2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<vanjska_deklaracija>");
        visit(ctx.deklaracija());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitPrijevodna_jedinica2(ParserParser.Prijevodna_jedinica2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<prijevodna_jedinica>");
        visit(ctx.prijevodna_jedinica());
        visit(ctx.vanjska_deklaracija());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitPrijevodna_jedinica1(ParserParser.Prijevodna_jedinica1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<prijevodna_jedinica>");
        visit(ctx.vanjska_deklaracija());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_skoka1(ParserParser.Naredba_skoka1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_skoka>");
        this.printTerm("KR_CONTINUE", ctx.KR_CONTINUE().toString());
        this.printTerm("TOCKAZAREZ", ctx.TOCKAZAREZ().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_skoka2(ParserParser.Naredba_skoka2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_skoka>");
        this.printTerm("KR_BREAK", ctx.KR_BREAK().toString());
        this.printTerm("TOCKAZAREZ", ctx.TOCKAZAREZ().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_skoka3(ParserParser.Naredba_skoka3Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_skoka>");
        this.printTerm("KR_RETURN", ctx.KR_RETURN().toString());
        this.printTerm("TOCKAZAREZ", ctx.TOCKAZAREZ().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_skoka4(ParserParser.Naredba_skoka4Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_skoka>");
        this.printTerm("KR_RETURN", ctx.KR_RETURN().toString());
        visit(ctx.izraz());
        this.printTerm("TOCKAZAREZ", ctx.TOCKAZAREZ().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_petlje1(ParserParser.Naredba_petlje1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_petlje>");
        this.printTerm("KR_WHILE", ctx.KR_WHILE().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.izraz());
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        visit(ctx.naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_petlje2(ParserParser.Naredba_petlje2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_petlje>");
        this.printTerm("KR_FOR", ctx.KR_FOR().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.izraz_naredba(0));
        visit(ctx.izraz_naredba(1));
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        visit(ctx.naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_petlje3(ParserParser.Naredba_petlje3Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_petlje>");
        this.printTerm("KR_FOR", ctx.KR_FOR().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.izraz_naredba(0));
        visit(ctx.izraz_naredba(1));
        visit(ctx.izraz());
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        visit(ctx.naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_grananja1(ParserParser.Naredba_grananja1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_grananja>");
        this.printTerm("KR_IF", ctx.KR_IF().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.izraz());
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        visit(ctx.naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba_grananja2(ParserParser.Naredba_grananja2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba_grananja>");
        this.printTerm("KR_IF", ctx.KR_IF().toString());
        this.printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.izraz());
        this.printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        visit(ctx.naredba(0));
        this.printTerm("KR_ELSE", ctx.KR_ELSE().toString());
        visit(ctx.naredba(1));
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitIzraz_naredba1(ParserParser.Izraz_naredba1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<izraz_naredba>");
        this.printTerm("TOCKAZAREZ", ctx.TOCKAZAREZ().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitIzraz_naredba2(ParserParser.Izraz_naredba2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<izraz_naredba>");
        visit(ctx.izraz());
        this.printTerm("TOCKAZAREZ", ctx.TOCKAZAREZ().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba1(ParserParser.Naredba1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba>");
        visit(ctx.slozena_naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba2(ParserParser.Naredba2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba>");
        visit(ctx.izraz_naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba3(ParserParser.Naredba3Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba>");
        visit(ctx.naredba_grananja());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba4(ParserParser.Naredba4Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba>");
        visit(ctx.naredba_petlje());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitNaredba5(ParserParser.Naredba5Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<naredba>");
        visit(ctx.naredba_skoka());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_naredbi1(ParserParser.Lista_naredbi1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<lista_naredbi>");
        visit(ctx.naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitLista_naredbi2(ParserParser.Lista_naredbi2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<lista_naredbi>");
        visit(ctx.lista_naredbi());
        visit(ctx.naredba());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitSlozena_naredba1(ParserParser.Slozena_naredba1Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<slozena_naredba>");
        printTerm("L_VIT_ZAGRADA", ctx.L_VIT_ZAGRADA().toString());
        visit(ctx.lista_naredbi());
        printTerm("D_VIT_ZAGRADA", ctx.D_VIT_ZAGRADA().toString());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitSlozena_naredba2(ParserParser.Slozena_naredba2Context ctx) { 
        this.inc();
        this.inline(); 
        System.out.println("<slozena_naredba>");
        printTerm("L_VIT_ZAGRADA", ctx.L_VIT_ZAGRADA().toString());
        visit(ctx.lista_deklaracija());
        visit(ctx.lista_naredbi());
        printTerm("D_VIT_ZAGRADA", ctx.D_VIT_ZAGRADA().toString());
        this.dec();
        return 0;
     }
    
	
	@Override public Integer visitIzraz2(ParserParser.Izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<izraz>");
        visit(ctx.izraz());
        printTerm("ZAREZ", ctx.ZAREZ().toString());
        visit(ctx.izraz_pridruzivanja());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitIzraz1(ParserParser.Izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<izraz>");
        visit(ctx.izraz_pridruzivanja());
        this.dec();
        return 0;
     }
	
	
	@Override public Integer visitIzraz_pridruzivanja1(ParserParser.Izraz_pridruzivanja1Context ctx) {
        this.inc();
        this.inline();
        System.out.println("<izraz_pridruzivanja>");
        visit(ctx.log_ili_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitIzraz_pridruzivanja2(ParserParser.Izraz_pridruzivanja2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<izraz_pridruzivanja>");
        visit(ctx.postfiks_izraz());
        printTerm("OP_PRIDRUZI", ctx.OP_PRIDRUZI().toString());
        visit(ctx.izraz_pridruzivanja()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitLog_ili_izraz1(ParserParser.Log_ili_izraz1Context ctx) {
        this.inc();
        this.inline();
        System.out.println("<log_ili_izraz>");
        visit(ctx.log_i_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitLog_ili_izraz2(ParserParser.Log_ili_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<log_ili_izraz>");
        visit(ctx.log_ili_izraz());
        printTerm("OP_ILI", ctx.OP_ILI().toString());
        visit(ctx.log_i_izraz()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitLog_i_izraz2(ParserParser.Log_i_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<log_i_izraz>");
        visit(ctx.log_i_izraz());
        printTerm("OP_I", ctx.OP_I().toString());
        visit(ctx.bin_ili_izraz()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitLog_i_izraz1(ParserParser.Log_i_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<log_i_izraz>");
        visit(ctx.bin_ili_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitBin_ili_izraz2(ParserParser.Bin_ili_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<bin_ili_izraz>");
        visit(ctx.bin_ili_izraz());
        printTerm("OP_BIN_ILI", ctx.OP_BIN_ILI().toString());
        visit(ctx.bin_xili_izraz()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitBin_ili_izraz1(ParserParser.Bin_ili_izraz1Context ctx) {
        this.inc();
        this.inline();
        System.out.println("<bin_ili_izraz>");
        visit(ctx.bin_xili_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitBin_xili_izraz1(ParserParser.Bin_xili_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<bin_xili_izraz>");
        visit(ctx.bin_i_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitBin_xili_izraz2(ParserParser.Bin_xili_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<bin_xili_izraz>");
        visit(ctx.bin_xili_izraz());
        printTerm("OP_BIN_XILI", ctx.OP_BIN_XILI().toString());
        visit(ctx.bin_i_izraz()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitBin_i_izraz2(ParserParser.Bin_i_izraz2Context ctx) {
        this.inc();
        this.inline();
        System.out.println("<bin_i_izraz>");
        visit(ctx.bin_i_izraz());
        printTerm("OP_BIN_I", ctx.OP_BIN_I().toString());
        visit(ctx.jednakosni_izraz()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitBin_i_izraz1(ParserParser.Bin_i_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<bin_i_izraz>");
        visit(ctx.jednakosni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitJednakosni_izraz2(ParserParser.Jednakosni_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<jednakosni_izraz>");
        visit(ctx.jednakosni_izraz());
        printTerm("OP_EQ", ctx.OP_EQ().toString());
        visit(ctx.odnosni_izraz()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitJednakosni_izraz1(ParserParser.Jednakosni_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<jednakosni_izraz>");
        visit(ctx.odnosni_izraz());
        this.dec();
        return 0;
}
	
	
	@Override public Integer visitJednakosni_izraz3(ParserParser.Jednakosni_izraz3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<jednakosni_izraz>");
        visit(ctx.jednakosni_izraz());
        printTerm("OP_NEQ", ctx.OP_NEQ().toString());
        visit(ctx.odnosni_izraz()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitOdnosni_izraz4(ParserParser.Odnosni_izraz4Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<odnosni_izraz>");
        visit(ctx.odnosni_izraz());
        printTerm("OP_LTE", ctx.OP_LTE().toString());
        visit(ctx.aditivni_izraz()); 
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitOdnosni_izraz3(ParserParser.Odnosni_izraz3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<odnosni_izraz>");
        visit(ctx.odnosni_izraz());
        printTerm("OP_GT", ctx.OP_GT().toString());
        visit(ctx.aditivni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitOdnosni_izraz5(ParserParser.Odnosni_izraz5Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<odnosni_izraz>");
        visit(ctx.odnosni_izraz());
        printTerm("OP_GTE", ctx.OP_GTE().toString());
        visit(ctx.aditivni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitOdnosni_izraz2(ParserParser.Odnosni_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<odnosni_izraz>");
        visit(ctx.odnosni_izraz());
        printTerm("OP_LT", ctx.OP_LT().toString());
        visit(ctx.aditivni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitOdnosni_izraz1(ParserParser.Odnosni_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<odnosni_izraz>");
        visit(ctx.aditivni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitAditivni_izraz3(ParserParser.Aditivni_izraz3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<aditivni_izraz>");
        visit(ctx.aditivni_izraz());
        printTerm("MINUS", ctx.MINUS().toString());
        visit(ctx.multiplikativni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitAditivni_izraz1(ParserParser.Aditivni_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<aditivni_izraz>");
        visit(ctx.multiplikativni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitAditivni_izraz2(ParserParser.Aditivni_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<aditivni_izraz>");
        visit(ctx.aditivni_izraz());
        printTerm("PLUS", ctx.PLUS().toString());
        visit(ctx.multiplikativni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitMultiplikativni_izraz3(ParserParser.Multiplikativni_izraz3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<multiplikativni_izraz>");
        visit(ctx.multiplikativni_izraz());
        printTerm("OP_DIJELI", ctx.OP_DIJELI().toString());
        visit(ctx.cast_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitMultiplikativni_izraz4(ParserParser.Multiplikativni_izraz4Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<multiplikativni_izraz>");
        visit(ctx.multiplikativni_izraz());
        printTerm("OP_MOD", ctx.OP_MOD().toString());
        visit(ctx.cast_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitMultiplikativni_izraz1(ParserParser.Multiplikativni_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<multiplikativni_izraz>");
        visit(ctx.cast_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitMultiplikativni_izraz2(ParserParser.Multiplikativni_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<multiplikativni_izraz>");
        visit(ctx.multiplikativni_izraz());
        printTerm("OP_PUTA", ctx.OP_PUTA().toString());
        visit(ctx.cast_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitSpecifikator_tipa1(ParserParser.Specifikator_tipa1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<specifikator_tipa>");
        printTerm("KR_VOID", ctx.KR_VOID().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitSpecifikator_tipa2(ParserParser.Specifikator_tipa2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<specifikator_tipa>");
        printTerm("KR_CHAR", ctx.KR_CHAR().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitSpecifikator_tipa3(ParserParser.Specifikator_tipa3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<specifikator_tipa>");
        printTerm("KR_INT", ctx.KR_INT().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitIme_tipa1(ParserParser.Ime_tipa1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<ime_tipa>");
        visit(ctx.specifikator_tipa());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitIme_tipa2(ParserParser.Ime_tipa2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<ime_tipa>");
        printTerm("KR_CONST", ctx.KR_CONST().toString());
        visit(ctx.specifikator_tipa());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitCast_izraz1(ParserParser.Cast_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<cast_izraz>");
        visit(ctx.unarni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitCast_izraz2(ParserParser.Cast_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<cast_izraz>");
        printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.ime_tipa());
        printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        visit(ctx.cast_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitUnarni_operator1(ParserParser.Unarni_operator1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<unarni_operator>");
        printTerm("PLUS", ctx.PLUS().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitUnarni_operator2(ParserParser.Unarni_operator2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<unarni_operator>");
        printTerm("MINUS", ctx.MINUS().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitUnarni_operator3(ParserParser.Unarni_operator3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<unarni_operator>");
        printTerm("OP_TILDA", ctx.OP_TILDA().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitUnarni_operator4(ParserParser.Unarni_operator4Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<unarni_operator>");
        printTerm("OP_NEG", ctx.OP_NEG().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitUnarni_izraz1(ParserParser.Unarni_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<unarni_izraz>");
        visit(ctx.postfiks_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitUnarni_izraz2(ParserParser.Unarni_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<unarni_izraz>");
        printTerm("OP_INC", ctx.OP_INC().toString());
        visit(ctx.unarni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitUnarni_izraz3(ParserParser.Unarni_izraz3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<unarni_izraz>");
        printTerm("OP_DEC", ctx.OP_DEC().toString());
        visit(ctx.unarni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitUnarni_izraz4(ParserParser.Unarni_izraz4Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<unarni_izraz>");
        visit(ctx.unarni_operator());
        visit(ctx.cast_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitLista_argumenata1(ParserParser.Lista_argumenata1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<lista_argumenata>");
        visit(ctx.izraz_pridruzivanja());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitLista_argumenata2(ParserParser.Lista_argumenata2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<lista_argumenata>");
        visit(ctx.lista_argumenata());
        printTerm("ZAREZ", ctx.ZAREZ().toString());
        visit(ctx.izraz_pridruzivanja());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPostfiks_izraz3(ParserParser.Postfiks_izraz3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<postfiks_izraz>");
        visit(ctx.postfiks_izraz());
        printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPostfiks_izraz2(ParserParser.Postfiks_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<postfiks_izraz>");
        visit(ctx.postfiks_izraz());
        printTerm("L_UGL_ZAGRADA", ctx.L_UGL_ZAGRADA().toString());
        visit(ctx.izraz());
        printTerm("D_UGL_ZAGRADA", ctx.D_UGL_ZAGRADA().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPostfiks_izraz5(ParserParser.Postfiks_izraz5Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<postfiks_izraz>");
        visit(ctx.postfiks_izraz());
        printTerm("OP_INC", ctx.OP_INC().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPostfiks_izraz4(ParserParser.Postfiks_izraz4Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<postfiks_izraz>");
        visit(ctx.postfiks_izraz());
        printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.lista_argumenata());
        printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPostfiks_izraz1(ParserParser.Postfiks_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<postfiks_izraz>");
        visit(ctx.primarni_izraz());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPostfiks_izraz6(ParserParser.Postfiks_izraz6Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<postfiks_izraz>");
        visit(ctx.postfiks_izraz());
        printTerm("OP_DEC", ctx.OP_DEC().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPrimarni_izraz1(ParserParser.Primarni_izraz1Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<primarni_izraz>");
        printTerm("IDN", ctx.IDN().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPrimarni_izraz2(ParserParser.Primarni_izraz2Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<primarni_izraz>");
        printTerm("BROJ", ctx.BROJ().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPrimarni_izraz3(ParserParser.Primarni_izraz3Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<primarni_izraz>");
        printTerm("ZNAK", ctx.ZNAK().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPrimarni_izraz4(ParserParser.Primarni_izraz4Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<primarni_izraz>");
        printTerm("NIZ_ZNAKOVA", ctx.NIZ_ZNAKOVA().toString());
        this.dec();
        return 0;
    }
	
	
	@Override public Integer visitPrimarni_izraz5(ParserParser.Primarni_izraz5Context ctx) {
        this.inc();
        this.inline(); 
        System.out.println("<primarni_izraz>");
        printTerm("L_ZAGRADA", ctx.L_ZAGRADA().toString());
        visit(ctx.izraz());
        printTerm("D_ZAGRADA", ctx.D_ZAGRADA().toString());
        this.dec();
        return 0;
    }
}



