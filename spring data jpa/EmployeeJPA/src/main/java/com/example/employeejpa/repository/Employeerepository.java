package com.example.employeejpa.repository;

import com.example.employeejpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer> {
}
