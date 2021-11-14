package com.company;

/**
 * abstract Data type:hidden implementation and container for datatype
 * LinkedList ,Stack etc are Abstract DataType like this Counter class
 */
public class Counter {
    private int value = 0;
    private String name = null;

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        value++;
    }

    public int getCurrentValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " : " + value;
    }
}
