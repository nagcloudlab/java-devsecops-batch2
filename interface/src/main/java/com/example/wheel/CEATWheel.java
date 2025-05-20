package com.example.wheel;

import com.example.car.Wheel;

public class CEATWheel implements Wheel {

    public CEATWheel() {
        System.out.println("CEAT Wheel component created");
    }

    public int rotate(int speed) {
        System.out.println("CEAT Wheel is rolling");
        int rpm = speed * 3; // example logic for rotation
        return rpm;
    }
}
