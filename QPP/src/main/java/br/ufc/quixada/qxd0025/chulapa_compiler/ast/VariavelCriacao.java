package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class VariavelCriacao extends Variavel {

    private final Tipo tipo;
    private final String varid;
    private final int linha;

    public VariavelCriacao(Tipo tipo, String varid, int linha) {
        this.tipo = tipo;
        this.varid = varid;
        this.linha = linha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getVarid() {
        return varid;
    }

    public int getLinha() {
        return linha;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[DeclaracaoVariavel ]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.println("Name: " + varid + "     Type: " + tipo);

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");

    }

}
