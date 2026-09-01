package com.example;


import com.example.config.Configurations;
import com.example.service.Productservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Configurations.class);

        Productservice service = context.getBean(Productservice.class);

        service.addProduct();
        service.updateProduct();
        service.findProductById();
        service.displayAllProduct();
        service.deleteProduct();
        service.filterbyquantity();
        service.totalinventory();
        service.findProductByCategory();

    }



    }

