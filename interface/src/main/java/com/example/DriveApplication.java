package com.example;

import com.example.car.Car;
import com.example.car.Wheel;
import com.example.wheel.CEATWheel;
import com.example.wheel.MRFWheel;

public class DriveApplication {
    public static void main(String[] args) {

        Wheel wheel = new MRFWheel();
        Car car = new Car(wheel);

        System.out.println();
        car.move();
        System.out.println();
        car.move();
        System.out.println();
        //----

        wheel = new CEATWheel();
        car.setWheel(wheel);

        System.out.println();
        car.move();
        System.out.println();
        car.move();


    }
}
