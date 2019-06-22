package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoOperadorBinario extends Expressao {
    private final Expressao leftExpressao;
    private final OperadorBinario operadorBinario;
    private final Expressao rightExpressao;

    public ExpressaoOperadorBinario(Expressao leftExpressao, OperadorBinario operadorBinario, Expressao rightExpressao) {
        this.leftExpressao = leftExpressao;
        this.operadorBinario = operadorBinario;
        this.rightExpressao = rightExpressao;
    }

    public Expressao getLeftExpressao() {
        return leftExpressao;
    }

    public OperadorBinario getOperadorBinario() {
        return operadorBinario;
    }

    public Expressao getRightExpressao() {
        return rightExpressao;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[ExpressaoOperadorBinario]: {");

        System.out.print(" ".repeat(depth*2));
        System.out.print("Expressao:");
        leftExpressao.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth*2));
        System.out.print(operadorBinario.getOperador());
        System.out.print(" ".repeat(depth*2));
        System.out.print("Expressao:");
        rightExpressao.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth*2));

        System.out.println("}");
    }
}
