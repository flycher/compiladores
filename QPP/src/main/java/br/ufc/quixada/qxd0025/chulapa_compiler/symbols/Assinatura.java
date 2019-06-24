package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.Tipo;
import br.ufc.quixada.qxd0025.chulapa_compiler.ast.TipoEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Assinatura {

    private Tipo tipoRetorno;
    private ArrayList<Tipo> tipoParametros;
    private ArrayList<String> idParametros;
    private Set<String> parametrosUnicos;

    public Assinatura(Tipo tipoRetorno, ArrayList<Tipo> tipoParametros, ArrayList<String> idParametros, Set<String> parametrosUnicos) {
        this.tipoRetorno = tipoRetorno;
        this.tipoParametros = tipoParametros;
        this.idParametros = idParametros;
        this.parametrosUnicos = parametrosUnicos;
    }

    public Assinatura(Tipo tipo) {
        this.tipoRetorno = tipo;
        this.tipoParametros = new ArrayList<>();
        this.idParametros = new ArrayList<>();
        this.parametrosUnicos = new HashSet<>();
    }

    public Assinatura() {
        this.tipoParametros = new ArrayList<>();
        this.idParametros = new ArrayList<>();
        this.parametrosUnicos = new HashSet<>();
    }

    public boolean adicionarParametro(Symbol s) {
        if (parametrosUnicos.contains(s.getId())) {
            //parametros com mesmo id
            return false;
        }

        tipoParametros.add(s.getTipo());
        idParametros.add(s.getId());
        return true;
    }

    public Tipo getTipoRetorno() {
        return tipoRetorno;
    }

    public ArrayList<Tipo> getTipoParametros() {
        return tipoParametros;
    }

    public ArrayList<String> getIdParametros() {
        return idParametros;
    }

    public Set<String> getParametrosUnicos() {
        return parametrosUnicos;
    }

    public boolean equals(Assinatura compara) {
        ArrayList<Tipo> outros = compara.getTipoParametros();
        if (this.tipoParametros.size() != outros.size()) return false;
        for (int i = 0; i < tipoParametros.size(); i++) {
            Tipo t = this.tipoParametros.get(i);
            Tipo o = outros.get(i);

            //caso o tipo dos parametros sejam diferentes
            if (!o.getTipo().equals(t.getTipo()))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (tipoParametros.size() == 0) return "()";

        String res = "" + this.tipoRetorno + ":(";
        for (Tipo t : tipoParametros) {
            if (t.getTipo() == TipoEnum.INT) {
                res += "int,";
            } else if (t.getTipo() == TipoEnum.BOOL) {
                res += "bool,";
            } else if (t.getTipo() == TipoEnum.CHAR) {
                res += "char,";
            } else if (t.getTipo() == TipoEnum.VOID) {
                res += "void";
            } else if (t.getTipo() == TipoEnum.NOME) {
                res += t.getTipoNome().toString();
            }
        }
        res = res.substring(0, res.length() - 1);
        return res + ")";
    }
}
