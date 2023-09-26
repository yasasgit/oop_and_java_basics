package com.oop_java_a.L1022;

public class ThreadingT extends Thread {
    public void run() {
        int x;
        for (x = 100; x <= 500; x += 100)
            System.out.println("X is " + x);
    }
}
