package com.example.studentaop;

import com.example.studentaop.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentaopApplication implements CommandLineRunner {

    @Autowired
    private Studentservice s;
    public static void main(String[] args) {
        SpringApplication.run(StudentaopApplication.class, args);
    }

    @Override
    public void run(String... args){

        s.addstudent(101);
        s.addstudent(-1);

    }

}
