package com.oop_java_b_assignment.Q07;

public class Item {

    private int location;
    private String description;
    //Declaring data

    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }
    //Parameterized constructor

    public void setLocation(int location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //Setter functions

    public int getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
    //Getter functions
}
