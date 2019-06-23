package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class DefinicaoFuncao extends Definicao {

    private final Tipo tipo;
    private final String funcid;
    private final ParametrosFormais parametrosFormais;
    private final Bloco bloco;
    private final int linha;

    public DefinicaoFuncao(Tipo tipo, String funcid, ParametrosFormais parametrosFormais, int linha) {
        this.tipo = tipo;
        this.funcid = funcid;
        this.parametrosFormais = parametrosFormais;
        this.bloco = new Bloco();
        this.linha = linha;
    }

    public DefinicaoFuncao(Tipo tipo, String funcid, ParametrosFormais parametrosFormais, Bloco bloco, int linha) {
        this.tipo = tipo;
        this.funcid = funcid;
        this.parametrosFormais = parametrosFormais;
        this.bloco = bloco;
        this.linha = linha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getFuncid() {
        return funcid;
    }

    public ParametrosFormais getParametrosFormais() {
        return parametrosFormais;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public int getLinha() {
        return linha;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[Definicão Funçao]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.println("Nome: " + funcid);

        tipo.printAtDepth(depth + 1);

        parametrosFormais.printAtDepth(depth + 1);

        bloco.printAtDepth(depth + 1);

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");
    }
}
