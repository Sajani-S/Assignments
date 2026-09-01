package com.example.onlinedelivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {

    public static void main(String[] args){


        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


        DeliveryPartner d = (DeliveryPartner) context.getBean("swiggyPartner");

        DeliveryPartner s = (DeliveryPartner) context.getBean("zomatopartner");

       d.display();
       s.display();




















    }









}
