package Replit;

public class R156Super {
    /*
    Create class A

    declare variable int i=10;

    Create class B  extends A

    declare variable int i=20;

    create a method to display value of variable i from both classes

    In Main Class create an object of subclass and call method display

    **Expected Output:**

    20

    10
    */

    public static void main(String[] args) {
        B1 newTest = new B1();
        newTest.display();
    }
}

class A1 {
    int i = 10;

}

class B1 extends A1 {
    int i = 20;

    void display() {
        System.out.println(this.i);
        System.out.println(super.i);
    }
}
