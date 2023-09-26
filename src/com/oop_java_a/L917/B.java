package com.oop_java_a.L917;

public class B extends A {
    private final int c;

    //whenever you write a child class constructor
    //it is must pass values to the base class constructor
    public B(int x, int y, int z) {
        super(x, y);
        c = z;
    }

    public void output() {
        super.display();
    }
}

