package com.oop_java_a.L819;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n1, n2, sum;
        System.out.print("Enter first number ");
        n1 = sc1.nextInt();
        System.out.print("Enter second number ");
        n2 = sc1.nextInt();
        sum = (n1 + n2);
        System.out.println("The total is " + sum);
        String name = "NSBM";
        System.out.println("Hey " + name);

        String name1;
        System.out.print("Enter yor name ");
        name1 = new Scanner(System.in).nextLine();
        System.out.println("Hey " + name1);
        String name2;

        Scanner sc2 = new Scanner(System.in);
        //Creating an object from the Scanner class, sc2 is an object name (any name)
        System.out.print("Enter yor name ");
        name2 = sc2.nextLine();
        //allow the user to input a string value and
        //stores the user input inside the variable name2
        System.out.println("Hey " + name2);
    }
}


