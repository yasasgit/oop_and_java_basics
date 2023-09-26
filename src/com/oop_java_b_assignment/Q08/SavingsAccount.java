package com.oop_java_b_assignment.Q08;

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public void calculateMonthlyInterest() {
        double interestRate = savingsBalance * annualInterestRate / 12;
        savingsBalance += interestRate;
        //savingsBalance = savingsBalance + interestRate
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
