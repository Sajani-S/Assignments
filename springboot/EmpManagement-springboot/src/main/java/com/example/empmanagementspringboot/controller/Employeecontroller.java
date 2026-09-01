package com.example.empmanagementspringboot.controller;

import com.example.empmanagementspringboot.model.Employee;
import com.example.empmanagementspringboot.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employeecontroller {

    @Autowired
    private Employeeservice service;

    @PostMapping("/add")
    public String addemployee(@RequestBody Employee employee) {

        service.addall(employee);

        return "employee Added Successfully";

    }

    @GetMapping("/get")
    public List<Employee> getAllemployees() {
        return service.getall();

    }

    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getbyid(id);

    }
    @DeleteMapping ("/delete/{id}")
    public Employee deleteEmployeeById(@PathVariable int id) {
        return service.deletebyid(id);


    }








}
