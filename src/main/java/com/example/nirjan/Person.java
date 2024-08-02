package com.example.nirjan;

public class Person {
    private String name;
    private String email;
    private String phone;
    private String fname;
    private String lname;
    private String fathersname;
    private String address;
    private String age;





    // Constructor
    public Person(String name, String email, String phone,String fname,String lname,String fathersname,String address,String age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.fname = fname;
        this.lname = lname;
        this.fathersname = fathersname;
        this.address = address;
        this.age = age;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFathersname() {
        return fathersname;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public static String[] getHeaders() {
        return new String[] { "Name", "Email", "Phone","fname","lname","fathersname","address","age" };
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", email=" + email + ", phone=" + phone + ", fname=" + fname + ", lname="
                + lname + ", fathersname=" + fathersname + ", address=" + address + ", age=" + age + "]";
    }

}

