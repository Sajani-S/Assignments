package com.example.employeemanagementrest.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "emp")
public class Employee {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer empid;
    private String empname;
    private String department;
    private double salary;

   public Employee(){}

    public Employee(Integer empid, String empname, String department, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.department = department;
        this.salary = salary;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
