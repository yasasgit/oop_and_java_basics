package com.oop_java_b_assignment.Q12;

public class Main {

    public static void main(String[] args) {
        try {
            int[] arr1 = new int[-2];
            System.out.print(arr1[1] + " ");
            //Array index is negative

            int[] arr2 = new int[5];
            System.out.print(arr2[6] + " ");
            //Array index is higher than the index of last item

            int x = 10, y = 0, z;
            z = x / y;
            System.out.println("Z is " + z);
            //x divides vy zero which is not valid

        } catch (NegativeArraySizeException e1) {
            System.out.println(e1.getMessage());
            //Only shows the message if Array size is negative
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2.getMessage());
            //Only shows the message if Array index is higher than the index of last item
        } catch (ArithmeticException e3) {
            System.out.println(e3.getMessage());
            //Only shows the message if A number is divided by zero
        } finally {
            //finally block will execute even the try block gets an error or not
            System.out.println("This Prints Anyway(Whatever happens in Try block)");
        }
    }
}
