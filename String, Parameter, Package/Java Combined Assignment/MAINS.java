package com.app.main;

import com.app.util.StringUtil;

import java.util.*;


public class MAINS {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string : " ) ;
        String s = sc.next();

        StringUtil obj =  new StringUtil();

        System.out.println("length :" + obj.getLength(s)) ;
        System.out.println("upper case :" + obj.toUpperCase(s)) ;
        System.out.println("reverse :" + obj.reverse(s)) ;
        System.out.println("palindrome :" + obj.ispalindrome(s)) ;





    }






















}
