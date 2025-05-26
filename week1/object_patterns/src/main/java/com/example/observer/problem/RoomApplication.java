package com.example.observer.problem;

class Light {
    public void on() {
        System.out.println("Light ON");
    }

    public void off() {
        System.out.println("Light OFF");
    }
}

class AC {
    public void on() {
        System.out.println("AC ON");
    }

    public void off() {
        System.out.println("AC OFF");
    }
}

class Door {

    Light light = new Light();
    AC ac = new AC();


    public void open() {
        System.out.println("Door Open");
        light.on();
        ac.on();
    }

    public void close() {
        System.out.println("Door Close");
        light.off();
        ac.off();
    }
}


public class RoomApplication {


    public static void main(String[] args) throws InterruptedException {

        Door door = new Door();

        Thread.sleep(3 * 1000);
        door.open();
        Thread.sleep(3 * 1000);
        door.close();

    }


}
