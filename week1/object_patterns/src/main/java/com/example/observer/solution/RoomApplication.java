package com.example.observer.solution;

import java.util.ArrayList;

interface DoorListener {
    void on();

    void off();
}

class Light implements DoorListener {
    public void on() {
        System.out.println("Light ON");
    }

    public void off() {
        System.out.println("Light OFF");
    }
}

class AC implements DoorListener {
    public void on() {
        System.out.println("AC ON");
    }

    public void off() {
        System.out.println("AC OFF");
    }
}

class Door {

//    Light light = new Light();
//    AC ac = new AC();

    //    DoorListener doorListener;
    ArrayList<DoorListener> doorListeners = new ArrayList<>();

//    void setDoorListener(DoorListener doorListener) {
//        this.doorListener = doorListener;
//    }

    public void addDoorListener(DoorListener doorListener) {
        this.doorListeners.add(doorListener);
    }

    public void removeListener(DoorListener doorListener){
        this.doorListeners.remove(doorListener);
    }

    public void open() {
        System.out.println("Door Open");
        //doorListener.on();
        for (DoorListener doorListener : doorListeners) {
            doorListener.on();
        }
    }

    public void close() {
        System.out.println("Door Close");
        //doorListener.off();
        for (DoorListener doorListener : doorListeners) {
            doorListener.off();
        }
    }
}


public class RoomApplication {


    public static void main(String[] args) throws InterruptedException {

        Door door = new Door();

        Light light = new Light();
        AC ac = new AC();

        //door.setDoorListener(ac);

        door.addDoorListener(light);
        door.addDoorListener(ac);

        Thread.sleep(3 * 1000);
        door.open();
        Thread.sleep(3 * 1000);
        door.close();


        door.removeListener(ac);

        Thread.sleep(3 * 1000);
        door.open();
        Thread.sleep(3 * 1000);
        door.close();

    }


}
