package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class ComandoEntrada extends Comando {
    private final ArrayList<nome> nomes;

    public ComandoEntrada(List<nome> nomes) {
        this.nomes = nomes;
    }

    public List<nome> getNomes() {
        return nomes;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Entrada]: {");

        System.out.print(" ".repeat(depth*2));

        for (nome c: nomes) {
        System.out.print(" ".repeat(depth*2));
            c.printAtDepth(depth+1);
        }

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
