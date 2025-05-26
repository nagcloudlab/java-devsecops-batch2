package com.example;


import java.sql.Connection;
import java.sql.SQLException;

/**
 * Throwable
 * <p>
 * - Exception
 * - Error
 */


/*

    2 types of exceptions

    - checked
    - un-checked

 */



class SomeService {
    public void m1() {
        // bad..
        throw new RuntimeException();
    }

    public void m2() {
        m1();
    }

    public void m3() {
        try {
            m2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}


class AccountNotFoundException extends RuntimeException {
    String account;
    String message;

    AccountNotFoundException(String account, String message) {
        this.account = account;
        this.message = message;
    }
}

class AccountBalanceException extends RuntimeException {
    double currentBalance;
    String message;

    public AccountBalanceException(double currentBalance, String message) {
        this.currentBalance = currentBalance;
        this.message = message;
    }
}

class OutOfMemoryError extends Error {
}


//-----------------------------------------------------
// Data Layer
//------------------------------------------------------

class AccountRepository {
    public String getAccount(String accountId) {
        //
        try {
            Connection connection = null;
            connection.prepareStatement("select unknownclumn from table");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

}


//----------------------------------------------------
// Service module ( business logic )  -> team-1 ( nag )
//----------------------------------------------------
class TransferService {
    public void transfer(double amount, String fromUPI, String toUPI) /*throws AccountNotFoundException*/ {
        // load 'from' & 'to' accounts
        boolean isFromAccountExist = fromUPI.equals("foo@oksbi");
        if (!isFromAccountExist) {
            throw new AccountNotFoundException(fromUPI, "upi-account doest not exist");
        }
        // check balance..
        double fromAccountBalance = 500.00;
        if (amount > fromAccountBalance) {
            throw new AccountBalanceException(fromAccountBalance, "No enough funds");
        }
    }
}

//----------------------------------------------------
// Web module ( Request & Response Logic )  -> team-1 ( nag )
//----------------------------------------------------
class TransferController {

    TransferService transferService = new TransferService();

    public void handleTransferRequest(/*http-request*/) {

        // extract input params from http-request
        double amount = 1000.00;
        String fromUPI = "foo@oksbi";
        String toUPI = "bar@okicici";

        try {
            transferService.transfer(amount, fromUPI, toUPI);
            // prepare success http-response...
            System.out.println("transfer success");

        } catch (AccountNotFoundException e) {
            //...
            // Provide User friendly info about failure ( via HTTP )
            // log the failure ( for future fix )
            // execute plan-B
            // re-throw to other module..
            System.out.println("transfer  failed..." + e.message + " " + e.account);
        } catch (AccountBalanceException e) {
            System.out.println("transfer  failed..." + e.message + " " + e.currentBalance);
        } catch (Exception e) {
            //..
            System.out.println("generic execption handler..");
        } finally {
            // // clean any external resouces being resuled..
        }


    }
}


public class Application {

    public static void main(String[] args) {

        TransferController transferController = new TransferController();
        transferController.handleTransferRequest(/*http-request*/);

    }

}
