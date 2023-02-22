package Replit;

public class R175Interface implements FirstInterface, SecondInterface {

    /*
    Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)

    Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)

    Step 3: Inherit both interfaces to Main class.

    Step 4: Execute both methods

    **Expected Output:**

    First Method implementing multiple Inheritance
    Second Method implementing multiple Inheritance
    */

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }

    public static void main(String[] args) {

        R175Interface newTest = new R175Interface();
        newTest.firstMethod();
        newTest.secondMethod();


    }
}

interface FirstInterface {
    void firstMethod();
}

interface SecondInterface {
    void secondMethod();
}