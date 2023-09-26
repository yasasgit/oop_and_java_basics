package com.oop_java_a.L1022;

public class Main {
    public static void main(String[] args) {
        {
            ThreadingT t1 = new ThreadingT();
            ThreadingT t2 = new ThreadingT();
            t1.start();
            t2.start();
        }
        {
            ThreadingR a = new ThreadingR();
            new Thread(a).start();
            ThreadingR b = new ThreadingR();
            new Thread(b).start();
        }
    }
}
