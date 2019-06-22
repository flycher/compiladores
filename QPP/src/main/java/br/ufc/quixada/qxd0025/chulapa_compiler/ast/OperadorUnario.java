package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class OperadorUnario extends TreeNode {
    private final OperadorUnarioEnum operador;

    public OperadorUnario(OperadorUnarioEnum operador) {
        this.operador = operador;
    }

    public OperadorUnarioEnum getOperador() {
        return operador;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.print("[OperadorUnario]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.print("operador: " + operador);
        System.out.print(" ".repeat(depth * 2));

        System.out.print("}");
    }
}
