package com.example;


class AccountNotFoundException extends Throwable {
    String account;
    String message;

    AccountNotFoundException(String account, String message) {
        this.account = account;
        this.message = message;
    }
}

//----------------------------------------------------
// Service module ( business logic )  -> team-1
//----------------------------------------------------
class TransferService {
    public void transfer(double amount, String fromUPI, String toUPI) throws AccountNotFoundException {
        // load 'from' & 'to' accounts
        boolean isFromAccountExist = !fromUPI.equals("from@oksbi");
        if (!isFromAccountExist) {
            throw new AccountNotFoundException(fromUPI, "upi-account doest not exist");
        }

    }
}
//----------------------------------------------------
// Web module ( Request & Response Logic )  -> team-2
//----------------------------------------------------
class TransferController {

    TransferService transferService = new TransferService();

    public void handleTransferRequest(/*http-request*/) {

        // extract input params from http-request
        double amount = 1000.00;
        String fromUPI = "foo@oksbi";
        String toUPI = "to@okicici";

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
            // clean any external resouces being resuled..
            System.out.println("transfer  failed...");
        }


    }
}


public class Application {

    public static void main(String[] args) {

        TransferController transferController = new TransferController();
        transferController.handleTransferRequest(/*http-request*/);

    }

}
