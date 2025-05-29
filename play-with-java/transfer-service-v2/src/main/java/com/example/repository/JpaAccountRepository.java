package com.example.repository;

import com.example.model.Account;
import org.apache.log4j.Logger;

/**
 * author : dev-1
 */

public class JdbcAccountRepository {

    private static Logger logger = Logger.getLogger("transfer-service");

    public JdbcAccountRepository() {
        // Initialization logic if needed
        logger.info("JdbcAccountRepository initialized.");
    }

    public Account findByAccountNumber(String number) {
        logger.info("Finding account by number: " + number);
        return new Account(number, 1000.0);
    }

    public void save(Account account) {
        logger.info("Saving account: " + account.getNumber() + " with balance: " + account.getBalance());
        // Logic to save the account to the database
        // This is a stub implementation; actual implementation would interact with a database
    }

}
