package com.oop_java_b_assignment.Q09;

public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan sedan = new Sedan(100, 60000.0, "Blue", 40);
        Ford ford1 = new Ford(120, 80000.0, "Red", 2016, 2000);
        Ford ford2 = new Ford(130, 90000.0, "Yellow", 2020, 1000);
        Car car = new Car(60, 30000.0, "White");

        System.out.println("Price of Sedan is " + sedan.getSalePrice());
        System.out.println("Price of Ford 1 is " + ford1.getSalePrice());
        System.out.println("Price of Ford 2 is " + ford2.getSalePrice());
        System.out.println("Price of Car is " + car.getSalePrice());
    }
}
