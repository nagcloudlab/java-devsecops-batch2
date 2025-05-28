package com.example;


//class HelloTask implements Runnable {
//    public void run() {
//        String threadName = Thread.currentThread().getName();
//        System.out.println("Hello from " + threadName);
//    }
//}

import java.util.concurrent.ExecutorService;

public class How_To_Create_Thread {
    public static void main(String[] args) {

//        HelloTask helloTask = new HelloTask();

        Runnable helloTask = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello from " + threadName);
        };

        Runnable hiTask = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hi from " + threadName);
        };

        // 2 ways, to create threads
        // 1. on demand
        // 2. using thread-pools


        // // 1. on demand
//        Thread thread1 = new Thread(helloTask, "T1");
//        thread1.start(); // allocate 'stack' memory for the thread, and start it
//
//        Thread thread2 = new Thread(hiTask, "T2");
//        thread2.start(); // allocate 'stack' memory for the thread, and start it


        // 2. using thread-pools  ( For example, using ExecutorService )
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(2);
        executorService.submit(helloTask); // submit the task to the thread pool
        executorService.submit(hiTask); // submit the task to the thread pool

    }
}
