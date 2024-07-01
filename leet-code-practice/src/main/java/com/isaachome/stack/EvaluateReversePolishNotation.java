package com.isaachome.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evalRPN2(new String[]
                {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a=0, b=0;

        for (String token : tokens) {
            switch (token) {
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a +b);
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a - b);
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a / b);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
    }
    public static int evalRPN2(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a, b;
        for (String token : tokens) {
            if(token.equals("+")){
                stack.add(stack.pop() + stack.pop());
            }else if(token.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a - b);
            }else if(token.equals("*")){
                stack.add(stack.pop() * stack.pop());
            }else if(token.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a / b);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return  stack.pop();
    }
}
