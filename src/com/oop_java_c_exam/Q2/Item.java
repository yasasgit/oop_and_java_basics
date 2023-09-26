package com.oop_java_c_exam.Q2;

public class Item {

    private int itemNumber;
    private String itemDescription;
    private int quantity;
    private double price;
    //instance variables

    public Item() {
        //default constructor
        itemNumber = 1000;
        itemDescription = "Description";
        quantity = 1;
        price = 99.99;
    }

    //Setters and Getters
    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int qty) {
        if (qty > 0) {
            quantity = qty;
        } else {
            quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double prc) {
        if (prc > 0.0) {
            price = prc;
        } else {
            price = 0.0;
        }
    }

    public double getStockValue() {
        return quantity * price;
    }

}
