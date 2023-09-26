package com.oop_java.mosh;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte age=30;
        int[] array = new int[5];
        final float PI = 3.213F;
        array[0] = 300;
        array[4] = 112;
        Arrays.sort(array);
        String message = "\"Hello\"" + "World!";
        Date now = new Date();
        System.out.println(age);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        System.out.print("Age?");
        age = sc.nextByte();
        System.out.println(now);
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 3;
        point1.y = 4;
        System.out.println(point2);
        System.out.println(message.toUpperCase());
        System.out.println(Arrays.toString(array));
        System.out.println(Math.random());
        System.out.println(name);
        System.out.println(age);
        String adult = age > 18 ? "Adult" : "Child";
        System.out.println(adult);


    }
}
