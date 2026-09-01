package com.example.studentaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Studentaspect {



    @Around("execution(* com.example.studentaop.service.*.*(..))")

    public Object validate(ProceedingJoinPoint jp)throws Throwable{


        Object []args = jp.getArgs();

        int id = (Integer)args[0];

         if (id<= 0){
             System.out.println("invalid student id ");


             return null;
         }
             return jp.proceed();








    }
}
