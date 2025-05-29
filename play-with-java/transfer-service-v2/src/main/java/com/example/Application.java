package com.example;

import com.example.repository.AccountRepository;
import com.example.repository.AccountRepositoryFactory;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.service.TransferService;
import com.example.service.UPITransferService;
import org.apache.log4j.Logger;

public class Application {


    private static Logger logger = Logger.getLogger("transfer-service");

    public static void main(String[] args) {

        //----------------------------------------
        // init / boot
        //----------------------------------------
        // initialize & assemble application's
        // components based on config

        AccountRepository accountRepository = AccountRepositoryFactory.getAccountRepository("jpa");
        TransferService transferService = new UPITransferService(accountRepository);

        System.out.println();
        System.out.println();
        //----------------------------------------
        // run
        //----------------------------------------

        transferService.transfer(
                "user1@upi",
                "user2@upi",
                100.0
        );
        System.out.println();
        transferService.transfer(
                "user1@upi",
                "user2@upi",
                200.0
        );

        System.out.println();
        System.out.println();
        //----------------------------------------
        // shutdown
        //----------------------------------------
        // clean up resources, if any


    }
}
