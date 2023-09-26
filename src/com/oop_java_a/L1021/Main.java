package com.oop_java_a.L1021;

public class Main {
    public static void main(String[] args) {
        Threading t1 = new Threading();
        Threading t2 = new Threading();

        t1.start();
        t2.start();
    }
}
