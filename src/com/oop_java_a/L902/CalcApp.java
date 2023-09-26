package com.oop_java_a.L902;


// Create a class called Calc. Include two integers as data and include methods to set values and display the average.
// After creating the class, create two objects and display the average.

public class CalcApp {
    public static void main(String[] args) {
        //Creating objects
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();
        obj1.setValues(30, 65);
        System.out.println("The Average of obj1 is " + obj1.displayAvg());
        obj2.setValues(45, 120);
        System.out.println("The Average of obj2 is " + obj2.displayAvg());
        Calculator cal1 = new Calculator(12, 23);
    }
}


