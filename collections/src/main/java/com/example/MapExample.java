package com.example;

import com.example.model.Car;
import com.example.model.Owner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {


        Owner owner1 = new Owner("riya", "chennai");
        Owner owner2 = new Owner("diya", "hyderabad");

        Car car1 = new Car("BMW", "X5", 2020);
        Car car2 = new Car("Audi", "Q7", 2021);

        //Map<Owner, Car> map = new TreeMap<>();
        Map<Owner, Car> map = new HashMap<>();
        map.put(owner1, car1);
        map.put(owner2, car2);
        map.put(new Owner("sita", "delhi"), new Car("Mercedes", "C-Class", 2022));

        //-----------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter owner name to search car details:");
        String ownerName = scanner.nextLine();
        Owner searchOwner = new Owner(ownerName, null);
        Car car = map.get(searchOwner);

        if (car != null) {
            System.out.println("Car details for owner " + ownerName + ": " + car);
        } else {
            System.out.println("No car found for owner " + ownerName);
        }


    }

}
