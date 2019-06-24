package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.Tipo;

public class SemanticaBloco {

    private boolean garanteRetorno;
    private boolean dentroLaco;
    private SymbolCategory category;
    private Tipo tipoRetorno;


    public SemanticaBloco(Tipo tipoRetorno, SymbolCategory category) {
        this.garanteRetorno = false;
        this.dentroLaco = false;
        this.tipoRetorno = tipoRetorno;
        this.category = category;
    }

    public SemanticaBloco(boolean dentroLaco, Tipo tipoRetorno, SymbolCategory category) {
        this.garanteRetorno = false;
        this.dentroLaco = dentroLaco;
        this.tipoRetorno = tipoRetorno;
        this.category = category;
    }


    public boolean isGaranteRetorno() {
        return garanteRetorno;
    }

    public void setGaranteRetorno(boolean garanteRetorno) {
        this.garanteRetorno = garanteRetorno;
    }

    public boolean isDentroLaco() {
        return dentroLaco;
    }

    public void setDentroLaco(boolean dentroLaco) {
        this.dentroLaco = dentroLaco;
    }

    public Tipo getTipoRetorno() {
        return tipoRetorno;
    }

    public void setTipoRetorno(Tipo tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

}
