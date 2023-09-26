package com.oop_java_a.tute.orq;

public class Employee {
    private final String name;
    private double salary;

    public Employee() {
        name = "default_name";
        salary = 0.0;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        salary = salary + salary * byPercent;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee " + name + " 's Salary is " + salary;
    }
}
