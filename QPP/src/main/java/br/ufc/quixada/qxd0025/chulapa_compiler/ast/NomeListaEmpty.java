package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class NomeListaEmpty extends Nome_Lista_ {

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");
    }
}
