package com.oop_java_c_exam.Q3;

public class Main {

    public static void main(String[] args) {
        IllustrateThread t1 = new IllustrateThread();
        IllustrateThread t2 = new IllustrateThread();
        t1.start();
        t2.start();
    }
}
