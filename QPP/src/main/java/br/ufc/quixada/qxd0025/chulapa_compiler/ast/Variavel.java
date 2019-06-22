package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class Variavel extends TreeNode {


    private final Tipo tipo;
    private final String varid;
    private final Expressao expressao;
    private final int linha;

    public Variavel(Tipo tipo, String varid, Expressao expressao, int linha) {
        this.tipo = tipo;
        this.varid = varid;
        this.expressao = expressao;
        this.linha = linha;
    }

    public Variavel(Tipo tipo, String varid, int linha) {
        this.tipo = tipo;
        this.varid = varid;
        this.expressao = new Expressao();
        this.linha = linha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getVarid() {
        return varid;
    }

    public Expressao getExpressao() {
        return expressao;
    }

    public int getLinha() {
        return linha;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[DeclaracaoVariavel ]: {");

        System.out.print(" ".repeat(depth*2));
        System.out.println("Name: " + varid + "     Type: " + tipo);

        if(expressao != null){
            System.out.print(" ".repeat(depth*2));
            expressao.printAtDepth(depth+1);
            System.out.println("Expression: ");

        }

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");

    }
}
