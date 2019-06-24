package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

public class ErroSemantico {

    private int linha;
    private String mensagem;

    public ErroSemantico(int linha, String mensagem) {
        this.linha = linha;
        this.mensagem = mensagem;
    }

    public ErroSemantico(int linha) {
        this.linha = linha;
        this.mensagem = "";
    }

    public ErroSemantico(String mensagem) {
        this.mensagem = mensagem;
        this.linha = -1;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "[Erro: " +
                "linha " + linha +
                ": " + mensagem + "]";
    }
}
