package com.oop_java_b_assignment.Q04;

import java.util.Scanner;
//Importing Scanner class from library

public class CalculateStats {

    private int input1;
    private int input2;
    private int input3;
    //Declaring the Integers

    public void getInputs() {
        //Creating the method getInputs
        Scanner sc = new Scanner(System.in);
        //Creating a memory object for Scanner class
        System.out.print("Input 1 : ");
        //Displaying instruction for the user
        input1 = sc.nextInt();
        // Calling nextInt method inside Scanner class and assigning the value to Input
        System.out.print("Input 2 : ");
        //Displaying instruction for the user
        input2 = sc.nextInt();
        // Calling nextInt method inside Scanner class and assigning the value to Input
        System.out.print("Input 3 : ");
        //Displaying instruction for the user
        input3 = sc.nextInt();
        // Calling nextInt method inside Scanner class and assigning the value to Input
    }

    public void displayProd() {
        //Creating the method displayProd
        int prod = input1 * input2 * input3;
        System.out.println("Product is " + prod);
        //Displaying the value inside the Integer
    }

    public void displaySum() {
        //Creating the method displaySum
        int sum = input1 + input2 + input3;
        System.out.println("Sum is " + sum);
        //Displaying the value inside the Integer
    }

    public void displayAvg() {
        //Creating the method displayAvg
        double avg = (double) (input1 + input2 + input3) / 3;
        System.out.println("Average is " + avg);
        //Displaying the value inside the Integer
    }

    public void displayMin() {
        //Creating the method displayMin
        int min;
        if (input1 <= input2) {
            if (input1 <= input3) {
                min = input1;
            } else {
                min = input3;
            }
        } else {
            if (input2 <= input3) {
                min = input2;
            } else {
                min = input3;
            }
        }
        //Finding min using nested if
        System.out.println("Smallest is " + min);
        //Displaying the value inside the Integer
    }

    public void displayMax() {
        //Creating the method displayMax
        int max;
        if (input1 >= input2) {
            if (input1 >= input3) {
                max = input1;
            } else {
                max = input3;
            }
        } else {
            if (input2 >= input3) {
                max = input2;
            } else {
                max = input3;
            }
        }
        //Finding max using nested if
        System.out.println("Largest is " + max);
        //Displaying the value inside the Integer
    }

}
