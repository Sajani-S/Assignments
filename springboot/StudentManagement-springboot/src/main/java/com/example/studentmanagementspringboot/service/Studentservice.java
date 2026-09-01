package com.example.studentmanagementspringboot.service;


import com.example.studentmanagementspringboot.model.Student;
import com.example.studentmanagementspringboot.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {

    @Autowired
    private Studentrepo s;

    public void addall(Student student){

         s.add(student);
    }


    public List<Student> getall(){
       return s.get();
    }

     public Student getbyid(int id ){

       return s.getStudentById(id);
     }


}
