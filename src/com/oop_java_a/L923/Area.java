package com.oop_java_a.L923;

public class Area {
    int a, b;

    public Area() {
        a = 0;
        b = 0;
    }

    public Area(int x, int y) {
        a = x;
        b = y;
    }

    public int findArea(int a) {
        return a * a;
    }

    public int findArea(int a, int b) {
        return a * b;
    }
}
