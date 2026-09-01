package com.example.studentjpa;

import com.example.studentjpa.entity.Student;
import com.example.studentjpa.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentjpaApplication implements CommandLineRunner {
    @Autowired
    private Studentrepo e;
    public static void main(String[] args) {
        SpringApplication.run(StudentjpaApplication.class, args);
    }

    @Override
    public void run(String... args){

        e.save(new Student(101,"ARUN","JAVA",85));
        e.save(new Student(102,"PRIYA","PYTHON",90));
        e.save(new Student(103,"KARTHIK","SPRING BOOT",88));


        System.out.println("Student details  : ");

        e.findAll().forEach(student -> {
            System.out.println(
                    student.getStudentid() + " - " +
                            student.getStudentname() + " - " +
                            student.getCourse() + " - " +
                            student.getMarks()
            );
        });

        System.out.println("student by id   : ");

        Student t = e.findById(101).orElse(null);

        if (t != null) {
            System.out.println("ID : " + t.getStudentid());
            System.out.println("Name : " + t.getStudentname());
            System.out.println("Course : " + t.getCourse());
            System.out.println("Marks : " + t.getMarks());
        } else {
            System.out.println("Student not found.");
        }
    }


}

