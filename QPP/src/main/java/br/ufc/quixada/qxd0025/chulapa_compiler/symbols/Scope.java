package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import java.util.*;

public class Scope implements Iterable<Scope> {
    private Map<Symbol, SymbolType> declaredSymbols = new HashMap<>();
    private List<Scope> nestedScopes = new ArrayList<>();

    private Scope parent;

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public boolean bind(Symbol s, SymbolType t) {
        return declaredSymbols.putIfAbsent(s, t) == null;
    }

    public boolean contains(Symbol s) {
        return declaredSymbols.containsKey(s);
    }

    public Optional<SymbolType> getBinding(Symbol s) {
        return Optional.ofNullable(declaredSymbols.get(s));
    }

    public Scope createNestedScope() {
        Scope nextScope = new Scope(this);
        nestedScopes.add(nextScope);

        return nextScope;
    }

    @Override
    public Iterator<Scope> iterator() {
        return nestedScopes.iterator();
    }

    public Scope getParentScope() {
        return parent;
    }
}
