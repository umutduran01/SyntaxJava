package Replit;

public class R161Overloading {
    /*
    Overload private instance method m1

    Call each method from the main method.

    Expected Output:

    private m1 method
    private m1 method with int parameter
     */

    private void m1() {
        System.out.println("private m1 method");
    }

    private void m1(int num) {
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {

        R161Overloading newTest = new R161Overloading();
        newTest.m1();
        newTest.m1(1);

    }
}