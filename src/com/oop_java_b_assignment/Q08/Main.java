package com.oop_java_b_assignment.Q08;

public class Main {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        //Creating a memory objects from SavingsAccount class

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        //Assigning values through setters

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        //Executing calculateMonthlyInterest method

        System.out.println("New Balance : " + saver1.getSavingsBalance());
        System.out.println("New Balance : " + saver2.getSavingsBalance());
        //Displaying through getters

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("New Balance : " + saver1.getSavingsBalance());
        System.out.println("New Balance : " + saver2.getSavingsBalance());
        //Displaying through getters
    }
}
