package com.oop_java_b_assignment.Q12;

class UDException extends Exception {

    //User Defined Exception
    String str;

    UDException(String str) {
        this.str = str;
    }

    public String toString() {
        return "MyException: " + str;
    }
}
