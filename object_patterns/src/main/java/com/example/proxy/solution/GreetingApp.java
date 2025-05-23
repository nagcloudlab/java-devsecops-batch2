package com.example.proxy.solution;

/*
    design issues
    -> code tangling / coupling
    -> code scatting / duplication
 */

interface IGreeting {
    void hello();

    void hi();

    void hey();
}

class Greeting implements IGreeting {

    public void hello() {
        System.out.println("Hello");
    }

    public void helloWithoutEmoji() {
        System.out.println("Hello");
    }

    public void hi() {
        System.out.println("Hi");
    }

    public void hey() {
        System.out.println("Hey");
    }

}


class Emoji {
    public void withSmile() {
        System.out.println("😀");
    }
}

class Sec {
    public void authorize() {
        System.out.println("Auth..");
    }
}

class GreetingProxy implements IGreeting {
    private Greeting greeting;
    private Emoji emoji = new Emoji();
    private Sec sec = new Sec();

    public GreetingProxy(Greeting greeting) {
        this.greeting = greeting;
    }

    public void hello() {
        sec.authorize();
        greeting.hello(); // target
        emoji.withSmile();
    }

    public void hi() {
        sec.authorize();
        greeting.hi();
        emoji.withSmile();
    }

    public void hey() {
        sec.authorize();
        greeting.hey();
    }
}


public class GreetingApp {
    public static void main(String[] args) {


        var greeting = new Greeting();  // target
        var greetingProxy = new GreetingProxy(greeting);

        //------------------------------
        // Inside Module
        //------------------------------

        greeting.hello();

        //------------------------------
        // Outsider Module
        //------------------------------
        greetingProxy.hello();
        greetingProxy.hi();
        greetingProxy.hey();

        //------------------------------

    }
}
