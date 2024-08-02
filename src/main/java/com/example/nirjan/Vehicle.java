package com.example.nirjan;

public class Vehicle {
    private String company;
    private String model;
    private String year;
    private String cc;


    

    // Constructor
    public Vehicle(String company, String model, String year, String cc) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.cc = cc;

    }
    
    public static String[] vehicleHeaders() {
        return new String[] { "company", "moodel", "year", "cc" };
    }

    public String getCc() {
        return cc;
    }
    public void setCc(String cc) {
        this.cc = cc;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Vehicle [company=" + company + ", model=" + model + ", year=" + year + ", cc=" + cc + "]";
    }
  
    
}
