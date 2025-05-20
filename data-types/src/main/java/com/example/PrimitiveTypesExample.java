package com.example;

public class PrimitiveTypesExample {

    public static void main(String[] args) {

        // java primary data types

        // 1. whole numbers
        // byte - 8 bits -> -128 to 127
        byte b = 127;
        // short - 16 bits -> -32,768 to 32,767
        short s = 32767;
        // int - 32 bits -> -2,147,483,648 to 2,147,483,647
        int i = 2147483647;
        // long - 64 bits -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 9223372036854775807L;


        // 2. floating point numbers
        // float - 32 bits -> 1.4E-45 to 3.4E+38
        float f = 3.40282347E+38F;
        // double - 64 bits -> 4.9E-324 to 1.8E+308
        double d = 1.7976931348623157E+308;

        // 3. character
        // char - 16 bits -> 0 to 65,535 - Unicode characters
        char c1 = 'A'; // 65
        char c2 = 65; // 'A'
        char c3 = '\u0041'; // 'A' - Unicode representation
        char inrSymbol = '\u20B9'; // Indian Rupee symbol

        // 4. boolean
        // boolean - 1 bit -> true or false
        boolean bool = true;
        boolean bool2 = false;


        //------------------------------------------

        int n1 = 10;
        System.out.println(n1);

        int n2 = 010;
        System.out.println(n2); // octal representation - 8

        int n3 = 0x10;
        System.out.println(n3); // hexadecimal representation - 16

        int n4 = 0b10;
        System.out.println(n4); // binary representation - 2


        double mySalary = 100_000.00;
        long creditCardNumber = 1234_5678_9012_3456L;


        //---------------------------------------------

        int p = 6;
        int q = 4;
        float r = (float)p / q;
        System.out.println(r);

        // Typecasting
        // implicit typecasting
        // byte -> short -> int -> long -> float -> double ( JRE does it automatically )
        // explicit typecasting
        // double -> float -> long -> int -> short -> byte  ( programmer has to do it )
        //--------------------------------------

        int intValue=456;
        byte byteValue=(byte)intValue; // explicit typecasting
        System.out.println(byteValue);

        //--------------------------------------


    }

}
