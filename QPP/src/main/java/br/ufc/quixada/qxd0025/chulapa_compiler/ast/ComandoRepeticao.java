package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class ComandoRepeticao extends Comando {

    private final Expressao expressao;
    private final ArrayList<Comando> comandos;

    public ComandoRepeticao(Expressao expressao, ArrayList<Comando> comandos) {
        this.expressao = expressao;
        this.comandos = comandos;
    }

    public Expressao getExpressao() {
        return expressao;
    }

    public ArrayList<Comando> getComandos() {
        return comandos;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Repeticao]: {");

        System.out.print(" ".repeat(depth*2));
        expressao.printAtDepth(depth+1);
        System.out.print(" ".repeat(depth*2));

        for (Comando c: comandos) {
            c.printAtDepth(depth+1);
        }

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
