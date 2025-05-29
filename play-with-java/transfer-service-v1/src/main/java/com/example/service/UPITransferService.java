package com.example.service;

import com.example.model.Account;
import com.example.repository.JdbcAccountRepository;
import org.apache.log4j.Logger;

public class UPITransferService {

    private static Logger logger = Logger.getLogger("transfer-service");

    public UPITransferService() {
        // Initialization logic if needed
        logger.info("UPITransferService initialized.");
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        logger.info("Initiating transfer from " + fromAccountNumber + " to " + toAccountNumber + " of amount: " + amount);
        // Logic to transfer funds using UPI
        JdbcAccountRepository accountRepository = new JdbcAccountRepository();

        Account fromAccount = accountRepository.findByAccountNumber(fromAccountNumber);
        Account toAccount = accountRepository.findByAccountNumber(toAccountNumber);

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        logger.info("Deducted " + amount + " from " + fromAccountNumber + ". New balance: " + fromAccount.getBalance());
        toAccount.setBalance(toAccount.getBalance() + amount);
        logger.info("Added " + amount + " to " + toAccountNumber + ". New balance: " + toAccount.getBalance());

        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);
        logger.info("Transfer completed successfully from " + fromAccountNumber + " to " + toAccountNumber);
    }

}
