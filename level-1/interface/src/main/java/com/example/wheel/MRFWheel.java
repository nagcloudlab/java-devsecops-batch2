package com.example.wheel;

// team : mrf

import com.example.car.Wheel;

public class MRFWheel implements Wheel {

    public MRFWheel() {
        System.out.println("MRFWheel component created");
    }

    public int rotate(int speed) {
        System.out.println("MRFWheel is rotating");
        return speed * 2; // example logic for rotation
    }

}
