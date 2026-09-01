package com.example.libraryaop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Libraryaspect {


    @Before("execution(* com.example.libraryaop.service.*.*(..))")

    public void call(){
        System.out.println("loggin started");
    }

    @After("execution(* com.example.libraryaop.service.*.*(..))")

    public void go(){
        System.out.println("loggin completed");
    }

    @Around("execution(* com.example.libraryaop.service.*.*(..))")

      public Object execu(ProceedingJoinPoint jp)throws Throwable{


        long start = System.currentTimeMillis();

        Object result = jp.proceed();

        long stop = System.currentTimeMillis();


        System.out.println("execution time ; "+ (stop-start)+" "+"ms");

        return result;



    }





}
