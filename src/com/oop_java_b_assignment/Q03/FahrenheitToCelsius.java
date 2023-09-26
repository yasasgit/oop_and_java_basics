package com.oop_java_b_assignment.Q03;

import java.util.Scanner;
//Importing Scanner class from library

public class FahrenheitToCelsius {

    private double fahrenheit = 1;
    private double celsius = 1;
    //Declaring the Integers

    public void getFahrenheit() {
        //Creating the method getFahrenheit
        Scanner sc = new Scanner(System.in);
        //Creating a memory object for Scanner class
        System.out.print("Input Temperature in Fahrenheit : ");
        //Displaying instruction for the user
        fahrenheit = sc.nextDouble();
        // Calling nextDouble method inside Scanner class and assigning the value to double
    }

    public void calculate() {
        //Creating the method calculate
        celsius = (double) 5 / 9 * (fahrenheit - 32);
    }

    public void displayCelsius() {
        //Creating the method displayName
        System.out.println("Temperature in Celsius is " + celsius);
        //Displaying the value inside
    }
}
