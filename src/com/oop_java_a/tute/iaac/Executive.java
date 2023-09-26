package com.oop_java_a.tute.iaac;

public class Executive extends Employee implements paybonus {

    private final float travelaallowance;

    public Executive(int employeeid, String employeename, String address, String dob, float salary, float travelaallowance) {
        super(employeeid, employeename, address, dob, salary);
        this.travelaallowance = travelaallowance;
    }

    public void calcincentive() {
        float inc;
        if (salary < 5000)
            System.out.println("Not Eligible");
        else {
            inc = salary * 0.10f;
            System.out.println("Incentive amount is " + inc + "Travel allowance is " + travelaallowance);
        }
    }
}
