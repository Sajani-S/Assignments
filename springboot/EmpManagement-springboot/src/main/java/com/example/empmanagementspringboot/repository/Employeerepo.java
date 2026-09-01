package com.example.empmanagementspringboot.repository;


import com.example.empmanagementspringboot.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Employeerepo {


    public List<Employee> d = new ArrayList<>();



    public void add (Employee employee){
        d.add(employee);
    }


    public List<Employee> get (){
        return d;
    }

    public Employee getemployeeById(int id) {

        for (Employee employee : d) {

            if (employee.getEmpId() == id) {
                return employee;
            }

        }

        return null;
    }

    public Employee deleteemployeeById(int id) {

        for (Employee employee : d) {

            if (employee.getEmpId() == id) {
                 d.remove(employee);


            }

        }

        return null;
    }




 }





