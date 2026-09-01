package com.relational.main;
import com.relational.util.hibernateutil;
import com.relational.entity.department;
import com.relational.entity.employee;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;

public class mainapp {

    public static void main(String[] args) {

        Session session = hibernateutil.getSessionFactory().openSession();

        Transaction s = session.beginTransaction();

        department e = new department(6, "IT");

        employee u = new employee(8, "rahul", e);
        employee u1 = new employee(3, "sneha", e);
        employee u3 = new employee(9, "kiren", e);

        e.setE(Arrays.asList(u,u1,u3));

        session.persist(e);
        session.persist(u);
        session.persist(u1);
        session.persist(u3);

       s.commit();

       System.out.println("department saved");
        System.out.println(e.getE().size() + " employees added to "+ e.getDepartment() + " department");

session.close();











    }
}
