package com.example.studentrest.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer studentid;
    private String  studentname;
    private String course;
    private String email;

public Student(){}


    public Student(Integer studentid, String studentname, String course, String email) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.course = course;
        this.email = email;
    }


    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
