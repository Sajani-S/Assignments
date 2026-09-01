package com.example.model;

public class Product {
   private  int productid  ;
    private  String productname;
    private String category;
    private  double price;
    private int quantity;

    public Product(){}

    public Product(int productid, String productname, String category, double price, int quantity) {
        this.productid = productid;
        this.productname = productname;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return productid + " " + productname + " " + category + " " + price + " " + quantity;
    }


}

