package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.Tipo;

public class SemanticaExpressao {

    private Tipo tipoRetornado;
    private Tipo escopoAtual;

    public SemanticaExpressao() {
        this.tipoRetornado = null;
        this.escopoAtual = null;
    }

    public SemanticaExpressao(Tipo tipoRetornado) {
        this.tipoRetornado = tipoRetornado;
        this.escopoAtual = null;
    }

    public Tipo getTipoRetornado() {
        return tipoRetornado;
    }

    public void setTipoRetornado(Tipo tipoRetornado) {
        this.tipoRetornado = tipoRetornado;
    }

    public Tipo getEscopoAtual() {
        return escopoAtual;
    }

    public void setEscopoAtual(Tipo escopoAtual) {
        this.escopoAtual = escopoAtual;
    }

}
