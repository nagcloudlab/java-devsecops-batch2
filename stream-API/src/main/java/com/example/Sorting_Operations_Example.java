package com.example;

import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}


public class Sorting_Operations_Example {
    public static void main(String[] args) {


        List<Product> products = List.of(
                new Product("Laptop", 1200.00),
                new Product("Smartphone", 800.00),
                new Product("Tablet", 300.00),
                new Product("Smartwatch", 200.00)
        );

        products
                .stream()
                .filter(p -> p.getPrice() > 200)
                .sorted((p1,p2)-> Double.compare(p2.getPrice(), p1.getPrice()))
                .forEach(System.out::println);

    }
}
