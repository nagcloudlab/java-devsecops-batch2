package com.example.model;

public enum TransactionStatus {
    PENDING,
    COMPLETED,
    FAILED,
    CANCELLED;
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
