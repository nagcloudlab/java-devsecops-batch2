package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) {

        // Input
        String[] csvReport = {
                "Alice,Engineering,70000",   // str.split(",")
                "Bob,Marketing,60000",
                "Charlie,Engineering,80000", // Double.parseDouble(tokens[2) => salary
                "David,Marketing,50000",
                "Eve,Engineering,75000",
                "Frank,HR,55000"
        };

        Map<String, Double> resultMap = new HashMap<>();
        for (String csvLine : csvReport) {
            String[] tokens = csvLine.split(",");
            String department = tokens[1];
            double salary = Double.parseDouble(tokens[2]);
            if (resultMap.containsKey(department)) {
                double currentTotal = resultMap.get(department);
                resultMap.put(department, currentTotal + salary);
            } else {
                resultMap.put(department, salary);
            }
        }

        // Output
        Set<String> keySet = resultMap.keySet();
        for (String key : keySet) {
            System.out.println(key + ": " + resultMap.get(key));
        }


    }

}
