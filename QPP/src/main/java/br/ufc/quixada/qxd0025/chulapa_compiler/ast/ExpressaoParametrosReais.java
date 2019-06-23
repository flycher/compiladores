package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoParametrosReais extends Expressao {
    private final Nome nome;
    private final ParametrosReais parametrosReais;

    public ExpressaoParametrosReais(Nome nome, ParametrosReais parametrosReais) {
        this.nome = nome;
        this.parametrosReais = parametrosReais;
    }

    public Nome getNome() {
        return nome;
    }

    public ParametrosReais getParametrosReais() {
        return parametrosReais;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[ExpressaoParametrosReais]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.print("Nome:");
        nome.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth * 2));
        System.out.print("(");
        System.out.print(" ".repeat(depth * 2));
        System.out.print("ParametrosReais:");
        parametrosReais.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth * 2));
        System.out.print(")");
        System.out.print(" ".repeat(depth * 2));

        System.out.println("}");
    }
}
