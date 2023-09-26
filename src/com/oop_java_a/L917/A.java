package com.oop_java_a.L917;

//Base class
public class A {
    private final int a;
    private final int b;

    //parameterized constructor
    public A(int x, int y) {
        a = x;
        b = y;
    }

    public void display() {
        System.out.println(" a is " + a);
        System.out.println(" b is " + b);
    }
}