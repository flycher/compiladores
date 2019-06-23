package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class Parametro extends TreeNode {

    private Tipo tipo;
    private String id;

    public Parametro(Tipo tipo, String id) {
        this.tipo = tipo;
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));

        System.out.println(tipo.getQualificador() + " " + tipo.getTipo() + " " + id  + " " + tipo.getDecorador());

        System.out.print(" ".repeat(depth*2));
    }
}
