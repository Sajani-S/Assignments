package com.example.model;




public class Employee {

    private int empid;
    private String empname;
    private String department;
    private String designation;
    private double salary;


    public Employee(){}

    public Employee(int empid, String empname, String department, String designation, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public  void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public  void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDepartment() {
        return department;
    }

    public  void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public  void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public  void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empid + " " + empname + " " + department + " " + designation + " " + salary;
    }
}
