package com.example.inventory_management_api.controller;


import com.example.inventory_management_api.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Productcontroller {

    @GetMapping(value="/products",
            produces = {"application/json","application/xml"})

    public Product get(){
        return new Product(1,"laptop",55000);

    }













}
