package com.sample.main;
import com.sample.entity.product;
import com.sample.util.hibernateutil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import jakarta.persistence.*;
import java.util.List;
import  org.hibernate.query.Query;


public class mainapp {
    public static void main(String[] args) {

        Session session = hibernateutil.getSessionFactory().openSession();

        Transaction s1 = session.beginTransaction();
        product u1 = new product("Laptop",55000);
        product u2 = new product("mobile",15000);
        product u3 = new product("ac",14000);
        product u4 = new product("tv",10000);

        session.persist(u1);
        session.persist(u2);
        session.persist(u3);
        session.persist(u4);
        s1.commit();

           System.out.println("fetching all products");
        Query <product> a = session.createQuery("from product" , product.class);

        List <product> w = a.list();

 for (product e : w){
     System.out.println( e.getname() + "->" + e.getPrice());
 }
    System.out.println("--------------------------");
        System.out.println("filtering products by price");

        Query <product> a2 = session.createQuery("from product where price >14000" , product.class);

        List <product> w2 = a2.list();
        for (product e1 : w2){
            System.out.println( e1.getname() + "->" + e1.getPrice());
        }
        System.out.println("--------------------------");
        System.out.println("NAMES : ");

        Query <product> a3 = session.createQuery("from product" , product.class);

        List <product> w3 = a.list();

        for (product e3 : w){
            System.out.println( e3.getname() );
        }



















      session.close();








    }
}
