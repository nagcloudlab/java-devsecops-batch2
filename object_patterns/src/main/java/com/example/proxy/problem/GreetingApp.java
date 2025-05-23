package com.example.proxy.problem;

/*
    design issues
    -> code tangling / coupling
    -> code scatting / duplication
 */

class Greeting {

    // dev-1:
    public void hello() {
        System.out.println("😀");
        System.out.println("Hello");
    }

    public void helloWithoutEmoji() {
        System.out.println("Hello");
    }

    // Me
    public void hi() {
        System.out.println("😀");
        System.out.println("Hi");
    }

    public void hey() {
        System.out.println("😀");
        System.out.println("Hey");
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
