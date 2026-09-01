package com.example.productmanagementrest.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer productid;
    private String productname;
    private int quantity;
    private Double price;

    public Product() {
    }


    public Product(Integer productid, String productname, int quantity, Double price) {
        this.productid = productid;
        this.productname = productname;
        this.quantity = quantity;
        this.price = price;
    }


    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
