package com.example.BankingSystem;

public class Account {

    private  int accountnumber ;
    private String customername ;
    private int  balance ;


    public Account(int accountnumber, String customername, int  balance) {
        this.accountnumber = accountnumber;
        this.customername = customername;
        this.balance = balance;
    }


    public void show(){

        System.out.println("Account number : " + accountnumber);

        System.out.println("customer number : " + customername);
        System.out.println("Balance : " + balance);






    }











}
