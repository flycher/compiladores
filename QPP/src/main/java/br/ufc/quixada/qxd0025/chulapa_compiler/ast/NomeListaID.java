package br.ufc.quixada.qxd0025.chulapa_compiler.ast;


public class NomeListaID extends NomeLista {
    private final String id;
    private final NomeListaLPAREN nomeLista_;

    public NomeListaID(String id, NomeListaLPAREN nomeLista_) {
        this.id = id;
        this.nomeLista_ = nomeLista_;
    }

    public String getId() {
        return id;
    }

    public NomeListaLPAREN getNomeLista_() {
        return nomeLista_;
    }

    @Override
    public void printAtDepth(int depth) {

        System.out.print(" ".repeat(depth * 2));
        System.out.print("[NomeListaIDDOT]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.print("ID: " + id);
        System.out.print(" ".repeat(depth * 2));
        System.out.print("NomeLista_:");
        nomeLista_.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth * 2));

        System.out.print("}");
    }
}
