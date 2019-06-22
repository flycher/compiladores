package br.ufc.quixada.qxd0025.chulapa_compiler.frontend;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.*;

import java.util.ArrayList;

public class QPPTranslator extends QPPBaseVisitor<TreeNode>{

    //TODO override vitita ao no


    @Override
    public Programa visitPrograma(QPPParser.ProgramaContext ctx) {
        return new Programa();
    }

    @Override
    public TreeNode visitDefinicaoFuncao(QPPParser.DefinicaoFuncaoContext ctx) {
        return super.visitDefinicaoFuncao(ctx);
    }

    @Override
    public TreeNode visitDefinicaoEstrutura(QPPParser.DefinicaoEstruturaContext ctx) {
        return super.visitDefinicaoEstrutura(ctx);
    }

    @Override
    public TreeNode visitEstrutura(QPPParser.EstruturaContext ctx) {
        return super.visitEstrutura(ctx);
    }

    @Override
    public TreeNode visitEstruturaAcessoPublic(QPPParser.EstruturaAcessoPublicContext ctx) {
        return super.visitEstruturaAcessoPublic(ctx);
    }

    @Override
    public TreeNode visitEstruturaAcessoProtected(QPPParser.EstruturaAcessoProtectedContext ctx) {
        return super.visitEstruturaAcessoProtected(ctx);
    }

    @Override
    public TreeNode visitEstruturaAcessoPrivate(QPPParser.EstruturaAcessoPrivateContext ctx) {
        return super.visitEstruturaAcessoPrivate(ctx);
    }

    @Override
    public TreeNode visitMembroConstrutor(QPPParser.MembroConstrutorContext ctx) {
        return super.visitMembroConstrutor(ctx);
    }

    @Override
    public TreeNode visitMembroVariavel(QPPParser.MembroVariavelContext ctx) {
        return super.visitMembroVariavel(ctx);
    }

    @Override
    public TreeNode visitMembroMetodo(QPPParser.MembroMetodoContext ctx) {
        return super.visitMembroMetodo(ctx);
    }

    @Override
    public TreeNode visitMembroStaticVariavel(QPPParser.MembroStaticVariavelContext ctx) {
        return super.visitMembroStaticVariavel(ctx);
    }

    @Override
    public TreeNode visitMembroStaticMetodo(QPPParser.MembroStaticMetodoContext ctx) {
        return super.visitMembroStaticMetodo(ctx);
    }

    @Override
    public TreeNode visitVariavelCriacao(QPPParser.VariavelCriacaoContext ctx) {
        return super.visitVariavelCriacao(ctx);
    }

    @Override
    public TreeNode visitVariavelAtribuicao(QPPParser.VariavelAtribuicaoContext ctx) {
        return super.visitVariavelAtribuicao(ctx);
    }

    @Override
    public TreeNode visitConstrutor(QPPParser.ConstrutorContext ctx) {
        return super.visitConstrutor(ctx);
    }

    @Override
    public TreeNode visitMetodo(QPPParser.MetodoContext ctx) {
        return super.visitMetodo(ctx);
    }

    @Override
    public TreeNode visitFuncao(QPPParser.FuncaoContext ctx) {
        return super.visitFuncao(ctx);
    }

    @Override
    public TreeNode visitFuncao_cabecalho(QPPParser.Funcao_cabecalhoContext ctx) {
        return super.visitFuncao_cabecalho(ctx);
    }

    @Override
    public TreeNode visitListaParametrosFormais(QPPParser.ListaParametrosFormaisContext ctx) {
        return super.visitListaParametrosFormais(ctx);
    }

    @Override
    public TreeNode visitParametrosFormaisVazio(QPPParser.ParametrosFormaisVazioContext ctx) {
        return super.visitParametrosFormaisVazio(ctx);
    }

    @Override
    public TreeNode visitTipoVoid(QPPParser.TipoVoidContext ctx) {
        return super.visitTipoVoid(ctx);
    }

    @Override
    public TreeNode visitTipoInt(QPPParser.TipoIntContext ctx) {
        return super.visitTipoInt(ctx);
    }

    @Override
    public TreeNode visitTipoFloat(QPPParser.TipoFloatContext ctx) {
        return super.visitTipoFloat(ctx);
    }

    @Override
    public TreeNode visitTipoChar(QPPParser.TipoCharContext ctx) {
        return super.visitTipoChar(ctx);
    }

    @Override
    public TreeNode visitTipoBool(QPPParser.TipoBoolContext ctx) {
        return super.visitTipoBool(ctx);
    }

    @Override
    public TreeNode visitTipoNome(QPPParser.TipoNomeContext ctx) {
        return super.visitTipoNome(ctx);
    }

    @Override
    public TreeNode visitTipoID(QPPParser.TipoIDContext ctx) {
        return super.visitTipoID(ctx);
    }

    @Override
    public TreeNode visitTipoNomeAcesso(QPPParser.TipoNomeAcessoContext ctx) {
        return super.visitTipoNomeAcesso(ctx);
    }

    @Override
    public TreeNode visitQualificadorConst(QPPParser.QualificadorConstContext ctx) {
        return super.visitQualificadorConst(ctx);
    }

    @Override
    public TreeNode visitQualificadorVazio(QPPParser.QualificadorVazioContext ctx) {
        return super.visitQualificadorVazio(ctx);
    }

    @Override
    public TreeNode visitDecoradorAmper(QPPParser.DecoradorAmperContext ctx) {
        return super.visitDecoradorAmper(ctx);
    }

    @Override
    public TreeNode visitDecoradorVazio(QPPParser.DecoradorVazioContext ctx) {
        return super.visitDecoradorVazio(ctx);
    }

    @Override
    public TreeNode visitBloco(QPPParser.BlocoContext ctx) {
        return super.visitBloco(ctx);
    }

    @Override
    public TreeNode visitComandoBloco(QPPParser.ComandoBlocoContext ctx) {
        return super.visitComandoBloco(ctx);
    }

    @Override
    public TreeNode visitComadoSelecao(QPPParser.ComadoSelecaoContext ctx) {
        return super.visitComadoSelecao(ctx);
    }

    @Override
    public TreeNode visitComadoRepeticao(QPPParser.ComadoRepeticaoContext ctx) {
        return super.visitComadoRepeticao(ctx);
    }

    @Override
    public TreeNode visitComandoAtribuicao(QPPParser.ComandoAtribuicaoContext ctx) {
        return super.visitComandoAtribuicao(ctx);
    }

    @Override
    public TreeNode visitComandoRetorno(QPPParser.ComandoRetornoContext ctx) {
        return super.visitComandoRetorno(ctx);
    }

    @Override
    public TreeNode visitComandoEntrada(QPPParser.ComandoEntradaContext ctx) {
        return super.visitComandoEntrada(ctx);
    }

    @Override
    public TreeNode visitComandoSaida(QPPParser.ComandoSaidaContext ctx) {
        return super.visitComandoSaida(ctx);
    }

    @Override
    public TreeNode visitComandoExpressaoComando(QPPParser.ComandoExpressaoComandoContext ctx) {
        return super.visitComandoExpressaoComando(ctx);
    }

    @Override
    public TreeNode visitComandoBreak(QPPParser.ComandoBreakContext ctx) {
        return super.visitComandoBreak(ctx);
    }

    @Override
    public TreeNode visitSelecao(QPPParser.SelecaoContext ctx) {
        return super.visitSelecao(ctx);
    }

    @Override
    public TreeNode visitSelecaoSenao(QPPParser.SelecaoSenaoContext ctx) {
        return super.visitSelecaoSenao(ctx);
    }

    @Override
    public TreeNode visitSelecaoSenaoVazio(QPPParser.SelecaoSenaoVazioContext ctx) {
        return super.visitSelecaoSenaoVazio(ctx);
    }

    @Override
    public TreeNode visitRepeticao(QPPParser.RepeticaoContext ctx) {
        return super.visitRepeticao(ctx);
    }

    @Override
    public TreeNode visitAtribuicao(QPPParser.AtribuicaoContext ctx) {
        return super.visitAtribuicao(ctx);
    }

    @Override
    public TreeNode visitRetorno(QPPParser.RetornoContext ctx) {
        return super.visitRetorno(ctx);
    }

    @Override
    public TreeNode visitEntrada(QPPParser.EntradaContext ctx) {
        return super.visitEntrada(ctx);
    }

    @Override
    public TreeNode visitSaida(QPPParser.SaidaContext ctx) {
        return super.visitSaida(ctx);
    }

    @Override
    public TreeNode visitExpressaoComandoExpressao(QPPParser.ExpressaoComandoExpressaoContext ctx) {
        return super.visitExpressaoComandoExpressao(ctx);
    }

    @Override
    public TreeNode visitExpressaoComandoSEMI(QPPParser.ExpressaoComandoSEMIContext ctx) {
        return super.visitExpressaoComandoSEMI(ctx);
    }

    @Override
    public TreeNode visitExpressaoCHARL(QPPParser.ExpressaoCHARLContext ctx) {
        return super.visitExpressaoCHARL(ctx);
    }

    @Override
    public TreeNode visitExpressaoUnario(QPPParser.ExpressaoUnarioContext ctx) {
        return super.visitExpressaoUnario(ctx);
    }

    @Override
    public TreeNode visitExpressaoNome(QPPParser.ExpressaoNomeContext ctx) {
        return super.visitExpressaoNome(ctx);
    }

    @Override
    public TreeNode visitExpressaoFLOATL(QPPParser.ExpressaoFLOATLContext ctx) {
        return super.visitExpressaoFLOATL(ctx);
    }

    @Override
    public TreeNode visitExpressaoOperadorBinario(QPPParser.ExpressaoOperadorBinarioContext ctx) {
        return super.visitExpressaoOperadorBinario(ctx);
    }

    @Override
    public TreeNode visitExpressaoINTL(QPPParser.ExpressaoINTLContext ctx) {
        return super.visitExpressaoINTL(ctx);
    }

    @Override
    public TreeNode visitExpressaoTrue(QPPParser.ExpressaoTrueContext ctx) {
        return super.visitExpressaoTrue(ctx);
    }

    @Override
    public TreeNode visitExpressaoFalse(QPPParser.ExpressaoFalseContext ctx) {
        return super.visitExpressaoFalse(ctx);
    }

    @Override
    public TreeNode visitExpressaoLarenRparen(QPPParser.ExpressaoLarenRparenContext ctx) {
        return super.visitExpressaoLarenRparen(ctx);
    }

    @Override
    public TreeNode visitExpressaoParametrosReais(QPPParser.ExpressaoParametrosReaisContext ctx) {
        return super.visitExpressaoParametrosReais(ctx);
    }

    @Override
    public TreeNode visitExpressaoSTRL(QPPParser.ExpressaoSTRLContext ctx) {
        return super.visitExpressaoSTRL(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioAND(QPPParser.OperadorBinarioANDContext ctx) {
        return super.visitOperadorBinarioAND(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioOR(QPPParser.OperadorBinarioORContext ctx) {
        return super.visitOperadorBinarioOR(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioPLUS(QPPParser.OperadorBinarioPLUSContext ctx) {
        return super.visitOperadorBinarioPLUS(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioMINUS(QPPParser.OperadorBinarioMINUSContext ctx) {
        return super.visitOperadorBinarioMINUS(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioTIMES(QPPParser.OperadorBinarioTIMESContext ctx) {
        return super.visitOperadorBinarioTIMES(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioDIV(QPPParser.OperadorBinarioDIVContext ctx) {
        return super.visitOperadorBinarioDIV(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioMOD(QPPParser.OperadorBinarioMODContext ctx) {
        return super.visitOperadorBinarioMOD(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioLT(QPPParser.OperadorBinarioLTContext ctx) {
        return super.visitOperadorBinarioLT(ctx);
    }

    @Override
    public TreeNode visitOperadorBinarioLEQ(QPPParser.OperadorBinarioLEQContext ctx) {
        return super.visitOperadorBinarioLEQ(ctx);
    }

    @Override
    public TreeNode visitOperadorGT(QPPParser.OperadorGTContext ctx) {
        return super.visitOperadorGT(ctx);
    }

    @Override
    public TreeNode visitOperadorGEQ(QPPParser.OperadorGEQContext ctx) {
        return super.visitOperadorGEQ(ctx);
    }

    @Override
    public TreeNode visitOperadorEQ(QPPParser.OperadorEQContext ctx) {
        return super.visitOperadorEQ(ctx);
    }

    @Override
    public TreeNode visitOperadorNEQ(QPPParser.OperadorNEQContext ctx) {
        return super.visitOperadorNEQ(ctx);
    }

    @Override
    public TreeNode visitOperadorUnarioUNARYMINUS(QPPParser.OperadorUnarioUNARYMINUSContext ctx) {
        return super.visitOperadorUnarioUNARYMINUS(ctx);
    }

    @Override
    public TreeNode visitOperadorUnarioINCR(QPPParser.OperadorUnarioINCRContext ctx) {
        return super.visitOperadorUnarioINCR(ctx);
    }

    @Override
    public TreeNode visitOperadorUnarioDECR(QPPParser.OperadorUnarioDECRContext ctx) {
        return super.visitOperadorUnarioDECR(ctx);
    }

    @Override
    public TreeNode visitOperadorUnarioNOT(QPPParser.OperadorUnarioNOTContext ctx) {
        return super.visitOperadorUnarioNOT(ctx);
    }

    @Override
    public TreeNode visitNomeID(QPPParser.NomeIDContext ctx) {
        return super.visitNomeID(ctx);
    }

    @Override
    public TreeNode visitNomeThisArrow(QPPParser.NomeThisArrowContext ctx) {
        return super.visitNomeThisArrow(ctx);
    }

    @Override
    public TreeNode visitNomeNomeLista(QPPParser.NomeNomeListaContext ctx) {
        return super.visitNomeNomeLista(ctx);
    }

    @Override
    public TreeNode visitNomeListaIDDOT(QPPParser.NomeListaIDDOTContext ctx) {
        return super.visitNomeListaIDDOT(ctx);
    }

    @Override
    public TreeNode visitNomeListaID(QPPParser.NomeListaIDContext ctx) {
        return super.visitNomeListaID(ctx);
    }

    @Override
    public TreeNode visitNomeListaThisArrow(QPPParser.NomeListaThisArrowContext ctx) {
        return super.visitNomeListaThisArrow(ctx);
    }

    @Override
    public TreeNode visitNomeListaLPAREN(QPPParser.NomeListaLPARENContext ctx) {
        return super.visitNomeListaLPAREN(ctx);
    }

    @Override
    public TreeNode visitNomeListaEmpty(QPPParser.NomeListaEmptyContext ctx) {
        return super.visitNomeListaEmpty(ctx);
    }

    @Override
    public TreeNode visitParametrosReaisLista(QPPParser.ParametrosReaisListaContext ctx) {
        return super.visitParametrosReaisLista(ctx);
    }

    @Override
    public TreeNode visitParametrosReaisVazio(QPPParser.ParametrosReaisVazioContext ctx) {
        return super.visitParametrosReaisVazio(ctx);
    }
}
