package com.example;

import com.npci.Calculator;

public class Main {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 8;

        Calculator calculator = new Calculator();
        int sum = calculator.add(number1, number2);
        int difference = calculator.subtract(number1, number2);
        int product = calculator.multiply(number1, number2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

    }
}