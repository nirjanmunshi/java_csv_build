package com.example.nirjan;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String outputFileName = "input";
        String fileExt = ".csv";
        
        FileCreator f = new FileCreator();   
        String parentPath = f.createFolder();
    
        String filePath = f.createFile(parentPath, outputFileName, fileExt);
        System.out.println(filePath);

        String[] nameArray =  {"Alice", "Bob", "Charlie", "David", "Eve"};
        String[] emailArray = {"Alice@gmail.com", "Bob@gmail.com", "Charlie@gmail.com", "David@gmail.com", "Eve@gmail.com"};
        f.writeNamesToCSV(Arrays.asList(nameArray), Arrays.asList(emailArray), filePath);
        
    }
}