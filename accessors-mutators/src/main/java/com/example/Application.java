package com.example;

public class Application {
    public static void main(String[] args) {


        //---------------------------------------
        // dev-2
        //---------------------------------------
        Account account = new Account(123456789, 1000.0);


        //---------------------------------------
        // junior-dev
        //---------------------------------------

        account.setBalance(2000.0);

        //---------------------------------------
        // dev-4
        //---------------------------------------

        System.out.println("Account ID: " + account.getAccountId());
        System.out.println("Account Balance: " + account.getBalance());
    }
}
