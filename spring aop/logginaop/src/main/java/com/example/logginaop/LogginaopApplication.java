package com.example.logginaop;

import com.example.logginaop.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogginaopApplication implements CommandLineRunner {



    @Autowired
    private Employeeservice s;
    public static void main(String[] args) {
        SpringApplication.run(LogginaopApplication.class, args);
    }


    @Override
    public void run(String... args){
        s.addEmployee();
        s.updateEmployee();
        s.deleteEmployee();

    }









}
