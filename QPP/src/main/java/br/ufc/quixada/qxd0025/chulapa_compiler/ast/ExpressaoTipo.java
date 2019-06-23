package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoTipo extends Expressao {
    private final ExpressaoTipoEnum tipo;
    private final String value;
    private final int line;

    public ExpressaoTipo(ExpressaoTipoEnum tipo, String value, int line) {
        this.tipo = tipo;
        this.value = value;
        this.line = line;
    }

    public ExpressaoTipoEnum getTipo() {
        return tipo;
    }

    public String getValue() {
        return value;
    }

    public int getLine() {
        return line;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[ExpressaoTipos]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.print("ExpressaoTipo: " + tipo + "  Valor: " + value);
        System.out.print(" ".repeat(depth * 2));

        System.out.println("}");
    }
}
