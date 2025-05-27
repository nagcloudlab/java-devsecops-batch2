package com.example;

import java.util.function.Consumer;

public class VariableCaptureInLambda {

    public static void main(String[] args) {

        // imp-note : lambda can capture variables from the enclosing scope
        // only final or effectively final variables can be captured
        String prefix = "Hello, ";
        //prefix = "Hi, ";

        Consumer<String> consumer = name -> {
            // The variable 'name' is captured by the lambda expression
            System.out.println(prefix + name + "!");
        };

        // Calling the lambda expression
        consumer.accept("Alice");

    }

}
