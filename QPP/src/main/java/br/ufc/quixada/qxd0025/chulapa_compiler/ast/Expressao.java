package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public abstract class Expressao extends TreeNode {
    private int linha;

    public int getLinha() {
        return linha;
    }
}
