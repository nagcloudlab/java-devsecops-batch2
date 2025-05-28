package com.example;

/*


    2 types of tasks


   1. computational tasks
    2. I/O tasks

 */

import java.util.Scanner;

public class Application2 {

    // IO task
    private static void ioTask() {
        String threadName = Thread.currentThread().getName();
        System.out.println("IO task started by " + threadName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some input: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
        System.out.println("IO task completed by " + threadName);
    }

    // Computational task
    private static void computationalTask() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Computational task started by " + threadName);
        long sum = 0;
        for (long i = 0; i < 1_000_000_000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Computational task completed by " + threadName);
    }


    public static void main(String[] args) {

        // step-1:
        ioTask();

        // step-2:
        computationalTask();

    }
}
