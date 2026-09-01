package com.example.balancesecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bankcontroller {


    @GetMapping("/balance")
    public String get(){

        return "you have balance 10000 rupees";

    }
}
