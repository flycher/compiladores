package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import java.util.*;

public class SymbolTable {

    //TODO implementar reconhecimento de todos os tipos
    private Set<Symbol> variables = new HashSet<>();
    private Map<Symbol, List<Symbol>> functions = new HashMap<>();
    private long lastResult = 0;

    public Optional<SymbolType> getSymbolType(Symbol s) {
        if (variables.contains(s)) {
            return Optional.of(SymbolType.VARIABLE);
        } else if (functions.containsKey(s)) {
            return Optional.of(SymbolType.FUNCTION);
        } else {
            return Optional.empty();
        }
    }

    public boolean ensureIsVariable(Symbol v) {
        if (!functions.containsKey(v)) {
            variables.add(v);

            return true;
        }

        return false;
    }

    public void newResult() {
        ++this.lastResult;
    }

    public boolean ensureIsNewFunction(Symbol f, ArrayList<Symbol> parameters) {
        if (!(variables.contains(f) || functions.containsKey(f))) {
            functions.put(f, parameters);

            return true;
        }

        return false;
    }

    public int countFunctionArguments(Symbol f) {
        if (!functions.containsKey(f)) {
            return -1;
        } else {
            return functions.get(f).size();
        }
    }

    public boolean containsVariable(Symbol v) {
        return variables.contains(v);
    }

    public boolean containsResult(long result) {
        return result <= this.lastResult;
    }

    public boolean containsFunction(Symbol f) {
        return functions.containsKey(f);
    }

}
