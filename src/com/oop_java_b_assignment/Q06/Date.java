package com.oop_java_b_assignment.Q06;

public class Date {

    private int month;
    private int day;
    private int year;
    //Declaring Integers

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    //Parameterized Constructor

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //Setter functions

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
    //Getter functions

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
