package com.fileinputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample_3 {
    public static void main(String[] args) {
        String fileName = "F:\\programming-practice\\Practice_Program\\IOStreamsExample\\output.txt"; // Replace with the path to your desired output file

        try {
            String content = "Hello, this is an example of FileOutputStream in Java!";
            
            // Create a FileOutputStream with the specified file name
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            
            // Convert the string to bytes and write to the file
            fileOutputStream.write(content.getBytes());
            
            // Close the stream after use
            fileOutputStream.close();
            
            System.out.println("Content has been written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
