package com.example.employee_directory_restapi.controller;


import com.example.employee_directory_restapi.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class Employeecontroller {

List <Employee> s = new ArrayList<>();

    @PostMapping("/add")
    public String add(@RequestBody Employee e) {
        s.add(e);
        return "employee added";
    }
    @GetMapping("/get")
    public List<Employee> get() {
        return s;
    }

    @GetMapping("/get/{id}")
    public Employee getbyID(@PathVariable int id ){

        for(Employee o: s) {
            if (o.getEmpId()==id) {

                return o;
            }
        }
        return null;
    }


}
