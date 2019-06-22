package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class ParametrosFormais extends TreeNode{

    private final ArrayList<Tipo> parametros;

    public ParametrosFormais(ArrayList<Tipo> parameters) {
        this.parametros = parameters;
    }

    public ParametrosFormais() {
        this.parametros = new ArrayList<Tipo>();
    }


    public ArrayList<Tipo> getParametros() {
        return parametros;
    }


    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Parametros Formais]: {");

        for(Tipo p : parametros) {
            System.out.print(" ".repeat(depth*2));
            System.out.println("Parâmetros:");
            p.printAtDepth(depth+1);
        }

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }

}
