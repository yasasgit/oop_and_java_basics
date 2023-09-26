package com.oop_java_b_assignment.Q06;

public class DateTest {

    public static void main(String[] args) {
        Date myDate = new Date(5, 31, 1999);
        //Creating a memory object from Date class and assigning values through arguments
        myDate.setMonth(9);
        myDate.setDay(2);
        myDate.setYear(2000);
        //Assigning values through setters
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getDay());
        System.out.println(myDate.getYear());
        //Displaying values through getters
        myDate.displayDate();
        //Displaying values through displayDate method
    }
}
