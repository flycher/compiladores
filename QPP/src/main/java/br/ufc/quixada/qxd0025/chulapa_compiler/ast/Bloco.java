package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class Bloco extends Comando {

    private final ArrayList<Variavel> variaveis;
    private final ArrayList<Comando> comandos;

    public Bloco(ArrayList<Variavel> variaveis, ArrayList<Comando> comandos) {
        this.variaveis = variaveis;
        this.comandos = comandos;
    }

    public Bloco() {
        this.variaveis = new ArrayList<Variavel>();
        this.comandos = new ArrayList<Comando>();
    }

    public ArrayList<Variavel> getVariaveis() {
        return variaveis;
    }

    public ArrayList<Comando> getComandos() {
        return comandos;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[Bloco]: {");

        System.out.print(" ".repeat(depth * 2));
        for (Variavel v : variaveis) {
            if(v != null)
                v.printAtDepth(depth + 1);
        }
        System.out.print(" ".repeat(depth * 2));

        for (Comando c : comandos) {
            c.printAtDepth(depth + 1);
        }

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");
    }

}
