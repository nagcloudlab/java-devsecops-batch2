package com.example;

import java.util.function.*;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {


        Function<String, Integer> f1 = s -> {
            return s.length();
        };
        Predicate<String> p1 = s -> {
            return true;
        };
        Consumer<String> c1 = s -> {
        };
        Supplier<String> s1 = () -> {
            return "hello";
        };

        BiFunction<String, String, Integer> f2 = (a, b) -> {
            return a.length() + b.length();
        };
        BiPredicate<String, String> p2 = (a, b) -> {
            return a.length() > b.length();
        };
        BiConsumer<String, String> c2 = (a, b) -> {
            System.out.println(a + " " + b);
        };

        UnaryOperator<String> uo1 = s -> {
            return s.toUpperCase();
        };
        BinaryOperator<String> bo1 = (a, b) -> {
            return a + b;
        };

        int a = 12;
        Integer i = 13;

        BinaryOperator<Integer> add = (x, y) -> {
            return x + y;
        };
        System.out.println(add.apply(10, 20));


        IntBinaryOperator intAdd = (x, y) -> {
            return x + y;
        };
        LongBinaryOperator longAdd = (x, y) -> {
            return x + y;
        };
        DoubleBinaryOperator doubleAdd = (x, y) -> {
            return x + y;
        };

        IntUnaryOperator intSquare = x -> {
            return x * x;
        };
        LongUnaryOperator longSquare = x -> {
            return x * x;
        };
        DoubleUnaryOperator doubleSquare = x -> {
            return x * x;
        };

        ToIntFunction<String> toInt = s -> {
            return s.length();
        };

        ToLongFunction<String> toLong = s -> {
            return s.length();
        };

        ToDoubleFunction<String> toDouble = s -> {
            return s.length();
        };

        //...


    }
}
