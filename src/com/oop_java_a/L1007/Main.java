package com.oop_java_a.L1007;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10, y = 0, z;
            z = x / y;
            System.out.println("Answer " + z);
            //Declaring an integer array with the size of 10 (In c -> int arr[10];)
            int[] arr = new int[10];
            //Array index begins with 0 and ends with 9
            arr[10] = 25;
            System.out.println("Value of the last element " + arr[10]);
        } catch (ArithmeticException e1) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Array Based Error");
        } finally {
            System.out.println("Finally Block is here ");
        }
    }
}