package com.example;

import com.example.model.Transaction;
import com.example.model.TransactionStatus;
import com.example.model.TransactionType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionsApplication {

    public static void main(String[] args) {


        List<Transaction> transactions =
                List.of(
                        new Transaction("123123123", TransactionType.WITHDRAWAL, 100.00, LocalDateTime.of(2025, 5, 27, 15, 15, 15), "acc001", "acc002", TransactionStatus.COMPLETED),
                        new Transaction("435345345", TransactionType.CREDIT, 100.00, LocalDateTime.of(2025, 6, 27, 15, 15, 15), "acc002", "acc003", TransactionStatus.COMPLETED),
                        new Transaction("456534534", TransactionType.FEE, 400.00, LocalDateTime.of(2025, 5, 23, 15, 15, 15), "acc001", "acc002", TransactionStatus.PENDING)
                );


        // Req-1: filter credit transactions
        System.out.println(
                //filterCreditTransactions(transactions)
                //filterTransactionsByType(transactions, TransactionType.CREDIT)
//                filterTransactions(transactions, new TransactionPredicate() {
//                    @Override
//                    public boolean test(Transaction t) {
//                        return t.getType().equals(TransactionType.CREDIT);
//                    }
//                })

                filterTransactions(transactions, t -> t.getType().equals(TransactionType.CREDIT))
        );

        // Req-2: filter fee transactions
        System.out.println(
                //filterTransactionsByType(transactions, TransactionType.FEE)
                filterTransactions(transactions, t -> t.getType().equals(TransactionType.FEE))
        );


    }


    private static List<Transaction> filterTransactions(List<Transaction> transactions, TransactionPredicate condition) {

        List<Transaction> output = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (condition.test(transaction)) {
                output.add(transaction);
            }
        }
        return output;

    }


//    private static List<Transaction> filterTransactionsByType(List<Transaction> transactions, TransactionType type) {
//
//        List<Transaction> output = new ArrayList<>();
//        for (Transaction transaction : transactions) {
//            if (transaction.getType().equals(type)) {
//                output.add(transaction);
//            }
//        }
//        return output;
//
//    }


//    private static List<Transaction> filterCreditTransactions(List<Transaction> transactions) {
//        List<Transaction> output = new ArrayList<>();
//        for (Transaction transaction : transactions) {
//            if (transaction.getType().equals(TransactionType.CREDIT)) {
//                output.add(transaction);
//            }
//        }
//        return output;
//    }
//
//    private static List<Transaction> filterFeeTransactions(List<Transaction> transactions) {
//        List<Transaction> output = new ArrayList<>();
//        for (Transaction transaction : transactions) {
//            if (transaction.getType().equals(TransactionType.FEE)) {
//                output.add(transaction);
//            }
//        }
//        return output;
//    }

}
