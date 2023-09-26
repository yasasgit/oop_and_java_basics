package com.oop_java_a.L829;

public class Student {
    //data
    //usually data declared as private
    private String name, batch;
    private int admNo;

    //methods
    //usually methods declared as public
    public void setData(String n, String b, int a) {
        name = n;
        batch = b;
        admNo = a;
    }

    public void display() {
        System.out.println("Student Name " + name);
        System.out.println("Student Batch " + batch);
        System.out.println("Student Admission Number " + admNo);
    }
}
