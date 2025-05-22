package com.example;


import java.util.List;

class Transaction {
    private String transactionId;
    private double amount;

    public Transaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }
}

public class Benchmarking {
    public static void main(String[] args) {

        List<Transaction> transactions = new java.util.ArrayList<>(100000);
        compareList(transactions);

        transactions = new java.util.LinkedList<>();
        compareList(transactions);

    }


    public static void compareList(List<Transaction> transactions) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            transactions.add(new Transaction("id" + i, i));
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken to add 10000 transactions: " + (end - start) + " ms");
    }

}
