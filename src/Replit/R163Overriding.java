package Replit;

public class R163Overriding {
    /*
    In Parent Class create a method with name method() that will print "Parent method"

    Override method() in Child class that will print "Child method"

    In Main Class create objects of child and parent class and call its method.

    **Expected Output:**

    Parent method
    Child method
    */

    public static void main(String[] args) {

        Parent5 newTest1 = new Parent5();
        Child5 newTest2 = new Child5();

        newTest1.method();
        newTest2.method();

    }
}

class Parent5 {
    void method() {
        System.out.println("Parent method");
    }
}

class Child5 extends Parent5{
    void method() {
        System.out.println("Child method");
    }
}