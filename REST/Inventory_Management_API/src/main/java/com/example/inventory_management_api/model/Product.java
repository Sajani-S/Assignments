package com.example.inventory_management_api.model;

public class Product {

    private int productid;
    private String productname;
    private int price;
    public Product(){}

    public Product(int productid, String productname, int price) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
    }


    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
