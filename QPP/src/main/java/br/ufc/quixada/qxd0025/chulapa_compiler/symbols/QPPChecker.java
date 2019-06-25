package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.*;

import java.util.ArrayList;

public class QPPChecker {

    //TODO implementar checker
    private Programa programa;
    private SymbolTable symbolTable;
    private ArrayList<ErroSemantico> errosSemanticos;

    public QPPChecker(Programa programa) {
        this.programa = programa;
        this.symbolTable = null;
        this.errosSemanticos = new ArrayList<>();
    }

    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }

    public boolean check() {
        symbolTable = new SymbolTable();
        check(programa);
        return true;
    }

    private void check(Programa programa) {
        for (Definicao definicao : programa.getStatements()) {
            check(definicao, symbolTable);
        }
    }

    private void check(Definicao definicao, SymbolTable symbolTable) {
        if (definicao instanceof DefinicaoFuncao)
            check((DefinicaoFuncao) definicao, symbolTable);
        else if (definicao instanceof DefinicaoEstrutura)
            check((DefinicaoEstrutura)definicao, symbolTable);
    }

    private void check(DefinicaoFuncao definicaoFuncao, SymbolTable symbolTable) {
        Symbol symbol = new Symbol(definicaoFuncao);
        SymbolTable escopo = new SymbolTable(symbolTable);
        ErroSemantico erro = new ErroSemantico(definicaoFuncao.getLinha(), "");

        ParametrosFormais parametrosFormais = definicaoFuncao.getParametrosFormais();
        Assinatura parametros = new Assinatura(symbol.getTipo());

        for (Parametro parametro : parametrosFormais.getParametros()) {
            Symbol p = new Symbol(parametro);
            if (!parametros.adicionarParametro(p)) {
                errosSemanticos.add(new ErroSemantico(definicaoFuncao.getLinha(),
                        "Parametros com meso ID {" + p.getId() + "}"));
            } else {
                escopo.addSymbol(p, erro);
            }
        }

        erro = new ErroSemantico(definicaoFuncao.getLinha());
        if (!symbol.addParametros(parametros, erro)) {
            errosSemanticos.add(erro);
        }

        erro = new ErroSemantico(definicaoFuncao.getLinha());
        if (!escopo.addSymbol(symbol, erro)) {
            errosSemanticos.add(erro);
        }

        SemanticaBloco bloco = new SemanticaBloco(definicaoFuncao.getTipo(), SymbolCategory.FUNCTION);
        check(definicaoFuncao.getBloco(), escopo, bloco);

        if (!bloco.isGaranteRetorno()) {
            errosSemanticos.add(new ErroSemantico(definicaoFuncao.getLinha(),
                    "Funcao ID {" + definicaoFuncao.getFuncid() + "} não garante retorno"));
        }
    }

    private void check(Bloco bloco, SymbolTable symbolTable, SemanticaBloco info) {
        for (Variavel variavel : bloco.getVariaveis()) {
            check(variavel, symbolTable);
        }
    }

    private void check(Variavel variavel, SymbolTable symbolTable) {

    }

    private void check(Expressao expressao, SymbolTable symbolTable, SemanticaExpressao info) {
        if (expressao instanceof ExpressaoOperadorBinario)
            check((ExpressaoOperadorBinario) expressao, symbolTable, info);
        if (expressao instanceof ExpressaoUnario) check((ExpressaoUnario) expressao, symbolTable, info);
        if (expressao instanceof ExpressaoNome) check((ExpressaoNome) expressao, symbolTable, info);
        if (expressao instanceof ExpressaoTipo) check((ExpressaoTipo) expressao, symbolTable, info);
    }

    private void check(ExpressaoOperadorBinario expressao, SymbolTable symbolTable, SemanticaExpressao info) {
        SemanticaExpressao esquerda = new SemanticaExpressao();
        SemanticaExpressao direita = new SemanticaExpressao();

        check(expressao.getLeftExpressao(), symbolTable, esquerda);
        check(expressao.getRightExpressao(), symbolTable, direita);

        OperadorBinario op = expressao.getOperadorBinario();

        if (op.getOperador() == OperadorBinarioEnum.PLUS
                || op.getOperador() == OperadorBinarioEnum.MINUS
                || op.getOperador() == OperadorBinarioEnum.TIMES
                || op.getOperador() == OperadorBinarioEnum.DIV
                || op.getOperador() == OperadorBinarioEnum.MOD) {
            info.setTipoRetornado(new Tipo(TipoEnum.INT, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
            if (esquerda.getTipoRetornado().getTipo() != TipoEnum.INT || esquerda.getTipoRetornado().getTipo() != TipoEnum.FLOAT
                    || direita.getTipoRetornado().getTipo() != TipoEnum.INT || direita.getTipoRetornado().getTipo() != TipoEnum.FLOAT) {
                errosSemanticos.add(new ErroSemantico(expressao.getLinha(), "Operador " + op.getOperador() + " entre tipos invalidos."));
            }
        } else if (op.getOperador() == OperadorBinarioEnum.LT
                || op.getOperador() == OperadorBinarioEnum.GT
                || op.getOperador() == OperadorBinarioEnum.GEQ
                || op.getOperador() == OperadorBinarioEnum.LEQ) {
            info.setTipoRetornado(new Tipo(TipoEnum.BOOL, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
            if (esquerda.getTipoRetornado().getTipo() != TipoEnum.INT || esquerda.getTipoRetornado().getTipo() != TipoEnum.FLOAT
                    || direita.getTipoRetornado().getTipo() != TipoEnum.INT || direita.getTipoRetornado().getTipo() != TipoEnum.FLOAT) {
                errosSemanticos.add(new ErroSemantico(expressao.getLinha(), "Operador " + op.getOperador() + " entre tipos invalidos."));
            }
        } else if (op.getOperador() == OperadorBinarioEnum.EQ
                || op.getOperador() == OperadorBinarioEnum.NEQ) {
            info.setTipoRetornado(new Tipo(TipoEnum.BOOL, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
            if (esquerda.getTipoRetornado().getTipo() != direita.getTipoRetornado().getTipo()) {
                errosSemanticos.add(new ErroSemantico(expressao.getLinha(), "Operador " + op.getOperador() + " entre tipos invalidos."));
            }
        } else if (op.getOperador() == OperadorBinarioEnum.AND || op.getOperador() == OperadorBinarioEnum.OR) {
            info.setTipoRetornado(new Tipo(TipoEnum.BOOL, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
            if (esquerda.getTipoRetornado().getTipo() != TipoEnum.BOOL || direita.getTipoRetornado().getTipo() != TipoEnum.BOOL) {
                errosSemanticos.add(new ErroSemantico(expressao.getLinha(), "Operador " + op.getOperador() + " entre tipos invalidos."));
            }
        }
    }

    private void check(ExpressaoUnario expressao, SymbolTable symbolTable, SemanticaExpressao info) {
        SemanticaExpressao expr = new SemanticaExpressao();
        check(expressao.getExpressao(), symbolTable, expr);

        OperadorUnario op = expressao.getOperadorUnario();

        if (op.getOperador() == OperadorUnarioEnum.INCR || op.getOperador() == OperadorUnarioEnum.DECR || op.getOperador() == OperadorUnarioEnum.MINUS) {
            if (expr.getTipoRetornado().getTipo() == TipoEnum.INT)
                info.setTipoRetornado(new Tipo(TipoEnum.INT, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
            else
                info.setTipoRetornado(new Tipo(TipoEnum.FLOAT, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
            if (expr.getTipoRetornado().getTipo() != TipoEnum.INT || expr.getTipoRetornado().getTipo() != TipoEnum.FLOAT) {
                errosSemanticos.add(new ErroSemantico(expressao.getLinha(), "Operador " + op.getOperador() + " aplicado a tipo invalido."));
            }
        } else if (op.getOperador() == OperadorUnarioEnum.NOT) {
            info.setTipoRetornado(new Tipo(TipoEnum.BOOL, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
            if (expr.getTipoRetornado().getTipo() != TipoEnum.BOOL)
                errosSemanticos.add(new ErroSemantico(expressao.getLinha(), "Operador " + op.getOperador() + " aplicado a tipo invalido."));
        }
    }

    private void check(ExpressaoTipo expressao, SymbolTable symbolTable, SemanticaExpressao info) {
        ExpressaoTipoEnum tipo = expressao.getTipo();
        if (tipo == ExpressaoTipoEnum.INTL)
            info.setTipoRetornado(new Tipo(TipoEnum.INT, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
        if (tipo == ExpressaoTipoEnum.FLOATL)
            info.setTipoRetornado(new Tipo(TipoEnum.FLOAT, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
        if (tipo == ExpressaoTipoEnum.CHARL || tipo == ExpressaoTipoEnum.STRL)
            info.setTipoRetornado(new Tipo(TipoEnum.CHAR, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
        if (tipo == ExpressaoTipoEnum.TRUE || tipo == ExpressaoTipoEnum.FALSE)
            info.setTipoRetornado(new Tipo(TipoEnum.BOOL, QualificadorEnum.EMPTY, DecoradorEnum.EMPTY));
    }

    private void check(ExpressaoNome expressao, SymbolTable symbolTable, SemanticaExpressao info) {
        Nome nome = expressao.getNome();
        check(nome, symbolTable, info);
    }

    private void check(Nome nome, SymbolTable symbolTable, SemanticaExpressao info) {
        if (nome instanceof NomeID) check((NomeID) nome, symbolTable, info);
        if (nome instanceof NomeThisArrow) check((NomeThisArrow) nome, symbolTable, info);
        if (nome instanceof NomeNomeLista) check((NomeNomeLista) nome, symbolTable, info);
    }

    public String mostrarErros() {
        String erros = "Lista de erros:\n";
        for (ErroSemantico erro : errosSemanticos) {
            erros += erro + "\n";
        }
        return erros;
    }

}
