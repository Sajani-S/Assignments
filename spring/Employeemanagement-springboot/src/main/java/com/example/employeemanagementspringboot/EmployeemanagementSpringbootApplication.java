package com.example.employeemanagementspringboot;

import com.example.employeemanagementspringboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeemanagementSpringbootApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService service;

    public static void main(String[] args) {
        SpringApplication.run( EmployeemanagementSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) {

        service.showEmployee();
    }



}
