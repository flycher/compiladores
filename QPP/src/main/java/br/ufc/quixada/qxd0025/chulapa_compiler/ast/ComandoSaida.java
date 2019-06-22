package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.List;

public class ComandoSaida extends Comando {
    private final List<Expressao> expressoes;

    public ComandoSaida(List<Expressao> expressoes) {
        this.expressoes = expressoes;
    }

    public List<Expressao> getExpressoes() {
        return expressoes;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Saida]: {");

        System.out.print(" ".repeat(depth*2));

        for (Expressao c: expressoes) {
            c.printAtDepth(depth+1);
        }

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
