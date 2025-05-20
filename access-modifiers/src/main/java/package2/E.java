package package2;

import package1.A;

public class E {

    A a = new A();

    public void eInstanceMethod() {
        System.out.println("E instance method");
        //System.out.println("pri: " + a.pri); // private member not accessible
        //System.out.println("def: " + a.def); // default member not accessible
        //System.out.println("pro: " + a.pro); // protected member not accessible
        System.out.println("pub: " + a.pub); // public member accessible
    }

}
