package com.example.repository;

import com.example.model.Account;

/**
 * author: John Doe
 */

public class MysqlAccountRepository {

    public MysqlAccountRepository() {
        System.out.println("CassandraAccountRepository component created");
    }

    public Account loadAccount(String accountId) {
        System.out.println("SqlAccountRepository: loadAccount() called");
        // SQL logic to load account
        return new Account(accountId, 1000.0);
    }

    public void updateAccount(Account account) {
        System.out.println("SqlAccountRepository: updateAccount() called");
        // SQL logic to save account
    }

}
