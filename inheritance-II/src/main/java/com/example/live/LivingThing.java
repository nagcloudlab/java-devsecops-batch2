package com.example.live;

/**
 * author : Trainer
 */

public abstract class LivingThing {

    // state
    // constructor
    // behavior

    public void eat(){
        System.out.println("LT :: eat()");
    }
    public void sleep(){
        System.out.println("LT :: sleep()");
    }
    public abstract void work();

}
