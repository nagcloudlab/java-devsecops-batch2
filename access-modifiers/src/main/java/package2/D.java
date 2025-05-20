package package2;

import package1.A;

// IS-A relationship
public class D extends A {

    public void dInstanceMethod() {
        System.out.println("D instance method");
        //System.out.println("pri: " + pri); // private member not accessible
        //System.out.println("def: " + def);
        System.out.println("pro: " + pro);
        System.out.println("pub: " + pub);
    }

}
