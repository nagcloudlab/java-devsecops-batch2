
package com.example.service;

import com.example.model.Account;
import com.example.repository.AccountRepository;
import com.example.repository.MockAccountRepository;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;

import com.npci.Calculator;

@Component("transferService")
public class UPITransferService implements TransferService {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger("transfer-service");


    private AccountRepository accountRepository;

    // @Autowired
    public UPITransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        logger.info("UPITransferService initialized.");
    }

    @Override
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        // accountRepository = new MockAccountRepository();
            logger.info("Thread [{}] started transfer", Thread.currentThread().getName());

            Account fromAccount = accountRepository.findByAccountNumber(fromAccountNumber);
            Account toAccount = accountRepository.findByAccountNumber(toAccountNumber);

            Calculator calculator = new Calculator();
            System.out.println("Calculator: " + calculator.add(1, 2));
            
            fromAccount.setBalance(fromAccount.getBalance() - amount);
            logger.info("Deducted {} from {}. New balance: {}", amount, fromAccountNumber,
                    fromAccount.getBalance());

            toAccount.setBalance(toAccount.getBalance() + amount);
            logger.info("Added {} to {}. New balance: {}", amount, toAccountNumber, toAccount.getBalance());

            accountRepository.save(fromAccount);
            accountRepository.save(toAccount);
            logger.info("Thread [{}] completed transfer", Thread.currentThread().getName());

    }
}
