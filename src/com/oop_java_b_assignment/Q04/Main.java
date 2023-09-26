package com.oop_java_b_assignment.Q04;

public class Main {

    public static void main(String[] args) {
        CalculateStats calcS = new CalculateStats();
        //Creating a memory object from CalculateStats class
        calcS.getInputs();
        calcS.displaySum();
        calcS.displayAvg();
        calcS.displayProd();
        calcS.displayMin();
        calcS.displayMax();
        //Calling methods using the created instance
    }
}
