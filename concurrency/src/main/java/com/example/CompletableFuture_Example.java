package com.example;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public class CompletableFuture_Example {

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {


        // For Each Order
        // step-1 : fetch-order-details
        // step-2 : enrich order-details
        // step-3 : process order

        List<String> orders = List.of("order1", "order2", "order3");


        ExecutorService pool1 = java.util.concurrent.Executors.newFixedThreadPool(3);
        ExecutorService pool2 = java.util.concurrent.Executors.newFixedThreadPool(2);


        for (String order : orders) {
            System.out.println("initiating " + order);
            CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
                // step-1: fetch order details
                System.out.println("Fetching details for " + order);
                sleep();
                return order + " details";
            }, pool1).thenAcceptAsync(enrichedOrderDetails -> {
                // step-3: process order
                sleep();
                System.out.println("Processing " + enrichedOrderDetails);
            }, pool2);
        }


        // Wait for all tasks to complete
        Thread.sleep(10 * 1000);


    }
}
