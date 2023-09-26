package com.oop_java_b_assignment.Q05;

import java.util.Scanner;
//Importing Scanner class from library

public class AvgOfArray {

    private final int[] grades = new int[20];
    //Declaring array grades as final
    private int sum;
    private double avg;

    public double findAverage() {
        Scanner sc = new Scanner(System.in);
        //Creating a memory object for Scanner class
        for (int i = 0; i < 20; i++) {
            //for loop 0 to 19
            System.out.print("Enter Grade " + (i + 1) + " : ");
            //Displaying instruction for the user
            grades[i] = sc.nextInt();
            // Calling nextLine method inside Scanner class and assigning the value to String
            if (grades[i] == -1) {
                break;
            }
            //If the entered value is -1 loop breaks
            sum += grades[i];
            //Maintaining a total through the loop process
            avg = (double) sum / (i + 1);
        }
        return avg;
        //Returns the average
    }
}
