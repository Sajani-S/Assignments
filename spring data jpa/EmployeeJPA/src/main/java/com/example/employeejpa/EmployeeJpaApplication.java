package com.example.employeejpa;

import com.example.employeejpa.entity.Employee;
import com.example.employeejpa.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeJpaApplication implements CommandLineRunner {


    @Autowired
    private Employeerepository e;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeJpaApplication.class, args);
    }


    @Override
    public void run(String... args){

        e.save(new Employee(1,"John","IT",5000));
        e.save(new Employee(2,"david","HR",45000));
        e.save(new Employee(3,"rahul","finance",60000));


      System.out.println("employee details  : ");

        e.findAll().forEach(employee -> {
            System.out.println(
                    employee.getEmpId() + " - " +
                            employee.getEmpName() + " - " +
                            employee.getDepartment() + " - " +
                            employee.getSalary()
            );
        });

        System.out.println("searching by id   : ");

        Employee t = e.findById(2).orElse(null);

        if (t != null) {
            System.out.println("ID : " + t.getEmpId());
            System.out.println("Name : " + t.getEmpName());
            System.out.println("Course : " + t.getDepartment());
            System.out.println("Marks : " + t.getSalary());
        } else {
            System.out.println("Student not found.");
        }
    }




    }

