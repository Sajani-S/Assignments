package com.example.VehicleManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);


        Vehicle v =  context.getBean(Vehicle.class);

        v.start();













    }







}
