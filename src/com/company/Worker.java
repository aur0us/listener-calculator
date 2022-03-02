package com.company;

import calculator.CalculatorBaseListener;
import calculator.CalculatorParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class Worker extends CalculatorBaseListener {
        Stack<Float> numStack = new Stack<Float>();
        @Override
        public void enterProg (CalculatorParser.ProgContext ctx){
                System.out.println("Entering the program");
        }

        @Override
        public void exitProg (CalculatorParser.ProgContext ctx){
                System.out.println("The result is " + numStack.pop());
        }

        @Override
        public void enterStat (CalculatorParser.StatContext ctx){

        }

        @Override
        public void exitStat (CalculatorParser.StatContext ctx){

        }

        @Override
        public void enterAdd (CalculatorParser.AddContext ctx){
        }

        @Override
        public void exitAdd (CalculatorParser.AddContext ctx){
                float op1 = numStack.pop();
                float op2 = numStack.pop();
                numStack.push(op1 + op2);
        }

        @Override
        public void enterSub (CalculatorParser.SubContext ctx){

        }

        @Override
        public void exitSub (CalculatorParser.SubContext ctx){
                float op1 = numStack.pop();
                float op2 = numStack.pop();
                numStack.push(op2 - op1);
        }

        @Override
        public void enterDiv (CalculatorParser.DivContext ctx){

        }

        @Override
        public void exitDiv (CalculatorParser.DivContext ctx){

        }

        @Override
        public void enterMul (CalculatorParser.MulContext ctx){

        }

        @Override
        public void exitMul (CalculatorParser.MulContext ctx){

        }

        @Override
        public void enterMod (CalculatorParser.ModContext ctx){

        }

        @Override
        public void exitMod (CalculatorParser.ModContext ctx){

        }

        @Override
        public void enterOperand (CalculatorParser.OperandContext ctx){
                float op = Float.parseFloat(ctx.getText());
                numStack.push(op);
        }

        @Override
        public void exitOperand (CalculatorParser.OperandContext ctx){

        }

        @Override
        public void visitTerminal (TerminalNode terminalNode){

        }

        @Override
        public void visitErrorNode (ErrorNode errorNode){

        }

        @Override
        public void enterEveryRule (ParserRuleContext parserRuleContext){

        }

        @Override
        public void exitEveryRule (ParserRuleContext parserRuleContext){

        }
    }