grammar QPP;

// Rules

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
    | nome LPAREN parâmetros_reais RPAREN
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
    | nome LPAREN parâmetros_reais RPAREN DOT nome_lista
    | ID
    ;

parâmetros_reais
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
