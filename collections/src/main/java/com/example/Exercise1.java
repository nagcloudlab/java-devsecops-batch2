package com.example;

import com.example.model.Dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {

        List<Dish> menu = Dish.menu;
        // Get low calorie ( < 400 calories) dish's names in new List ( sorted by cal )
        // step-1 : filter dish to new list
        List<Dish> filteredMenu = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                filteredMenu.add(dish);
            }
        }

        // step-2 : sort by cal
        class CalComparator implements Comparator<Dish> {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        }
        filteredMenu.sort(new CalComparator());
        // step-3 : extract dish name into new list
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : filteredMenu) {
            dishNames.add(dish.getName());
        }

        System.out.println(dishNames);


    }

}
