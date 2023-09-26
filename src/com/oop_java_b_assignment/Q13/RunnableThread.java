package com.oop_java_b_assignment.Q13;

public class RunnableThread implements Runnable {

    //Implements from Runnable Interface
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(500);
                //pauses the thread for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("thread running :" + i);
        }
        System.out.println("Exiting thread");
    }

    public static void main(String[] args) {
        RunnableThread i = new RunnableThread();
        new Thread(i).start();
        //Creates a thread object and calls the run method using the start keyword
    }
}
