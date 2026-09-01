package com.example.studentmanagementspringboot.repo;

import com.example.studentmanagementspringboot.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentrepo {

    // Encapsulate the data list to protect it from outside modification
    private final List<Student> students = new ArrayList<>();

    // Add a new student
    public void add(Student student) {
        students.add(student);
    }

    // Retrieve all students
    public List<Student> get() {
        return students;
    }

    // Find a single student by their ID
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}