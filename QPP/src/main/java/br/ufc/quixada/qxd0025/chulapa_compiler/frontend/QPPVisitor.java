// Generated from /home/flycher/Dropbox/VScode/compiladores/QPP/src/main/java/br/ufc/quixada/qxd0025/chulapa_compiler/antlr4/QPP.g4 by ANTLR 4.7.2
package frontend;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QPPParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(QPPParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinicaoFuncao}
	 * labeled alternative in {@link QPPParser#definicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicaoFuncao(QPPParser.DefinicaoFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinicaoEstrutura}
	 * labeled alternative in {@link QPPParser#definicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicaoEstrutura(QPPParser.DefinicaoEstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#estrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstrutura(QPPParser.EstruturaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EstruturaAcessoPublic}
	 * labeled alternative in {@link QPPParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaAcessoPublic(QPPParser.EstruturaAcessoPublicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EstruturaAcessoProtected}
	 * labeled alternative in {@link QPPParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaAcessoProtected(QPPParser.EstruturaAcessoProtectedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EstruturaAcessoPrivate}
	 * labeled alternative in {@link QPPParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaAcessoPrivate(QPPParser.EstruturaAcessoPrivateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MembroConstrutor}
	 * labeled alternative in {@link QPPParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembroConstrutor(QPPParser.MembroConstrutorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MembroVariavel}
	 * labeled alternative in {@link QPPParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembroVariavel(QPPParser.MembroVariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MembroMetodo}
	 * labeled alternative in {@link QPPParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembroMetodo(QPPParser.MembroMetodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MembroStaticVariavel}
	 * labeled alternative in {@link QPPParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembroStaticVariavel(QPPParser.MembroStaticVariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MembroStaticMetodo}
	 * labeled alternative in {@link QPPParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembroStaticMetodo(QPPParser.MembroStaticMetodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelCriacao}
	 * labeled alternative in {@link QPPParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelCriacao(QPPParser.VariavelCriacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelAtribuicao}
	 * labeled alternative in {@link QPPParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelAtribuicao(QPPParser.VariavelAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#construtor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrutor(QPPParser.ConstrutorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(QPPParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(QPPParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#funcao_cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao_cabecalho(QPPParser.Funcao_cabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListaParametrosFormais}
	 * labeled alternative in {@link QPPParser#parametros_formais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametrosFormais(QPPParser.ListaParametrosFormaisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParametrosFormaisVazio}
	 * labeled alternative in {@link QPPParser#parametros_formais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosFormaisVazio(QPPParser.ParametrosFormaisVazioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoVoid}
	 * labeled alternative in {@link QPPParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVoid(QPPParser.TipoVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoInt}
	 * labeled alternative in {@link QPPParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoInt(QPPParser.TipoIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoFloat}
	 * labeled alternative in {@link QPPParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoFloat(QPPParser.TipoFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoChar}
	 * labeled alternative in {@link QPPParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoChar(QPPParser.TipoCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoBool}
	 * labeled alternative in {@link QPPParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBool(QPPParser.TipoBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoNome}
	 * labeled alternative in {@link QPPParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoNome(QPPParser.TipoNomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoID}
	 * labeled alternative in {@link QPPParser#tipo_nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoID(QPPParser.TipoIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoNomeAcesso}
	 * labeled alternative in {@link QPPParser#tipo_nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoNomeAcesso(QPPParser.TipoNomeAcessoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QualificadorConst}
	 * labeled alternative in {@link QPPParser#qualificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualificadorConst(QPPParser.QualificadorConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QualificadorVazio}
	 * labeled alternative in {@link QPPParser#qualificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualificadorVazio(QPPParser.QualificadorVazioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoradorAmper}
	 * labeled alternative in {@link QPPParser#decorador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoradorAmper(QPPParser.DecoradorAmperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoradorVazio}
	 * labeled alternative in {@link QPPParser#decorador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoradorVazio(QPPParser.DecoradorVazioContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(QPPParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoBloco}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoBloco(QPPParser.ComandoBlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComadoSelecao}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComadoSelecao(QPPParser.ComadoSelecaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComadoRepeticao}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComadoRepeticao(QPPParser.ComadoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoAtribuicao}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(QPPParser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoRetorno}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRetorno(QPPParser.ComandoRetornoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoEntrada}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEntrada(QPPParser.ComandoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoSaida}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSaida(QPPParser.ComandoSaidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoExpressaoComando}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoExpressaoComando(QPPParser.ComandoExpressaoComandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoBreak}
	 * labeled alternative in {@link QPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoBreak(QPPParser.ComandoBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(QPPParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelecaoSenao}
	 * labeled alternative in {@link QPPParser#selecao_senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecaoSenao(QPPParser.SelecaoSenaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelecaoSenaoVazio}
	 * labeled alternative in {@link QPPParser#selecao_senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecaoSenaoVazio(QPPParser.SelecaoSenaoVazioContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao(QPPParser.RepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(QPPParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(QPPParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(QPPParser.EntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link QPPParser#saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaida(QPPParser.SaidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoComandoExpressao}
	 * labeled alternative in {@link QPPParser#expressao_comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoComandoExpressao(QPPParser.ExpressaoComandoExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoComandoSEMI}
	 * labeled alternative in {@link QPPParser#expressao_comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoComandoSEMI(QPPParser.ExpressaoComandoSEMIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoCHARL}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoCHARL(QPPParser.ExpressaoCHARLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoUnario}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoUnario(QPPParser.ExpressaoUnarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoNome}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoNome(QPPParser.ExpressaoNomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoFLOATL}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoFLOATL(QPPParser.ExpressaoFLOATLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoOperadorBinario}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoOperadorBinario(QPPParser.ExpressaoOperadorBinarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoINTL}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoINTL(QPPParser.ExpressaoINTLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoTrue}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoTrue(QPPParser.ExpressaoTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoFalse}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoFalse(QPPParser.ExpressaoFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoLarenRparen}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLarenRparen(QPPParser.ExpressaoLarenRparenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoParametrosReais}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoParametrosReais(QPPParser.ExpressaoParametrosReaisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoSTRL}
	 * labeled alternative in {@link QPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoSTRL(QPPParser.ExpressaoSTRLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioAND}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioAND(QPPParser.OperadorBinarioANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioOR}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioOR(QPPParser.OperadorBinarioORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioPLUS}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioPLUS(QPPParser.OperadorBinarioPLUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioMINUS}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioMINUS(QPPParser.OperadorBinarioMINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioTIMES}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioTIMES(QPPParser.OperadorBinarioTIMESContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioDIV}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioDIV(QPPParser.OperadorBinarioDIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioMOD}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioMOD(QPPParser.OperadorBinarioMODContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioLT}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioLT(QPPParser.OperadorBinarioLTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorBinarioLEQ}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinarioLEQ(QPPParser.OperadorBinarioLEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorGT}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorGT(QPPParser.OperadorGTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorGEQ}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorGEQ(QPPParser.OperadorGEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorEQ}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorEQ(QPPParser.OperadorEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorNEQ}
	 * labeled alternative in {@link QPPParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorNEQ(QPPParser.OperadorNEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorUnarioUNARYMINUS}
	 * labeled alternative in {@link QPPParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnarioUNARYMINUS(QPPParser.OperadorUnarioUNARYMINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorUnarioINCR}
	 * labeled alternative in {@link QPPParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnarioINCR(QPPParser.OperadorUnarioINCRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorUnarioDECR}
	 * labeled alternative in {@link QPPParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnarioDECR(QPPParser.OperadorUnarioDECRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorUnarioNOT}
	 * labeled alternative in {@link QPPParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnarioNOT(QPPParser.OperadorUnarioNOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeID}
	 * labeled alternative in {@link QPPParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeID(QPPParser.NomeIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeThisArrow}
	 * labeled alternative in {@link QPPParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeThisArrow(QPPParser.NomeThisArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeNomeLista}
	 * labeled alternative in {@link QPPParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeNomeLista(QPPParser.NomeNomeListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeListaIDDOT}
	 * labeled alternative in {@link QPPParser#nome_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeListaIDDOT(QPPParser.NomeListaIDDOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeListaID}
	 * labeled alternative in {@link QPPParser#nome_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeListaID(QPPParser.NomeListaIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeListaThisArrow}
	 * labeled alternative in {@link QPPParser#nome_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeListaThisArrow(QPPParser.NomeListaThisArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeListaLPAREN}
	 * labeled alternative in {@link QPPParser#nome_lista_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeListaLPAREN(QPPParser.NomeListaLPARENContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeListaEmpty}
	 * labeled alternative in {@link QPPParser#nome_lista_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeListaEmpty(QPPParser.NomeListaEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParametrosReaisLista}
	 * labeled alternative in {@link QPPParser#parametros_reais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosReaisLista(QPPParser.ParametrosReaisListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParametrosReaisVazio}
	 * labeled alternative in {@link QPPParser#parametros_reais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosReaisVazio(QPPParser.ParametrosReaisVazioContext ctx);
}