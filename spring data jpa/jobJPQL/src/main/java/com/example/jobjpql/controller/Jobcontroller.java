package com.example.jobjpql.controller;


import com.example.jobjpql.entity.Job;
import com.example.jobjpql.service.Jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class Jobcontroller {
    @Autowired
    private Jobservice service;

    // Save Job
    @PostMapping
    public Job saveJob(@RequestBody Job job){
        return service.save(job);
    }

    // Get All Jobs
    @GetMapping
    public List<Job> getAllJobs(){
        return service.getAllJobs();
    }

    // 1. Salary > 50000
    @GetMapping("/salary/{salary}")
    public List<Job> salaryGreater(@PathVariable double salary){
        return service.getSalaryGreaterThan(salary);
    }

    // 2. Location
    @GetMapping("/location/{location}")
    public List<Job> byLocation(@PathVariable String location){
        return service.getJobsByLocation(location);
    }

    // 3. Update Salary
    @PutMapping("/{id}/{salary}")
    public String updateSalary(@PathVariable Long id,
                               @PathVariable double salary){

        service.updateSalary(id,salary);
        return "Salary Updated Successfully";
    }

    // 4. Delete Company
    @DeleteMapping("/company/{company}")
    public String deleteCompany(@PathVariable String company){

        service.deleteByCompany(company);
        return "Company Jobs Deleted Successfully";
    }
}
