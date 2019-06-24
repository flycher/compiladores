package br.ufc.quixada.qxd0025.chulapa_compiler.frontend;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.*;

import java.util.ArrayList;

public class QPPTranslator extends QPPBaseVisitor<TreeNode> {
    @Override
    public Programa visitPrograma(QPPParser.ProgramaContext ctx) {

        if (ctx.definicao().size() == 0) return new Programa();
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

    @Override
    public DefinicaoEstrutura visitDefinicaoEstrutura(QPPParser.DefinicaoEstruturaContext ctx) {
        String id = ctx.estrutura().ID().getSymbol().getText();
        ArrayList<EstruturaAcesso> acessos = new ArrayList<>();

        for (QPPParser.Estrutura_acessoContext c : ctx.estrutura().estrutura_acesso()) {
            acessos.add((EstruturaAcesso) visit(c));
        }

        return new DefinicaoEstrutura(id, acessos);
    }

//    @Override
//    public TreeNode visitEstrutura(QPPParser.EstruturaContext ctx) {
//
//        return super.visitEstrutura(ctx);
//    }

    @Override
    public EstruturaAcesso visitEstruturaAcessoPublic(QPPParser.EstruturaAcessoPublicContext ctx) {

        ArrayList<Membro> mebros = new ArrayList<>();

        for (QPPParser.MembroContext m : ctx.membro()) {
            mebros.add((Membro) visit(m));
        }

        return new EstruturaAcesso(AcessoEnum.PUBLIC, mebros);
    }

    @Override
    public EstruturaAcesso visitEstruturaAcessoProtected(QPPParser.EstruturaAcessoProtectedContext ctx) {
        ArrayList<Membro> mebros = new ArrayList<>();

        for (QPPParser.MembroContext m : ctx.membro()) {
            mebros.add((Membro) visit(m));
        }

        return new EstruturaAcesso(AcessoEnum.PROTECTED, mebros);
    }

    @Override
    public EstruturaAcesso visitEstruturaAcessoPrivate(QPPParser.EstruturaAcessoPrivateContext ctx) {
        ArrayList<Membro> membros = new ArrayList<>();

        for (QPPParser.MembroContext m : ctx.membro()) {
            membros.add((Membro) visit(m));
        }

        return new EstruturaAcesso(AcessoEnum.PRIVATE, membros);
    }

    @Override
    public MembroConstrutor visitMembroConstrutor(QPPParser.MembroConstrutorContext ctx) {
        String constId = ctx.construtor().ID().getSymbol().getText();
        ParametrosFormais parametrosFormais = (ParametrosFormais) visit(ctx.construtor().parametros_formais());
        Bloco bloco = (Bloco) visit(ctx.construtor().bloco());

        return new MembroConstrutor(constId, parametrosFormais, bloco);
    }

    @Override
    public MembroVariavel visitMembroVariavel(QPPParser.MembroVariavelContext ctx) {
        Variavel variavel = (Variavel) visit(ctx.variavel());
        return new MembroVariavel(variavel);

    }

    @Override
    public MembroMetodo visitMembroMetodo(QPPParser.MembroMetodoContext ctx) {
        DefinicaoFuncao definicaoFuncao = (DefinicaoFuncao) visit(ctx.metodo().funcao_cabecalho());
        QualificadorEnum qualificador;
        if (ctx.metodo().qualificador().getText() == "") {
            qualificador = QualificadorEnum.EMPTY;
        } else {
            qualificador = QualificadorEnum.CONST;
        }
        return new MembroMetodo(definicaoFuncao, qualificador);
    }

    @Override
    public MembroStaticVariavel visitMembroStaticVariavel(QPPParser.MembroStaticVariavelContext ctx) {
        Variavel variavel = (Variavel) visit(ctx.variavel());
        return new MembroStaticVariavel(variavel);
    }

    @Override
    public MembroStaticMetodo visitMembroStaticMetodo(QPPParser.MembroStaticMetodoContext ctx) {
        DefinicaoFuncao definicaoFuncao = (DefinicaoFuncao) visit(ctx.metodo().funcao_cabecalho());
        QualificadorEnum qualificador;
        if (ctx.metodo().qualificador().getText().equals("")) {
            qualificador = QualificadorEnum.EMPTY;
        } else {
            qualificador = QualificadorEnum.CONST;
        }
        return new MembroStaticMetodo(definicaoFuncao, qualificador);
    }

    @Override
    public VariavelCriacao visitVariavelCriacao(QPPParser.VariavelCriacaoContext ctx) {
        Tipo t = (Tipo) visit(ctx.tipo());
        String id = ctx.ID().getText();

        return new VariavelCriacao(t, id, ctx.getStart().getLine());
    }

    @Override
    public VariavelAtribuicao visitVariavelAtribuicao(QPPParser.VariavelAtribuicaoContext ctx) {
        Tipo tipo = (Tipo) visit(ctx.tipo());
        String varid = ctx.ID().getSymbol().getText();
        ComandoAtribuicao atribuicao = (ComandoAtribuicao) visit(ctx.atribuicao());

        return new VariavelAtribuicao(tipo, varid, atribuicao, ctx.getStart().getLine());
    }

    @Override
    public MembroConstrutor visitConstrutor(QPPParser.ConstrutorContext ctx) {
        String constid = ctx.ID().getSymbol().getText();
        ParametrosFormais parametrosFormais = (ParametrosFormais) visit(ctx.parametros_formais());
        Bloco bloco = (Bloco) visit(ctx.bloco());

        return new MembroConstrutor(constid, parametrosFormais, bloco);
    }

    @Override
    public MembroMetodo visitMetodo(QPPParser.MetodoContext ctx) {
        DefinicaoFuncao metodo = (DefinicaoFuncao) visit(ctx.funcao_cabecalho()); // CONSERTAR
        QualificadorEnum qualificador;

        if (ctx.qualificador().getText().equals("")) {
            qualificador = QualificadorEnum.EMPTY;
        } else {
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
    public ParametrosFormais visitParametrosFormaisVazio(QPPParser.ParametrosFormaisVazioContext ctx) {
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
        return new Tipo(TipoEnum.NOME, (TipoNome) visit(ctx.tipo_nome()), qualificador, decorador);
    }

    @Override
    public TipoNome visitTipoID(QPPParser.TipoIDContext ctx) {
        return new TipoNome(null, ctx.ID().getSymbol().getText());
    }

    @Override
    public TipoNome visitTipoNomeAcesso(QPPParser.TipoNomeAcessoContext ctx) {
        return new TipoNome((TipoNome) visit(ctx.tipo_nome()), ctx.ID().getSymbol().getText());
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
    public Comando visitComadoSelecao(QPPParser.ComadoSelecaoContext ctx) {
        Expressao expressao;
        ArrayList<Comando> comandos = new ArrayList<Comando>();
        SelecaoSenao selecaoSenao;

        expressao = (Expressao) visit(ctx.selecao().expressao());

        for (QPPParser.ComandoContext e : ctx.selecao().comando()) {
            comandos.add((Comando) visit(e));
        }

        selecaoSenao = (SelecaoSenao) visit(ctx.selecao().selecao_senao());

        return new ComandoSelecao(expressao, comandos, selecaoSenao);
    }

    @Override
    public Comando visitComadoRepeticao(QPPParser.ComadoRepeticaoContext ctx) {
        Expressao expressao;
        ArrayList<Comando> comandos = new ArrayList<Comando>();

        expressao = (Expressao) visit(ctx.repeticao().expressao());

        for (QPPParser.ComandoContext e : ctx.repeticao().comando()) {
            comandos.add((Comando) visit(e));
        }

        return new ComandoRepeticao(expressao, comandos);
    }

    @Override
    public Comando visitComandoAtribuicao(QPPParser.ComandoAtribuicaoContext ctx) {
        String nome;
        Expressao expressao;

        nome = ctx.atribuicao().nome().getText();

        expressao = (Expressao) visit(ctx.atribuicao().expressao());

        return new ComandoAtribuicao(nome, expressao);
    }

    @Override
    public Comando visitComandoRetorno(QPPParser.ComandoRetornoContext ctx) {
        ExpressaoComandoExpressao expressao;

        expressao = (ExpressaoComandoExpressao) visit(ctx.retorno().expressao_comando());

        return new ComandoRetorno(expressao);
    }

    @Override
    public Comando visitComandoEntrada(QPPParser.ComandoEntradaContext ctx) {
        ArrayList<Nome> nomes = new ArrayList<Nome>();

        for (QPPParser.NomeContext e : ctx.entrada().nome()) {
            nomes.add((Nome) visit(e));
        }

        return new ComandoEntrada(nomes);
    }

    @Override
    public Comando visitComandoSaida(QPPParser.ComandoSaidaContext ctx) {
        ArrayList<Expressao> expressoes = new ArrayList<Expressao>();

        for (QPPParser.ExpressaoContext e : ctx.saida().expressao()) {
            expressoes.add((Expressao) visit(e));
        }

        return new ComandoSaida(expressoes);
    }

    @Override
    public TreeNode visitComandoExpressaoComando(QPPParser.ComandoExpressaoComandoContext ctx) {
        return visit(ctx.expressao_comando());
    }

    @Override
    public ComandoBreak visitComandoBreak(QPPParser.ComandoBreakContext ctx) {
        return new ComandoBreak(ctx.getStart().getLine());
    }

    @Override
    public SelecaoSenao visitSelecaoSenao(QPPParser.SelecaoSenaoContext ctx) {
        ArrayList<Comando> comandos = new ArrayList<>();

        for(QPPParser.ComandoContext comando: ctx.comando()) {
            comandos.add((Comando) visit(comando));
        }

        return new SelecaoSenao(comandos);
    }

    @Override
    public SelecaoSenao visitSelecaoSenaoVazio(QPPParser.SelecaoSenaoVazioContext ctx) {
        return new SelecaoSenao();
    }

//    @Override
//    public TreeNode visitSelecao(QPPParser.SelecaoContext ctx) {
//        return super.visitSelecao(ctx);

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
//        return new ComandoRetorno((ExpressaoComandoExpressao) visit(ctx.expressao_comando()));
//    }

    @Override
    public Comando visitEntrada(QPPParser.EntradaContext ctx) {
        ArrayList<Nome> nomes = new ArrayList<Nome>();

        for (QPPParser.NomeContext e : ctx.nome()) {
            nomes.add((Nome) visit(e));
        }

        return new ComandoEntrada(nomes);
    }

    @Override
    public Comando visitSaida(QPPParser.SaidaContext ctx) {
        ArrayList<Expressao> expressoes = new ArrayList<Expressao>();

        for (QPPParser.ExpressaoContext e : ctx.expressao()) {
            expressoes.add((Expressao) visit(e));
        }

        return new ComandoSaida(expressoes);
    }

    @Override
    public ComandoExpressaoComando visitExpressaoComandoExpressao(QPPParser.ExpressaoComandoExpressaoContext ctx) {
        return new ExpressaoComandoExpressao((Expressao) visit(ctx.expressao()));
    }

    @Override
    public ComandoExpressaoComando visitExpressaoComandoSEMI(QPPParser.ExpressaoComandoSEMIContext ctx) {
        return new ExpressaoComandoSEMI();
    }

    @Override
    public Expressao visitExpressaoCHARL(QPPParser.ExpressaoCHARLContext ctx) {
        return new ExpressaoTipo(ExpressaoTipoEnum.CHARL, ctx.CHARL().getSymbol().getText(), ctx.start.getLine());
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
    public Expressao visitExpressaoFLOATL(QPPParser.ExpressaoFLOATLContext ctx) {
        return new ExpressaoTipo(ExpressaoTipoEnum.FLOATL, ctx.FLOATL().getSymbol().getText(), ctx.start.getLine());
    }

    @Override
    public Expressao visitExpressaoOperadorBinario(QPPParser.ExpressaoOperadorBinarioContext ctx) {
        return new ExpressaoOperadorBinario((Expressao) visit(ctx.expressao(0)),
                (OperadorBinario) visit(ctx.operador_binario()),
                (Expressao) visit(ctx.expressao(1)));
    }

    @Override
    public Expressao visitExpressaoINTL(QPPParser.ExpressaoINTLContext ctx) {
        return new ExpressaoTipo(ExpressaoTipoEnum.INTL, ctx.INTL().getSymbol().getText(), ctx.start.getLine());
    }

    @Override
    public Expressao visitExpressaoTrue(QPPParser.ExpressaoTrueContext ctx) {
        return new ExpressaoTipo(ExpressaoTipoEnum.TRUE, ctx.TRUE().getSymbol().getText(), ctx.start.getLine());
    }

    @Override
    public Expressao visitExpressaoFalse(QPPParser.ExpressaoFalseContext ctx) {
        return new ExpressaoTipo(ExpressaoTipoEnum.FALSE, ctx.FALSE().getSymbol().getText(), ctx.start.getLine());
    }

    @Override
    public Expressao visitExpressaoLarenRparen(QPPParser.ExpressaoLarenRparenContext ctx) {
        return new ExpressaoLarenRparen((Expressao) visit(ctx.expressao()));
    }

    @Override
    public Expressao visitExpressaoParametrosReais(QPPParser.ExpressaoParametrosReaisContext ctx) {
        return new ExpressaoParametrosReais((Nome) visit(ctx.nome()), (ParametrosReais) visit(ctx.parametros_reais()));
    }

    @Override
    public Expressao visitExpressaoSTRL(QPPParser.ExpressaoSTRLContext ctx) {
        return new ExpressaoTipo(ExpressaoTipoEnum.STRL, ctx.STRL().getSymbol().getText(), ctx.start.getLine());
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
    public Nome visitNomeID(QPPParser.NomeIDContext ctx) {
        return new NomeID(ctx.ID().getSymbol().getText(), (NomeLista) visit(ctx.nome_lista()));
    }

    @Override
    public Nome visitNomeThisArrow(QPPParser.NomeThisArrowContext ctx) {
        return new NomeThisArrow((NomeLista) visit(ctx.nome_lista()));
    }

    @Override
    public Nome visitNomeNomeLista(QPPParser.NomeNomeListaContext ctx) {
        return new NomeNomeLista((NomeLista) visit(ctx.nome_lista()));
    }

    @Override
    public NomeLista visitNomeListaIDDOT(QPPParser.NomeListaIDDOTContext ctx) {
        return new NomeListaIDDOT(ctx.ID().getSymbol().getText(),
                (NomeLista) visit(ctx.nome_lista()),
                (Nome_Lista_) visit(ctx.nome_lista_()));
    }

    @Override
    public NomeLista visitNomeListaIDDBLCOL(QPPParser.NomeListaIDDBLCOLContext ctx) {
        return new NomeListaIDDBLCOL(ctx.ID().getSymbol().getText(), (NomeLista) visit(ctx.nome_lista(0)),
                (ParametrosReais) visit(ctx.parametros_reais()), (NomeLista) visit(ctx.nome_lista(1)),
                (Nome_Lista_) visit(ctx.nome_lista_()));
    }

    @Override
    public TreeNode visitNomeListaThisArrow(QPPParser.NomeListaThisArrowContext ctx) {
        NomeLista nomeLista1;
        ParametrosReais parametrosReais;
        NomeLista nomeLista2;
        Nome_Lista_ nome_Lista_;

        nomeLista1 = (NomeLista) visit(ctx.nome_lista(0));
        parametrosReais = (ParametrosReais) visit(ctx.parametros_reais());
        nomeLista2 = (NomeLista) visit(ctx.nome_lista(1));
        nome_Lista_ = (Nome_Lista_) visit(ctx.nome_lista_());

        return new NomeListaThisArrow(nomeLista1, parametrosReais, nomeLista2, nome_Lista_);
    }

    @Override
    public NomeLista visitNomeListaID(QPPParser.NomeListaIDContext ctx) {
        String id = ctx.ID().getSymbol().getText();
        Nome_Lista_ nomeListaLPAREN = (Nome_Lista_) visit(ctx.nome_lista_());
        return new NomeListaID(id, nomeListaLPAREN);
    }

    @Override
    public Nome_Lista_ visitNomeListaLPAREN(QPPParser.NomeListaLPARENContext ctx) {
        ParametrosReais parametrosReais = (ParametrosReais) visit(ctx.parametros_reais());
        NomeLista nomeLista = (NomeLista) visit(ctx.nome_lista());
        Nome_Lista_ nome_lista_ = (Nome_Lista_) visit(ctx.nome_lista_());//Codigo duvidoso
        return new NomeListaLPAREN(parametrosReais, nomeLista, nome_lista_);
    }

    @Override
    public Nome_Lista_ visitNomeListaEmpty(QPPParser.NomeListaEmptyContext ctx) {
        return new NomeListaEmpty();
    }

    @Override
    public ParametrosReais visitParametrosReaisLista(QPPParser.ParametrosReaisListaContext ctx) {
        ArrayList<Expressao> parametros = new ArrayList<>();


        for (QPPParser.ExpressaoContext expressaoContext : ctx.expressao()) {
            parametros.add((Expressao) visit(expressaoContext));
        }

        return new ParametrosReais(parametros);
    }

    @Override
    public ParametrosReais visitParametrosReaisVazio(QPPParser.ParametrosReaisVazioContext ctx) {
        return new ParametrosReais();
    }
}
