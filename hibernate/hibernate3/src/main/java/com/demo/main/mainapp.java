package com.demo.main;
import com.demo.entity.Employee;
import com.demo.entity.address;

import com.model.util.hibernateutil;
import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class mainapp {
    public static void main (String[] args) {


        Session session = hibernateutil.getSessionFactory().openSession();
        Transaction r = session.beginTransaction();


         address e2 = new address("chennai","Tamil nady");

         Employee e1 = new Employee(201,"priya",e2);


          session.persist(e1);
          r.commit();

          System.out.println("Employee saved successfully");
        System.out.println("address embedded succcessfully");

session.close();

































    }
    }

