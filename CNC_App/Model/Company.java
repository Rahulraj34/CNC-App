package com.example.employeeportal.Model;

public class Company {
    public String name;
    public String category;
    public String phno;
    public String address;
    public String idproof1;
    public String idproof2;
    public String workexperience;
    public String salary;
public byte[] imgpic;
    public String bookingstatus;
    public String bookingdate;
    public String totalamount;
    public String employeename;
    public String rating;

    public Company(String name,String category, String phno, String address, String idproof1, String idproof2, String workexperience, String salary, byte[] imgpic,String bookingdate,String bookingstatus,String totalamount,String employeename,String rating) {
        this.name = name;
        this.category = category;
        this.phno = phno;
        this.address = address;
        this.idproof1 = idproof1;
        this.idproof2 = idproof2;
        this.workexperience = workexperience;
        this.salary = salary;
        this.imgpic = imgpic;
        this.bookingdate = bookingdate;
        this.bookingstatus = bookingstatus;
        this.totalamount = totalamount;
        this.employeename = employeename;
        this.rating = rating;
    }
    public Company()
    {}
    {}
}
