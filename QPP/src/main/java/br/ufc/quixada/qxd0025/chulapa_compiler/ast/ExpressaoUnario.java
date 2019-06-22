package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoUnario extends Expressao{
    private final OperadorUnario operadorUnario;
    private final Expressao expressao;

    public ExpressaoUnario(OperadorUnario operadorUnario, Expressao expressao) {
        this.operadorUnario = operadorUnario;
        this.expressao = expressao;
    }

    public OperadorUnario getOperadorUnario() {
        return operadorUnario;
    }

    public Expressao getExpressao() {
        return expressao;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Expressao]: {");

        System.out.print(" ".repeat(depth*2));
        System.out.print(operadorUnario.getOperador());
        System.out.print(" ".repeat(depth*2));
        System.out.print("Expressao:");
        expressao.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth*2));

        System.out.println("}");
    }
}
