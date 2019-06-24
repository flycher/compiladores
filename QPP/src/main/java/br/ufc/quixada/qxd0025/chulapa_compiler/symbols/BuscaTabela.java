package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

public class BuscaTabela {

    private String id;
    private Symbol simbolo;

    private SymbolCategory category;
    private Assinatura parametros;

    public BuscaTabela(String id) {
        this.id = id;
        this.parametros = new Assinatura();
        this.category = SymbolCategory.VARIABLE;
    }

    public BuscaTabela(String id, Assinatura parametros) {
        this.id = id;
        this.parametros = parametros;
        this.category = SymbolCategory.FUNCTION;
    }

    public Symbol buscar(SymbolTable symbolTable, ErroSemantico erroSemantico) {
        Symbol symbol = symbolTable.getSymbol(this.id, erroSemantico);
        if (symbol == null) {
            if (symbolTable.getPai() == null) {
                simbolo = null;
                return null;
            } else {
                return simbolo = buscar(symbolTable.getPai(), erroSemantico);
            }
        } else {
            if (symbol.getCategory() == SymbolCategory.VARIABLE || symbol.getCategory() == SymbolCategory.ATRIBUTE) {
                if (category == SymbolCategory.VARIABLE) {
                    simbolo = symbol;
                    return symbol;
                } else {
                    erroSemantico.setMensagem("simbolo ID[" + id + "] ja foi declarado como atributo (l." + symbol.getLinha() + ")");

                    return simbolo = null;
                }
            } else {
                if (symbol.buscaParametros(parametros)) {
                    return simbolo = symbol;
                } else {
                    erroSemantico.setMensagem("o ID[" + id + "] nao possui os parametros compativeis com " + parametros);
                    return simbolo = null;
                }
            }
        }
    }

    public String getId() {
        return id;
    }

    public Symbol getSimbolo() {
        return simbolo;
    }

    public SymbolCategory getCategory() {
        return category;
    }

    public Assinatura getParametros() {
        return parametros;
    }
}
