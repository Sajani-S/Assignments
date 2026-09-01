package com.example.studentjpa.repo;

import com.example.studentjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student,Integer> {
}
