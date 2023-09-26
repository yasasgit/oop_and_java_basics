package com.oop_java_b_assignment.Q10;

abstract class SolidShape {

    abstract void volume(); //No method body because Can't measure volume

    void surfaceArea() {
        System.out.println("Surface Area of a Solid Shape");
    }

}
