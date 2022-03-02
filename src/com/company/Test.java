package com.company;

import calculator.CalculatorLexer;
import calculator.CalculatorListener;
import calculator.CalculatorParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;

public class Test {

    public static void main(String[] args){
        try {
            ANTLRInputStream input = new ANTLRInputStream(System.in);
            CalculatorLexer lexer = new CalculatorLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokens);
            ParseTree tree = parser.prog(); // start at the root node
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new Worker(), tree);
        } catch(IOException ioe)
        {
            System.out.println("Unable to access input stream");
        }
    }
}
