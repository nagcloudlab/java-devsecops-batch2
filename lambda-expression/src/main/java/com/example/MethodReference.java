package com.example;


import java.util.ArrayList;
import java.util.List;

/**
 * author : third-party
 */
class MathLib {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}


public class MethodReference {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        // Remove All Even numbers

        // Functional style
        //numbers.removeIf(n -> n % 2 == 0);
        //numbers.removeIf(n -> MathLib.isEven(n));
        numbers.removeIf(MathLib::isEven); // Method reference
        System.out.println(numbers);

    }

}
