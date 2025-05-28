package com.example;


class TransferService {
    public void transfer(String from, String to, int amount) {
        System.out.println("Transferring " + amount + " from " + from + " to " + to);
        // Simulate some processing time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Transfer interrupted");
        }
        System.out.println("Transfer completed");
    }
}

public class Application {
    public static void main(String[] args) {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);


        TransferService transferService = new TransferService();

        // transfer-requests..

        // step-1 : Request 1
        transferService.transfer("Alice", "Bob", 100);

        // step-2 : Request 2
        transferService.transfer("Charlie", "Dave", 200);

        // step-3
        transferService.transfer("Eve", "Frank", 300);

    }
}
