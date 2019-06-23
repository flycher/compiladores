package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

import java.util.ArrayList;

public class DefinicaoEstrutura extends Definicao {

    private final String structid;
    private final ArrayList<EstruturaAcesso> acessos;

    public DefinicaoEstrutura(String structid, ArrayList<EstruturaAcesso> acessos) {
        this.structid = structid;
        this.acessos = acessos;
    }

    public String getStructid() {
        return structid;
    }

    public ArrayList<EstruturaAcesso> getAcessos() {
        return acessos;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.println("[Estrutura]: {");

        System.out.print(" ".repeat(depth * 2));
        for (EstruturaAcesso a : acessos) {
            a.printAtDepth(depth + 1);
        }

        System.out.print(" ".repeat(depth * 2));
        System.out.println("}");

    }
}
