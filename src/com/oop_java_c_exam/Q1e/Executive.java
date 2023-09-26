package com.oop_java_c_exam.Q1e;

public class Executive extends Employee implements CalcBonus {
//Inherits from a class and an interface and methods implemented

    @Override
    public void payBonus() {
        System.out.println("payBouns()");
    }

    @Override
    void payAllowance() {
        System.out.println("payAllowance()");
    }
}
