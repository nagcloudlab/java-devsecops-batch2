package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {


        List<String> menu = new ArrayList<>(); // mutable list
        menu.add("veg");
        menu.add("non-veg");
        menu.add("veg");
        menu.add("non-veg");
        menu.add("veg");
        menu.add("non-veg");

        // remove all 'non-veg' items from the menu
//        Iterator<String> iterator = menu.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if (item.equals("non-veg"))
//                iterator.remove();
//        }

        menu.removeIf(item -> item.equals("non-veg"));

        System.out.println(menu);


        List<String> snacks = new ArrayList<>();
        snacks.add("foo");
        snacks.add("bar");
        snacks.add("baz");

        snacks.replaceAll(item -> item.toUpperCase());

        System.out.println(snacks);


    }

}
