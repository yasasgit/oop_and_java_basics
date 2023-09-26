package com.oop_java_b_assignment.Q07;

public class Main {

    public static void main(String[] args) {
        Item item = new Item(10, "Ten");
        //Creating a memory object from Date class and assigning values through arguments
        item.setLocation(12);
        item.setDescription("Twelve");
        //Setter functions
        Monster monster = new Monster(13, "Thirteen");
        //Creating a memory object from Date class and assigning values through arguments
        monster.setLocation(14);
        monster.setDescription("Fourteen");
        //Setter functions
        System.out.println(item.getLocation());
        System.out.println(item.getDescription());
        System.out.println(monster.getLocation());
        System.out.println(monster.getDescription());
        ////Displaying values through Getter functions
    }
}
