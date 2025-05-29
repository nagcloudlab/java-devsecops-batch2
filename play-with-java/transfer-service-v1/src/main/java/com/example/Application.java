package com.example;

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

        UPITransferService transferService = new UPITransferService();

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
