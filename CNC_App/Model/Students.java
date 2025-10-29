package com.example.employeeportal.Model;

public class Students {
    public String name;
    public String password;
    public String role;
    public String phno;
    public String mailid;
    public String address;


    public Students(String name,String password,String role,String phno,String mailid,String address) {
        this.name = name;
        this.password = password;
        this.role = role;
        this.phno = phno;
        this.mailid = mailid;
        this.address = address;
    }
    public Students()
    {}
}
