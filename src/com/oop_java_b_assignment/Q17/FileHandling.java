package com.oop_java_b_assignment.Q17;

import java.io.*;

public class FileHandling {

    public static void main(String[] args) {
        try {
            File file1 = new File("filename.txt");
            //No file yet
            if (file1.exists()) {
                //check whether the file exists
                System.out.println("File already exists.");
            } else if (file1.createNewFile()) {
                //file created
                System.out.println("File created: " + file1.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred in Creating.");
        }
        try {
            File file1 = new File("filename.txt");
            FileWriter writer = new FileWriter(file1);
            writer.write("Yasas Harshana");
            writer.flush();
            writer.close();
            System.out.println("Successfully written.");
        } catch (IOException e) {
            System.out.println("An error occurred in Writing.");
        }
        try {
            char[] in = new char[14];
            // to store input
            File file1 = new File("filename.txt");
            FileReader reader = new FileReader(file1);
            int size = reader.read(in);
            // read the whole file!
            System.out.print(size + "\n");
            // print the array
            for (char c : in) {
                System.out.print(c);
            }

//            while (reader.hasNextLine()) {
//                String data = reader.nextLine();
//                System.out.println(data);
//            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred in Reading.");
        }
    }
}
