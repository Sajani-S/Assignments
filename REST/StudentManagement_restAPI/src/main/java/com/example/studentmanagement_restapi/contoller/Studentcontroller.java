package com.example.studentmanagement_restapi.contoller;


import com.example.studentmanagement_restapi.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:3000")

public class Studentcontroller {

    List<Student> s = new ArrayList<>();

    @PostMapping("/students")
    public String addstudent(@RequestBody Student o) {
        s.add(o);
        return "student added";

    }

    @GetMapping("/students")
    public List<Student> getstudent() {

        return s;
    }

    @GetMapping("/students/{id}")
    public Student getstudentID(@PathVariable int id) {
        for (Student u : s) {
            if (u.getId() == id) {
                return u;
            }

        }
        return null;
    }







































}
