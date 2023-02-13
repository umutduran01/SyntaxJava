package Replit;

public class R165Overriding {
    /*
    Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".

    Override methods in child class

    In Main Class create object of the child class and see which methods are available

    **Expected Output:**


    I am a child public method

    I am a child protected method

    I am a child default method
    */

    public static void main(String[] args) {

        Child7 newTest = new Child7();
        newTest.method1();
        newTest.method2();
        newTest.method3();
        //newTest.method4();
    }
}

class Parent7 {

    public void method1() {
        System.out.println("I am parent public method");
    }

    protected void method2() {
        System.out.println("I am parent protected method");
    }

    void method3() {
        System.out.println("I am parent default method");
    }

    private void method4() {
        System.out.println("I am parent private method");
    }
}

class Child7 extends Parent7{

    public void method1() {
        System.out.println("I am child public method");
    }

    protected void method2() {
        System.out.println("I am child protected method");
    }

    void method3() {
        System.out.println("I am child default method");
    }

    private void method4() {
        System.out.println("I am child private method");
    }
}