package com.oop_java_a.L1014;

public class Main {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception ab) {
            System.out.println(ab.getMessage());
        }
    }
}
