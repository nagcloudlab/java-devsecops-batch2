package com.example;

public class Account {

    // State
    long accountId; // 0 // required
    double balance; // 0.0


    // Constructor
    // default constructor
//    public Account() {
//        System.out.println("Account object created");
//    }

    // parametrized constructor - accountId
    public Account(long accountId) {
        this(accountId, 0.0);
    }

    // parametrized constructor - accountId, balance
    public Account(long accountId, double balance) {
        if (accountId <= 0) {
            throw new IllegalArgumentException("Account ID must be greater than 0");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be greater than or equal to 0");
        }
        this.accountId = accountId;
        this.balance = balance;
        System.out.println("Account object created with accountId: " + accountId + " and balance: " + balance);
    }

    // Behavior

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }
        balance += amount;
        System.out.println("Deposited " + amount + " to account " + accountId);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be greater than 0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + " from account " + accountId);
    }

}
