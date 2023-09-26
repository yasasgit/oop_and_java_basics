package com.oop_java_b_assignment.Q09;

public class Truck extends Car {

    private final int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice() * 1;
        }
    }

}
