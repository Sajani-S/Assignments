package com.example.logginaop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logginaspect {

        @Before("execution(* com.example.logginaop.service.*.*(..))")
        public void logMethodCall() {
            System.out.println("Method execution started");
        }
    }

