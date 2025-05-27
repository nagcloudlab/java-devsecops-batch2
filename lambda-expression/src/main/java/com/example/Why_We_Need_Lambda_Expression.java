package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Why_We_Need_Lambda_Expression {

    public static void main(String[] args) {

        // way-1: Named Class
        class OddPredicate implements Predicate {
            @Override
            public boolean test(Integer number) {
                return number % 2 != 0;
            }
        }
        Predicate oddPredicate1 = new OddPredicate();

        //Way-2: Anonymous Class
        Predicate oddPredicate2 = new Predicate() {
            @Override
            public boolean test(Integer number) {
                return number % 2 != 0;
            }
        };

        //Way-3: Lambda Expression  ( Function )  ( java 8 onwards )
        Predicate oddPredicate3 = n -> n % 2 != 0;


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Req-1 : filter odd numbers
        System.out.println(
                NumberLibrary.filterNumbers(numbers, oddPredicate3)
        );
        // Req-2 : filter even numbers
        System.out.println(
                NumberLibrary.filterNumbers(numbers, n -> n % 2 == 0)
        );
        // Req-3 : filter numbers greater than 5
        System.out.println(
                NumberLibrary.filterNumbers(numbers, n -> n > 5)
        );


    }

}
