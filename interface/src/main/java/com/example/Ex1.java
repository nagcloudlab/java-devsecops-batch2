package com.example;


interface I1 {
    void m1();

    void m2();

    void m3();
}

interface I2 extends I1 {
    void m3();

    void m4();
}

class C1 implements I2 {
    public void m1() {
        System.out.println("C1:m1");
    }

    public void m2() {
        System.out.println("C1:m2");
    }

    public void m3() {
        System.out.println("C1:m3");
    }

    public void m4() {
        System.out.println("C1:m4");
    }
}

class C2 implements I2 {
    public void m1() {
        System.out.println("C2:m1");
    }

    public void m2() {
        System.out.println("C2:m2");
    }

    public void m3() {
        System.out.println("C2:m3");
    }

    public void m4() {
        System.out.println("C2:m4");
    }
}

abstract class C3 implements I2 {
    public void m1() {

    }
}

class C31 extends C3 {

    public void m2() {

    }

    public void m3() {

    }

    public void m4() {

    }
}

public class Ex1 {


    public static void main(String[] args) {

        I2 i = new C1();
        i = new C2();

    }

}
