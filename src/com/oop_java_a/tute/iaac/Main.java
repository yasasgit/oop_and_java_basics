package com.oop_java_a.tute.iaac;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee(1111, "Yasas", "62 Anula", "315", 4999);
        e1.displayInfo();
        Executive e2 = new Executive(2222, "Harshana", "96 Santha", "999", 50000, 3000);
        e2.displayInfo();
        e2.calcincentive();
        Executive e3 = new Executive(3333, "Indika Peiris", "69 WEST", "888", 20000, 2000);
        e3.displayInfo();
        e3.calcincentive();
    }
}
