package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class Tipo extends TreeNode {

    private final TipoEnum tipo;
    private final QualificadorEnum qualificador;
    private final DecoradorEnum decorador;
    private TipoNome tipoNome;

    public Tipo(TipoEnum tipo, TipoNome tipoNome, QualificadorEnum qualificador, DecoradorEnum decorador) {
        this.tipo = tipo;
        this.tipoNome = tipoNome;
        this.qualificador = qualificador;
        this.decorador = decorador;
    }

    public Tipo(TipoEnum tipo, QualificadorEnum qualificador, DecoradorEnum decorador) {
        this.tipo = tipo;
        this.tipoNome = null;
        this.qualificador = qualificador;
        this.decorador = decorador;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public QualificadorEnum getQualificador() {
        return qualificador;
    }

    public TipoNome getTipoNome() {
        return tipoNome;
    }

    public DecoradorEnum getDecorador() {
        return decorador;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[Tipo]: {");

        System.out.print(" ".repeat(depth * 4));
        System.out.println(qualificador + " " + tipo + " " + decorador);
        if (tipoNome != null)
            tipoNome.printAtDepth(depth + 1);

        System.out.print(" ".repeat(depth * 3));
        System.out.println("}");

    }

}
