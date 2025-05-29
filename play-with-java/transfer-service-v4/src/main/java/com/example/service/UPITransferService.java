package com.example.service;

import com.example.model.Account;
import com.example.repository.AccountRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("transferService")
public class UPITransferService implements TransferService {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger("transfer-service");

    private AccountRepository accountRepository; // required

    @Autowired
    public UPITransferService(AccountRepository accountRepository) {
        // Initialization logic if needed
        this.accountRepository = accountRepository;
        logger.info("UPITransferService initialized.");
    }

    @Override
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        logger.info("Initiating transfer from " + fromAccountNumber + " to " + toAccountNumber + " of amount: " + amount);
        // Logic to transfer funds using UPI


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
