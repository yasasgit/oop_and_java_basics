package com.oop_java_a.L829;

import java.util.Scanner;

//    Write a java program. to input a student name, birth year and display the student is a teenager or not a teenager

public class Main {
    public static void main(String[] args) {
        String name;
        int bYear, age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = sc.nextLine(); // to allow the user to input a string value
        System.out.println("Enter your birth year ");
        bYear = sc.nextInt(); // to allow the user to input an integer value
        age = 2021 - bYear;
        if (age >= 13 && age <= 19)
            System.out.println("Hey Teenager " + name + " you are " + age + " years old ");
        else
            System.out.println("Hey " + name + " you are " + age + " years old & not a teenager ");

        //Creating an object from the class Student
        Student studentObj = new Student();
        //calling(invoke) the methods , YOU ALWAYS CALL THE METHODS THROUGH AN OBJECT
        studentObj.setData("Yasas", "Batch20.2", 20864);
        studentObj.display();

        Rectangle rectOb = new Rectangle();
        rectOb.setData(3, 4);
        System.out.println("Area is " + rectOb.findArea());


        //    Identify relevant data and methods of a class 'Time'.
        //    Note : You must be able to set and display the hours,minutes and seconds
        //    Convert the above into a java program, create 2 time objects and call the methods.
        Time timeOb = new Time();
        timeOb.setData(8, 10, 59);
        timeOb.theTime();
    }
}



