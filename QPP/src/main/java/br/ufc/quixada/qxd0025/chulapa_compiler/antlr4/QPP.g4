grammar QPP;

// Rules
//TODO remover recursões
programa
    : lista_definicoes EOF
    ;

lista_definicoes
    :
    | lista_definicoes definicao
    | definicao
    ;

definicao
    :
    | funcao
    | estrutura
    ;

estrutura
    :
    | STRUCT ID LBRACE lista_estrutura_corpo RBRACE SEMI
    ;


lista_estrutura_corpo
    :
    | lista_estrutura_corpo estrutura_acesso
    | estrutura_acesso
    ;

estrutura_acesso
    :
    | PUBLIC COLON lista_estrutura_membros
    | PROTECTED COLON lista_estrutura_membros
    ;

lista_estrutura_membros
    :
    | lista_estrutura_membros membro
    | membro
    ;

membro
    :
    | construtor
    | variavel
    | metodo
    | STATIC variavel
    | STATIC metodo
    ;

variavel
    :
    | tipo ID SEMI
    ;

variavel_atribuicao
    :
    | tipo ID ATRIB expressao SEMI
    ;

construtor
    :
    | ID LPAREN parametros_formais RPAREN bloco
    ;

metodo
    :
    | funcao_cabecalho qualificador bloco
    ;

funcao
    :
    | funcao_cabecalho bloco
    ;

funcao_cabecalho
    :
    | tipo ID LPAREN parametros_formais RPAREN
    ;

parametros_formais
    :
    | lista_parametros_formais
    | EMPTY
    ;

lista_parametros_formais
    :
    | lista_parametros_formais COMMA tipo ID
    | tipo ID
    ;

tipo
    :
    | VOID
    | qualificador INT decorador
    | qualificador CHAR decorador
    | qualificador BOOL decorador
    | qualificador tipo_nome decorador
    ;

tipo_nome
    :
    | tipo_nome DBCOL ID
    | ID
    ;

qualificador
    :
    | CONST
    | EMPTY
    ;

decorador
    :
    | AMPER
    | EMPTY
    ;

bloco
    :
    | LBRACE lista_declaracoes_locais lista_comandos RBRACE
    ;

lista_comandos
    :
    | lista_comandos comando
    | comando
    ;

comando
    :
    | bloco
    | selecao
    | repeticao
    | atribuicao
    | retorno
    | entrada
    | saida
    | expressao_comando
    | BREAK SEMI
    ;

selecao
    :
    | IF LPAREN expressao RPAREN lista_comandos selecao_senao
    ;

selecao_senao
    :
    | ELSE lista_comandos
    | EMPTY
    ;

repeticao
    :
    | WHILE LPAREN expressao RPAREN lista_comandos
    ;

atribuicao
    :
    | nome ATRIB expressao SEMI
    ;

retorno
    :
    | RETURN expressao_comando
    ;

entrada
    :
    | STDCIN lista_entrada_params SEMI
    ;

lista_entrada_params
    :
    | lista_entrada_params RSHIFT nome
    | nome
    | STDENDL
    ;

saida
    :
    | STDCOUT lista_saida_params SEMI
    ;

lista_saida_params
    :
    | lista_entrada_params LSHIFT expressao
    | expressao
    | STRL
    | STDENDL
    ;

lista_declaracoes_locais
    :
    | variavel
    | variavel_atribuicao
    | EMPTY
    ;

expressao_comando
    :
    | expressao SEMI
    | SEMI
    ;

expressao
    :
    | LPAREN expressao RPAREN
    | expressao operador_binario expressao
    | operador_unario expressao
    | nome LPAREN parametros_reais RPAREN
    | nome
    | INTL
    | CHARL
    | TRUE
    | FALSE
    ;

operador_binario
    :
    | AND
    | OR
    | PLUS
    | MINUS
    | TIMES
    | DIV
    | MOD
    | LT
    | LEQ
    | GT
    | GEQ
    | EQ
    | NEQ
    ;

operador_unario
    :
    | INCR
    | DECR
    | MINUS
    | NOT
    ;

nome
    :
    | ID DBLCOL nome_lista
    | THIS ARROW nome_lista
    | nome_lista
    ;

nome_lista
    :
    | ID DOT nome_lista
    | nome LPAREN parametros_reais RPAREN DOT nome_lista
    | ID
    ;

parametros_reais
    :
    | lista_parametros_reais
    | EMPTY
    ;

lista_parametros_reais
    :
    | lista_parametros_reais COMMA expressao
    | expressao
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