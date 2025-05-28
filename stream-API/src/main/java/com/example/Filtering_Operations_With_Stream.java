package com.example;

import java.util.List;

public class Filtering_Operations_With_Stream {

    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 9, 10);

        // filtering

        // 1. filter() - content based
        numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println();
        // 2. skip() & limit() - count based..
        numbers
                .stream()
                .limit(5)
                .skip(3)
                .forEach(System.out::println);

        System.out.println();
        // 3. distinct() - unique elements
        numbers
                .stream()
                .distinct() // equals()
                .forEach(System.out::println);


        // 4. takeWhile() - elements that match the predicate until the first mismatch
        System.out.println();
        List<Integer> sortedList = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );
        // take elements while they are less than 5
        sortedList
                .stream()
                .peek(ele -> System.out.println("Processing: " + ele))
                .takeWhile(n -> n < 5)
                .forEach(System.out::println);

        System.out.println();
        // 5. dropWhile() - elements that match the predicate until the first match
        sortedList
                .stream()
                .peek(ele -> System.out.println("Processing: " + ele))
                .dropWhile(n -> n < 5)
                .forEach(System.out::println);


        //------------------

        // filter
        // takeWhlile
        // dropWhile
        // skip
        // limit
        // distinct

        //-------------------


        System.out.println("-------------------");
        // filter & takeWhile
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers2
                .stream()
                .peek(ele -> System.out.println("Processing: " + ele))
                //.filter(n -> n < 5)
                .takeWhile(n -> n < 5)
                .forEach(System.out::println);

    }

}
