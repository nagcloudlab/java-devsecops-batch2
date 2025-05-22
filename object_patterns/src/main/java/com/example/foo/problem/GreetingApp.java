package com.example.foo.problem;


/*
    design issues

    -> code tangling / coupling
    -> code scatting / duplication

 */

class Greeting {

    // dev-1:
    public void hello() {
        System.out.println("Hello");
        System.out.println("😀");
    }

    public void helloWithoutEmoji() {
        System.out.println("Hello");
    }

    // Me
    public void hi() {
        System.out.println("Hi");
        System.out.println("😀");
    }

    public void hey() {
        System.out.println("Hey");
        System.out.println("😀");
    }

}


public class GreetingApp {
    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        greeting.hello();
        greeting.hi();
        greeting.hey();

    }
}
