package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class NomeListaLPAREN extends TreeNode {
    private final  ParametrosReais parametrosReais;
    private final NomeLista nomeLista;
    private final NomeListaLPAREN nomeListaLPAREN;

    public NomeListaLPAREN(ParametrosReais parametrosReais, NomeLista nomeLista, NomeListaLPAREN nomeListaLPAREN) {
        this.parametrosReais = parametrosReais;
        this.nomeLista = nomeLista;
        this.nomeListaLPAREN = nomeListaLPAREN;
    }

    public ParametrosReais getParametrosReais() {
        return parametrosReais;
    }

    public NomeLista getNomeLista() {
        return nomeLista;
    }

    public NomeListaLPAREN getNomeListaLPAREN() {
        return nomeListaLPAREN;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[NomeListaLPAREN]: {");

        System.out.print(" ".repeat(depth*2));
        parametrosReais.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        nomeLista.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        nomeListaLPAREN.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
