package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class SelecaoSenao extends TreeNode {

    private final ArrayList<Comando> comandos;

    public SelecaoSenao(ArrayList<Comando> comandos) {
        this.comandos = comandos;
    }

    public ArrayList<Comando> getComandos() {
        return comandos;
    }

    @Override
    public void printAtDepth(int depth) {

        if (!comandos.isEmpty()) {
            System.out.print(" ".repeat(depth * 2));
            System.out.println("[Senao]: {");

            System.out.print(" ".repeat(depth * 2));

            for (Comando c : comandos) {
                c.printAtDepth(depth + 1);
            }

            System.out.print(" ".repeat(depth * 2));
            System.out.println("}");
        }

    }
}
