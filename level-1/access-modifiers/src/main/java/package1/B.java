package package1;

/**
 * author: John Doe
 */

// If Type B is Type A
public class B extends A {

    public void bInstanceMethod() {
        System.out.println("B instance method");
        //System.out.println("pri: " + pri); // private member not accessible
        System.out.println("def: " + def);
        System.out.println("pro: " + pro);
        System.out.println("pub: " + pub);
    }

}
