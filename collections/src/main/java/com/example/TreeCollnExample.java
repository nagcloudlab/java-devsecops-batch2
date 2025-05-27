package com.example;

import java.util.*;

class Foo implements Comparable<Foo> {
    @Override
    public int compareTo(Foo o) {
        return 0;
    }
}

class Bar {
}


public class TreeCollnExample {

    public static void main(String[] args) {

        Set<Foo> treeSet = new TreeSet<>();
        treeSet.add(new Foo());
        treeSet.add(new Foo());

        class BarComparator implements Comparator<Bar> {
            @Override
            public int compare(Bar o1, Bar o2) {
                return 0; // Custom comparison logic for Bar objects
            }
        }
        Set<Bar> treeSet2 = new TreeSet<>(new BarComparator());
        treeSet2.add(new Bar());

        TreeMap<Foo, Bar> treeMap = new TreeMap<>();
        treeMap.put(new Foo(), new Bar());
        treeMap.put(new Foo(), new Bar());


    }


}
