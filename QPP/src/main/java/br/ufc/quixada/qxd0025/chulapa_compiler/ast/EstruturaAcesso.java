package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class EstruturaAcesso extends TreeNode {

    private final AcessoEnum tipo;
    private final ArrayList<Membro> membros;

    public EstruturaAcesso(AcessoEnum tipo, ArrayList<Membro> membros) {
        this.tipo = tipo;
        this.membros = membros;
    }

    public AcessoEnum getTipo() {
        return tipo;
    }

    public ArrayList<Membro> getMembros() {
        return membros;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[Membros]: {");

        System.out.print(" ".repeat(depth * 2));
        for (Membro m : membros) {
            m.printAtDepth(depth + 1);
        }
        System.out.print(" ".repeat(depth * 2));

        System.out.println("}");
    }
}
