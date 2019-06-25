package br.ufc.quixada.qxd0025.chulapa_compiler.backend;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.*;
import br.ufc.quixada.qxd0025.chulapa_compiler.symbols.SymbolTable;

public class IntermediateCode {
    private SymbolTable symbolTable;
    private int counterLabels = 0;
    private int counterVariaveis = 0;

    public IntermediateCode(SymbolTable symbolTable){
        this.symbolTable = symbolTable;
    }

    public String gerar(Programa programa){
        String resultado = "";

        for(Definicao d : programa.getStatements()){
            resultado += gerar(d);
        }

        return resultado;
    }

    public String gerar(Definicao t){
        if(t instanceof DefinicaoFuncao){
            DefinicaoFuncao no = (DefinicaoFuncao) t;

            return "label " + no.getFuncid() + ":\n" + gerar(no.getBloco());
        }

        return "";
    }

    public String gerar(Bloco b){
        String resultado = "";

        for(Variavel v : b.getVariaveis()){
            resultado += gerar(v) + "\n";
        }

        for(Comando c : b.getComandos()){
            resultado += gerar(c) + "\n";
        }

        return resultado;
    }

    public String gerar(Variavel v) {
        String stm = "";
        if (v instanceof VariavelCriacao) {
            VariavelCriacao no = (VariavelCriacao) v;

            stm = no.getVarid();
        }

        return stm;
    }

    public String gerar(Comando c){
        String stm = "";

        if(c instanceof ComandoAtribuicao){
            ComandoAtribuicao no = (ComandoAtribuicao) c;

            stm += no.getNome();
            stm += " = ";
            stm += gerar(no.getExpressao());
        }else if(c instanceof ComandoRetorno){
            ComandoRetorno no = (ComandoRetorno) c;

            stm += "return ";
            stm += gerar(no.getComandoExpressaoComando().getExpressao());
        }

        return stm;
    }

    public String gerar(Expressao e){
        String stm = "";

        if(e instanceof ExpressaoTipo){
            ExpressaoTipo no = (ExpressaoTipo) e;

            stm += no.getValue();
        }else if(e instanceof ExpressaoOperadorBinario){
            ExpressaoOperadorBinario no = (ExpressaoOperadorBinario) e;

            stm += gerar(no.getLeftExpressao()) + " " + no.getOperadorBinario().toString() + " " + gerar(no.getRightExpressao());
        }else if(e instanceof ExpressaoNome){
            ExpressaoNome no = (ExpressaoNome) e;

            stm += gerar(no.getNome());
        }

        return stm;
    }

    public String gerar(Nome n) {
        String stm = "";

        if (n instanceof NomeNomeLista) {
            NomeNomeLista no = (NomeNomeLista) n;

            stm += gerar(no.getNomeLista());
        }

        return stm;
    }

    public String gerar(NomeLista n) {
        String stm = "";

        if(n instanceof NomeListaID) {
            NomeListaID no = (NomeListaID) n;

            stm += no.getId();
        }

        return stm;
    }

}
