package com.arch.desc.lang;

import com.arch.desc.lang.generator.puml.CPUMLSequenceGenerator;
import com.arch.desc.lang.grammar.ADLGrammarLexer;
import com.arch.desc.lang.grammar.ADLGrammarParser;
import com.arch.desc.lang.compiler.CCodeCompiler;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ADLGrammarLexer lexer = new ADLGrammarLexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ADLGrammarParser parser = new ADLGrammarParser(tokens);
        CCodeCompiler codeParser = new CCodeCompiler(parser.code());
        CPUMLSequenceGenerator generator = new CPUMLSequenceGenerator(codeParser.getGlobalNamespace());
        System.out.println(generator.getPUML());
    }
}
