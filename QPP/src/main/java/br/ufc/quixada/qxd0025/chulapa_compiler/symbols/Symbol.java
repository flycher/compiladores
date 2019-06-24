package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.*;

import java.util.ArrayList;

public class Symbol {

    private final String id;
    private final int linha;
    private Tipo tipo;
    private SymbolCategory category;
    private ArrayList<Assinatura> parametros;

    public Symbol(Parametro parametro) {
        this.id = parametro.getId();
        this.tipo = parametro.getTipo();
        this.linha = -1;
        this.category = SymbolCategory.VARIABLE;
        this.parametros = new ArrayList<>();
    }

    public Symbol(Symbol symbol, Assinatura parametros) {
        this.id = symbol.getId();
        this.linha = symbol.getLinha();
        this.parametros.add(parametros);
        this.tipo = symbol.getTipo();
    }

    public Symbol(Symbol symbol) {
        this.id = symbol.getId();
        this.linha = symbol.getLinha();
        this.parametros = new ArrayList<>();
        this.tipo = symbol.getTipo();
    }

    public Symbol(String id, Tipo tipo, int linha) {
        this.id = id;
        this.linha = linha;
        this.parametros = new ArrayList<>();
        this.tipo = tipo;
    }

    public Symbol(VariavelAtribuicao variavelAtribuicao) {
        this.id = variavelAtribuicao.getVarid().intern();
        this.tipo = variavelAtribuicao.getTipo();
        this.parametros = new ArrayList<>();
        this.category = SymbolCategory.ATRIBUTE;
        this.linha = variavelAtribuicao.getLinha();
    }

    public Symbol(DefinicaoFuncao definicaoFuncao) {
        this.id = definicaoFuncao.getFuncid().intern();
        this.tipo = definicaoFuncao.getTipo();
        this.parametros = new ArrayList<>();
        this.category = SymbolCategory.FUNCTION;
        this.linha = definicaoFuncao.getLinha();
    }

    public Symbol(MembroMetodo metodo) {
        this.id = metodo.getMetodo().getFuncid().intern();
        this.tipo = metodo.getMetodo().getTipo();
        this.parametros = new ArrayList<>();
        this.category = SymbolCategory.METOD;
        this.linha = metodo.getMetodo().getLinha();
    }

    public String getId() {
        return id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getLinha() {
        return linha;
    }

    public SymbolCategory getCategory() {
        return category;
    }

    public ArrayList<Assinatura> getParametros() {
        return parametros;
    }

    public boolean addParametros(Assinatura novosParametros, ErroSemantico erroSemantico) {
        for (Assinatura p : parametros) {
            if (p.equals(parametros)) {
                erroSemantico.setMensagem("Assinatura ja utilizada para o ID [" + this.getId() + "]");
                return false;
            }
        }
        this.parametros.add(novosParametros);
        return true;
    }

    public boolean buscaParametros(Assinatura outrosParametros) {
        for (Assinatura p : parametros) {
            if (p.equals(outrosParametros)) {
                return true;
            }
        }
        return false;
    }

}
