package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


class Baz {
    int x;
    int y;

    public Baz(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baz baz = (Baz) o;
        return x == baz.x;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x);
    }
}

public class HashCollnExample {

    public static void main(String[] args) {


        Set<Baz> bazs = new HashSet<>();
        bazs.add(new Baz(1, 2));
        bazs.add(new Baz(1, 20));

        System.out.println(bazs.size()); // Output: 1

        HashMap<Baz, String> bazMap = new HashMap<>();
        bazMap.put(new Baz(1, 2), "First");
        bazMap.put(new Baz(1, 3), "Second");




    }

}
