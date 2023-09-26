package com.oop_java_b_assignment.Q09;

public class Ford extends Car {

    private final int year;
    private final int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return (super.getSalePrice() - manufacturerDiscount);
    }
}
