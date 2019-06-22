package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class ParametrosFormais extends TreeNode{

    private final ArrayList<Variavel> parametros;

    public ParametrosFormais(ArrayList<Variavel> parameters) {
        this.parametros = parameters;
    }

    public ParametrosFormais() {
        this.parametros = new ArrayList<Variavel>();
    }


    public ArrayList<Variavel> getParametros() {
        return parametros;
    }


    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[ParametrosChamados]: {");


        for(Variavel p : parametros) {
            System.out.print(" ".repeat(depth*2));
            System.out.println("Expression Parameters:");
            p.printAtDepth(depth+1);
        }

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }

}
