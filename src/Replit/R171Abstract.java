package Replit;

public class R171Abstract {
    /*
    Create a Parent Class that will have two overloaded abstract methods m1

    Make Main class as concrete subclass to Parent Class

    In main method call the methods.

    **Expected Output:**

    m1 without parameters
    m1 method with parameter
    */

}

abstract class Parent8 {

    abstract void m1();

    abstract void m1(String str);

}

class Main extends Parent8 {

    void m1() {
        System.out.println("m1 without parameters");
    }

    void m1(String str) {
        System.out.println("m1 method with parameter");
    }

    public static void main(String[] args) {

        Main newTest = new Main();
        newTest.m1();
        newTest.m1("hello");
    }
}
