package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class MembroStaticVariavel extends Membro{
    private final Variavel variavel;

    public MembroStaticVariavel(Variavel variavel) {
        this.variavel = variavel;
    }

    public Variavel getVariavel() {
        return variavel;
    }

    @Override
    public void printAtDepth(int depth) {

        System.out.print(" ".repeat(depth*2));
        System.out.println("[MembroStatict]: {");
        System.out.print(" ".repeat(depth*2));
        variavel.printAtDepth(depth+1);
        System.out.print(" ".repeat(depth*2));
        System.out.println("}");

    }
}
