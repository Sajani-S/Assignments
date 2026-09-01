package com.example.libraryaop.service;


import org.springframework.stereotype.Service;

@Service
public class Librarryservice {

   public void issueBook(){

        try{
            Thread.sleep(2000);
        }

        catch (Exception e){

        }

        System.out.println("book issued");
   }


    public void returnBook(){
        System.out.println("book returned");

    }
   public void searchBook(){

       System.out.println("book search");


   }
}
