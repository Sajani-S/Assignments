package com.example.orderaop;

import com.example.orderaop.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderaopApplication implements CommandLineRunner {

    @Autowired
    private Orderservice s;
    public static void main(String[] args) {
        SpringApplication.run(OrderaopApplication.class, args);
    }



    @Override
    public void run(String... args){

        s.placeorder();





    }

}
