package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ComandoBreak extends Comando {
    private final int linha;

    public ComandoBreak(int linha) {
        this.linha = linha;
    }

    public int getLinha() {
        return linha;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[Break]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.print(linha);

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");
    }
}
