package com.example;

import com.example.model.Dish;

import java.util.List;

public class Terminal_Operations_Example {

    public static void main(String[] args) {


        List<Dish> menu = Dish.menu;

        // 1. Void terminal operation: forEach
        menu
                .stream()
                .filter(dish -> dish.getCalories() > 300)
                .forEach(dish -> System.out.println(dish));


        // 2. collect terminal operation: collect

        // a. toList
        List<Dish> highCalorieDishes = menu
                .stream()
                .filter(dish -> dish.getCalories() > 300)
                .collect(java.util.stream.Collectors.toList());
        System.out.println("High calorie dishes: " + highCalorieDishes);

        // b. toSet
        java.util.Set<Dish> highCalorieDishesSet = menu
                .stream()
                .filter(dish -> dish.getCalories() > 300)
                .collect(java.util.stream.Collectors.toSet());
        System.out.println("High calorie dishes set: " + highCalorieDishesSet);

        // c. toMap
        java.util.Map<String, Integer> highCalorieDishesMap = menu
                .stream()
                .filter(dish -> dish.getCalories() > 300)
                .collect(java.util.stream.Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println("High calorie dishes map: " + highCalorieDishesMap);

        //d. partitioningBy
        java.util.Map<Boolean, List<Dish>> partitionedDishes = menu
                .stream()
                .collect(java.util.stream.Collectors.partitioningBy(dish -> dish.isVegetarian()));
        System.out.println("Partitioned dishes: " + partitionedDishes);

        //e. groupingBy
        java.util.Map<Dish.Type, List<Dish>> groupedByType = menu
                .stream()
                .collect(java.util.stream.Collectors.groupingBy(Dish::getType));
        System.out.println("Grouped by type: " + groupedByType);

        //f. joining
        String joinedDishNames = menu
                .stream()
                .map(Dish::getName)
                .collect(java.util.stream.Collectors.joining(", "));
        System.out.println("Joined dish names: " + joinedDishNames);

        // g. reduce terminal operation: reduce
        int totalCalories = menu
                .stream()
                .mapToInt(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println("Total calories: " + totalCalories);


        // h. counting terminal operation: count
        long countHighCalorieDishes = menu
                .stream()
                .filter(dish -> dish.getCalories() > 300)
                .count();
        System.out.println("Count of high calorie dishes: " + countHighCalorieDishes);

        // i. min and max terminal operations
        java.util.Optional<Dish> minCalorieDish = menu
                .stream()
                .max((d1, d2) -> Double.compare(d1.getCalories(), d2.getCalories()));
        minCalorieDish.ifPresent(dish -> System.out.println("Dish with minimum calories: " + dish));

        java.util.Optional<Dish> maxCalorieDish = menu
                .stream()
                .min((d1, d2) -> Double.compare(d1.getCalories(), d2.getCalories()));

        maxCalorieDish.ifPresent(dish -> System.out.println("Dish with maximum calories: " + dish));


        // j. anyMatch, allMatch, noneMatch terminal operations

        boolean anyVegetarian = menu
                .stream()
                .anyMatch(Dish::isVegetarian);
        System.out.println("Any vegetarian dish: " + anyVegetarian);
    }

}
