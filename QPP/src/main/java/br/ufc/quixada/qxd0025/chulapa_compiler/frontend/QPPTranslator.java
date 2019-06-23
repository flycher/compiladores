package br.ufc.quixada.qxd0025.chulapa_compiler.frontend;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.*;

import java.util.ArrayList;

public class QPPTranslator extends QPPBaseVisitor<TreeNode>{

    //TODO override vitita ao no


    @Override
    public Programa visitPrograma(QPPParser.ProgramaContext ctx) {

        if(ctx.definicao().size() == 0) return new Programa();
        ArrayList<Definicao> definicoes = new ArrayList<>();

        for (QPPParser.DefinicaoContext def : ctx.definicao()) {
            definicoes.add((Definicao) visit(def));
        }

        return new Programa(definicoes);
    }

    @Override
    public DefinicaoFuncao visitDefinicaoFuncao(QPPParser.DefinicaoFuncaoContext ctx) {

        Tipo ti = (Tipo) visit(ctx.funcao().funcao_cabecalho().tipo());
        String id = ctx.funcao().funcao_cabecalho().ID().getSymbol().getText();
        ParametrosFormais pf = (ParametrosFormais) visit(ctx.funcao().funcao_cabecalho().parametros_formais());
        Bloco bl = (Bloco) visit(ctx.funcao().bloco());
        return new DefinicaoFuncao(ti, id, pf, bl, ctx.getStart().getLine());
    }
//severo_Start
    @Override
    public DefinicaoEstrutura visitDefinicaoEstrutura(QPPParser.DefinicaoEstruturaContext ctx) {
        String id = ctx.estrutura().ID().getSymbol().getText();
        ArrayList<EstruturaAcesso> acessos = new ArrayList<>();

        for(QPPParser.Estrutura_acessoContext c: ctx.estrutura().estrutura_acesso()){
            acessos.add((EstruturaAcesso) visit(c));
        }

        return  new DefinicaoEstrutura(id, acessos);
    }

    @Override
    public TreeNode visitEstrutura(QPPParser.EstruturaContext ctx) {

        return super.visitEstrutura(ctx);
    }

    @Override
    public EstruturaAcesso visitEstruturaAcessoPublic(QPPParser.EstruturaAcessoPublicContext ctx) {

        ArrayList<Membro> mebros = new ArrayList<>();

        for(QPPParser.MembroContext m : ctx.membro()){
            mebros.add((Membro) visit(m));
        }

        return new EstruturaAcesso(AcessoEnum.PUBLIC, mebros);
    }

    @Override
    public EstruturaAcesso visitEstruturaAcessoProtected(QPPParser.EstruturaAcessoProtectedContext ctx) {
        ArrayList<Membro> mebros = new ArrayList<>();

        for(QPPParser.MembroContext m : ctx.membro()){
            mebros.add((Membro) visit(m));
        }

        return new EstruturaAcesso(AcessoEnum.PROTECTED, mebros);
    }

    @Override
    public EstruturaAcesso visitEstruturaAcessoPrivate(QPPParser.EstruturaAcessoPrivateContext ctx) {
        ArrayList<Membro> membros = new ArrayList<>();

        for(QPPParser.MembroContext m : ctx.membro()){
            membros.add((Membro) visit(m));
        }

        return new EstruturaAcesso(AcessoEnum.PRIVATE, membros);
    }

    @Override
    public MembroConstrutor visitMembroConstrutor(QPPParser.MembroConstrutorContext ctx) {
        String constId = ctx.construtor().ID().getSymbol().getText();
        ParametrosFormais parametrosFormais = (ParametrosFormais) visit( ctx.construtor().parametros_formais());
        Bloco bloco = (Bloco) visit(ctx.construtor().bloco());

        return  new MembroConstrutor(constId, parametrosFormais, bloco);
    }

    @Override
    public MembroVariavel visitMembroVariavel(QPPParser.MembroVariavelContext ctx) {
        Variavel variavel = (Variavel) visit(ctx.variavel());//ask Xavier if it's correct.
        return  new MembroVariavel(variavel);

    }

    @Override
    public MembroMetodo visitMembroMetodo(QPPParser.MembroMetodoContext ctx) {
        DefinicaoFuncao definicaoFuncao = (DefinicaoFuncao) visit(ctx.metodo().funcao_cabecalho());

        return new MembroMetodo(definicaoFuncao, QualificadorEnum.CONST);//Ask xavier what to do.
    }

    @Override
    public TreeNode visitMembroStaticVariavel(QPPParser.MembroStaticVariavelContext ctx) {
        return super.visitMembroStaticVariavel(ctx);
    }

    @Override
    public TreeNode visitMembroStaticMetodo(QPPParser.MembroStaticMetodoContext ctx) {
        return super.visitMembroStaticMetodo(ctx);
    }
//severo_end
// INICIO lucas

    @Override
    public TreeNode visitVariavelCriacao(QPPParser.VariavelCriacaoContext ctx) {
        Tipo t = (Tipo) visit(ctx.tipo());
        String id = ctx.ID().getSymbol().getText();

        return new VariavelCriacao(t, id, ctx.getStart().getLine());
    }

    @Override
    public TreeNode visitVariavelAtribuicao(QPPParser.VariavelAtribuicaoContext ctx) {
        Tipo tipo = (Tipo) visit(ctx.tipo());
        String varid = ctx.ID().getSymbol().getText();
        ComandoAtribuicao atribuicao = (ComandoAtribuicao) visit(ctx.atribuicao());

        return new VariavelAtribuicao(tipo, varid, atribuicao, ctx.getStart().getLine());
    }

    @Override
    public TreeNode visitConstrutor(QPPParser.ConstrutorContext ctx){
        String constid = ctx.ID().getSymbol().getText();
        ParametrosFormais parametrosFormais = (ParametrosFormais) visit(ctx.parametros_formais());
        Bloco bloco = (Bloco) visit(ctx.bloco());

        return new MembroConstrutor(constid, parametrosFormais, bloco);
    }

    @Override
    public TreeNode visitMetodo(QPPParser.MetodoContext ctx){
        DefinicaoFuncao metodo = (DefinicaoFuncao) visit(ctx.funcao_cabecalho()); // CONSERTAR
        QualificadorEnum qualificador;

        if(ctx.qualificador().getText().equals("")){
            qualificador = QualificadorEnum.EMPTY;
        }else {
            qualificador = QualificadorEnum.CONST;
        }

        return new MembroMetodo(metodo, qualificador);
    }

//    @Override
//    public TreeNode visitFuncao(QPPParser.FuncaoContext ctx) {
//        return super.visitFuncao(ctx);
//    }
//
//    @Override
//    public TreeNode visitFuncao_cabecalho(QPPParser.Funcao_cabecalhoContext ctx) {
//        return super.visitFuncao_cabecalho(ctx);
//    }

    @Override
    public ParametrosFormais visitListaParametrosFormais(QPPParser.ListaParametrosFormaisContext ctx) {

        ArrayList<Parametro> parametros = new ArrayList<>();

        int i = 0;
        for (QPPParser.TipoContext tipo : ctx.tipo()) {
            parametros.add(new Parametro((Tipo) visit(tipo), ctx.ID().get(i).getSymbol().getText()));
            i++;
        }

        return new ParametrosFormais(parametros);
    }

    @Override
    public TreeNode visitParametrosFormaisVazio(QPPParser.ParametrosFormaisVazioContext ctx) {
        return new ParametrosFormais();
    }

    @Override
    public Tipo visitTipoVoid(QPPParser.TipoVoidContext ctx) {
        return new Tipo(TipoEnum.VOID, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY);
    }

    @Override
    public Tipo visitTipoInt(QPPParser.TipoIntContext ctx) {
        QualificadorEnum qualificador = ctx.qualificador().getText().equals("") ? QualificadorEnum.EMPTY : QualificadorEnum.CONST;
        DecoradorEnum decorador = ctx.decorador().getText().equals("") ? DecoradorEnum.EMPTY : DecoradorEnum.AMPER;
        return new Tipo(TipoEnum.INT, qualificador, decorador);
    }

    @Override
    public Tipo visitTipoFloat(QPPParser.TipoFloatContext ctx) {
        QualificadorEnum qualificador = ctx.qualificador().getText().equals("") ? QualificadorEnum.EMPTY : QualificadorEnum.CONST;
        DecoradorEnum decorador = ctx.decorador().getText().equals("") ? DecoradorEnum.EMPTY : DecoradorEnum.AMPER;
        return new Tipo(TipoEnum.FLOAT, qualificador, decorador);
    }

    @Override
    public Tipo visitTipoChar(QPPParser.TipoCharContext ctx) {
        QualificadorEnum qualificador = ctx.qualificador().getText().equals("") ? QualificadorEnum.EMPTY : QualificadorEnum.CONST;
        DecoradorEnum decorador = ctx.decorador().getText().equals("") ? DecoradorEnum.EMPTY : DecoradorEnum.AMPER;
        return new Tipo(TipoEnum.CHAR, qualificador, decorador);
    }

    @Override
    public Tipo visitTipoBool(QPPParser.TipoBoolContext ctx) {
        QualificadorEnum qualificador = ctx.qualificador().getText().equals("") ? QualificadorEnum.EMPTY : QualificadorEnum.CONST;
        DecoradorEnum decorador = ctx.decorador().getText().equals("") ? DecoradorEnum.EMPTY : DecoradorEnum.AMPER;
        return new Tipo(TipoEnum.BOOL, qualificador, decorador);
    }

    @Override
    public Tipo visitTipoNome(QPPParser.TipoNomeContext ctx) {
        QualificadorEnum qualificador = ctx.qualificador().getText().equals("") ? QualificadorEnum.EMPTY : QualificadorEnum.CONST;
        DecoradorEnum decorador = ctx.decorador().getText().equals("") ? DecoradorEnum.EMPTY : DecoradorEnum.AMPER;
        return new Tipo(TipoEnum.NOME, ctx.tipo_nome().getText(), qualificador, decorador);
    }

    @Override
    public TreeNode visitTipoID(QPPParser.TipoIDContext ctx) {
        return super.visitTipoID(ctx);
    }

    @Override
    public TreeNode visitTipoNomeAcesso(QPPParser.TipoNomeAcessoContext ctx) {
        return super.visitTipoNomeAcesso(ctx);
    }

//    @Override
//    public TreeNode visitQualificadorConst(QPPParser.QualificadorConstContext ctx) {
//        return super.visitQualificadorConst(ctx);
//    }
//
//    @Override
//    public TreeNode visitQualificadorVazio(QPPParser.QualificadorVazioContext ctx) {
//        return super.visitQualificadorVazio(ctx);
//    }

//    @Override
//    public TreeNode visitDecoradorAmper(QPPParser.DecoradorAmperContext ctx) {
//        return super.visitDecoradorAmper(ctx);
//    }
//
//    @Override
//    public TreeNode visitDecoradorVazio(QPPParser.DecoradorVazioContext ctx) {
//        return super.visitDecoradorVazio(ctx);
//    }

    @Override
    public Bloco visitBloco(QPPParser.BlocoContext ctx) {
        ArrayList<Comando> comandos = new ArrayList<>();
        ArrayList<Variavel> variaveis = new ArrayList<>();

        for (QPPParser.ComandoContext comando : ctx.comando()) {
            comandos.add((Comando) visit(comando));
        }

        for (QPPParser.VariavelContext variavel : ctx.variavel()) {
            variaveis.add((Variavel) visit(variavel));
        }

        return new Bloco(variaveis, comandos);
    }

    @Override
    public Bloco visitComandoBloco(QPPParser.ComandoBlocoContext ctx) {
        return visitBloco(ctx.bloco());
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

    // END


//    @Override
//    public TreeNode visitSelecao(QPPParser.SelecaoContext ctx) {
//        return super.visitSelecao(ctx);
//    }
//
//    @Override
//    public TreeNode visitSelecaoSenao(QPPParser.SelecaoSenaoContext ctx) {
//        return super.visitSelecaoSenao(ctx);
//    }
//
//    @Override
//    public TreeNode visitSelecaoSenaoVazio(QPPParser.SelecaoSenaoVazioContext ctx) {
//        return super.visitSelecaoSenaoVazio(ctx);
//    }
//
//    @Override
//    public TreeNode visitRepeticao(QPPParser.RepeticaoContext ctx) {
//        return super.visitRepeticao(ctx);
//    }
//
//    @Override
//    public TreeNode visitAtribuicao(QPPParser.AtribuicaoContext ctx) {
//        return super.visitAtribuicao(ctx);
//    }
//
//    @Override
//    public TreeNode visitRetorno(QPPParser.RetornoContext ctx) {
//        return super.visitRetorno(ctx);
//    }
//
//    @Override
//    public TreeNode visitEntrada(QPPParser.EntradaContext ctx) {
//        return super.visitEntrada(ctx);
//    }
//
//    @Override
//    public TreeNode visitSaida(QPPParser.SaidaContext ctx) {
//        return super.visitSaida(ctx);
//    }

    @Override
    public ComandoExpressaoComando visitExpressaoComandoExpressao(QPPParser.ExpressaoComandoExpressaoContext ctx) {
        return (ComandoExpressaoComando) visit(ctx.expressao());
    }

    @Override
    public ComandoExpressaoComando visitExpressaoComandoSEMI(QPPParser.ExpressaoComandoSEMIContext ctx) {
        return new ExpressaoComandoSEMI();
    }

    @Override
    public TreeNode visitExpressaoCHARL(QPPParser.ExpressaoCHARLContext ctx) {
        return super.visitExpressaoCHARL(ctx);
    }

    @Override
    public Expressao visitExpressaoUnario(QPPParser.ExpressaoUnarioContext ctx) {
        return new ExpressaoUnario((OperadorUnario) visit(ctx.operador_unario()), (Expressao) visit(ctx.expressao()));
    }

    @Override
    public Expressao visitExpressaoNome(QPPParser.ExpressaoNomeContext ctx) {
        return new ExpressaoNome((Nome) visit(ctx.nome()));
    }

    @Override
    public TreeNode visitExpressaoFLOATL(QPPParser.ExpressaoFLOATLContext ctx) {
        return super.visitExpressaoFLOATL(ctx);
    }

    @Override
    public Expressao visitExpressaoOperadorBinario(QPPParser.ExpressaoOperadorBinarioContext ctx) {
        return new ExpressaoOperadorBinario((Expressao) visit(ctx.expressao(0)),
                (OperadorBinario) visit(ctx.operador_binario()),
                (Expressao) visit(ctx.expressao(1)));
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
    public Expressao visitExpressaoLarenRparen(QPPParser.ExpressaoLarenRparenContext ctx) {
        return new ExpressaoLarenRparen(visit(ctx.expressao());
    }

    @Override
    public Expressao visitExpressaoParametrosReais(QPPParser.ExpressaoParametrosReaisContext ctx) {
        return new ExpressaoParametrosReais((Nome) visit(ctx.nome()), visit(ctx.parametros_reais()));
    }

    @Override
    public TreeNode visitExpressaoSTRL(QPPParser.ExpressaoSTRLContext ctx) {
        return super.visitExpressaoSTRL(ctx);
    }

    @Override
    public OperadorBinario visitOperadorBinarioAND(QPPParser.OperadorBinarioANDContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.AND);
    }

    @Override
    public OperadorBinario visitOperadorBinarioOR(QPPParser.OperadorBinarioORContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.OR);
    }

    @Override
    public OperadorBinario visitOperadorBinarioPLUS(QPPParser.OperadorBinarioPLUSContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.PLUS);
    }

    @Override
    public OperadorBinario visitOperadorBinarioMINUS(QPPParser.OperadorBinarioMINUSContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.MINUS);
    }

    @Override
    public OperadorBinario visitOperadorBinarioTIMES(QPPParser.OperadorBinarioTIMESContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.TIMES);
    }

    @Override
    public OperadorBinario visitOperadorBinarioDIV(QPPParser.OperadorBinarioDIVContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.DIV);
    }

    @Override
    public OperadorBinario visitOperadorBinarioMOD(QPPParser.OperadorBinarioMODContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.MOD);
    }

    @Override
    public OperadorBinario visitOperadorBinarioLT(QPPParser.OperadorBinarioLTContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.LT);
    }

    @Override
    public OperadorBinario visitOperadorBinarioLEQ(QPPParser.OperadorBinarioLEQContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.LEQ);
    }

    @Override
    public OperadorBinario visitOperadorGT(QPPParser.OperadorGTContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.GT);
    }

    @Override
    public OperadorBinario visitOperadorGEQ(QPPParser.OperadorGEQContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.GEQ);
    }

    @Override
    public OperadorBinario visitOperadorEQ(QPPParser.OperadorEQContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.EQ);
    }

    @Override
    public OperadorBinario visitOperadorNEQ(QPPParser.OperadorNEQContext ctx) {
        return new OperadorBinario(OperadorBinarioEnum.NEQ);
    }

    @Override
    public OperadorUnario visitOperadorUnarioUNARYMINUS(QPPParser.OperadorUnarioUNARYMINUSContext ctx) {
        return new OperadorUnario(OperadorUnarioEnum.MINUS);

    }

    @Override
    public OperadorUnario visitOperadorUnarioINCR(QPPParser.OperadorUnarioINCRContext ctx) {
        return new OperadorUnario(OperadorUnarioEnum.INCR);
    }

    @Override
    public OperadorUnario visitOperadorUnarioDECR(QPPParser.OperadorUnarioDECRContext ctx) {
        return new OperadorUnario(OperadorUnarioEnum.DECR);
    }

    @Override
    public OperadorUnario visitOperadorUnarioNOT(QPPParser.OperadorUnarioNOTContext ctx) {
        return new OperadorUnario(OperadorUnarioEnum.NOT);
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
    public TreeNode visitNomeListaIDDBLCOL(QPPParser.NomeListaIDDBLCOLContext ctx) {
        return super.visitNomeListaIDDBLCOL(ctx);
    }

    @Override
    public TreeNode visitNomeListaThisArrow(QPPParser.NomeListaThisArrowContext ctx) {
        return super.visitNomeListaThisArrow(ctx);
    }

    @Override
    public TreeNode visitNomeListaID(QPPParser.NomeListaIDContext ctx) {
        return super.visitNomeListaID(ctx);
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
