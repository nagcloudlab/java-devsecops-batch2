package com.example;

import java.util.List;
import java.util.stream.Stream;

public class How_To_Work_With_Stream {


    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        // stream => source -> intermediate operations => terminal operation

        // create stream
        Stream<Integer> stream = numbers.stream()
                .peek(n -> System.out.println("before filter: " + n)) // Peek to see the numbers before filtering
                // Intermediate operation(s): e.g filter, map
                .filter(n -> n % 2 == 0) // Filter even numbers
                .peek(n -> System.out.println("after filter: " + n)) // Peek to see the numbers after filtering
                .map(n -> n * n) // Square the even numbers
                .peek(n -> System.out.println("after map: " + n)) // Peek to see the numbers after mapping
                .limit(3);


        // Terminating operation: e.g forEach, collect

        stream.forEach(System.out::println);

        stream.forEach(System.out::println); // // This will throw an IllegalStateException because the stream has already been consumed


        // in stream , data pulled from bottom, not pushed from top

    }

}
