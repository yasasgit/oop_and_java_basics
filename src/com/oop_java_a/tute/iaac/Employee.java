package com.oop_java_a.tute.iaac;

public class Employee {
    private final int employeeid;
    private final String employeename;
    private final String address;
    private final String dob;
    protected float salary;

    public Employee(int employeeid, String employeename, String address, String dob, float salary) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.address = address;
        this.dob = dob;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(employeeid + " " + employeename + " " + address + " " + dob + " " + salary);
    }
}
