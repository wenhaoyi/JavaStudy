package com.stackStudy;

import java.util.Stack;

//https://www.geeksforgeeks.org/stack-class-in-java/
public class StackDemo02 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        System.out.println("Initial Stack: "+stack);
        System.out.println("The element at the top of the stack is: "+stack.peek());
        System.out.println("Final stack: "+stack);
    }

}
