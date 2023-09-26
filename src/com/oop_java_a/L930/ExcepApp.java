package com.oop_java_a.L930;

public class ExcepApp {
    public static void main(String[] args) {
        int x = 10, y = 0, z;
        try {
            z = x / y;
            System.out.println("Z is " + z);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Divide by zero error ");
        }
    }
}
