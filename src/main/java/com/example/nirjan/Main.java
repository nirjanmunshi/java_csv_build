package com.example.nirjan;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileCreator f = new FileCreator();
        String parentPath = f.createFolder();

        String vehicleFileName = "vehicle";
        String vehicleFileExt = ".csv";

        // data for vehicle object
        String[] companyArray = { "Tata", "Hyundai", "Maruti", "Honda", "Kia" };
        String[] moddelArray = { "Harrier", "Creta", "WagonR", "Honda city", "Duster" };
        String[] yearArray = { " 2015", "2017", "2010", "2008", "2020" };
        String[] ccArray = { "1800", "1600", "700", "1050", "1300" };

        // Create a list to store Person objects
        List<Vehicle> vehicleList = new ArrayList<>();
        
        for (int i = 0; i < companyArray.length; i++) {
            Vehicle car = new Vehicle(companyArray[i], moddelArray[i], yearArray[i], ccArray[i]);
            vehicleList.add(car);
        }

        String filePath = f.createFile(parentPath, vehicleFileName, vehicleFileExt);
        System.out.println(filePath);

        f.writeVehicleToCsv(vehicleList, filePath);
        ReadCSV.read(filePath);
    }
}