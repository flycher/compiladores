package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoTipo extends Expressao {
    private final ExpressaoTipoEnum tipo;

    public ExpressaoTipo(ExpressaoTipoEnum tipo) {
        this.tipo = tipo;
    }

    public ExpressaoTipoEnum getTipo() {
        return tipo;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[ExpressaoTipos]: {");

        System.out.print(" ".repeat(depth*2));
        System.out.print("ExpressaoTipo: " + tipo);
        System.out.print(" ".repeat(depth*2));

        System.out.println("}");
    }
}
