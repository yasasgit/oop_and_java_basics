package com.oop_java_a.L902;

public class Calculator {
    //Constructor
    public Calculator() {
        x = 10;
        y = 20;
    }

    //parameterized constructor
    public Calculator(int a, int b) {
        x = a;
        y = b;
    }

    //data
    private int x, y;

    //methods
    public void setValues(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //encapsulation
    //setter and getter functions
    //getter and setter functions
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public float displayAvg() {
        float avg;
        avg = (float) (x + y) / 2;
        return avg;
    }
}
