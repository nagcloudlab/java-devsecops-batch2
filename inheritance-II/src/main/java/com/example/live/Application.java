package com.example.live;

public class Application {
    public static void main(String[] args) {

        God god = new God();


        Human human = new Human();
        Animal animal = new Animal();

        System.out.println("--------------------");
        System.out.println("Human");
        System.out.println("--------------------");
        //god.manageHuman(human);
        god.manageLivingThing(human); // upcasting ( human is a living thing)

        System.out.println("--------------------");
        System.out.println("Animal");
        System.out.println("--------------------");
        //god.manageAnimal(animal);
        god.manageLivingThing(animal); // upcasting ( animal is a living thing) -> implicit


        System.out.println("--------------------");
        System.out.println("Robot");
        System.out.println("--------------------");
        Robot robot = new Robot();
        god.manageLivingThing(robot); // upcasting ( robot is a living thing)

    }
}
