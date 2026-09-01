package com.example.empmanagementspringboot.service;


import com.example.empmanagementspringboot.model.Employee;
import com.example.empmanagementspringboot.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employeeservice {


    @Autowired
    private Employeerepo s;

    public void addall(Employee employee){

        s.add(employee);
    }


    public List<Employee> getall(){
        return s.get();
    }

    public Employee getbyid(int id ){

        return s.getemployeeById(id);
    }
    public Employee deletebyid(int id ){

        return s.deleteemployeeById(id);
    }










}
