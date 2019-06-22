package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoComandoExpressao extends ComandoExpressaoComando {
    private final Expressao expressao;

    public ExpressaoComandoExpressao(Expressao expressao) {
        this.expressao = expressao;
    }

    public Expressao getExpressao() {
        return expressao;
    }

    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[ExpressaoComandoExpressao]: {");

        System.out.print(" ".repeat(depth*2));
        expressao.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
