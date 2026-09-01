package com.sample.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class product {
     @Id
    private String name;
    private double price;

    public product(){}
    public product (String name,double price){
        this.name=name;
        this.price=price;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double salary) {
        this.price = price;
    }
}
