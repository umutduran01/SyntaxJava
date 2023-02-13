package Replit;

public class R154Super {
    /*
    In Parent Class.

    Create a no-argument constructor and include the logic to print "Parent Constructor without argument"

    Create another constructor that takes one parameter of integer type called number.

    include the logic to print the value of the number.

    In Child class.

    Create a Constructor without parameter and include the logic to print "Child Constructor without argument"

    Overload the constructor by adding one parameter of type integer

    Inside the constructor call the parameterized parent class constructor.

    In Main Class.

    Create an object of Child without passing any argument.

    And then another object of Child class by passing the value "10". run the application.

    **Expected Output:**


    Parent Constructor without argument

    Child Constructor without argument

    10
    */
    public static void main(String[] args) {

        Child2 newTest = new Child2();
        Child2 newTest2 = new Child2(10);

    }


}

class Parent2 {
    Parent2() {
        System.out.println("Parent Constructor without argument");
    }

    Parent2(int number) {
        System.out.println(number);
    }
}

class Child2 extends Parent2 {

    Child2() {
        System.out.println("Child Constructor without argument");
    }

    Child2(int number) {
        super(number);
    }


}


