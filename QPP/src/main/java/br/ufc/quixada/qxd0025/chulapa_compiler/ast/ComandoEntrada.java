package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class ComandoEntrada extends Comando {
    private final ArrayList<Nome> nomes;

    public ComandoEntrada(ArrayList<Nome> nomes) {
        this.nomes = nomes;
    }

    public ArrayList<Nome> getNomes() {
        return nomes;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Entrada]: {");

        System.out.print(" ".repeat(depth*2));

        for (Nome c: nomes) {
        System.out.print(" ".repeat(depth*2));
            c.printAtDepth(depth+1);
        }

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
