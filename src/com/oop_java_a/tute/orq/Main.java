package com.oop_java_a.tute.orq;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Harry", 55000.00);
        System.out.println("Before the Salary Incremenet ");
        System.out.println("Employee Details " + e1);
        e1.raiseSalary(0.10);
        System.out.println("After the Salary Incremenet ");
        System.out.println("Employee Details " + e1);

        DigitalClock dc0 = new DigitalClock();
        dc0.displayTime();
        DigitalClock dc = new DigitalClock(9, 45, 56);
        dc.displayTime();
        dc.setHours(-1);
        dc.setMinutes(-2);
        dc.setSeconds(-3);
        dc.displayTime();
        dc.setHours(24);
        dc.setMinutes(60);
        dc.setSeconds(62);
        dc.displayTime();
        dc.setHours(5);
        dc.setMinutes(25);
        dc.setSeconds(45);
        dc.displayTime();
        dc.tick();
        dc.tick();
        dc.displayTime();

        Student st = new Student();
        st.getTotal();
        st.getName("Yasas");
        st.getTotal();
        st.addQuiz(78);
        st.addQuiz(22);
        st.addQuiz(2);
        st.getTotal();
        st.getAvg();
    }
}
