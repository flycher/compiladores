// Generated from /home/flycher/Dropbox/VScode/compiladores/QPP/src/main/java/br/ufc/quixada/qxd0025/chulapa_compiler/antlr4/QPP.g4 by ANTLR 4.7.2
package frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QPPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTL=1, FLOATL=2, CHARL=3, STRL=4, LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, 
		ARROW=9, DOT=10, INCR=11, DECR=12, NOT=13, AMPER=14, DIV=15, TIMES=16, 
		MOD=17, PLUS=18, MINUS=19, LT=20, GT=21, LEQ=22, GEQ=23, NEQ=24, EQ=25, 
		AND=26, OR=27, ATRIB=28, IF=29, ELSE=30, WHILE=31, BREAK=32, RETURN=33, 
		STRUCT=34, PUBLIC=35, PROTECTED=36, PRIVATE=37, STATIC=38, THIS=39, CONST=40, 
		VOID=41, INT=42, FLOAT=43, CHAR=44, BOOL=45, TRUE=46, FALSE=47, COMMA=48, 
		COLON=49, SEMI=50, DBLCOL=51, LSHIFT=52, RSHIFT=53, STDCIN=54, STDCOUT=55, 
		STDENDL=56, ID=57, DIR=58, COMMENTBLOCK=59, COMMENTLINE=60, WHITESPACE=61;
	public static final int
		RULE_programa = 0, RULE_definicao = 1, RULE_estrutura = 2, RULE_estrutura_acesso = 3, 
		RULE_membro = 4, RULE_variavel = 5, RULE_construtor = 6, RULE_metodo = 7, 
		RULE_funcao = 8, RULE_funcao_cabecalho = 9, RULE_parametros_formais = 10, 
		RULE_tipo = 11, RULE_tipo_nome = 12, RULE_qualificador = 13, RULE_decorador = 14, 
		RULE_bloco = 15, RULE_comando = 16, RULE_selecao = 17, RULE_selecao_senao = 18, 
		RULE_repeticao = 19, RULE_atribuicao = 20, RULE_retorno = 21, RULE_entrada = 22, 
		RULE_saida = 23, RULE_expressao_comando = 24, RULE_expressao = 25, RULE_operador_binario = 26, 
		RULE_operador_unario = 27, RULE_nome = 28, RULE_nome_lista = 29, RULE_nome_lista_ = 30, 
		RULE_parametros_reais = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "definicao", "estrutura", "estrutura_acesso", "membro", "variavel", 
			"construtor", "metodo", "funcao", "funcao_cabecalho", "parametros_formais", 
			"tipo", "tipo_nome", "qualificador", "decorador", "bloco", "comando", 
			"selecao", "selecao_senao", "repeticao", "atribuicao", "retorno", "entrada", 
			"saida", "expressao_comando", "expressao", "operador_binario", "operador_unario", 
			"nome", "nome_lista", "nome_lista_", "parametros_reais"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'->'", "'.'", 
			"'++'", "'--'", "'!'", "'&'", "'/'", "'*'", "'%'", "'+'", "'-'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "'='", "'if'", 
			"'else'", "'while'", "'break'", "'return'", "'struct'", "'public'", "'protected'", 
			"'private'", "'static'", "'this'", "'const'", "'void'", "'int'", "'float'", 
			"'char'", "'bool'", "'true'", "'false'", "','", "':'", "';'", "'::'", 
			"'<<'", "'>>'", "'std::cin'", "'std::cout'", "'std::endl'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTL", "FLOATL", "CHARL", "STRL", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "ARROW", "DOT", "INCR", "DECR", "NOT", "AMPER", "DIV", "TIMES", 
			"MOD", "PLUS", "MINUS", "LT", "GT", "LEQ", "GEQ", "NEQ", "EQ", "AND", 
			"OR", "ATRIB", "IF", "ELSE", "WHILE", "BREAK", "RETURN", "STRUCT", "PUBLIC", 
			"PROTECTED", "PRIVATE", "STATIC", "THIS", "CONST", "VOID", "INT", "FLOAT", 
			"CHAR", "BOOL", "TRUE", "FALSE", "COMMA", "COLON", "SEMI", "DBLCOL", 
			"LSHIFT", "RSHIFT", "STDCIN", "STDCOUT", "STDENDL", "ID", "DIR", "COMMENTBLOCK", 
			"COMMENTLINE", "WHITESPACE"
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
	public String getGrammarFileName() { return "QPP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QPPParser.EOF, 0); }
		public List<DefinicaoContext> definicao() {
			return getRuleContexts(DefinicaoContext.class);
		}
		public DefinicaoContext definicao(int i) {
			return getRuleContext(DefinicaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << CONST) | (1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(64);
				definicao();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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

	public static class DefinicaoContext extends ParserRuleContext {
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
	 
		public DefinicaoContext() { }
		public void copyFrom(DefinicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinicaoFuncaoContext extends DefinicaoContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public DefinicaoFuncaoContext(DefinicaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitDefinicaoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinicaoEstruturaContext extends DefinicaoContext {
		public EstruturaContext estrutura() {
			return getRuleContext(EstruturaContext.class,0);
		}
		public DefinicaoEstruturaContext(DefinicaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitDefinicaoEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicao);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VOID:
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
			case ID:
				_localctx = new DefinicaoFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				funcao();
				}
				break;
			case STRUCT:
				_localctx = new DefinicaoEstruturaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				estrutura();
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

	public static class EstruturaContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(QPPParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(QPPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QPPParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(QPPParser.SEMI, 0); }
		public List<Estrutura_acessoContext> estrutura_acesso() {
			return getRuleContexts(Estrutura_acessoContext.class);
		}
		public Estrutura_acessoContext estrutura_acesso(int i) {
			return getRuleContext(Estrutura_acessoContext.class,i);
		}
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_estrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(STRUCT);
			setState(77);
			match(ID);
			setState(78);
			match(LBRACE);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				estrutura_acesso();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0) );
			setState(84);
			match(RBRACE);
			setState(85);
			match(SEMI);
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

	public static class Estrutura_acessoContext extends ParserRuleContext {
		public Estrutura_acessoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura_acesso; }
	 
		public Estrutura_acessoContext() { }
		public void copyFrom(Estrutura_acessoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EstruturaAcessoPrivateContext extends Estrutura_acessoContext {
		public TerminalNode PRIVATE() { return getToken(QPPParser.PRIVATE, 0); }
		public TerminalNode COLON() { return getToken(QPPParser.COLON, 0); }
		public List<MembroContext> membro() {
			return getRuleContexts(MembroContext.class);
		}
		public MembroContext membro(int i) {
			return getRuleContext(MembroContext.class,i);
		}
		public EstruturaAcessoPrivateContext(Estrutura_acessoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitEstruturaAcessoPrivate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EstruturaAcessoPublicContext extends Estrutura_acessoContext {
		public TerminalNode PUBLIC() { return getToken(QPPParser.PUBLIC, 0); }
		public TerminalNode COLON() { return getToken(QPPParser.COLON, 0); }
		public List<MembroContext> membro() {
			return getRuleContexts(MembroContext.class);
		}
		public MembroContext membro(int i) {
			return getRuleContext(MembroContext.class,i);
		}
		public EstruturaAcessoPublicContext(Estrutura_acessoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitEstruturaAcessoPublic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EstruturaAcessoProtectedContext extends Estrutura_acessoContext {
		public TerminalNode PROTECTED() { return getToken(QPPParser.PROTECTED, 0); }
		public TerminalNode COLON() { return getToken(QPPParser.COLON, 0); }
		public List<MembroContext> membro() {
			return getRuleContexts(MembroContext.class);
		}
		public MembroContext membro(int i) {
			return getRuleContext(MembroContext.class,i);
		}
		public EstruturaAcessoProtectedContext(Estrutura_acessoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitEstruturaAcessoProtected(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estrutura_acessoContext estrutura_acesso() throws RecognitionException {
		Estrutura_acessoContext _localctx = new Estrutura_acessoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estrutura_acesso);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				_localctx = new EstruturaAcessoPublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(PUBLIC);
				setState(88);
				match(COLON);
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					membro();
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATIC) | (1L << CONST) | (1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL) | (1L << ID))) != 0) );
				}
				break;
			case PROTECTED:
				_localctx = new EstruturaAcessoProtectedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(PROTECTED);
				setState(95);
				match(COLON);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					membro();
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATIC) | (1L << CONST) | (1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL) | (1L << ID))) != 0) );
				}
				break;
			case PRIVATE:
				_localctx = new EstruturaAcessoPrivateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(PRIVATE);
				setState(102);
				match(COLON);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					membro();
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATIC) | (1L << CONST) | (1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL) | (1L << ID))) != 0) );
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

	public static class MembroContext extends ParserRuleContext {
		public MembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membro; }
	 
		public MembroContext() { }
		public void copyFrom(MembroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MembroConstrutorContext extends MembroContext {
		public ConstrutorContext construtor() {
			return getRuleContext(ConstrutorContext.class,0);
		}
		public MembroConstrutorContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitMembroConstrutor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MembroStaticMetodoContext extends MembroContext {
		public TerminalNode STATIC() { return getToken(QPPParser.STATIC, 0); }
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public MembroStaticMetodoContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitMembroStaticMetodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MembroStaticVariavelContext extends MembroContext {
		public TerminalNode STATIC() { return getToken(QPPParser.STATIC, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public MembroStaticVariavelContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitMembroStaticVariavel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MembroMetodoContext extends MembroContext {
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public MembroMetodoContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitMembroMetodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MembroVariavelContext extends MembroContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public MembroVariavelContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitMembroVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembroContext membro() throws RecognitionException {
		MembroContext _localctx = new MembroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_membro);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MembroConstrutorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				construtor();
				}
				break;
			case 2:
				_localctx = new MembroVariavelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				variavel();
				}
				break;
			case 3:
				_localctx = new MembroMetodoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				metodo();
				}
				break;
			case 4:
				_localctx = new MembroStaticVariavelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(STATIC);
				setState(114);
				variavel();
				}
				break;
			case 5:
				_localctx = new MembroStaticMetodoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(STATIC);
				setState(116);
				metodo();
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

	public static class VariavelContext extends ParserRuleContext {
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	 
		public VariavelContext() { }
		public void copyFrom(VariavelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariavelCriacaoContext extends VariavelContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(QPPParser.SEMI, 0); }
		public VariavelCriacaoContext(VariavelContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitVariavelCriacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariavelAtribuicaoContext extends VariavelContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public VariavelAtribuicaoContext(VariavelContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitVariavelAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variavel);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new VariavelCriacaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				tipo();
				setState(120);
				match(ID);
				setState(121);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new VariavelAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				tipo();
				setState(124);
				match(ID);
				setState(125);
				atribuicao();
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

	public static class ConstrutorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public Parametros_formaisContext parametros_formais() {
			return getRuleContext(Parametros_formaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ConstrutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitConstrutor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrutorContext construtor() throws RecognitionException {
		ConstrutorContext _localctx = new ConstrutorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_construtor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ID);
			setState(130);
			match(LPAREN);
			setState(131);
			parametros_formais();
			setState(132);
			match(RPAREN);
			setState(133);
			bloco();
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

	public static class MetodoContext extends ParserRuleContext {
		public Funcao_cabecalhoContext funcao_cabecalho() {
			return getRuleContext(Funcao_cabecalhoContext.class,0);
		}
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			funcao_cabecalho();
			setState(136);
			qualificador();
			setState(137);
			bloco();
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

	public static class FuncaoContext extends ParserRuleContext {
		public Funcao_cabecalhoContext funcao_cabecalho() {
			return getRuleContext(Funcao_cabecalhoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			funcao_cabecalho();
			setState(140);
			bloco();
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

	public static class Funcao_cabecalhoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public Parametros_formaisContext parametros_formais() {
			return getRuleContext(Parametros_formaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public Funcao_cabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_cabecalho; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitFuncao_cabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcao_cabecalhoContext funcao_cabecalho() throws RecognitionException {
		Funcao_cabecalhoContext _localctx = new Funcao_cabecalhoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcao_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			tipo();
			setState(143);
			match(ID);
			setState(144);
			match(LPAREN);
			setState(145);
			parametros_formais();
			setState(146);
			match(RPAREN);
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

	public static class Parametros_formaisContext extends ParserRuleContext {
		public Parametros_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_formais; }
	 
		public Parametros_formaisContext() { }
		public void copyFrom(Parametros_formaisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParametrosFormaisVazioContext extends Parametros_formaisContext {
		public ParametrosFormaisVazioContext(Parametros_formaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitParametrosFormaisVazio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaParametrosFormaisContext extends Parametros_formaisContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(QPPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QPPParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QPPParser.COMMA, i);
		}
		public ListaParametrosFormaisContext(Parametros_formaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitListaParametrosFormais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_formaisContext parametros_formais() throws RecognitionException {
		Parametros_formaisContext _localctx = new Parametros_formaisContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametros_formais);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VOID:
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
			case ID:
				_localctx = new ListaParametrosFormaisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				tipo();
				setState(149);
				match(ID);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					tipo();
					setState(152);
					match(ID);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				_localctx = new ParametrosFormaisVazioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoBoolContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(QPPParser.BOOL, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public TipoBoolContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitTipoBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoCharContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(QPPParser.CHAR, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public TipoCharContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitTipoChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoFloatContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(QPPParser.FLOAT, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public TipoFloatContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitTipoFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoVoidContext extends TipoContext {
		public TerminalNode VOID() { return getToken(QPPParser.VOID, 0); }
		public TipoVoidContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitTipoVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoNomeContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public Tipo_nomeContext tipo_nome() {
			return getRuleContext(Tipo_nomeContext.class,0);
		}
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public TipoNomeContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitTipoNome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIntContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode INT() { return getToken(QPPParser.INT, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public TipoIntContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitTipoInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new TipoVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(VOID);
				}
				break;
			case 2:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				qualificador();
				setState(164);
				match(INT);
				setState(165);
				decorador();
				}
				break;
			case 3:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				qualificador();
				setState(168);
				match(FLOAT);
				setState(169);
				decorador();
				}
				break;
			case 4:
				_localctx = new TipoCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				qualificador();
				setState(172);
				match(CHAR);
				setState(173);
				decorador();
				}
				break;
			case 5:
				_localctx = new TipoBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				qualificador();
				setState(176);
				match(BOOL);
				setState(177);
				decorador();
				}
				break;
			case 6:
				_localctx = new TipoNomeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				qualificador();
				setState(180);
				tipo_nome(0);
				setState(181);
				decorador();
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

	public static class Tipo_nomeContext extends ParserRuleContext {
		public Tipo_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_nome; }
	 
		public Tipo_nomeContext() { }
		public void copyFrom(Tipo_nomeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoIDContext extends Tipo_nomeContext {
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TipoIDContext(Tipo_nomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitTipoID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoNomeAcessoContext extends Tipo_nomeContext {
		public Tipo_nomeContext tipo_nome() {
			return getRuleContext(Tipo_nomeContext.class,0);
		}
		public TerminalNode DBLCOL() { return getToken(QPPParser.DBLCOL, 0); }
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TipoNomeAcessoContext(Tipo_nomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitTipoNomeAcesso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_nomeContext tipo_nome() throws RecognitionException {
		return tipo_nome(0);
	}

	private Tipo_nomeContext tipo_nome(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tipo_nomeContext _localctx = new Tipo_nomeContext(_ctx, _parentState);
		Tipo_nomeContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_tipo_nome, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TipoIDContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(186);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TipoNomeAcessoContext(new Tipo_nomeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tipo_nome);
					setState(188);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(189);
					match(DBLCOL);
					setState(190);
					match(ID);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class QualificadorContext extends ParserRuleContext {
		public QualificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualificador; }
	 
		public QualificadorContext() { }
		public void copyFrom(QualificadorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QualificadorVazioContext extends QualificadorContext {
		public QualificadorVazioContext(QualificadorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitQualificadorVazio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QualificadorConstContext extends QualificadorContext {
		public TerminalNode CONST() { return getToken(QPPParser.CONST, 0); }
		public QualificadorConstContext(QualificadorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitQualificadorConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualificadorContext qualificador() throws RecognitionException {
		QualificadorContext _localctx = new QualificadorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_qualificador);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new QualificadorConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(CONST);
				}
				break;
			case LBRACE:
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
			case ID:
				_localctx = new QualificadorVazioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DecoradorContext extends ParserRuleContext {
		public DecoradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorador; }
	 
		public DecoradorContext() { }
		public void copyFrom(DecoradorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecoradorAmperContext extends DecoradorContext {
		public TerminalNode AMPER() { return getToken(QPPParser.AMPER, 0); }
		public DecoradorAmperContext(DecoradorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitDecoradorAmper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecoradorVazioContext extends DecoradorContext {
		public DecoradorVazioContext(DecoradorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitDecoradorVazio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoradorContext decorador() throws RecognitionException {
		DecoradorContext _localctx = new DecoradorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decorador);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMPER:
				_localctx = new DecoradorAmperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(AMPER);
				}
				break;
			case ID:
				_localctx = new DecoradorVazioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(QPPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QPPParser.RBRACE, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bloco);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LBRACE);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					variavel();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTL) | (1L << FLOATL) | (1L << CHARL) | (1L << STRL) | (1L << LPAREN) | (1L << LBRACE) | (1L << INCR) | (1L << DECR) | (1L << NOT) | (1L << MINUS) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << SEMI) | (1L << STDCIN) | (1L << STDCOUT) | (1L << ID))) != 0)) {
				{
				{
				setState(211);
				comando();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(RBRACE);
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComandoAtribuicaoContext extends ComandoContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ComandoAtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComandoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoEntradaContext extends ComandoContext {
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public ComandoEntradaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComandoEntrada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComadoRepeticaoContext extends ComandoContext {
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public ComadoRepeticaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComadoRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoBlocoContext extends ComandoContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ComandoBlocoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComandoBloco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComadoSelecaoContext extends ComandoContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public ComadoSelecaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComadoSelecao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoBreakContext extends ComandoContext {
		public TerminalNode BREAK() { return getToken(QPPParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(QPPParser.SEMI, 0); }
		public ComandoBreakContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComandoBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoSaidaContext extends ComandoContext {
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public ComandoSaidaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComandoSaida(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoExpressaoComandoContext extends ComandoContext {
		public Expressao_comandoContext expressao_comando() {
			return getRuleContext(Expressao_comandoContext.class,0);
		}
		public ComandoExpressaoComandoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComandoExpressaoComando(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoRetornoContext extends ComandoContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoRetornoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitComandoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ComandoBlocoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				bloco();
				}
				break;
			case 2:
				_localctx = new ComadoSelecaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				selecao();
				}
				break;
			case 3:
				_localctx = new ComadoRepeticaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				repeticao();
				}
				break;
			case 4:
				_localctx = new ComandoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				atribuicao();
				}
				break;
			case 5:
				_localctx = new ComandoRetornoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				retorno();
				}
				break;
			case 6:
				_localctx = new ComandoEntradaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				entrada();
				}
				break;
			case 7:
				_localctx = new ComandoSaidaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				saida();
				}
				break;
			case 8:
				_localctx = new ComandoExpressaoComandoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				expressao_comando();
				}
				break;
			case 9:
				_localctx = new ComandoBreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
				match(BREAK);
				setState(228);
				match(SEMI);
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

	public static class SelecaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(QPPParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public Selecao_senaoContext selecao_senao() {
			return getRuleContext(Selecao_senaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selecao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IF);
			setState(232);
			match(LPAREN);
			setState(233);
			expressao(0);
			setState(234);
			match(RPAREN);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					comando();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(241);
			selecao_senao();
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

	public static class Selecao_senaoContext extends ParserRuleContext {
		public Selecao_senaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao_senao; }
	 
		public Selecao_senaoContext() { }
		public void copyFrom(Selecao_senaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelecaoSenaoVazioContext extends Selecao_senaoContext {
		public SelecaoSenaoVazioContext(Selecao_senaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitSelecaoSenaoVazio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelecaoSenaoContext extends Selecao_senaoContext {
		public TerminalNode ELSE() { return getToken(QPPParser.ELSE, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SelecaoSenaoContext(Selecao_senaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitSelecaoSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selecao_senaoContext selecao_senao() throws RecognitionException {
		Selecao_senaoContext _localctx = new Selecao_senaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selecao_senao);
		try {
			int _alt;
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SelecaoSenaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(ELSE);
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(244);
						comando();
						}
						} 
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SelecaoSenaoVazioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(QPPParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repeticao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WHILE);
			setState(254);
			match(LPAREN);
			setState(255);
			expressao(0);
			setState(256);
			match(RPAREN);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					comando();
					}
					} 
				}
				setState(262);
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
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode ATRIB() { return getToken(QPPParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(QPPParser.SEMI, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			nome();
			setState(264);
			match(ATRIB);
			setState(265);
			expressao(0);
			setState(266);
			match(SEMI);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(QPPParser.RETURN, 0); }
		public Expressao_comandoContext expressao_comando() {
			return getRuleContext(Expressao_comandoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(RETURN);
			setState(269);
			expressao_comando();
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

	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode STDCIN() { return getToken(QPPParser.STDCIN, 0); }
		public TerminalNode SEMI() { return getToken(QPPParser.SEMI, 0); }
		public List<TerminalNode> RSHIFT() { return getTokens(QPPParser.RSHIFT); }
		public TerminalNode RSHIFT(int i) {
			return getToken(QPPParser.RSHIFT, i);
		}
		public List<NomeContext> nome() {
			return getRuleContexts(NomeContext.class);
		}
		public NomeContext nome(int i) {
			return getRuleContext(NomeContext.class,i);
		}
		public List<TerminalNode> STDENDL() { return getTokens(QPPParser.STDENDL); }
		public TerminalNode STDENDL(int i) {
			return getToken(QPPParser.STDENDL, i);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_entrada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(STDCIN);
			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(272);
					match(RSHIFT);
					setState(273);
					nome();
					}
					break;
				case 2:
					{
					setState(274);
					match(RSHIFT);
					setState(275);
					match(STDENDL);
					}
					break;
				}
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RSHIFT );
			setState(280);
			match(SEMI);
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

	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode STDCOUT() { return getToken(QPPParser.STDCOUT, 0); }
		public TerminalNode SEMI() { return getToken(QPPParser.SEMI, 0); }
		public List<TerminalNode> LSHIFT() { return getTokens(QPPParser.LSHIFT); }
		public TerminalNode LSHIFT(int i) {
			return getToken(QPPParser.LSHIFT, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> STDENDL() { return getTokens(QPPParser.STDENDL); }
		public TerminalNode STDENDL(int i) {
			return getToken(QPPParser.STDENDL, i);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_saida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(STDCOUT);
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(283);
					match(LSHIFT);
					setState(284);
					expressao(0);
					}
					break;
				case 2:
					{
					setState(285);
					match(LSHIFT);
					setState(286);
					match(STDENDL);
					}
					break;
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LSHIFT );
			setState(291);
			match(SEMI);
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

	public static class Expressao_comandoContext extends ParserRuleContext {
		public Expressao_comandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_comando; }
	 
		public Expressao_comandoContext() { }
		public void copyFrom(Expressao_comandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressaoComandoExpressaoContext extends Expressao_comandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(QPPParser.SEMI, 0); }
		public ExpressaoComandoExpressaoContext(Expressao_comandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoComandoExpressao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoComandoSEMIContext extends Expressao_comandoContext {
		public TerminalNode SEMI() { return getToken(QPPParser.SEMI, 0); }
		public ExpressaoComandoSEMIContext(Expressao_comandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoComandoSEMI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_comandoContext expressao_comando() throws RecognitionException {
		Expressao_comandoContext _localctx = new Expressao_comandoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressao_comando);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTL:
			case FLOATL:
			case CHARL:
			case STRL:
			case LPAREN:
			case INCR:
			case DECR:
			case NOT:
			case MINUS:
			case THIS:
			case TRUE:
			case FALSE:
			case ID:
				_localctx = new ExpressaoComandoExpressaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				expressao(0);
				setState(294);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new ExpressaoComandoSEMIContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(SEMI);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressaoCHARLContext extends ExpressaoContext {
		public TerminalNode CHARL() { return getToken(QPPParser.CHARL, 0); }
		public ExpressaoCHARLContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoCHARL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoUnarioContext extends ExpressaoContext {
		public Operador_unarioContext operador_unario() {
			return getRuleContext(Operador_unarioContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpressaoUnarioContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoUnario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoNomeContext extends ExpressaoContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public ExpressaoNomeContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoNome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoFLOATLContext extends ExpressaoContext {
		public TerminalNode FLOATL() { return getToken(QPPParser.FLOATL, 0); }
		public ExpressaoFLOATLContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoFLOATL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoOperadorBinarioContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Operador_binarioContext operador_binario() {
			return getRuleContext(Operador_binarioContext.class,0);
		}
		public ExpressaoOperadorBinarioContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoOperadorBinario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoINTLContext extends ExpressaoContext {
		public TerminalNode INTL() { return getToken(QPPParser.INTL, 0); }
		public ExpressaoINTLContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoINTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoTrueContext extends ExpressaoContext {
		public TerminalNode TRUE() { return getToken(QPPParser.TRUE, 0); }
		public ExpressaoTrueContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoFalseContext extends ExpressaoContext {
		public TerminalNode FALSE() { return getToken(QPPParser.FALSE, 0); }
		public ExpressaoFalseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoLarenRparenContext extends ExpressaoContext {
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public ExpressaoLarenRparenContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoLarenRparen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoParametrosReaisContext extends ExpressaoContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public ExpressaoParametrosReaisContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoParametrosReais(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoSTRLContext extends ExpressaoContext {
		public TerminalNode STRL() { return getToken(QPPParser.STRL, 0); }
		public ExpressaoSTRLContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitExpressaoSTRL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressaoLarenRparenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(300);
				match(LPAREN);
				setState(301);
				expressao(0);
				setState(302);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExpressaoUnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				operador_unario();
				setState(305);
				expressao(10);
				}
				break;
			case 3:
				{
				_localctx = new ExpressaoParametrosReaisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				nome();
				setState(308);
				match(LPAREN);
				setState(309);
				parametros_reais();
				setState(310);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ExpressaoNomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				nome();
				}
				break;
			case 5:
				{
				_localctx = new ExpressaoINTLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(INTL);
				}
				break;
			case 6:
				{
				_localctx = new ExpressaoFLOATLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(FLOATL);
				}
				break;
			case 7:
				{
				_localctx = new ExpressaoCHARLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(CHARL);
				}
				break;
			case 8:
				{
				_localctx = new ExpressaoSTRLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(STRL);
				}
				break;
			case 9:
				{
				_localctx = new ExpressaoTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(TRUE);
				}
				break;
			case 10:
				{
				_localctx = new ExpressaoFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoOperadorBinarioContext(new ExpressaoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(321);
					if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(322);
					operador_binario();
					setState(323);
					expressao(10);
					}
					} 
				}
				setState(329);
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

	public static class Operador_binarioContext extends ParserRuleContext {
		public Operador_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_binario; }
	 
		public Operador_binarioContext() { }
		public void copyFrom(Operador_binarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperadorBinarioANDContext extends Operador_binarioContext {
		public TerminalNode AND() { return getToken(QPPParser.AND, 0); }
		public OperadorBinarioANDContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorBinarioMINUSContext extends Operador_binarioContext {
		public TerminalNode MINUS() { return getToken(QPPParser.MINUS, 0); }
		public OperadorBinarioMINUSContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioMINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorBinarioMODContext extends Operador_binarioContext {
		public TerminalNode MOD() { return getToken(QPPParser.MOD, 0); }
		public OperadorBinarioMODContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioMOD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorBinarioORContext extends Operador_binarioContext {
		public TerminalNode OR() { return getToken(QPPParser.OR, 0); }
		public OperadorBinarioORContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorNEQContext extends Operador_binarioContext {
		public TerminalNode NEQ() { return getToken(QPPParser.NEQ, 0); }
		public OperadorNEQContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorNEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorBinarioPLUSContext extends Operador_binarioContext {
		public TerminalNode PLUS() { return getToken(QPPParser.PLUS, 0); }
		public OperadorBinarioPLUSContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioPLUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorEQContext extends Operador_binarioContext {
		public TerminalNode EQ() { return getToken(QPPParser.EQ, 0); }
		public OperadorEQContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorGTContext extends Operador_binarioContext {
		public TerminalNode GT() { return getToken(QPPParser.GT, 0); }
		public OperadorGTContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorGT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorGEQContext extends Operador_binarioContext {
		public TerminalNode GEQ() { return getToken(QPPParser.GEQ, 0); }
		public OperadorGEQContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorGEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorBinarioLTContext extends Operador_binarioContext {
		public TerminalNode LT() { return getToken(QPPParser.LT, 0); }
		public OperadorBinarioLTContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioLT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorBinarioDIVContext extends Operador_binarioContext {
		public TerminalNode DIV() { return getToken(QPPParser.DIV, 0); }
		public OperadorBinarioDIVContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorBinarioLEQContext extends Operador_binarioContext {
		public TerminalNode LEQ() { return getToken(QPPParser.LEQ, 0); }
		public OperadorBinarioLEQContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioLEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorBinarioTIMESContext extends Operador_binarioContext {
		public TerminalNode TIMES() { return getToken(QPPParser.TIMES, 0); }
		public OperadorBinarioTIMESContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorBinarioTIMES(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_binarioContext operador_binario() throws RecognitionException {
		Operador_binarioContext _localctx = new Operador_binarioContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operador_binario);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new OperadorBinarioANDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OperadorBinarioORContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(OR);
				}
				break;
			case PLUS:
				_localctx = new OperadorBinarioPLUSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperadorBinarioMINUSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(MINUS);
				}
				break;
			case TIMES:
				_localctx = new OperadorBinarioTIMESContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				match(TIMES);
				}
				break;
			case DIV:
				_localctx = new OperadorBinarioDIVContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				match(DIV);
				}
				break;
			case MOD:
				_localctx = new OperadorBinarioMODContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				match(MOD);
				}
				break;
			case LT:
				_localctx = new OperadorBinarioLTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(337);
				match(LT);
				}
				break;
			case LEQ:
				_localctx = new OperadorBinarioLEQContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				match(LEQ);
				}
				break;
			case GT:
				_localctx = new OperadorGTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(339);
				match(GT);
				}
				break;
			case GEQ:
				_localctx = new OperadorGEQContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(340);
				match(GEQ);
				}
				break;
			case EQ:
				_localctx = new OperadorEQContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(341);
				match(EQ);
				}
				break;
			case NEQ:
				_localctx = new OperadorNEQContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(342);
				match(NEQ);
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

	public static class Operador_unarioContext extends ParserRuleContext {
		public Operador_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_unario; }
	 
		public Operador_unarioContext() { }
		public void copyFrom(Operador_unarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperadorUnarioINCRContext extends Operador_unarioContext {
		public TerminalNode INCR() { return getToken(QPPParser.INCR, 0); }
		public OperadorUnarioINCRContext(Operador_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorUnarioINCR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorUnarioUNARYMINUSContext extends Operador_unarioContext {
		public TerminalNode MINUS() { return getToken(QPPParser.MINUS, 0); }
		public OperadorUnarioUNARYMINUSContext(Operador_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorUnarioUNARYMINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorUnarioNOTContext extends Operador_unarioContext {
		public TerminalNode NOT() { return getToken(QPPParser.NOT, 0); }
		public OperadorUnarioNOTContext(Operador_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorUnarioNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorUnarioDECRContext extends Operador_unarioContext {
		public TerminalNode DECR() { return getToken(QPPParser.DECR, 0); }
		public OperadorUnarioDECRContext(Operador_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitOperadorUnarioDECR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_unarioContext operador_unario() throws RecognitionException {
		Operador_unarioContext _localctx = new Operador_unarioContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operador_unario);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new OperadorUnarioUNARYMINUSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(MINUS);
				}
				break;
			case INCR:
				_localctx = new OperadorUnarioINCRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(INCR);
				}
				break;
			case DECR:
				_localctx = new OperadorUnarioDECRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(DECR);
				}
				break;
			case NOT:
				_localctx = new OperadorUnarioNOTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				match(NOT);
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

	public static class NomeContext extends ParserRuleContext {
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
	 
		public NomeContext() { }
		public void copyFrom(NomeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NomeThisArrowContext extends NomeContext {
		public TerminalNode THIS() { return getToken(QPPParser.THIS, 0); }
		public TerminalNode ARROW() { return getToken(QPPParser.ARROW, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public NomeThisArrowContext(NomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitNomeThisArrow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomeNomeListaContext extends NomeContext {
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public NomeNomeListaContext(NomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitNomeNomeLista(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomeIDContext extends NomeContext {
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TerminalNode DBLCOL() { return getToken(QPPParser.DBLCOL, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public NomeIDContext(NomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitNomeID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nome);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new NomeIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(ID);
				setState(352);
				match(DBLCOL);
				setState(353);
				nome_lista();
				}
				break;
			case 2:
				_localctx = new NomeThisArrowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(THIS);
				setState(355);
				match(ARROW);
				setState(356);
				nome_lista();
				}
				break;
			case 3:
				_localctx = new NomeNomeListaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				nome_lista();
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

	public static class Nome_listaContext extends ParserRuleContext {
		public Nome_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_lista; }
	 
		public Nome_listaContext() { }
		public void copyFrom(Nome_listaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NomeListaThisArrowContext extends Nome_listaContext {
		public TerminalNode THIS() { return getToken(QPPParser.THIS, 0); }
		public TerminalNode ARROW() { return getToken(QPPParser.ARROW, 0); }
		public List<Nome_listaContext> nome_lista() {
			return getRuleContexts(Nome_listaContext.class);
		}
		public Nome_listaContext nome_lista(int i) {
			return getRuleContext(Nome_listaContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(QPPParser.DOT, 0); }
		public Nome_lista_Context nome_lista_() {
			return getRuleContext(Nome_lista_Context.class,0);
		}
		public NomeListaThisArrowContext(Nome_listaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitNomeListaThisArrow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomeListaIDDOTContext extends Nome_listaContext {
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TerminalNode DOT() { return getToken(QPPParser.DOT, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public Nome_lista_Context nome_lista_() {
			return getRuleContext(Nome_lista_Context.class,0);
		}
		public NomeListaIDDOTContext(Nome_listaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitNomeListaIDDOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomeListaIDContext extends Nome_listaContext {
		public TerminalNode ID() { return getToken(QPPParser.ID, 0); }
		public TerminalNode DBLCOL() { return getToken(QPPParser.DBLCOL, 0); }
		public List<Nome_listaContext> nome_lista() {
			return getRuleContexts(Nome_listaContext.class);
		}
		public Nome_listaContext nome_lista(int i) {
			return getRuleContext(Nome_listaContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(QPPParser.DOT, 0); }
		public Nome_lista_Context nome_lista_() {
			return getRuleContext(Nome_lista_Context.class,0);
		}
		public NomeListaIDContext(Nome_listaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitNomeListaID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_listaContext nome_lista() throws RecognitionException {
		Nome_listaContext _localctx = new Nome_listaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nome_lista);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new NomeListaIDDOTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(ID);
				setState(361);
				match(DOT);
				setState(362);
				nome_lista();
				setState(363);
				nome_lista_();
				}
				break;
			case 2:
				_localctx = new NomeListaIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(ID);
				setState(366);
				match(DBLCOL);
				setState(367);
				nome_lista();
				setState(368);
				match(LPAREN);
				setState(369);
				parametros_reais();
				setState(370);
				match(RPAREN);
				setState(371);
				match(DOT);
				setState(372);
				nome_lista();
				setState(373);
				nome_lista_();
				}
				break;
			case 3:
				_localctx = new NomeListaThisArrowContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(THIS);
				setState(376);
				match(ARROW);
				setState(377);
				nome_lista();
				setState(378);
				match(LPAREN);
				setState(379);
				parametros_reais();
				setState(380);
				match(RPAREN);
				setState(381);
				match(DOT);
				setState(382);
				nome_lista();
				setState(383);
				nome_lista_();
				}
				break;
			case 4:
				_localctx = new NomeListaIDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				match(ID);
				setState(386);
				nome_lista_();
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

	public static class Nome_lista_Context extends ParserRuleContext {
		public Nome_lista_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_lista_; }
	 
		public Nome_lista_Context() { }
		public void copyFrom(Nome_lista_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NomeListaLPARENContext extends Nome_lista_Context {
		public TerminalNode LPAREN() { return getToken(QPPParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QPPParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(QPPParser.DOT, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public Nome_lista_Context nome_lista_() {
			return getRuleContext(Nome_lista_Context.class,0);
		}
		public NomeListaLPARENContext(Nome_lista_Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitNomeListaLPAREN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomeListaEmptyContext extends Nome_lista_Context {
		public NomeListaEmptyContext(Nome_lista_Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitNomeListaEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_lista_Context nome_lista_() throws RecognitionException {
		Nome_lista_Context _localctx = new Nome_lista_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_nome_lista_);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new NomeListaLPARENContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(LPAREN);
				setState(390);
				parametros_reais();
				setState(391);
				match(RPAREN);
				setState(392);
				match(DOT);
				setState(393);
				nome_lista();
				setState(394);
				nome_lista_();
				}
				break;
			case 2:
				_localctx = new NomeListaEmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Parametros_reaisContext extends ParserRuleContext {
		public Parametros_reaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_reais; }
	 
		public Parametros_reaisContext() { }
		public void copyFrom(Parametros_reaisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParametrosReaisListaContext extends Parametros_reaisContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QPPParser.COMMA, i);
		}
		public ParametrosReaisListaContext(Parametros_reaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitParametrosReaisLista(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParametrosReaisVazioContext extends Parametros_reaisContext {
		public ParametrosReaisVazioContext(Parametros_reaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QPPVisitor ) return ((QPPVisitor<? extends T>)visitor).visitParametrosReaisVazio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_reaisContext parametros_reais() throws RecognitionException {
		Parametros_reaisContext _localctx = new Parametros_reaisContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parametros_reais);
		int _la;
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTL:
			case FLOATL:
			case CHARL:
			case STRL:
			case LPAREN:
			case INCR:
			case DECR:
			case NOT:
			case MINUS:
			case THIS:
			case TRUE:
			case FALSE:
			case ID:
				_localctx = new ParametrosReaisListaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				expressao(0);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(400);
					match(COMMA);
					setState(401);
					expressao(0);
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				_localctx = new ParametrosReaisVazioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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
		case 12:
			return tipo_nome_sempred((Tipo_nomeContext)_localctx, predIndex);
		case 25:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tipo_nome_sempred(Tipo_nomeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u019d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3"+
		"\4\6\4S\n\4\r\4\16\4T\3\4\3\4\3\4\3\5\3\5\3\5\6\5]\n\5\r\5\16\5^\3\5\3"+
		"\5\3\5\6\5d\n\5\r\5\16\5e\3\5\3\5\3\5\6\5k\n\5\r\5\16\5l\5\5o\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0082\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009d\n\f\f\f\16\f"+
		"\u00a0\13\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00c2\n\16\f\16\16\16\u00c5\13\16\3\17\3\17\5"+
		"\17\u00c9\n\17\3\20\3\20\5\20\u00cd\n\20\3\21\3\21\7\21\u00d1\n\21\f\21"+
		"\16\21\u00d4\13\21\3\21\7\21\u00d7\n\21\f\21\16\21\u00da\13\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e8\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u00ef\n\23\f\23\16\23\u00f2\13\23\3\23"+
		"\3\23\3\24\3\24\7\24\u00f8\n\24\f\24\16\24\u00fb\13\24\3\24\5\24\u00fe"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u0105\n\25\f\25\16\25\u0108\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\6\30"+
		"\u0117\n\30\r\30\16\30\u0118\3\30\3\30\3\31\3\31\3\31\3\31\3\31\6\31\u0122"+
		"\n\31\r\31\16\31\u0123\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u012c\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u0142\n\33\3\33\3\33\3\33\3\33\7\33"+
		"\u0148\n\33\f\33\16\33\u014b\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u015a\n\34\3\35\3\35\3\35\3\35\5\35"+
		"\u0160\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0169\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0186"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0190\n \3!\3!\3!\7!\u0195\n!\f!\16!"+
		"\u0198\13!\3!\5!\u019b\n!\3!\2\4\32\64\"\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\2\2\u01c7\2E\3\2\2\2\4L\3\2\2\2"+
		"\6N\3\2\2\2\bn\3\2\2\2\nw\3\2\2\2\f\u0081\3\2\2\2\16\u0083\3\2\2\2\20"+
		"\u0089\3\2\2\2\22\u008d\3\2\2\2\24\u0090\3\2\2\2\26\u00a2\3\2\2\2\30\u00b9"+
		"\3\2\2\2\32\u00bb\3\2\2\2\34\u00c8\3\2\2\2\36\u00cc\3\2\2\2 \u00ce\3\2"+
		"\2\2\"\u00e7\3\2\2\2$\u00e9\3\2\2\2&\u00fd\3\2\2\2(\u00ff\3\2\2\2*\u0109"+
		"\3\2\2\2,\u010e\3\2\2\2.\u0111\3\2\2\2\60\u011c\3\2\2\2\62\u012b\3\2\2"+
		"\2\64\u0141\3\2\2\2\66\u0159\3\2\2\28\u015f\3\2\2\2:\u0168\3\2\2\2<\u0185"+
		"\3\2\2\2>\u018f\3\2\2\2@\u019a\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2E"+
		"C\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JM\5\22\n"+
		"\2KM\5\6\4\2LJ\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NO\7$\2\2OP\7;\2\2PR\7\t\2"+
		"\2QS\5\b\5\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\n\2"+
		"\2WX\7\64\2\2X\7\3\2\2\2YZ\7%\2\2Z\\\7\63\2\2[]\5\n\6\2\\[\3\2\2\2]^\3"+
		"\2\2\2^\\\3\2\2\2^_\3\2\2\2_o\3\2\2\2`a\7&\2\2ac\7\63\2\2bd\5\n\6\2cb"+
		"\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fo\3\2\2\2gh\7\'\2\2hj\7\63\2\2"+
		"ik\5\n\6\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nY\3\2\2\2"+
		"n`\3\2\2\2ng\3\2\2\2o\t\3\2\2\2px\5\16\b\2qx\5\f\7\2rx\5\20\t\2st\7(\2"+
		"\2tx\5\f\7\2uv\7(\2\2vx\5\20\t\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2"+
		"\2wu\3\2\2\2x\13\3\2\2\2yz\5\30\r\2z{\7;\2\2{|\7\64\2\2|\u0082\3\2\2\2"+
		"}~\5\30\r\2~\177\7;\2\2\177\u0080\5*\26\2\u0080\u0082\3\2\2\2\u0081y\3"+
		"\2\2\2\u0081}\3\2\2\2\u0082\r\3\2\2\2\u0083\u0084\7;\2\2\u0084\u0085\7"+
		"\7\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\b\2\2\u0087\u0088\5 \21\2\u0088"+
		"\17\3\2\2\2\u0089\u008a\5\24\13\2\u008a\u008b\5\34\17\2\u008b\u008c\5"+
		" \21\2\u008c\21\3\2\2\2\u008d\u008e\5\24\13\2\u008e\u008f\5 \21\2\u008f"+
		"\23\3\2\2\2\u0090\u0091\5\30\r\2\u0091\u0092\7;\2\2\u0092\u0093\7\7\2"+
		"\2\u0093\u0094\5\26\f\2\u0094\u0095\7\b\2\2\u0095\25\3\2\2\2\u0096\u0097"+
		"\5\30\r\2\u0097\u009e\7;\2\2\u0098\u0099\7\62\2\2\u0099\u009a\5\30\r\2"+
		"\u009a\u009b\7;\2\2\u009b\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\27\3\2\2\2\u00a4\u00ba\7+\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7"+
		"\7,\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00ba\3\2\2\2\u00a9\u00aa\5\34\17"+
		"\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\5\36\20\2\u00ac\u00ba\3\2\2\2\u00ad"+
		"\u00ae\5\34\17\2\u00ae\u00af\7.\2\2\u00af\u00b0\5\36\20\2\u00b0\u00ba"+
		"\3\2\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\7/\2\2\u00b3\u00b4\5\36\20"+
		"\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\5\32\16\2\u00b7"+
		"\u00b8\5\36\20\2\u00b8\u00ba\3\2\2\2\u00b9\u00a4\3\2\2\2\u00b9\u00a5\3"+
		"\2\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9"+
		"\u00b5\3\2\2\2\u00ba\31\3\2\2\2\u00bb\u00bc\b\16\1\2\u00bc\u00bd\7;\2"+
		"\2\u00bd\u00c3\3\2\2\2\u00be\u00bf\f\4\2\2\u00bf\u00c0\7\65\2\2\u00c0"+
		"\u00c2\7;\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\33\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9"+
		"\7*\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\35\3\2\2\2\u00ca\u00cd\7\20\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2"+
		"\2\u00cc\u00cb\3\2\2\2\u00cd\37\3\2\2\2\u00ce\u00d2\7\t\2\2\u00cf\u00d1"+
		"\5\f\7\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\5\""+
		"\22\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\n"+
		"\2\2\u00dc!\3\2\2\2\u00dd\u00e8\5 \21\2\u00de\u00e8\5$\23\2\u00df\u00e8"+
		"\5(\25\2\u00e0\u00e8\5*\26\2\u00e1\u00e8\5,\27\2\u00e2\u00e8\5.\30\2\u00e3"+
		"\u00e8\5\60\31\2\u00e4\u00e8\5\62\32\2\u00e5\u00e6\7\"\2\2\u00e6\u00e8"+
		"\7\64\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00df\3\2\2\2"+
		"\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3"+
		"\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8#\3\2\2\2\u00e9"+
		"\u00ea\7\37\2\2\u00ea\u00eb\7\7\2\2\u00eb\u00ec\5\64\33\2\u00ec\u00f0"+
		"\7\b\2\2\u00ed\u00ef\5\"\22\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3\u00f4\5&\24\2\u00f4%\3\2\2\2\u00f5\u00f9\7 \2\2\u00f6\u00f8"+
		"\5\"\22\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\'\3\2\2\2\u00ff"+
		"\u0100\7!\2\2\u0100\u0101\7\7\2\2\u0101\u0102\5\64\33\2\u0102\u0106\7"+
		"\b\2\2\u0103\u0105\5\"\22\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107)\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0109\u010a\5:\36\2\u010a\u010b\7\36\2\2\u010b\u010c\5\64\33\2\u010c"+
		"\u010d\7\64\2\2\u010d+\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0110\5\62\32"+
		"\2\u0110-\3\2\2\2\u0111\u0116\78\2\2\u0112\u0113\7\67\2\2\u0113\u0117"+
		"\5:\36\2\u0114\u0115\7\67\2\2\u0115\u0117\7:\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\64\2\2\u011b/\3\2\2\2\u011c\u0121"+
		"\79\2\2\u011d\u011e\7\66\2\2\u011e\u0122\5\64\33\2\u011f\u0120\7\66\2"+
		"\2\u0120\u0122\7:\2\2\u0121\u011d\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\7\64\2\2\u0126\61\3\2\2\2\u0127\u0128\5\64\33\2\u0128\u0129\7\64"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u012c\7\64\2\2\u012b\u0127\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\63\3\2\2\2\u012d\u012e\b\33\1\2\u012e\u012f\7\7\2"+
		"\2\u012f\u0130\5\64\33\2\u0130\u0131\7\b\2\2\u0131\u0142\3\2\2\2\u0132"+
		"\u0133\58\35\2\u0133\u0134\5\64\33\f\u0134\u0142\3\2\2\2\u0135\u0136\5"+
		":\36\2\u0136\u0137\7\7\2\2\u0137\u0138\5@!\2\u0138\u0139\7\b\2\2\u0139"+
		"\u0142\3\2\2\2\u013a\u0142\5:\36\2\u013b\u0142\7\3\2\2\u013c\u0142\7\4"+
		"\2\2\u013d\u0142\7\5\2\2\u013e\u0142\7\6\2\2\u013f\u0142\7\60\2\2\u0140"+
		"\u0142\7\61\2\2\u0141\u012d\3\2\2\2\u0141\u0132\3\2\2\2\u0141\u0135\3"+
		"\2\2\2\u0141\u013a\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013c\3\2\2\2\u0141"+
		"\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2"+
		"\2\2\u0142\u0149\3\2\2\2\u0143\u0144\f\13\2\2\u0144\u0145\5\66\34\2\u0145"+
		"\u0146\5\64\33\f\u0146\u0148\3\2\2\2\u0147\u0143\3\2\2\2\u0148\u014b\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\65\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u015a\7\34\2\2\u014d\u015a\7\35\2\2\u014e\u015a\7"+
		"\24\2\2\u014f\u015a\7\25\2\2\u0150\u015a\7\22\2\2\u0151\u015a\7\21\2\2"+
		"\u0152\u015a\7\23\2\2\u0153\u015a\7\26\2\2\u0154\u015a\7\30\2\2\u0155"+
		"\u015a\7\27\2\2\u0156\u015a\7\31\2\2\u0157\u015a\7\33\2\2\u0158\u015a"+
		"\7\32\2\2\u0159\u014c\3\2\2\2\u0159\u014d\3\2\2\2\u0159\u014e\3\2\2\2"+
		"\u0159\u014f\3\2\2\2\u0159\u0150\3\2\2\2\u0159\u0151\3\2\2\2\u0159\u0152"+
		"\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159"+
		"\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\67\3\2\2"+
		"\2\u015b\u0160\7\25\2\2\u015c\u0160\7\r\2\2\u015d\u0160\7\16\2\2\u015e"+
		"\u0160\7\17\2\2\u015f\u015b\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u015f\u015e\3\2\2\2\u01609\3\2\2\2\u0161\u0162\7;\2\2\u0162\u0163"+
		"\7\65\2\2\u0163\u0169\5<\37\2\u0164\u0165\7)\2\2\u0165\u0166\7\13\2\2"+
		"\u0166\u0169\5<\37\2\u0167\u0169\5<\37\2\u0168\u0161\3\2\2\2\u0168\u0164"+
		"\3\2\2\2\u0168\u0167\3\2\2\2\u0169;\3\2\2\2\u016a\u016b\7;\2\2\u016b\u016c"+
		"\7\f\2\2\u016c\u016d\5<\37\2\u016d\u016e\5> \2\u016e\u0186\3\2\2\2\u016f"+
		"\u0170\7;\2\2\u0170\u0171\7\65\2\2\u0171\u0172\5<\37\2\u0172\u0173\7\7"+
		"\2\2\u0173\u0174\5@!\2\u0174\u0175\7\b\2\2\u0175\u0176\7\f\2\2\u0176\u0177"+
		"\5<\37\2\u0177\u0178\5> \2\u0178\u0186\3\2\2\2\u0179\u017a\7)\2\2\u017a"+
		"\u017b\7\13\2\2\u017b\u017c\5<\37\2\u017c\u017d\7\7\2\2\u017d\u017e\5"+
		"@!\2\u017e\u017f\7\b\2\2\u017f\u0180\7\f\2\2\u0180\u0181\5<\37\2\u0181"+
		"\u0182\5> \2\u0182\u0186\3\2\2\2\u0183\u0184\7;\2\2\u0184\u0186\5> \2"+
		"\u0185\u016a\3\2\2\2\u0185\u016f\3\2\2\2\u0185\u0179\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186=\3\2\2\2\u0187\u0188\7\7\2\2\u0188\u0189\5@!\2\u0189\u018a"+
		"\7\b\2\2\u018a\u018b\7\f\2\2\u018b\u018c\5<\37\2\u018c\u018d\5> \2\u018d"+
		"\u0190\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0187\3\2\2\2\u018f\u018e\3\2"+
		"\2\2\u0190?\3\2\2\2\u0191\u0196\5\64\33\2\u0192\u0193\7\62\2\2\u0193\u0195"+
		"\5\64\33\2\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2"+
		"\u0196\u0197\3\2\2\2\u0197\u019b\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b"+
		"\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u0199\3\2\2\2\u019bA\3\2\2\2&ELT^e"+
		"lnw\u0081\u009e\u00a2\u00b9\u00c3\u00c8\u00cc\u00d2\u00d8\u00e7\u00f0"+
		"\u00f9\u00fd\u0106\u0116\u0118\u0121\u0123\u012b\u0141\u0149\u0159\u015f"+
		"\u0168\u0185\u018f\u0196\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}