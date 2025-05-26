package com.example;

import java.util.*;

public class SetExample1 {

    public static void main(String[] args) {

        class NameDescComparator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Descending order
            }
        }

        //Set<String> set = new TreeSet<>(new NameDescComparator()); // sorted
        //Set<String> set=new HashSet<>(); // unordered
        Set<String> set = new LinkedHashSet<>(); // maintains insertion order
        set.add("apple");
        set.add("cherry");
        set.add("apple"); // Duplicate, will not be added
        set.add("date");
        set.add("banana");

        // Display the elements in the set
        System.out.println("Set elements: " + set);

    }

}
