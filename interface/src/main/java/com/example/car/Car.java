package com.example.car;


/**
 * team: car
 */

// Open-Closure Principle => Polymorphic behavior
public class Car {

    private Wheel wheel; // variable to hold the wheel object

    public Car(Wheel wheel) {
        this.wheel = wheel; // assign the wheel object to the variable
        System.out.println("Car component created");
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel; // method to set the wheel object
    }

    public void move() {
        int rpm = this.wheel.rotate(100); // call the rotate method on the wheel object
        System.out.println("Car is moving at " + rpm + " RPM");
    }

}
