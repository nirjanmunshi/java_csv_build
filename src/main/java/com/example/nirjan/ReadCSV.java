package com.example.nirjan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {


    public static void read(String filePath){
        // Path to the CSV file
        String line = "";
        String csvSeparator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                // Split the line into values based on the separator
                String[] values = line.split(csvSeparator);

                // Print each value
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println(); // Move to the next line after each record
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
