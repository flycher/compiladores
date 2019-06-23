package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class TipoNome extends TreeNode {

    private final TipoNome tipoNome;
    private final String id;

    public TipoNome(TipoNome tipoNome, String id) {
        this.tipoNome = tipoNome;
        this.id = id;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[TipoNome]: {");

        System.out.print(" ".repeat(depth*4));

        if(tipoNome != null) {
            tipoNome.printAtDepth(depth + 1);
            System.out.print("::" + id);
        }
        else
            System.out.println(id);

        System.out.print(" ".repeat(depth*3));
        System.out.println("}");
    }
}
