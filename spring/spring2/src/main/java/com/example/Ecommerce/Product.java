package com.example.Ecommerce;

public class Product {

private int productid;
    private String productname;
    private Double productprice;

public Product(){}


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

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }


    public void show(){
    System.out.println("Product id :" + productid);
        System.out.println("Product name :" + productname);
        System.out.println("Product price :" + productprice);
    }

}
