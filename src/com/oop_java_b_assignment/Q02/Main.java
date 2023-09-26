package com.oop_java_b_assignment.Q02;

public class Main {

    public static void main(String[] args) {
        CalculateProduct calc = new CalculateProduct();
        //Creating a memory object from CalculateProduct class
        calc.getInputs();
        //Calling the method getInputs using the instance
        calc.calculate();
        //Calling the method calculate using the instance
        calc.displayOutput();
        //Calling the method displayOutput using the instance
    }
}
