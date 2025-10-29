package com.example.employeeportal.Model;

public class filterlist {
    public String company_name;
    public String company_phno;
    public String company_mailid;
    public String company_vacancy;
    public String company_noofvacancy;
    public String company_noofvacancy1;
    public String company_noofvacancy2;



    public filterlist(String company_name, String company_phno, String company_mailid, String company_vacancy, String company_noofvacancy,String company_noofvacancy1,String company_noofvacancy2) {
        this.company_name = company_name;
        this.company_phno = company_phno;
        this.company_mailid = company_mailid;
        this.company_vacancy = company_vacancy;
        this.company_noofvacancy = company_noofvacancy;
        this.company_noofvacancy1 = company_noofvacancy1;
        this.company_noofvacancy2 = company_noofvacancy2;


    }
    public filterlist()
    {}
}
