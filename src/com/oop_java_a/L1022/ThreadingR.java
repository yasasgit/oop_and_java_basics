package com.oop_java_a.L1022;

public class ThreadingR implements Runnable {
    public void run() {
        int x;
        for (x = 10; x <= 50; x += 10) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("X is " + x);
        }
    }
}