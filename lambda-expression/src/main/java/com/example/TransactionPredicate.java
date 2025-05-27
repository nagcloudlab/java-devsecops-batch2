package com.example;

import com.example.model.Transaction;

public interface TransactionPredicate {
    boolean test(Transaction t);
}
