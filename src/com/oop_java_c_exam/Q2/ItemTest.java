package com.oop_java_c_exam.Q2;

public class ItemTest {

    public static void main(String[] args) {
        Item i1 = new Item();
        //Creates an instance
        System.out.println(i1.getItemNumber());
        System.out.println(i1.getItemDescription());
        System.out.println(i1.getQuantity());
        System.out.println(i1.getPrice());
        System.out.println(i1.getStockValue());
        Item i2 = new Item();
        i2.setItemNumber(12);
        i2.setItemDescription("Vegetable");
        i2.setQuantity(29);
        i2.setPrice(450.20);
        System.out.println(i2.getItemNumber());
        System.out.println(i2.getItemDescription());
        System.out.println(i2.getQuantity());
        System.out.println(i2.getPrice());
        System.out.println(i2.getStockValue());
    }
}
