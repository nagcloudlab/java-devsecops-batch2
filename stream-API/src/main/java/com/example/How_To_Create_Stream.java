package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class How_To_Create_Stream {

    public static void main(String[] args) throws IOException {


        // way-1 : data elements
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .forEach(System.out::println);

        //way-2: from array
        Integer[] numbers = {11, 12, 13, 14, 15};
        Stream.of(numbers)
                .forEach(System.out::println);

        // way-3: from collection
        List<Integer> numberList = List.of(16, 17, 18, 19, 20);
        numberList.stream()
                .forEach(System.out::println);

        // way-4: from file
        Files.lines(Path.of("/Users/nag/java-devsecops-batch2/stream-API/report.csv"))
                .forEach(System.out::println);

        // way-5: from database-table


        // way-6: from infinite stream - generate
//        Stream.generate(() -> {
//                    return (int) (Math.random() * 100);
//                })
//                .forEach(System.out::println);

        // way-7: from infinite stream - iterate
        Stream.iterate(1, n -> n + 1)
                .forEach(System.out::println);


    }
}
