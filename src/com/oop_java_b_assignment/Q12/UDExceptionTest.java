package com.oop_java_b_assignment.Q12;

class UDExceptionTest {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Access denied");
        } else {
            System.out.println("Access granted");
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
