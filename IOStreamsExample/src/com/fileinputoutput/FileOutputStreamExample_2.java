package com.fileinputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

/*To demonstrate the possible signed values that can be written using FileOutputStream,
we'll write all signed byte values from -128 to 127 to a file*/

public class FileOutputStreamExample_2 {
    public static void main(String[] args) {
        String fileName = "F:\\programming-practice\\Practice_Program\\IOStreamsExample\\signed_byte_values.txt"; 

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);

            // Write all signed byte values from -128 to 127 to the file
            for (int i = -128; i <= 127; i++) {
                fileOutputStream.write((byte) i);
            }

            fileOutputStream.close();

            System.out.println("All possible signed byte values have been written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
