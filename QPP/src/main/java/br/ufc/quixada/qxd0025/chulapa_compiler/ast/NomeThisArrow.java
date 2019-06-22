package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class NomeThisArrow extends Nome {
    private final NomeLista nomeLista;

    public NomeThisArrow(NomeLista nomeLista) {
        this.nomeLista = nomeLista;
    }

    public NomeLista getNomeLista() {
        return nomeLista;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.print("[NomeThisArrow]: {");

        System.out.print(" ".repeat(depth * 2));

        nomeLista.printAtDepth(depth + 1);

        System.out.print(" ".repeat(depth * 2));
        System.out.print("}");
    }
}
