package com.example;


import com.example.util.LinkedList;

import java.util.Iterator;

public class Example2 {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(13);
        numbers.add(39);
        numbers.add(52);
        numbers.add(65);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }

        // or

        // java 1.5

        for (Integer i : numbers) {
            System.out.println(i);
        }


        LinkedList<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.add("hi");

        for (String s : strings) {
            System.out.println(s);
        }


    }

}
