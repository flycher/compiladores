package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class ParametrosFormais extends TreeNode {

    private final ArrayList<Parametro> parametros;

    public ParametrosFormais(ArrayList<Parametro> parameters) {
        this.parametros = parameters;
    }

    public ParametrosFormais() {
        this.parametros = new ArrayList<Parametro>();
    }


    public ArrayList<Parametro> getParametros() {
        return parametros;
    }


    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[Parametros Formais]: {");

        for (Parametro p : parametros) {
            System.out.print(" ".repeat(depth * 2));
            p.printAtDepth(depth + 1);
        }

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");
    }

}
