package com.example;

/*

First Class Functions
        - A function can be stored in a variable or value
        - A parameter of a function can be a function
        - The return value of a function can be a function
A higher order function ( HOF )
        - A function with a parameter that is a function
        - A function whose return value is a function

 */

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Principles_of_Function {

    public static void main(String[] args) {


        Consumer<String> hello = (name) -> {
            System.out.println("Hello " + name);
        };


        Consumer<String> hi = (name) -> {
            System.out.println("Hi " + name);
        };


        // HOF
        Function<Consumer<String>, Consumer<String>> withEmoji = inputFunc -> {
            Consumer<String> outputFunc = (name) -> {
                System.out.println("😊");
                inputFunc.accept(name);
            };
            return outputFunc;
        };


        hello.accept("Foo");
        Consumer<String> helloWithEmoji = withEmoji.apply(hello);
        helloWithEmoji.accept("Bar");


        Predicate<Integer> isMin = (x) -> x < 10;
//        Function<Predicate<Integer>, Predicate<Integer>> negate = p -> {
//            return (x) -> !p.test(x);
//        };
        Predicate<Integer> isMax = isMin.negate();

        //-------------------------------------------------------------


        Consumer<String> consoleLogger = (line) -> {
            System.out.println("Console: " + line);
        };
        Consumer<String> fileLogger = (line) -> {
            // Simulate writing to a file
            System.out.println("File: " + line);
        };

        String logLine = "2023-10-01 12:00:00 INFO User logged in";
        Consumer<String> consoleAndFileLogger = consoleLogger.andThen(fileLogger);
        consoleAndFileLogger.accept(logLine);

    }


}
