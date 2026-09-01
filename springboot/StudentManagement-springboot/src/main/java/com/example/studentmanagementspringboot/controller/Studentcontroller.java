package com.example.studentmanagementspringboot.controller;


import com.example.studentmanagementspringboot.model.Student;
import com.example.studentmanagementspringboot.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studentcontroller {

    @Autowired
    Studentservice service;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {

        service.addall(student);

        return "Student Added Successfully";

    }

    @GetMapping("/get")
    public List<Student> getAllStudents() {
        return service.getall();

    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getbyid(id);

    }

}
