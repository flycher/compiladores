package br.ufc.quixada.qxd0025.chulapa_compiler;

import br.ufc.quixada.qxd0025.chulapa_compiler.ast.*;
import br.ufc.quixada.qxd0025.chulapa_compiler.frontend.QPPLexer;
import br.ufc.quixada.qxd0025.chulapa_compiler.frontend.QPPParser;
import br.ufc.quixada.qxd0025.chulapa_compiler.frontend.QPPTranslator;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        try {

            QPPLexer lexer = new QPPLexer(CharStreams.fromFileName("/home/flycher/Dropbox/VScode/compiladores/QPP/test_files/test1.qpp"));
            QPPParser parser = new QPPParser(new CommonTokenStream(lexer));

            QPPParser.ProgramaContext ctx = parser.programa();

            System.out.println("Parser executado.");

            QPPTranslator translator = new QPPTranslator();
            Programa programa = (Programa) translator.visit(ctx);
            programa.printAtDepth(0);

            System.out.println("Tradução AST executada.");

//            QPPChecker checker = new QPPChecker(prog);
//            SymbolTable symbols = checker.check();
//            System.out.println("Tabela de simbolos criada.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
