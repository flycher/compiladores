package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class OperadorBinario extends TreeNode {
    private final OperadorBinarioEnum operador;

    public OperadorBinario(OperadorBinarioEnum operador) {
        this.operador = operador;
    }

    public OperadorBinarioEnum getOperador() {
        return operador;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.print("[OperadorBinario]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.print("operador: " + operador);
        System.out.print(" ".repeat(depth * 2));

        System.out.print("}");
    }
}
