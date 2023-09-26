package com.oop_java_a.L829;

public class Time {
    private int h, m, s;

    public void setData(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public void theTime() {
        System.out.println("The time is " + h + ":" + m + ":" + s);
    }
}
