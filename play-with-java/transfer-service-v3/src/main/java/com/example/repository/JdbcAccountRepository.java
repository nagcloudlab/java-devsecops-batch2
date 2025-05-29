package com.example.repository;

import com.example.model.Account;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

/**
 * author : dev-1
 */

@Component
public class JdbcAccountRepository implements AccountRepository {

    private static Logger logger = Logger.getLogger("transfer-service");

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcAccountRepository(JdbcTemplate jdbcTemplate) {
        // Initialization logic if needed
        this.jdbcTemplate = jdbcTemplate;
        logger.info("JdbcAccountRepository initialized.");
    }

    @Override
    public Account findByAccountNumber(String number) {
        logger.info("Finding account by number: " + number);
        // Logic to find the account by number from the database
        String sql = "SELECT * FROM accounts WHERE number = ?";
        RowMapper<Account> rowMapper = (rs, rowNumber) -> {
            Account account = new Account(rs.getString("number"), rs.getDouble("balance"));
            return account;
        };
        return jdbcTemplate.queryForObject(sql, rowMapper, number);
    }

    @Override
    public void save(Account account) {
        logger.info("Saving account: " + account.getNumber() + " with balance: " + account.getBalance());
        // Logic to save the account to the database
        String sql = "UPDATE accounts SET balance = ? WHERE number = ?";
        jdbcTemplate.update(sql, account.getBalance(), account.getNumber());
        // This is a stub implementation; actual implementation would interact with a database
    }

}
