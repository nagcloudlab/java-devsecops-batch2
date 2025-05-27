package com.example;


/*

    data processing code
    ---------------------

    -> filtering
    -> mapping aka transformation
    -> sorting
    -> partitioning
    -> grouping
    -> aggregation - min, max, sum, average, count
    -> collecting - collect the results into a collection, like List, Set, Map, etc.
    .....

 */


import com.example.model.Dish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {


        List<Dish> menu = Dish.menu;


        // get low-cal ( < 400 ) dish's names sorted by calories
        // - filtering
        // - sorting
        // - mapping

        System.out.println(
                getLowCalDishesNamesSortedByCaloriesV1(menu)
        );

        System.out.println(
                getLowCalDishesNamesSortedByCaloriesV2(menu)
        );

    }

    private static List<String> getLowCalDishesNamesSortedByCaloriesV2(List<Dish> menu) {
        return menu
                .stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted((d1, d2) -> Integer.compare(d1.getCalories(), d2.getCalories()))
                .map(d -> d.getName())
                .collect(Collectors.toList());
    }


    // data processing pipeline ( stage-1: filtering, stage-2: sorting, stage-3: mapping )
    private static List<String> getLowCalDishesNamesSortedByCaloriesV1(List<Dish> menu) {

        // step-1: filter the dishes with calories < 400
        List<Dish> filteredDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                filteredDishes.add(dish);
            }
        }

        // step-2: sort the filtered dishes by calories
        Comparator<Dish> caloriesComparator = new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        };
        filteredDishes.sort(caloriesComparator);

        // step-3: map the filtered and sorted dishes to their names
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : filteredDishes) {
            dishNames.add(dish.getName());
        }

        // return the list of dish names
        return dishNames;
    }
}
