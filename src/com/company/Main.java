package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Counter myCounter = new Counter("MyCounter");
        myCounter.increment();
        System.out.println(myCounter.getCurrentValue());
        myCounter.increment();
        System.out.println(myCounter.getCurrentValue());
    }
}
