package com.fileinputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To demonstrate the possible values that can be written using FileOutputStream, 
 * we'll write all the byte values from 0 to 255 (the range of unsigned bytes) to a file. 
 * Keep in mind that these values represent the binary representation of each byte, 
 * and they might not be human-readable in a text file.
 */
public class FileOutputStreamExample_1 {
    public static void main(String[] args) {
        String fileName = "F:\\programming-practice\\Practice_Program\\IOStreamsExample\\byte_values.txt";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);

            // Write all byte values from 0 to 255 to the file
            for (int i = 0; i <= 255; i++) {
                fileOutputStream.write(i);
            }

            fileOutputStream.close();

            System.out.println("All possible byte values have been written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}

