package com.example.employeemanagementspringboot.repo;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Repo2 implements EmployeeRepository {


    @Override
    public void display() {
        System.out.println("this is not going to execute");
    }
}
