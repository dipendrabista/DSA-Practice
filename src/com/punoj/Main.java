package com.punoj;

import com.punoj.ds.stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(Character.class, 5);
        stack.push('H');
        stack.push('E');
        stack.push('L');
        stack.push('L');
        stack.push('0');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
