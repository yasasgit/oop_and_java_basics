package com.oop_java_c_exam.Q3;

public class IllustrateThread extends Thread {

    public void run() {
        for (int x = 1; x <= 5; x++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            System.out.println(x + ". 20864");
        }
    }
}
