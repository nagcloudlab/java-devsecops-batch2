package com.example.repository;

public class AccountRepositoryFactory {

    public static AccountRepository getAccountRepository(String dataAccessTech) {
        if ("jdbc".equalsIgnoreCase(dataAccessTech)) {
            return new JdbcAccountRepository();
        } else if ("jpa".equalsIgnoreCase(dataAccessTech)) {
            return new JpaAccountRepository();
        } else {
            throw new IllegalArgumentException("Unknown repository type: " + dataAccessTech);
        }
    }

}
