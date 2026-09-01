package com.example.logginaop.service;


import org.springframework.stereotype.Service;

@Service
public class Employeeservice {

    public void addEmployee(){
        System.out.println("Employee added");

    }

    public void updateEmployee(){
        System.out.println("Employee updated");

    }
    public void deleteEmployee(){
        System.out.println("Employee deleted");

    }



}
