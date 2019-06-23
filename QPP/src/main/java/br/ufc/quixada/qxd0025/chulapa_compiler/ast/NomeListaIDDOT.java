package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class NomeListaIDDOT extends NomeLista {
    private final String id;
    private final NomeLista nomeLista;
    private final Nome_Lista_ nomeLista_;

    public NomeListaIDDOT(String id, NomeLista nomeLista, Nome_Lista_ nomeLista_) {
        this.id = id;
        this.nomeLista = nomeLista;
        this.nomeLista_ = nomeLista_;
    }

    public String getId() {
        return id;
    }

    public NomeLista getNomeLista() {
        return nomeLista;
    }

    public Nome_Lista_ getNomeLista_() {
        return nomeLista_;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.print("[NomeListaIDDOT]: {");

        System.out.print(" ".repeat(depth * 2));

        System.out.print("ID: " + id);
        System.out.print(" ".repeat(depth * 2));
        System.out.print("NomeLista:");
        nomeLista.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth * 2));
        System.out.print("NomeLista_:");
        nomeLista_.printAtDepth(depth + 1);
        System.out.print(" ".repeat(depth * 2));

        System.out.print("}");
    }
}
