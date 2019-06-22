package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class Programa extends TreeNode {

    private final ArrayList<Definicao> definicoes;

    public Programa(ArrayList<Definicao> statements) {
        this.definicoes = statements;
    }

    public Programa() {
        definicoes = new ArrayList<>();
    }

    public ArrayList<Definicao> getStatements() {
        return definicoes;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[Program]");
        for (Definicao s : definicoes) {
            s.printAtDepth(depth + 1);
        }
    }

}
