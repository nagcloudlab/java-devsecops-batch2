package com.example;

public class ReferenceTypesExample {

    public static void main(String[] args) {

//        Account a1 = new Account();
//        System.out.println(a1.accountId);
//        System.out.println(a1.balance);
//        a1.accountId = 1001;
//        a1.balance = 1000.0;
//        System.out.println(a1.accountId);
//        System.out.println(a1.balance);


        Account a2 = new Account(1001);
        System.out.println(a2.accountId);
        System.out.println(a2.balance);


        Account a3 = new Account(1002, 1000.00);
        System.out.println(a3.accountId);
        System.out.println(a3.balance);

        a3.deposit(1000.00);
        System.out.println(a3.balance);
        a3.withdraw(500.00);
        System.out.println(a3.balance);


        var a5=new Account(1003);


    }
}
