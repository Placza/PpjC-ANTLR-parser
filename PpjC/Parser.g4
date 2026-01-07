grammar Parser;
import Lexer;

program
    : prijevodna_jedinica EOF ;


lista_izraza_pridruzivanja
    : izraz_pridruzivanja #lista_izraza_pridruzivanja1
    | lista_izraza_pridruzivanja ZAREZ izraz_pridruzivanja #lista_izraza_pridruzivanja2
    ;



inicijalizator
    : izraz_pridruzivanja #inicijalizator1
    | L_VIT_ZAGRADA lista_izraza_pridruzivanja D_VIT_ZAGRADA #inicijalizator2
    ;


izravni_deklarator
    : IDN #izravni_deklarator1
    | IDN L_UGL_ZAGRADA BROJ D_UGL_ZAGRADA #izravni_deklarator2
    | IDN L_ZAGRADA KR_VOID D_ZAGRADA #izravni_deklarator3
    | IDN L_ZAGRADA lista_parametara D_ZAGRADA #izravni_deklarator4
    ;


init_deklarator
    : izravni_deklarator #init_deklarator1
    | izravni_deklarator OP_PRIDRUZI inicijalizator #init_deklarator2
    ;



lista_init_deklaratora
    : init_deklarator #lista_init_deklaratora1
    | lista_init_deklaratora ZAREZ init_deklarator #lista_init_deklaratora2
    ;


deklaracija 
    : ime_tipa lista_init_deklaratora TOCKAZAREZ
    ;



lista_deklaracija
    : deklaracija #lista_deklaracija1
    | lista_deklaracija deklaracija #lista_deklaracija2
    ;



deklaracija_parametra
    : ime_tipa IDN #deklaracija_parametra1
    | ime_tipa IDN L_UGL_ZAGRADA D_UGL_ZAGRADA #deklaracija_parametra2
    ;


lista_parametara
    : deklaracija_parametra #lista_parametara1
    | lista_parametara ZAREZ deklaracija_parametra #lista_parametara2
    ;



definicija_funkcije
    : ime_tipa IDN L_ZAGRADA KR_VOID D_ZAGRADA slozena_naredba #definicija_funkcije1
    | ime_tipa IDN L_ZAGRADA lista_parametara D_ZAGRADA slozena_naredba #definicija_funkcije2
    ;


vanjska_deklaracija
    : definicija_funkcije #vanjska_deklaracija1
    | deklaracija #vanjska_deklaracija2
    ;



prijevodna_jedinica
    : vanjska_deklaracija #prijevodna_jedinica1
    | prijevodna_jedinica vanjska_deklaracija #prijevodna_jedinica2
    ;



naredba_skoka
    : KR_CONTINUE TOCKAZAREZ #naredba_skoka1
    | KR_BREAK TOCKAZAREZ #naredba_skoka2
    | KR_RETURN TOCKAZAREZ #naredba_skoka3
    | KR_RETURN izraz TOCKAZAREZ #naredba_skoka4
    ;



naredba_petlje
    : KR_WHILE L_ZAGRADA izraz D_ZAGRADA naredba #naredba_petlje1
    | KR_FOR L_ZAGRADA izraz_naredba izraz_naredba D_ZAGRADA naredba #naredba_petlje2
    | KR_FOR L_ZAGRADA izraz_naredba izraz_naredba izraz D_ZAGRADA naredba #naredba_petlje3
    ;



naredba_grananja
    : KR_IF L_ZAGRADA izraz D_ZAGRADA naredba #naredba_grananja1
    | KR_IF L_ZAGRADA izraz D_ZAGRADA naredba KR_ELSE naredba #naredba_grananja2
    ;



izraz_naredba
    : TOCKAZAREZ #izraz_naredba1
    | izraz TOCKAZAREZ #izraz_naredba2
    ;
    

naredba
    : slozena_naredba #naredba1
    | izraz_naredba #naredba2
    | naredba_grananja #naredba3
    | naredba_petlje #naredba4
    | naredba_skoka #naredba5
    ;


lista_naredbi
    : naredba #lista_naredbi1
    | lista_naredbi naredba #lista_naredbi2
    ;


slozena_naredba
    : L_VIT_ZAGRADA lista_naredbi D_VIT_ZAGRADA #slozena_naredba1
    | L_VIT_ZAGRADA lista_deklaracija lista_naredbi D_VIT_ZAGRADA #slozena_naredba2
    ;


izraz
    : izraz_pridruzivanja #izraz1
    | izraz ZAREZ izraz_pridruzivanja #izraz2
    ;


izraz_pridruzivanja
    : log_ili_izraz #izraz_pridruzivanja1
    | postfiks_izraz OP_PRIDRUZI izraz_pridruzivanja #izraz_pridruzivanja2
    ;


log_ili_izraz
    : log_i_izraz #log_ili_izraz1
    | log_ili_izraz OP_ILI log_i_izraz #log_ili_izraz2
    ;


log_i_izraz
    : bin_ili_izraz #log_i_izraz1
    | log_i_izraz OP_I bin_ili_izraz #log_i_izraz2
    ;



bin_ili_izraz
    : bin_xili_izraz #bin_ili_izraz1
    | bin_ili_izraz OP_BIN_ILI bin_xili_izraz #bin_ili_izraz2
    ;


bin_xili_izraz
    : bin_i_izraz #bin_xili_izraz1
    | bin_xili_izraz OP_BIN_XILI bin_i_izraz #bin_xili_izraz2
    ;



bin_i_izraz
    : jednakosni_izraz #bin_i_izraz1
    | bin_i_izraz OP_BIN_I jednakosni_izraz #bin_i_izraz2
    ;



jednakosni_izraz
    : odnosni_izraz #jednakosni_izraz1
    | jednakosni_izraz OP_EQ odnosni_izraz #jednakosni_izraz2
    | jednakosni_izraz OP_NEQ odnosni_izraz #jednakosni_izraz3
    ;
 
 
odnosni_izraz
    : aditivni_izraz #odnosni_izraz1 
    | odnosni_izraz OP_LT aditivni_izraz #odnosni_izraz2
    | odnosni_izraz OP_GT aditivni_izraz #odnosni_izraz3
    | odnosni_izraz OP_LTE aditivni_izraz #odnosni_izraz4
    | odnosni_izraz OP_GTE aditivni_izraz #odnosni_izraz5
    ;
    

aditivni_izraz
    : multiplikativni_izraz #aditivni_izraz1
    | aditivni_izraz PLUS multiplikativni_izraz #aditivni_izraz2
    | aditivni_izraz MINUS multiplikativni_izraz #aditivni_izraz3
    ;
 


multiplikativni_izraz 
    : cast_izraz #multiplikativni_izraz1
    | multiplikativni_izraz OP_PUTA cast_izraz #multiplikativni_izraz2
    | multiplikativni_izraz OP_DIJELI cast_izraz #multiplikativni_izraz3
    | multiplikativni_izraz OP_MOD cast_izraz #multiplikativni_izraz4
    ;

 

specifikator_tipa
    : KR_VOID #specifikator_tipa1
    | KR_CHAR #specifikator_tipa2
    | KR_INT #specifikator_tipa3
    ;


ime_tipa
    : specifikator_tipa #ime_tipa1
    | KR_CONST specifikator_tipa #ime_tipa2
    ;

 
cast_izraz
    : unarni_izraz #cast_izraz1
    | L_ZAGRADA ime_tipa D_ZAGRADA cast_izraz #cast_izraz2
    ;

  
unarni_operator
    : PLUS #unarni_operator1
    | MINUS #unarni_operator2
    | OP_TILDA #unarni_operator3
    | OP_NEG #unarni_operator4
    ;

  
unarni_izraz
    : postfiks_izraz #unarni_izraz1
    | OP_INC unarni_izraz #unarni_izraz2
    | OP_DEC unarni_izraz #unarni_izraz3
    | unarni_operator cast_izraz #unarni_izraz4
    ;

  
lista_argumenata
    : izraz_pridruzivanja #lista_argumenata1
    | lista_argumenata ZAREZ izraz_pridruzivanja #lista_argumenata2
    ;
    

postfiks_izraz
    : primarni_izraz #postfiks_izraz1
    | postfiks_izraz L_UGL_ZAGRADA izraz D_UGL_ZAGRADA #postfiks_izraz2
    | postfiks_izraz L_ZAGRADA D_ZAGRADA #postfiks_izraz3
    | postfiks_izraz L_ZAGRADA lista_argumenata D_ZAGRADA #postfiks_izraz4
    | postfiks_izraz OP_INC #postfiks_izraz5
    | postfiks_izraz OP_DEC #postfiks_izraz6
    ;
    

    
primarni_izraz
    : IDN #primarni_izraz1
    | BROJ #primarni_izraz2
    | ZNAK #primarni_izraz3
    | NIZ_ZNAKOVA #primarni_izraz4
    | L_ZAGRADA izraz D_ZAGRADA #primarni_izraz5
    ;