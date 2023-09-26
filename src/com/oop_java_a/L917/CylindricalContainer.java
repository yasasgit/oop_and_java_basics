package com.oop_java_a.L917;

public class CylindricalContainer extends Container {
    private final double height;
    private final double radius;

    public CylindricalContainer(double h, double r) {
        height = h;
        radius = r;
    }

    public double volume() {
        //PI * Radius*Radius*Height where PI=3.14159
        return 3.14159f * radius * radius * height;
    }
}
