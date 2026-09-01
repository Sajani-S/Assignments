package com.sample1.main;
import com.sample1.entity.customer;
import com.sample.util.hibernateutil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import jakarta.persistence.*;



public class mainapp {
    public static void main(String[] args) {

        Session session = hibernateutil.getSessionFactory().openSession();

        Transaction s = session.beginTransaction();

          customer c = new customer(101,"rahul");
          session.persist(c);
            s.commit();
            session.close();


        Session session1 = hibernateutil.getSessionFactory().openSession();

            customer c1 = session1.get(customer.class,101);

            System.out.println("customer loaded from database");
            session1.close();


        Session session2 = hibernateutil.getSessionFactory().openSession();

        customer c2 = session2.get(customer.class,101);

        System.out.println("customer loaded from cache");
        session2.close();

        System.out.println("performance improved");

    }
}

