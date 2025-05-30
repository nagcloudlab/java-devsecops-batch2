package com.example;

public class LoaderTest {
    public static void main(String[] args) {
        ClassLoader loader = LoaderTest.class.getClassLoader();
        System.out.println(loader);                     // Application ClassLoader
        System.out.println(loader.getParent());         // Platform ClassLoader
        System.out.println(loader.getParent().getParent()); // null (Bootstrap)
    }
}
