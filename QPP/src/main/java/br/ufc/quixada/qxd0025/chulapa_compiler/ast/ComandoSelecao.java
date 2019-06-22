package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class ComandoSelecao extends Comando {

    private final Expressao expressao;
    private final ArrayList<Comando> comandos;
    private final SelecaoSenao senao;

    public ComandoSelecao(Expressao expressao, ArrayList<Comando> comandos, SelecaoSenao senao) {
        this.expressao = expressao;
        this.comandos = comandos;
        this.senao = senao;
    }

    public Expressao getExpressao() {
        return expressao;
    }

    public ArrayList<Comando> getComandos() {
        return comandos;
    }

    public SelecaoSenao getSenao() {
        return senao;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Se]: {");

        System.out.print(" ".repeat(depth*2));
        expressao.printAtDepth(depth+1);
        System.out.print(" ".repeat(depth*2));

        for (Comando c: comandos) {
            c.printAtDepth(depth+1);
        }

        System.out.print(" ".repeat(depth*2));
        senao.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
