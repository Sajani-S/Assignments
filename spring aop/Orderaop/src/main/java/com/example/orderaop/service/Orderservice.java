package com.example.orderaop.service;

import org.springframework.stereotype.Service;

@Service
public class Orderservice {


    public void placeorder(){

        try{

            Thread.sleep(2000);
        }
        catch(Exception e) {


        }

      System.out.println("order placed ");





    }






}
