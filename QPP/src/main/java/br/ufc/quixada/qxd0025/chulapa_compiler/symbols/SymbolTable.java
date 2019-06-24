package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private Map<String, Symbol> simbolos;
    private SymbolTable pai;
    private long lastResult = 0;

    public SymbolTable() {
        simbolos = new HashMap<>();
        pai = null;
    }

    public SymbolTable(SymbolTable p) {
        simbolos = new HashMap<>();
        pai = null;
        this.pai = p;
    }


    public boolean addSymbol(Symbol s, ErroSemantico erro) {
        String id = s.getId();
        if (!simbolos.containsKey(id)) {
            simbolos.put(id, s);
            System.err.println("Adicionado " + id);
            return true;
        }

        Symbol other = simbolos.get(id);
        if (s.getCategory() == SymbolCategory.ATRIBUTE || s.getCategory() == SymbolCategory.VARIABLE ||
                other.getCategory() == SymbolCategory.ATRIBUTE || other.getCategory() == SymbolCategory.VARIABLE) {
            erro.setMensagem("Id [" + s.getId() + "] ja esta sendo usado (l." + other.getLinha() + ")");
            return false;
        }

        Assinatura novoP = s.getParametros().get(0);
        if (other.addParametros(novoP, erro)) {
            return true;
        } else {
            erro.setMensagem("Ja existe funcao/metodo com o id [" + id + "] e com a mesma assinatura (l." + other.getLinha() + ")");
            return false;
        }
    }


    public Symbol getSymbol(String id, ErroSemantico erro) {
        if (!simbolos.containsKey(id)) {
            erro.setMensagem("simbolo Id [" + id + "] nao encontrado");
            return null;
        } else {
            return simbolos.get(id);
        }
    }

    public Symbol getSymbolFunc(String id, Assinatura parametros, SymbolCategory categoria, ErroSemantico erro) {
        if (!simbolos.containsKey(id)) {
            erro.setMensagem("comando [" + id + "] nao encontrado");
            return null;
        } else {
            Symbol s = simbolos.get(id);
            if (s.getCategory() == SymbolCategory.ATRIBUTE || s.getCategory() == SymbolCategory.VARIABLE) {
                erro.setMensagem("comando [" + id + "] nao e uma funcao/metodo");
                return null;
            }
            if (!s.buscaParametros(parametros)) {
                erro.setMensagem("comando [" + id + "] nao possui a assinatura T:" + parametros);
                return null;
            }
            Symbol s2 = new Symbol(s, parametros);
            return s2;
        }
    }

    public Symbol getSymbolVar(String id, Assinatura parametros, SymbolCategory categoria, ErroSemantico erro) {
        if (!simbolos.containsKey(id)) {
            erro.setMensagem("comando [" + id + "] nao encontrado");
            return null;
        } else {
            Symbol s = simbolos.get(id);
            if (s.getCategory() == SymbolCategory.FUNCTION || s.getCategory() == SymbolCategory.METOD) {
                erro.setMensagem("var [" + id + "] nao e uma variavel/atributo");
                return null;
            }

            Symbol s2 = new Symbol(s);
            return s2;
        }
    }

    public Symbol getSymbol(String id, SymbolCategory categoria, ErroSemantico erro) {
        if (!simbolos.containsKey(id)) {
            erro.setMensagem("simbolo id[" + id + "] n ecsiste!");
            return null;//simbolo n existe
        } else {
            Symbol s = simbolos.get(id);

            if (s.getCategory() == categoria) return s;
            else return null;
        }
    }

    public SymbolTable getPai() {
        return pai;
    }


}
