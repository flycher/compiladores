package br.ufc.quixada.qxd0025.chulapa_compiler.symbols;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.Tipo;
import br.ufc.quixada.qxd0025.chulapa_compiler.ast.TipoEnum;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;

public class Symbol {

    private final String id;

    private Tipo tipo;
    private final int linha;


    private SymbolCategoty categoty;
    private ArrayList<Assinatura> parametros;



//    private static Map<String, Symbol> symbols = new IdentityHashMap<>();
//    private final String identifier;
//
//    private Symbol(String id) {
//        identifier = id;
//    }
//
//    public static Symbol getSymbolFor(String identifier) {
//        String id = identifier.intern();
//        Symbol s = symbols.get(id);
//
//        if (s == null) {
//            s = new Symbol(id.intern());
//            symbols.put(id, s);
//        }
//
//        return s;
//    }
//
//    @Override
//    public String toString() {
//        return identifier;
//    }

}
