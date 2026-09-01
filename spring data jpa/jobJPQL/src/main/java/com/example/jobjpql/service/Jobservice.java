package com.example.jobjpql.service;


import com.example.jobjpql.entity.Job;
import com.example.jobjpql.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Jobservice {
    @Autowired
    private Jobrepo repository;

    public Job save(Job job){
        return repository.save(job);
    }

    public List<Job> getAllJobs(){
        return repository.findAll();
    }

    public List<Job> getSalaryGreaterThan(double salary){
        return repository.findJobsWithSalaryGreaterThan(salary);
    }

    public List<Job> getJobsByLocation(String location){
        return repository.findJobsByLocation(location);
    }

    public int updateSalary(Long id,double salary){
        return repository.updateSalary(id,salary);
    }

    public int deleteByCompany(String company){
        return repository.deleteByCompany(company);
    }
}
