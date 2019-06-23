grammar QPP;

// Rules
programa
    : definicao* EOF
    ;

definicao
    : funcao # DefinicaoFuncao
    | estrutura # DefinicaoEstrutura
    ;

estrutura
    : STRUCT ID LBRACE estrutura_acesso+ RBRACE SEMI
    ;

estrutura_acesso
    : PUBLIC COLON membro+ # EstruturaAcessoPublic
    | PROTECTED COLON membro+ # EstruturaAcessoProtected
    | PRIVATE COLON membro+ # EstruturaAcessoPrivate
    ;

membro
    : construtor # MembroConstrutor
    | variavel # MembroVariavel
    | metodo # MembroMetodo
    | STATIC variavel # MembroStaticVariavel
    | STATIC metodo # MembroStaticMetodo
    ;

variavel
    : tipo ID SEMI # VariavelCriacao
    | tipo ID atribuicao # VariavelAtribuicao
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
    : tipo ID ( COMMA tipo ID )* #ListaParametrosFormais
    | # ParametrosFormaisVazio
    ;

tipo
    : VOID # TipoVoid
    | qualificador INT decorador # TipoInt
    | qualificador FLOAT decorador # TipoFloat
    | qualificador CHAR decorador # TipoChar
    | qualificador BOOL decorador # TipoBool
    | qualificador tipo_nome decorador # TipoNome
    ;

tipo_nome
    : tipo_nome DBLCOL ID # TipoNomeAcesso
    | ID # TipoID
    ;

qualificador
    : CONST # QualificadorConst
    | # QualificadorVazio
    ;

decorador
    : AMPER # DecoradorAmper
    | # DecoradorVazio
    ;

bloco
    : LBRACE variavel* comando* RBRACE
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
    : IF LPAREN expressao RPAREN comando* selecao_senao
    ;

selecao_senao
    : ELSE comando* # SelecaoSenao
    | # SelecaoSenaoVazio
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
    : STDCIN ( RSHIFT nome | RSHIFT STDENDL)+ SEMI
    ;

saida
    : STDCOUT (LSHIFT expressao | LSHIFT STDENDL)+ SEMI
    ;

expressao_comando
    : expressao SEMI # ExpressaoComandoExpressao
    | SEMI # ExpressaoComandoSEMI
    ;

expressao
    : LPAREN expressao RPAREN # ExpressaoLarenRparen
    | <assoc=right>operador_unario expressao # ExpressaoUnario
    | expressao operador_binario expressao # ExpressaoOperadorBinario
    | nome LPAREN parametros_reais RPAREN # ExpressaoParametrosReais
    | nome # ExpressaoNome
    | INTL # ExpressaoINTL
    | FLOATL # ExpressaoFLOATL
    | CHARL # ExpressaoCHARL
    | STRL #ExpressaoSTRL
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
    : MINUS # OperadorUnarioUNARYMINUS
    | INCR # OperadorUnarioINCR
    | DECR # OperadorUnarioDECR
    | NOT # OperadorUnarioNOT
    ;

nome
    : ID DBLCOL nome_lista # NomeID
    | THIS ARROW nome_lista # NomeThisArrow
    | nome_lista # NomeNomeLista
    ;

nome_lista
    : ID DOT nome_lista nome_lista_ # NomeListaIDDOT
    | ID DBLCOL nome_lista LPAREN parametros_reais RPAREN DOT nome_lista nome_lista_ # NomeListaIDDBLCOL
    | THIS ARROW nome_lista LPAREN parametros_reais RPAREN DOT nome_lista nome_lista_ # NomeListaThisArrow
    | ID nome_lista_ # NomeListaID
    ;

nome_lista_
    : LPAREN parametros_reais RPAREN DOT nome_lista  # NomeListaLPAREN
    | # NomeListaEmpty
    ;

parametros_reais
    : expressao ( COMMA expressao)* # ParametrosReaisLista
    | # ParametrosReaisVazio
    ;

// Tokens
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment NUMBER: [0-9] ;

INTL: NUMBER+ ;
FLOATL: NUMBER*'.'NUMBER+  ;
CHARL: '\'' .? '\'' ;
STRL: '"' .*? '"' ;

LPAREN: '(' ;
RPAREN: ')' ;
LBRACE: '{' ;
RBRACE: '}' ;
ARROW: '->' ;
DOT: '.' ;

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
PROTECTED: 'protected' ;
PRIVATE: 'private' ;
STATIC: 'static' ;
THIS: 'this' ;
CONST: 'const';
VOID: 'void' ;
INT: 'int' ;
FLOAT: 'float' ;
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
