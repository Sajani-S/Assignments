package com.example.orderaop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Orderaspect {


    @Around("execution(* com.example.orderaop.service.*.*(..))")

    public Object monitorTime(ProceedingJoinPoint jp)throws Throwable{


        long starttime = System.currentTimeMillis();

        Object result = jp.proceed();

        long stoptime = System.currentTimeMillis();

        System.out.println("Execution time ; "+ (stoptime - starttime) + " "+"ms");


       return result;








    }
}
