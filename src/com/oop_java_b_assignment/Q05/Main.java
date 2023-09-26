package com.oop_java_b_assignment.Q05;

public class Main {

    public static void main(String[] args) {
        AvgOfArray avgA = new AvgOfArray();
        //Creating a memory object from AvgOfArray class
        double average = avgA.findAverage();
        //Assigning returning value from method to Double average
        System.out.println("Average is " + average);
    }
}
