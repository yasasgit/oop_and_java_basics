package com.oop_java_b_assignment.Q12;

class NegativeCheck {

    public static void main(String[] a) {
        try {
            //start try block that which checks whether the statement critical
            //expected to produce an error which disrupts the flow of the program
            int[] a1 = new int[-2];
            //this will produce an error as the array size is defined as negative
            System.out.println("Index 0 element" + a1[0]);
        } catch (NegativeArraySizeException n) {
            //start catch block which runs the code if the previous try clock has
            //thrown an exception
            System.out.println("Exception " + n);
        }
    }
}
