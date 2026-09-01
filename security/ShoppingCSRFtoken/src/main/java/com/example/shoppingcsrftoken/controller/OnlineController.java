package com.example.shoppingcsrftoken.controller;


import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineController {


    @PostMapping("/placeorder")
    public String add(){
        return "order placed";
    }

    @GetMapping ("/token")
    public CsrfToken get(CsrfToken csrfToken){
        return csrfToken;
    }
}
