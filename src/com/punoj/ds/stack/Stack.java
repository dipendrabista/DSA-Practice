package com.punoj.ds.stack;

public class Stack {
    private double container[] = {};
    //not removing actual data in array just changing pointer
    private int top;
    private int maxSize;

    public Stack(int size) {
        this.container = new double[size];
        top = -1;
        maxSize = size;

    }

    public void push(double input) {
        if (!isFull()) {
            top++;
            container[top] = input;
        } else {

            System.out.println("Stack is Full");
        }
    }

    public double pop() {
        if (!isEmpty()) {
            int old_top = top;
            top--;
            return container[old_top];
        } else {
            System.out.println("Stack is already empty !!");
            return -1;
        }
    }

    public double peek() {
        return container[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
