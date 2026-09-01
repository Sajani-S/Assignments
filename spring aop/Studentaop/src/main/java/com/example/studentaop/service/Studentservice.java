package com.example.studentaop.service;


import org.springframework.stereotype.Service;

@Service
public class Studentservice {

    public void addstudent(int id  ){

        System.out.println("student added : "+ id);

    }



}
