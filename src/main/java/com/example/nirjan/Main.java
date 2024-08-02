package com.example.nirjan;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    

    public static void main(String[] args) {

        String outputFileName = "vehicle";
        String fileExt = ".csv";

        String[] companyArray = { "Tata", "Hyundai", "Maruti", "Honda", "Kia" };
        String[] moddelArray = { "Harrier", "Creta", "WagonR", "Honda city", "Duster" };
        String[] yearArray = { " 2015", "2017", "2010", "2008", "2020" };
        String[] ccArray = { "1800", "1600", "700", "1050", "1300" };

        // Create a list to store Person objects
        List<Vehicle> vehicleList = new ArrayList<>();

        // Populate the list with Person objects
        for (int i = 0; i < companyArray.length; i++) {
            Vehicle car = new Vehicle(companyArray[i], moddelArray[i], yearArray[i], ccArray[i]);
            vehicleList.add(car);
        }

        FileCreator f = new FileCreator();
        String parentPath = f.createFolder();

        String filePath = f.createFile(parentPath, outputFileName, fileExt);
        System.out.println(filePath);

        // f.writeNamesToCSV(Arrays.asList(nameArray), Arrays.asList(emailArray), filePath);
        f.writeNamesToCSV(vehicleList, filePath);
        //ReadCSVExample.main(args);//
       

        // createFolder();
        // createFile();
    }
    
    // to rename the file //
    public class RenameFileExample {
        public static void main(String[] args) {
            // Step 1: Create a File object representing the original file
            File originalFile = new File("D:\\project\\java\\src\\main\\resources\\output\\vehicle.csv");

            // Step 2: Create a File object representing the new file name or location
            File renamedFile = new File("D:\\project\\java\\src\\main\\resources\\output\\vehicledata.csv");

            // Step 3: Rename the file using the renameTo() method
            boolean success = originalFile.renameTo(renamedFile);

            if (success) {
                System.out.println("File renamed successfully!");
            } else {
                System.out.println("Failed to rename the file.");
            }
        }
    }
    
    // to read data from csv file//


    public class ReadCSVExample {
    public static void main(String[] args) {
        // Path to the CSV file
        String csvFile = "D:\\\\project\\\\java\\\\src\\\\main\\\\resources\\\\output\\\\vehicledata.csv";
        String line = "";
        String csvSeparator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
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

    

    

    // private static void createFolder() {
    //     // Specify the directory you want to create
    //     String directoryPath = "src/main/resources/output";

    //     // Create a File object representing the directory
    //     File directory = new File(directoryPath);


    //     // Check if the directory already exists
    //     if (!directory.exists()) {
    //         // Attempt to create the directory
    //         boolean isCreated = directory.mkdirs();

    //         if (isCreated) {
    //             System.out.println("Directory created successfully: " + directoryPath);
    //         } else {
    //             System.out.println("Failed to create directory: " + directoryPath);
    //         }
    //     } else {
    //         System.out.println("Directory already exists: " + directoryPath);
    //     }

    //     System.err.println(directory.getAbsolutePath());
    //     System.err.println(directory.getParentFile());
    //     System.err.println(directory.getName());
    //     System.err.println(directory.getParent());
    // }

    // private static void createFile(){
    //      // Specify the directory you want to create
    //     String directoryPath = "src/main/resources/output";
    //     String fileName = "output.csv";

    //     try {
    //         File csvFile = new File(directoryPath, fileName);

    //         if (!csvFile.exists()) {
    //             boolean isFileCreated = csvFile.createNewFile();
    //             System.out.println("file created  "+isFileCreated);
    //         } else {
    //             System.err.println("File already exists");
    //         }
    //     } catch (Exception e) {
    //         System.err.println("Unable to create file");
    //     }

        

        
    // }
}