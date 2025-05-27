package com.example;

import com.example.model.Car;

import java.util.HashSet;
import java.util.Set;

public class SetExample3 {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Toyota", "Camry", 2020);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.equals(car2));

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);

        System.out.println(cars.size());


    }

}
