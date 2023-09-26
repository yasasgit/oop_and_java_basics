package com.oop_java_c_exam.Q1e;

abstract class Employee {

    //This is an abstract class
    abstract void payAllowance();
    //This is an abstract method

    public void display() {
        //inside non-abstract method
        System.out.println("dispaly()");
    }
}
