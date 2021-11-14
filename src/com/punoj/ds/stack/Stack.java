package com.punoj.ds.stack;

import java.lang.reflect.Array;

public class Stack<T> {
    private T stackContainer[];
    //not removing actual data in array just changing pointer
    private int top;
    private int maxSize;

    public Stack(Class<T> c, int size) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked") final T[] a = (T[]) Array.newInstance(c, size);
        this.stackContainer = a;
        top = -1;
        maxSize = size;
    }

    public void push(T input) {
        if (!isFull()) {
            top++;
            stackContainer[top] = input;
        } else {

            System.out.println("Stack is Full");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            int old_top = top;
            top--;
            return stackContainer[old_top];
        } else {
            System.out.println("Stack is already empty !!");
        }
        return null;
    }

    public T peek() {
        return stackContainer[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
