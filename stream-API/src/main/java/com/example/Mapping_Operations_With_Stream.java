package com.example;

import java.util.List;
import java.util.stream.Stream;

public class Mapping_Operations_With_Stream {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5);


        numbers
                .stream()
                .map(n -> n * n) // Squaring each number
                .forEach(System.out::println); // Printing each squared number

        System.out.println("----------------------------");
        numbers
                .stream()
                .flatMap(n -> Stream.of(n, n * n, n * n * n))
                .forEach(System.out::println); // This will not print anything as flatMap is empty

        System.out.println("----------------------------");

        String[] menu = {
                "idly,vada,upma,sambar",
                "dosa,chutney",
                "poori,masala",
                "upma",
        };

        Stream.of(menu)
                .flatMap(item -> Stream.of(item.split(","))) // Splitting each string into individual items
                .distinct() // Removing duplicates
                .map(String::toUpperCase) // Converting each item to uppercase
                .forEach(System.out::println); // Printing each item


    }
}
