package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class NomeID extends Nome {
    private final String id;
    private final NomeLista nomeLista;

    public NomeID(String id, NomeLista nomeLista) {
        this.id = id;
        this.nomeLista = nomeLista;
    }

    public String getId() {
        return id;
    }

    public NomeLista getNomeLista() {
        return nomeLista;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[NomeID]: {");

        System.out.print(" ".repeat(depth*2));

        nomeLista.printAtDepth(depth + 1);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
