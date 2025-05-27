package com.example;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {

        Product p1 = new Product(23123, "product-2", 100.00);
        Product p2 = new Product(34535, "product-1", 400.00);
        Product p3 = new Product(12312, "product-4", 400.00);
        Product p4 = new Product(54634, "product-3", 200.00);
        Product p5 = new Product(67968, "product-5", 700.00);


        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p4);
        products.add(p5);

        // sort.. = compare + swap
        //Collections.sort(products);

        //IdComparator idComparator = new IdComparator();
        //Collections.sort(products, idComparator);


        NameComparator nameComparator = new NameComparator();
        Collections.sort(products, nameComparator);


        display(products);

    }

    private static void display(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class IdComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Long.compare(o1.id, o2.id);
    }
}

class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.name.compareTo(o2.name);
    }
}