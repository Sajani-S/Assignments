package com.example;


import com.example.config.Configurations;
import com.example.service.Employeeservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Configurations.class);

        Employeeservice service = context.getBean(Employeeservice.class);

        service.addEmployee();
        service.updateEmployee();
        service.findEmployeeById();
        service.displayAllEmployees();
        service.deleteEmployee();
        service.filterbysalary();

}

}
