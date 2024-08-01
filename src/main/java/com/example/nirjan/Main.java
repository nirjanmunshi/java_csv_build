package com.example.nirjan;
import java.util.ArrayList;
import java.util.List;

public class Main {

    

    public static void main(String[] args) {

        String outputFileName = "input";
        String fileExt = ".csv";

 String[] nameArray = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String[] emailArray = {"Alice@gmail.com", "Bob@gmail.com", "Charlie@gmail.com", "David@gmail.com", "Eve@gmail.com"};
        String[] phoneArray = {"123-456-7890", "234-567-8901", "345-678-9012", "456-789-0123", "567-890-1234"};


        // Create a list to store Person objects
        List<Person> personList = new ArrayList<>();
        
        // Populate the list with Person objects
        for (int i = 0; i < nameArray.length; i++) {
            Person person = new Person(nameArray[i], emailArray[i], phoneArray[i]);
            personList.add(person);
        }
        
        FileCreator f = new FileCreator();   
        String parentPath = f.createFolder();
    
        String filePath = f.createFile(parentPath, outputFileName, fileExt);
        System.out.println(filePath);

      

        // f.writeNamesToCSV(Arrays.asList(nameArray), Arrays.asList(emailArray), filePath);
        f.writeNamesToCSV(personList, filePath);
        // createFolder();
        // createFile();
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