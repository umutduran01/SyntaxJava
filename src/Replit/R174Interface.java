package Replit;

public class R174Interface implements MyInterface {

    /*
    Create an Interface with name as MyInterface

    Create two undefined methods method1 and method2

    Inherit the MyInterface to Main Class.

    Execute both methods

    **Expected Output:**


    implementation of method1

    implementation of method2

    */

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {

        R174Interface newTest = new R174Interface();
        newTest.method1();
        newTest.method2();

    }
}

interface MyInterface {

    void method1();

    void method2();

}


