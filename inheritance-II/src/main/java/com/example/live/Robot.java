package com.example.live;

/**
 *
 * author: robot-team
 *
 */

public class Robot extends LivingThing {

    @Override
    public void eat() {
        System.out.println("Robot :: eat()");
    }

    @Override
    public void work() {
        System.out.println("Robot :: work()");
    }
}
