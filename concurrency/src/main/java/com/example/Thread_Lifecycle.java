package com.example;

public class Thread_Lifecycle {
    public static void main(String[] args) {

        Runnable printNumberTask = () -> {
            String threadName = Thread.currentThread().getName();
            for (int i = 1; i <= 100; i++) {
                System.out.println(threadName + " - Number: " + i);
                try {
                    Thread.sleep(0); // Sleep for 1 second // TIMED_WAITING | BLOCKED | WAITING
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }; // TERMINATED

        Thread thread1 = new Thread(printNumberTask, "t1"); // NEW
        System.out.println(thread1.getState());
        thread1.start(); // RUNNABLE

        Thread thread2 = new Thread(printNumberTask, "t2"); // NEW
        System.out.println(thread2.getState());
        thread2.start(); // RUNNABLE


    }
}
