package com.oop_java_b_assignment.Q01;

import java.util.Scanner;
//Importing Scanner class from library

public class MyNameIs {

    //Creating the class MyNameIs
    private String myName = "";
    //Declaring the String myName

    public void getName() {
        //Creating the method getName
        Scanner sc = new Scanner(System.in);
        //Creating a memory object for Scanner class
        System.out.print("Name : ");
        //Displaying instruction for the user
        myName = sc.nextLine();
        // Calling nextLine method inside Scanner class and assigning the value to String
    }

    public void displayName() {
        //Creating the method displayName
        System.out.println("My Name is " + myName);
        //Displaying the value inside the String
    }
}
