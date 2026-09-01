package com.example.productaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Productaspect {

    @After("execution(* com.example.productaop.service.*.*(..))")
    public void logMethodCall() {
        System.out.println("Method execution completed");
    }



}
