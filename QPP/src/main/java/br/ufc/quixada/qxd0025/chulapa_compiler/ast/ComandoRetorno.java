package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ComandoRetorno extends Comando{
    private final ComandoExpressaoComando comandoExpressaoComando;

    public ComandoRetorno(ComandoExpressaoComando comandoExpressaoComando) {
        this.comandoExpressaoComando = comandoExpressaoComando;
    }

    public ComandoExpressaoComando getComandoExpressaoComando() {
        return comandoExpressaoComando;
    }

    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Retorno]: {");

        System.out.print(" ".repeat(depth*2));
        comandoExpressaoComando.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
