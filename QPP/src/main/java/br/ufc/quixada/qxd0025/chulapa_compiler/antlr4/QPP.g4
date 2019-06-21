grammar QPP;

// Rules
//TODO verificar se gramatica está correta
programa
    : definicao* EOF
    ;

definicao
    : funcao        #DefinicaoFuncao
    | estrutura     #DefinicaoEstrutura
    ;

estrutura
    : STRUCT ID LBRACE estrutura_acesso* RBRACE SEMI
    ;

estrutura_acesso
    : PUBLIC COLON membro*          #EstruturaPublica
    | PRIVATE COLON membro*         #EstruturaPrivada
    | PROTECTED COLON membro*       #EstruturaProtegida
    ;

membro
    : construtor        #MembroConstrutor
    | variavel          #MembroVariavel
    | metodo            #MembroMetodo
    | STATIC variavel   #MembroStaticVariavel
    | STATIC metodo     #MembroStaticMetodo
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
    : qualificador funcao
    ;

funcao
    : funcao_cabecalho bloco
    ;

funcao_cabecalho
    : tipo ID LPAREN parametros_formais RPAREN
    ;

parametros_formais
    : tipo ID (COMA tipo ID)*       #ParametrosFormaisID
    |                               #ParametrosFormaisVazio
    ;

tipo
    : VOID                                  #TipoVoid
    | qualificador INT decorador            #TipoChar
    | qualificador CHAR decorador           #TipoInt
    | qualificador BOOL decorador           #TipoBool
    | qualificador tipo_nome decorador      #TipoNome
    ;

tipo_nome
    : tipo_nome DBCOL ID        #TipoNomeAcesso
    | ID                        #TipoNomeId
    ;

qualificador
    : CONST             #QualificadorConst
    |                   #QualificadorVazio
    ;

decorador
    : AMPER             #DecoradorAmper
    |                   #DecoradorVazio
    ;

bloco
    : LBRACE declaracoes_locais comando* RBRACE
    ;

comando
    : bloco                     #ComandoBloco
    | selecao                   #ComandoSelecao
    | repeticao                 #ComandoRepeticao
    | atribuicao                #ComandoAtribuicao
    | retorno                   #ComandoRetorno
    | entrada                   #ComandoEntrada
    | saida                     #ComandoSaida
    | expressao_comando         #ComandoExpressao
    | BREAK SEMI                #ComandoBreak
    ;

selecao
    : IF LPAREN expressao RPAREN comando* (ELSE comando*)?
    ;

repeticao
    : WHILE LPAREN expressao RPAREN comando*
    ;

atribuicao
    : nome ATRIB expressao SEMI
    ;

retorno
    : RETURN expressao_comando
    ;

entrada
    : STDCIN (RSHIFT (nome | STDENDL))+ SEMI
    ;

saida
    : STDCOUT (LSHIFT (expressao | STRL | STDENDL))+ SEMI
    ;

declaracoes_locais
    : variavel                  #DeclaracaoLocalVariavel
    | variavel_atribuicao       #DeclaracaoLocalAtribuicao
    |                           #DeclaracaoLocalVazia
    ;

expressao_comando
    : expressao SEMI            #ExpressaoComandoExpressao
    | SEMI                      #ExpressaoComandoSemi
    ;

expressao
    : LPAREN expressao RPAREN                           #ExpressaoParens
    | expressao operador_binario expressao              #ExpressaoBinario
    | <assoc=right> operador_unario expressao           #ExpressaoUnario
    | nome LPAREN parametros_reais RPAREN               #ExpressaoReais
    | nome                                              #ExpressaoNome
    | INTL                                              #ExpressaoIntl
    | CHARL                                             #ExpressaoCharl
    | TRUE                                              #ExpressaoTrue
    | FALSE                                             #ExpressaoFalse
    ;

operador_binario
    : AND           #BinarioAnd
    | OR            #BinarioOr
    | PLUS          #BinarioPlus
    | MINUS         #BinarioMinus
    | TIMES         #BinarioTimes
    | DIV           #BinarioDiv
    | MOD           #BinarioMod
    | LT            #BinarioLess
    | LEQ           #BinarioLessEqual
    | GT            #BinarioGreater
    | GEQ           #BinarioGreaterEqual
    | EQ            #BinarioEqual
    | NEQ           #BinarioNotEqual
    ;

operador_unario
    : INCR          #UnarioIncrement
    | DECR          #UnarioDecrement
    | MINUS         #UnarioMinus
    | PLUS          #UnarioPlus
    | NOT           #UnarioNot
    ;

nome
    : (ID DBLCOL | THIS ARROW)? (ID DOT | ID DBLCOL | THIS ARROW | LPAREN parametros_reais RPAREN DOT | ID)*
    ;

parametros_reais
    : expressao (COMMA expressao)*      #ParametrosReaisExpressao
    |                                   #ParametrosReaisVazio
    ;

// Tokens
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment NUMBER: [0-9] ;
fragment PONT: ('-' | '!' | ':' | ',' | '.' | '+' | '?' | '(' | ')' | '{' | '}' | '/') ;

ID: (LOWERCASE | UPPERCASE)(LOWERCASE | UPPERCASE | NUMBER | '_')* ;
INTL: ('+' | '-')? NUMBER ;

//TODO aceitar tabela ASCII
CHARL: '\'' (LOWERCASE | UPPERCASE | PONT) '\'' ;
STRL: '"' (LOWERCASE | UPPERCASE | PONT)* '"' ;

//TODO precedencia
AND: '&&' ;
OR: '||' ;
PLUS: '+' ;
MINUS: '-' ;
TIMES: '*' ;
DIV: '/' ;
MOD: '%' ;
LT: '<' ;
LEQ: '<=' ;
GT: '>' ;
GEQ: '>=' ;
EQ: '==' ;
NEQ: '!=' ;
INCR: '++' ;
DECR: '--' ;
NOT: '!' ;

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

LPAREN: '(' ;
RPAREN: ')' ;
LBRACE: '{' ;
RBRACE: '}' ;
COMMA: ',' ;
COLON: ':' ;
SEMI: ';' ;
AMPER: '&' ;
LSHIFT: '<<' ;
RSHIFT: '>>' ;
STDCIN: 'std::cin' ;
STDCOUT: 'std::cout' ;
STDENDL: 'std::endl' ;

DIR: '#' ~[\r\n]* -> skip ;
COMMENTBLOCK: '/*' .*? '*/' -> skip ;
COMMENTLINE: '//' ~[\r\n]*  -> skip ;
WHITESPACE: [ \r\n\t]+ -> skip ;