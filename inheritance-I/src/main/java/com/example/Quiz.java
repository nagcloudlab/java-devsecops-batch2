package com.example;

class A extends Object {
    public A(int a) {
        super();
        System.out.println("A");
    }
}

class B extends A {
    public B(int a) {
        super(a);
        System.out.println("B");
    }
}

class C extends B {
    public C(int a) {
        super(a);
        System.out.println("C");
    }
}

public class Quiz {
    public static void main(String[] args) {

        C c = new C(100);

    }
}
