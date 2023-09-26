package com.oop_java_b_assignment.Q02;

import java.util.Scanner;
//Importing Scanner class from library

public class CalculateProduct {

    private int input1 = 1;
    private int input2 = 1;
    private int input3 = 1;
    private int output = 1;
    //Declaring the inputs and output as Integer

    public void getInputs() {
        //Creating the method getName
        Scanner sc = new Scanner(System.in);
        //Creating a memory object for Scanner class
        System.out.print("Input 1 : ");
        //Displaying instruction for the user
        input1 = sc.nextInt();
        // Calling nextInt method inside Scanner class and assigning the value to Integer
        System.out.print("Input 2 : ");
        //Displaying instruction for the user
        input2 = sc.nextInt();
        // Calling nextInt method inside Scanner class and assigning the value to Integer
        System.out.print("Input 3 : ");
        //Displaying instruction for the user
        input3 = sc.nextInt();
        // Calling nextInt method inside Scanner class and assigning the value to Integer
    }

    public void calculate() {
        //Creating the method calculate
        output = input1 * input2 * input3;
    }

    public void displayOutput() {
        //Creating the method displayOutput
        System.out.println("Product is " + output);
        //Displaying the value inside the Integer output
    }
}
