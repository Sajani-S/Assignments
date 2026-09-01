package com.example.employeemanagementspringboot.service;


import com.example.employeemanagementspringboot.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Autowired
    @Qualifier("repo1")
    private EmployeeRepository repository;

    public void showEmployee() {

        repository.display();
    }
}

