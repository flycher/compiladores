package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoNome extends Expressao {
    private final Nome nome;

    public ExpressaoNome(Nome nome) {
        this.nome = nome;
    }

    public Nome getNome() {
        return nome;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[ExpressaoNome]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.print("Nome:");
        nome.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth * 2));

        System.out.println("}");
    }
}
