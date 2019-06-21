grammar QPP;

// Rules
//TODO verificar se gramatica está correta
programa
    : lista_definicoes EOF
    ;

lista_definicoes
    : lista_definicoes definicao # ListaDefinicoes
    | definicao # ListaDefinicaoDefinicao
    ;

definicao
    : funcao # DefinicaoFuncao
    | estrutura # DefinicaoEstrutura
    ;

estrutura
    : STRUCT ID LBRACE lista_estrutura_corpo RBRACE SEMI
    ;


lista_estrutura_corpo
    : lista_estrutura_corpo estrutura_acesso # ListaEstruturaCorpo_
    | estrutura_acesso # ListaEstruturaCorpoEstruturaAcesso
    ;

estrutura_acesso
    : PUBLIC COLON lista_estrutura_membros # EstruturaAcessoPublic
    | PROTECTED COLON lista_estrutura_membros # EstruturaAcessoProtected
    ;

lista_estrutura_membros
    : lista_estrutura_membros membro # ListaEstruturaMembros_
    | membro # ListaEstruturaMembrosMembro
    ;

membro
    : construtor # MembroConstrutor
    | variavel # MembroVariavel
    | metodo # MembroMetodo
    | STATIC variavel # MembroStaticVariavel
    | STATIC metodo # MembroStaticMetodo
    ;

variavel
    : tipo ID SEMI
    ;

variavel_atribuicao
    : tipo ID ATRIB expressao SEMI
    ;

construtor
    : ID LPAREN parametros_formais RPAREN bloco
    ;

metodo
    : funcao_cabecalho qualificador bloco
    ;

funcao
    : funcao_cabecalho bloco
    ;

funcao_cabecalho
    : tipo ID LPAREN parametros_formais RPAREN
    ;

parametros_formais
    : lista_parametros_formais
    | 
    ;

lista_parametros_formais
    : lista_parametros_formais COMMA tipo ID # ListaParametrosFormais_
    | tipo ID # ListaParametrosFormaisTipo
    ;

tipo
    : VOID # TipoVoid
    | qualificador INT decorador # TipoInt
    | qualificador CHAR decorador # TipoChar
    | qualificador BOOL decorador # TipoBool
    | qualificador tipo_nome decorador # TipoNome
    ;

tipo_nome
    : tipo_nome DBLCOL ID # TipoNome_
    | ID # TipoID
    ;

qualificador
    : CONST # QualificadorConst
    | # QualificadorEmpty
    ;

decorador
    : AMPER # DecoradorAmper
    | # DecoradorEmpty
    ;

bloco
    : LBRACE lista_declaracoes_locais lista_comandos RBRACE
    ;

lista_comandos
    : lista_comandos comando # ListaComandos_
    | comando #ListaComandosComandos
    ;

comando
    : bloco # ComandoBloco
    | selecao # ComadoSelecao
    | repeticao # ComadoRepeticao
    | atribuicao # ComandoAtribuicao
    | retorno # ComandoRetorno
    | entrada # ComandoEntrada
    | saida # ComandoSaida
    | expressao_comando # ComandoExpressaoComando
    | BREAK SEMI # ComandoBreak
    ;

selecao
    : IF LPAREN expressao RPAREN lista_comandos selecao_senao
    ;

selecao_senao
    : ELSE lista_comandos # SelecaoSenao
    | # SelecaoSenaoEmpty
    ;

repeticao
    : WHILE LPAREN expressao RPAREN lista_comandos
    ;

atribuicao
    : nome ATRIB expressao SEMI
    ;

retorno
    : RETURN expressao_comando
    ;

entrada
    : STDCIN lista_entrada_params SEMI
    ;

lista_entrada_params
    : lista_entrada_params RSHIFT nome # ListaEntradaParams_
    | nome # ListaEntradaParamsNome
    | STDENDL # ListaEntradaParamsSTDENDL
    ;

saida
    : STDCOUT lista_saida_params SEMI
    ;

lista_saida_params
    : lista_entrada_params LSHIFT expressao # ListaSaidaParams
    | expressao # ListaSaidaParams
    | STRL # ListaSaidaSTRL
    | STDENDL # ListaSaidaParamsSTDENDL
    ;

lista_declaracoes_locais
    : variavel # ListaDeclaracoesLocaisVariavel
    | variavel_atribuicao # ListaDeclaracoesLocaisAtribuicao
    | # ListaDeclaracoesLocaisEmpty
    ;

expressao_comando
    : expressao SEMI # ExpressaoComandoExpressao
    | SEMI # ExpressaoComandoSEMI
    ;

expressao
    : LPAREN expressao RPAREN # Expressao_
    | expressao operador_binario expressao # ExpressaoOperadorBinario
    | operador_unario expressao # ExpressaoUnario
    | nome LPAREN parametros_reais RPAREN # ExpressaoParametrosReais
    | nome # ExpressaoNome2
    | INTL # ExpressaoINTL
    | CHARL # ExpressaoCHARL
    | TRUE # ExpressaoTrue
    | FALSE # ExpressaoFalse
    ;

operador_binario
    : AND # OperadorBinarioAND
    | OR # OperadorBinarioOR
    | PLUS # OperadorBinarioPLUS
    | MINUS # OperadorBinarioMINUS
    | TIMES # OperadorBinarioTIMES
    | DIV # OperadorBinarioDIV
    | MOD # OperadorBinarioMOD
    | LT # OperadorBinarioLT
    | LEQ # OperadorBinarioLEQ
    | GT # OperadorGT
    | GEQ # OperadorGEQ
    | EQ # OperadorEQ
    | NEQ # OperadorNEQ
    ;

operador_unario
    : INCR # OperadorUnarioINCR
    | DECR # OperadorUnarioDECR
    | UNARYMINUS # OperadorUnarioUNARYMINUS
    | NOT # OperadorUnarioNOT
    ;

//nome
//    : ID DBLCOL nome_lista
//    | THIS ARROW nome_lista
//    | nome_lista
//    ;
//
//nome_lista
//    : ID DOT nome_lista
//    | nome LPAREN parâmetros_reais RPAREN DOT nome_lista
//    | ID
//    ;

nome
    : ID DBLCOL nome_lista # NomeID
    | THIS ARROW nome_lista # NomeThisArrow
    | nome_lista # NomeNomeLista
    ;

nome_lista
    : ID DOT nome_lista nome_lista_ # NomeListaIDDOT
    | ID DBLCOL nome_lista LPAREN lista_parametros_reais RPAREN DOT nome_lista nome_lista_ # NomeListaID
    | THIS ARROW nome_lista LPAREN parametros_reais RPAREN DOT nome_lista nome_lista_ # NomeListaThisArrow
    | ID nome_lista_ # NomeListaID
    ;

nome_lista_
    : LPAREN parametros_reais RPAREN DOT nome_lista nome_lista_ # NomeListaLPAREN
    | # NomeListaEmpty
    ;

parametros_reais
    : lista_parametros_reais # ParametrosReaisLista
    | # ParametrosReaisEmpty
    ;

lista_parametros_reais
    : lista_parametros_reais COMMA expressao # ListaParametrosReais_
    | expressao # ListaParametrosReaisExpressao
    ;

// Tokens
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment NUMBER: [0-9] ;
fragment PONT: ('-' | '!' | ':' | ',' | '.' | '+' | '?' | '(' | ')' | '{' | '}' | '/') ;

INTL: ('+' | '-')? NUMBER+ ;
CHARL: '\'' .? '\'' ;
STRL: '"' .*? '"' ;

//TODO precedencia
LPAREN: '(' ;
RPAREN: ')' ;
LBRACE: '{' ;
RBRACE: '}' ;
ARROW: '->' ;
DOT: '.' ;

UNARYMINUS: '-' ;
INCR: '++' ;
DECR: '--' ;
NOT: '!' ;
AMPER: '&' ;

DIV: '/' ;
TIMES: '*' ;
MOD: '%' ;

PLUS: '+' ;
MINUS: '-' ;

LT: '<' ;
GT: '>' ;
LEQ: '<=' ;
GEQ: '>=' ;

NEQ: '!=' ;
EQ: '==' ;

AND: '&&' ;
OR: '||' ;

ATRIB: '=' ;

IF: 'if' ;
ELSE: 'else' ;
WHILE: 'while' ;
BREAK: 'break' ;
RETURN: 'return' ;
STRUCT: 'struct' ;
PUBLIC: 'public' ;
PRIVATE: 'private' ;
STATIC: 'static' ;
THIS: 'this' ;
CONST: 'const';
VOID: 'void' ;
INT: 'int' ;
CHAR: 'char' ;
BOOL: 'bool';
TRUE: 'true' ;
FALSE: 'false';

COMMA: ',' ;
COLON: ':' ;
SEMI: ';' ;
DBLCOL: '::' ;
LSHIFT: '<<' ;
RSHIFT: '>>' ;
STDCIN: 'std::cin' ;
STDCOUT: 'std::cout' ;
STDENDL: 'std::endl' ;

ID: (LOWERCASE | UPPERCASE)(LOWERCASE | UPPERCASE | NUMBER | '_')* ;

DIR: '#' ~[\r\n]* -> skip ;
COMMENTBLOCK: '/*' .*? '*/' -> skip ;
COMMENTLINE: '//' ~[\r\n]*  -> skip ;
WHITESPACE: [ \r\n\t]+ -> skip ;
