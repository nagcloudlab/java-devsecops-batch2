package com.example;

/**
 *
 * dev1
 */

public class Account {

    private long accountId;
    private double balance;

    public Account(long accountId, double balance) {
        if (accountId <= 0) {
            throw new IllegalArgumentException("Account ID must be positive");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.accountId = accountId;
        this.balance = balance;
    }

    // accessors / getters => read

    public long getAccountId() {
        return accountId;
    }
    public double getBalance() {
        return balance;
    }

    // mutators / setters => write
    // set new balance
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }


}
