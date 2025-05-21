package com.example.live;

// LT management
// Open-closed principle => Polymorphism
public class God {


//    public void manageHuman(Human human) {
//        human.eat();
//        human.sleep();
//        human.study();
//        human.work();
//    }
//
//    public void manageAnimal(Animal animal) {
//        animal.eat();
//        animal.sleep();
//        animal.work();
//    }

    public void manageLivingThing(LivingThing livingThing) {
        livingThing.eat();
        livingThing.sleep();
        if(livingThing instanceof Human) {
            Human h = (Human) livingThing; // downcasting ( livingThing is a human)
            h.study();
        }
        livingThing.work();
    }


}
