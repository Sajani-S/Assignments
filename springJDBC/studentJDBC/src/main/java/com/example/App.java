package com.example;


import com.example.config.configuration;
import com.example.service.Studentservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(configuration.class);

        Studentservice service = context.getBean(Studentservice.class);

        service.addStudent();
        service.updateStudent();
        service.findStudentById();
        service.displayAllStudents();
        service.deleteStudent();
    }
}
