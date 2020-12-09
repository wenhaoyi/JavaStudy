package com.stackStudy;

import java.util.Stack;

//https://www.geeksforgeeks.org/stack-class-in-java/
public class StackDemo03 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);

        System.out.println("Initial Stack: "+stack);
        System.out.println("Popped element: "+stack.pop());
        System.out.println("Popped element: "+stack.pop());
        System.out.println("The element at the top of the stack is: "+stack.peek());
        System.out.println("Final stack: "+stack);
    }

}
