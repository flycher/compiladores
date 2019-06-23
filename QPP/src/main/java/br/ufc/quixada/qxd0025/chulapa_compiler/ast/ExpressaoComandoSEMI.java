package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class ExpressaoComandoSEMI extends ComandoExpressaoComando {

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[ExpressaoComandoSEMI]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");
    }
}
