package com.example.studentrest.repo;


import com.example.studentrest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "students")
public interface Studentrepo extends JpaRepository<Student,Integer> {
}
