package com.oop_java_a.L1021;

public class Threading extends Thread {
    public void run() {
        int x;
        for (x = 1; x <= 5; x++)
            System.out.println("X : " + x);
    }
}
