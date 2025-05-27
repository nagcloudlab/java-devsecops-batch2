package com.example;

import com.example.model.Transaction;
import com.example.model.TransactionStatus;
import com.example.model.TransactionType;

import java.time.LocalDateTime;

public class How_To_Create_lambda {

    public static void main(String[] args) {


        Predicate p = (Integer i) -> {
            //..
            System.out.println("...");
            return true;
        };

        TransactionPredicate pp = (Transaction t) -> {
            //..
            return true;
        };

        boolean b = p.test(12);
        boolean bb = pp.test(new Transaction("123123123", TransactionType.WITHDRAWAL, 100.00, LocalDateTime.of(2025, 5, 27, 15, 15, 15), "acc001", "acc002", TransactionStatus.COMPLETED));


    }

}
