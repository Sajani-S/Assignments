package com.model.main;
import com.model.util.hibernateutil;
import com.model.entity.student;
import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class mainapp {
    public static void main (String[] args){


           Session session = hibernateutil.getSessionFactory().openSession();

           Transaction r = session.beginTransaction();
           student s = new student(101,"Arun","arun@gmail.com");
           session.persist(s);
           r.commit();

           System.out.println("student saved successfully");


            student s1 = session.get(student.class,101);
            System.out.println("student found : " + s1.getName());


        Transaction r2 = session.beginTransaction();
        s1.setEmail("arun213@gmail.com");
        session.update(s1);
        r2.commit();

        System.out.println("Student email updated ");

        Transaction r3 = session.beginTransaction();
           session.delete(s);
           r3.commit();
        System.out.println("Student deleted successfully ");

        session.close();

























    }













}
