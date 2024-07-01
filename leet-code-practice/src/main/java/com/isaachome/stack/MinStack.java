package com.isaachome.stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> min;
    public MinStack() {
        s= new Stack<>();
        min= new Stack<>();
    }

    public void push(int val) {
        s.push(val);
//        int minValue = min.isEmpty() || min.peek() < val ? min.peek() : val;
         int minValue =Math.min(val, min.isEmpty() ? val : min.peek());
        min.push(minValue);
    }

    public void pop() {
        s.pop();
        min.pop();
    }

    public int top() {
        return  s.isEmpty() ? -1 : s.peek();
    }

    public int getMin() {
        return min.isEmpty() ? -1 : min.peek();
    }
    public static void main(String[] args) {

    }
}
