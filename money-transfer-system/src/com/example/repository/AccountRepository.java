package com.example.repository;

import com.example.model.Account;

public interface AccountRepository {
    Account loadAccount(String accountId); // abstract method
    void updateAccount(Account account); // abstract method
}
