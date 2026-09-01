package com.app.util;

public class StringUtil {

    public int getLength(String str) {

        return str.length();
    }

    public String toUpperCase(String str) {

        return str.toUpperCase();

    }

    public String reverse(String str) {

    return new StringBuilder (str) .reverse().toString();

    }

    public boolean ispalindrome(String str) {

        return str.equalsIgnoreCase(reverse(str));


    }



    }
