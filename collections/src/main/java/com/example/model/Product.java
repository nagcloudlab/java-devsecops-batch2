package com.example.model;

public class Product implements Comparable<Product> {

    public long id;
    public  String name;
    public  double price;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.price == o.price)
            return 0;
        else if (this.price > o.price)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
