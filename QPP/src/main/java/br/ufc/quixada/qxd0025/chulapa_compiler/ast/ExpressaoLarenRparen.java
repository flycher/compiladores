package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoLarenRparen extends Expressao {
    private final Expressao expressao;

    public ExpressaoLarenRparen(Expressao expressao) {
        this.expressao = expressao;
    }

    public Expressao getExpressao() {
        return expressao;
    }

    @Override
    public void printAtDepth(int depth){
        System.out.print(" ".repeat(depth*2));
        System.out.println("[ExpressaoLarenRparen]: {");

        System.out.print(" ".repeat(depth*2));
        System.out.print("(");
        System.out.print(" ".repeat(depth*2));
        System.out.print("Expressao:");
        expressao.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth*2));
        System.out.print(")");
        System.out.print(" ".repeat(depth*2));

        System.out.println("}");
    }
}