package com.oop_java_b_assignment.Q13;

public class MyThread extends Thread {

    //Creates a subclass from Thread Superclass (inherit)
    MyThread() {
        super("Calling Base Thread class");
        //calling Superclass constructor
        start();
        //starts run method of superclass
    }

    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("thread running :" + i);
        }
        System.out.println("exiting child thread");
    }

    public static void main(String[] args) {
        new MyThread();
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("thread running :" + i);
        }
        System.out.println("exiting main thread");
    }
}
