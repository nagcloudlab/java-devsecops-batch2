package com.example;


import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Future_Example {
    public static void main(String[] args) {

        Callable<List<String>> callableTask = () -> {
            String file = "/Users/nag/java-devsecops-batch2/concurrency/file1.txt";
            return Files.lines(java.nio.file.Path.of(file))
                    .collect(Collectors.toList());
        };

        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(11);
        Future<List<String>> future = executorService.submit(callableTask);
        //.......

        try {

            List<String> lines = future.get(); //block until the task is completed
            lines.forEach(System.out::println);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}
