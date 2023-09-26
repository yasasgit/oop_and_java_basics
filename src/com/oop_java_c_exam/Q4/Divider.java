package com.oop_java_c_exam.Q4;

import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        int no1, no2, output;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        no1 = input.nextInt();
        //Input from user
        System.out.print("Enter the second number: ");
        no2 = input.nextInt();
        //Input from user
        try {
            //tries to divide no1 by no2
            output = (no1 / no2);
            System.out.println("Answer is:" + output);
        } catch (Exception e) {
            //Runtime Exception generated
            System.out.println("Cannot divide by zero error ");
        } finally {
            //This block executes whether an exception occurred or not
            System.out.println("GoodBye ");
        }
    }
}
