package com.oop_java_c_exam.Q5;

import java.io.*;

public class IndexWriter {

    public static void main(String[] args) {
        try {
            File filetocreate = new File("File1.txt");
            //Creates a file instance with filename but No file yet
            if (filetocreate.exists()) {
                //check whether the file exists
                System.out.println("File already exists.");
            } else if (filetocreate.createNewFile()) {
                //file created
                System.out.println("File created: " + filetocreate.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while Creating.");
        }
        try {
            File filetowrite = new File("File1.txt");
            FileWriter writer = new FileWriter(filetowrite);
            writer.write("20864\n20.2");
            //Writes the string to the file
            writer.flush();
            writer.close();
            System.out.println("Successfully written.");
        } catch (IOException e) {
            System.out.println("An error occurred while Writing.");
        }
        try {
            char[] in = new char[10];
            // to store input
            File filetoread = new File("File1.txt");
            FileReader reader = new FileReader(filetoread);
            int size = reader.read(in);
            // read the whole file!
            for (char c : in) {
                System.out.print(c);
                // print the array
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while Reading.");
        }
    }
}
