package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class MembroVariavel extends Membro {

    private final Variavel variavel;

    public MembroVariavel(Variavel variavel) {
        this.variavel = variavel;
    }


    public Variavel getVariavel() {
        return variavel;
    }

    @Override
    public void printAtDepth(int depth) {

        System.out.print(" ".repeat(depth*2));
        System.out.println("[Atributos]: {");
        System.out.print(" ".repeat(depth*2));
        variavel.printAtDepth(depth+1);
        System.out.print(" ".repeat(depth*2));
        System.out.println("}");

    }
}
