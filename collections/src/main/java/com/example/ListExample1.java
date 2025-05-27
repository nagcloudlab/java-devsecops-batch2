package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample1 {

    public static void main(String[] args) {

        // List<String> list = new Vector<>(1000);
        // List<String> list = new ArrayList<>(1000);
        // List<String> list = new LinkedList<>();
        // list.add("foo");
        // list.add("bar");
        // list.add("baz");


        //------------------------------------------
        //------------------------------------------


        List<String> sheet1 = new ArrayList<>();
        sheet1.add("A");
        sheet1.add("D");
        sheet1.add("C");
        sheet1.add("B");

        List<String> sheet2 = new ArrayList<>();
        sheet2.add("A");
        sheet2.add("D");
        sheet2.add("E");

        // CRUDS


        sheet1.removeAll(sheet2);

        System.out.println(sheet1);

    }
}
