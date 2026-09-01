package com.example.employeemanagementspringboot.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Repo1 implements EmployeeRepository{
    @Value("${emp.id}")
    private int id;

    @Value("${emp.name}")
    private String name;

    @Value("${emp.department}")
    private String department;

    @Override
    public void display() {

        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Department : " + department);
    }

}
