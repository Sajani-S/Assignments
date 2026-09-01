package com.example.studentjpa.entity;

import jakarta.persistence.*;

@Entity
 @Table(name = "stu")
 public class Student {

        @Id
        private Integer studentid;
        private String studentname;
        private  String course;
        private  double marks;

     public Student(){}

    public Student(Integer studentid, String studentname, String course, double marks) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.course = course;
        this.marks = marks;
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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
