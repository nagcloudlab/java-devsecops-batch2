package com.example;

import com.example.model.Chapter;

import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {
    public static void main(String[] args) {


        Set<Chapter> chapters = new TreeSet<>();
        chapters.add(new Chapter("Introduction", 20));
        chapters.add(new Chapter("Java Basics", 20));
        chapters.add(new Chapter("Advanced Java", 30));
        chapters.add(new Chapter("Introduction", 10)); // Duplicate, will not be added

        System.out.println(chapters.size());


    }
}
