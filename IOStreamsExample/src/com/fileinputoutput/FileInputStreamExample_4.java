package com.fileinputoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample_4 {
    public static void main(String[] args) {
        //String fileName = "F:\\programming-practice\\Practice_Program\\IOStreamsExample\\output.txt"; // Replace with the path to your text file
         //String fileName="F:\\programming-practice\\Practice_Program\\IOStreamsExample\\byte_values.txt";
    	String fileName="F:\\programming-practice\\Practice_Program\\IOStreamsExample\\signed_byte_values.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);

            // Read bytes from the file
            int byteRead;
            while ((byteRead = fileInputStream.read()) != -1) {
                // Convert byte to character and print to console
                //System.out.print((char) byteRead);
            	//System.out.print((byte)byteRead+",");
                System.out.print(byteRead+",");
            }

            // Close the stream after use
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

