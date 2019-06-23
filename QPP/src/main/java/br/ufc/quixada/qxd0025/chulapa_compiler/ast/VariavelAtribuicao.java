package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class VariavelAtribuicao extends Variavel {

    private final Tipo tipo;
    private final String varid;
    private final ComandoAtribuicao atribuicao;
    private final int linha;

    public VariavelAtribuicao(Tipo tipo, String varid, ComandoAtribuicao atribuicao, int linha) {
        this.tipo = tipo;
        this.varid = varid;
        this.atribuicao = atribuicao;
        this.linha = linha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getVarid() {
        return varid;
    }

    public ComandoAtribuicao getAtribuicao() {
        return atribuicao;
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

        if (atribuicao != null) {
            System.out.print(" ".repeat(depth * 2));
            atribuicao.printAtDepth(depth + 1);
            System.out.println("Expression: ");

        }

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");

    }

}
