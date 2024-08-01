package com.example.nirjan;
import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;








public  class FileCreator {

    /**
     * With this we can create any folder inside of the project.
     * 
     * @returns Parent directory path
     */
    
    public String createFolder() {
        // Specify the directory you want to create
        String directoryPath = "src/main/resources/output";

        // Create a File object representing the directory
        File directory = new File(directoryPath);

        // Check if the directory already exists
        if (!directory.exists()) {
            // Attempt to create the directory
            boolean isCreated = directory.mkdirs();

            if (isCreated) {
                System.out.println("Directory created successfully: " + directoryPath);
            } else {
                System.out.println("Failed to create directory: " + directoryPath);
            }
        } else {
            System.out.println("Directory already exists: " + directoryPath);
        }

        // System.err.println("Absolute Path: " + directory.getAbsolutePath());
        // System.err.println("Parent File: " + directory.getParentFile());
        // System.err.println("Directory Name: " + directory.getName());
        // System.err.println("Parent: " + directory.getParent());
        
        

        return directory.getParent()+"/"+directory.getName();
    }

    // Method to create a file
    public String createFile(String parentPath, String fileName, String ext) {
        // Specify the directory and file name

        String directoryPath = "src/main/resources/output";
    
        String fName = fileName + ext;
        String filePath = "";

        try {
            // Create a File object for the CSV file
            File csvFile = new File(directoryPath, fName);

            // Check if the file already exists
            if (!csvFile.exists()) {
                // Attempt to create the file
                boolean isFileCreated = csvFile.createNewFile();
                
                if (isFileCreated) {
                    System.out.println("File created successfully: " + csvFile.getAbsolutePath());
                } else {
                    System.out.println("Failed to create file: " + csvFile.getAbsolutePath());
                }
            } else {
                System.err.println("File already exists: " + csvFile.getAbsolutePath());
            }

            filePath = csvFile.getPath();
        } catch (IOException e) {
            System.err.println("Unable to create file");
            e.printStackTrace();
        }
        return filePath;
    }


    // Method to write a list of names to a CSV file
    public void writeNamesToCSV(List<String> names, List<String> emails, String filePath) {

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {

            // Write the header only if the file does not already exist
            if (isFileEmpty(filePath)) {
                writer.writeNext(new String[] { "Name", "Email" });
            }

            // Ensure names and emails lists are of the same size
            if (names.size() != emails.size()) {
                throw new IllegalArgumentException("Names and emails lists must be of the same size.");
            }

            // Write names and emails to the CSV file
            for (int i = 0; i < names.size(); i++) {
                writer.writeNext(new String[] { names.get(i), emails.get(i) });
            }

            System.out.println("Names written to CSV file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to CSV file.");
            e.printStackTrace();
        }
    }
    

     // Method to write a list of names to a CSV file
    public void writeNamesToCSV(List<Person> persons,String filePath) {
        
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {

            // Write the header only if the file does not already exist
            if (isFileEmpty(filePath)) {
                writer.writeNext(Person.getHeaders());
            }

        
            // Write names and emails to the CSV file
            for (int i = 0; i < persons.size(); i++) {
                writer.writeNext(new String[] { persons.get(i).getName(), persons.get(i).getEmail(),persons.get(i).getPhone() });
            }

            System.out.println("Names written to CSV file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to CSV file.");
            e.printStackTrace();
        }
    }
    
    // Method to check if a file is empty
    private boolean isFileEmpty(String filePath) {
        File file = new File(filePath);
    

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Check if the file has any content
            return reader.readLine() == null;
        } catch (IOException e) {
            System.err.println("Error checking if file is empty.");
            e.printStackTrace();
            return true; // Consider file empty if an error occurs
        }
    }
}
