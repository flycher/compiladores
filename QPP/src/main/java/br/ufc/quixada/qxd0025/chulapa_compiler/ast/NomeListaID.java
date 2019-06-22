package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class NomeListaID extends NomeLista_ {
    private final ParamentrosReais paramentrosReais;
    private final  NomeLista nomelista;

    public NomeListaID(ParamentrosReais paramentrosReais, nomeLista nomelista) {
        this.paramentrosReais = paramentrosReais;
        this.nomelista = nomelista;
    }

    public ParamentrosReais getParamentrosReais() {
        return paramentrosReais;
    }

    public nomeLista getNomelista() {
        return nomelista;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[NomeListaID]: {");

        System.out.print(" ".repeat(depth*2));
        paramentrosReais.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        nomelista.printAtDepth(depth+1);
        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
