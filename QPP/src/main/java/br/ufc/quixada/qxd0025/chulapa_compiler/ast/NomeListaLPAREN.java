package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class NomeListaLPAREN extends Nome_Lista_ {
    private final  ParametrosReais parametrosReais;
    private final NomeLista nomeLista;
    private final Nome_Lista_ nome_lista_;

    public NomeListaLPAREN(ParametrosReais parametrosReais, NomeLista nomeLista, Nome_Lista_ nome_lista_) {
        this.parametrosReais = parametrosReais;
        this.nomeLista = nomeLista;
        this.nome_lista_ = nome_lista_;
    }

    public ParametrosReais getParametrosReais() {
        return parametrosReais;
    }

    public NomeLista getNomeLista() {
        return nomeLista;
    }

    public Nome_Lista_ getNome_lista_() {
        return nome_lista_;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[NomeListaLPAREN]: {");

        System.out.print(" ".repeat(depth*2));
        parametrosReais.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        nomeLista.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        nome_lista_.printAtDepth(depth+1);

        System.out.print(" ".repeat(depth*2));
        System.out.println("}");
    }
}
