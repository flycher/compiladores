
package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class ParamentrosReais extends TreeNode {
    private final ArrayList<Expressao> expressoes;

    public ParamentrosReais(ArrayList<Expressao> expressoes) {
        this.expressoes = expressoes;
    }

    public ArrayList<Expressao> getExpressoes() {
        return expressoes;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[ParametrosReais]: {");


        for(Expressao p : expressoes) {
            System.out.print(" ".repeat(depth*2));
            System.out.println("Expression Parameters:");
            p.printAtDepth(depth+1);
        }

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
