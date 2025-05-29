package com.example;

import java.util.concurrent.ExecutorService;

public class Thread_Naming_Example {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        },"foo");
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });
        thread2.setName("bar");
        thread2.start();


        // thread pool
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });


    }
}
