package Replit;

public class R172Abstract {
    /*
    Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1

    Make Main class to be a derived class from Parent.

    In main method execute both methods

    **Expected Output:**

    Child class providing implementation
    Parent class providing implementation
    */

}

abstract class Parent9 {

    void m2() {
        System.out.println("Parent class providing implementation");
    }

    abstract void m1();

}

class Main9 extends Parent9 {

    void m1() {
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {

        Main9 newTest = new Main9();
        newTest.m1();
        newTest.m2();
    }
}
