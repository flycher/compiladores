package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ComandoAtribuicao extends Comando {
    private final String nome;
    private final Expressao expressao;

    public ComandoAtribuicao(String nome, Expressao expressao) {
        this.nome = nome;
        this.expressao = expressao;
    }

    public String getNome() {
        return nome;
    }

    public Expressao getExpressao() {
        return expressao;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Atribuição]: {");

        System.out.print(" ".repeat(depth*2));
        System.out.print(nome);

        System.out.print(" ".repeat(depth*2));
        expressao.printAtDepth(depth+1);


        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
