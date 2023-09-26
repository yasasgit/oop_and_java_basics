package com.oop_java_b_assignment.Q09;

public class Car {

    private final int speed;
    private final double regularPrice;
    private final String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}
