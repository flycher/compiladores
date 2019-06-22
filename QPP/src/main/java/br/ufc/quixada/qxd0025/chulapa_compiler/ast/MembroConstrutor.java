package br.ufc.quixada.qxd0025.chulapa_compiler.ast;


public class MembroConstrutor extends Membro {

    private final String constid;
    private final ParametrosFormais parametrosFormais;
    private final Bloco bloco;

    public MembroConstrutor(String constid, ParametrosFormais parametrosFormais, Bloco bloco) {
        this.constid = constid;
        this.parametrosFormais = parametrosFormais;
        this.bloco = bloco;
    }

    public MembroConstrutor(String constid, ParametrosFormais parametrosFormais) {
        this.constid = constid;
        this.parametrosFormais = parametrosFormais;
        this.bloco = new Bloco();
    }

    public String getConstid() {
        return constid;
    }

    public ParametrosFormais getParametrosFormais() {
        return parametrosFormais;
    }

    public Bloco getBloco() {
        return bloco;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Construtor]: {");

        System.out.print(" ".repeat(depth*2));
        parametrosFormais.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        bloco.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }

}
