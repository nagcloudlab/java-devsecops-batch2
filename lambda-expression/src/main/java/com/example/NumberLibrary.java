package com.example;

import java.util.ArrayList;
import java.util.List;

public class NumberLibrary {


    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate obj) {
        // get 'odd' or 'even' numbers to a new list based on isOdd flag
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer n : numbers) {
            if (obj.test(n)) {
                filteredNumbers.add(n);
            }
        }
        return filteredNumbers;
    }

    
//    public static List<Integer> filterNumbersByPrimitive(List<Integer> numbers, boolean isOdd) {
//        // get 'odd' or 'even' numbers to a new list based on isOdd flag
//        List<Integer> filteredNumbers = new ArrayList<>();
//        for (Integer n : numbers) {
//            if (isOdd && n % 2 != 0) {
//                filteredNumbers.add(n);
//            } else if (!isOdd && n % 2 == 0) {
//                filteredNumbers.add(n);
//            }
//        }
//        return filteredNumbers;
//    }
//
//    public static List<Integer> filterEvens(List<Integer> numbers) {
//        // get 'odd' numbers to a new list
//        List<Integer> odds = new ArrayList<>();
//        for (Integer n : numbers) {
//            if (n % 2 != 0) {
//                odds.add(n);
//            }
//        }
//        return odds;
//    }
//
//    public static List<Integer> filterOdds(List<Integer> numbers) {
//        // get 'odd' numbers to a new list
//        List<Integer> odds = new ArrayList<>();
//        for (Integer n : numbers) {
//            if (n % 2 == 0) {
//                odds.add(n);
//            }
//        }
//        return odds;
//    }


}
