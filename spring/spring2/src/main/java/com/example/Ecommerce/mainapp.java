package com.example.Ecommerce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
    public static void main(String[] args){


        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Product p = (Product) context.getBean("pro");

        p.show();






















    }
}
