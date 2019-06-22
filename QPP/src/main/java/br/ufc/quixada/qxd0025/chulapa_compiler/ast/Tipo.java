package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class Tipo extends TreeNode {

    private final TipoEnum tipo;
    private final QualificadorEnum qualificador;
    private final DecoradorEnum decorador;

    public Tipo(TipoEnum tipo, QualificadorEnum qualificador, DecoradorEnum decorador) {
        this.tipo = tipo;
        this.qualificador = qualificador;
        this.decorador = decorador;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public QualificadorEnum getQualificador() {
        return qualificador;
    }

    public DecoradorEnum getDecorador() {
        return decorador;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Tipo ]: {");

        System.out.print(" ".repeat(depth*2));
        System.out.println("Tipo: " + tipo + "     Qualificador: " + qualificador + "     Decorador: " + decorador);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");

    }

}
