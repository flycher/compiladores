package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.Tipo;

import java.util.ArrayList;
import java.util.Set;

public class Assinatura {

    private Tipo tipoRetorno;
    private ArrayList<Tipo> tipoParametros;
    private ArrayList<String> idParametros;
    private Set<String> parameteosUnicos;

    public Assinatura(Tipo tipoRetorno, ArrayList<Tipo> tipoParametros, ArrayList<String> idParametros, Set<String> parameteosUnicos) {
        this.tipoRetorno = tipoRetorno;
        this.tipoParametros = tipoParametros;
        this.idParametros = idParametros;
        this.parameteosUnicos = parameteosUnicos;
    }


}
