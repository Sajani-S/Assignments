package com.example.inventoryrest.jpaentity;


import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer itemid;
    private String itemname;
    private String category;
    private double price;
    private int stock;


    public Item(){}

    public Item(Integer itemid, String itemname, String category, double price, int stock) {
        this.itemid = itemid;
        this.itemname = itemname;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
