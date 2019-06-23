package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class MembroStaticMetodo extends Membro {
    private final DefinicaoFuncao metodo;
    private final QualificadorEnum qualificador;

    public MembroStaticMetodo(DefinicaoFuncao metodo, QualificadorEnum qualificador) {
        this.metodo = metodo;
        this.qualificador = qualificador;
    }

    public DefinicaoFuncao getMetodo() {
        return metodo;
    }

    public QualificadorEnum getQualificador() {
        return qualificador;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[MetodoStact]: {");

        System.out.print(" ".repeat(depth*2));
        metodo.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        System.out.println(qualificador);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
