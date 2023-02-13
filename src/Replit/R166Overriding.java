package Replit;

public class R166Overriding {
    /*
    Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.

    Create a subclass Cat in which override method sleep

    Create 3 Kitten subclasses of a Cat class and override method eat

    for 1 kitten - eats milk

    for 2 kitten - eats snack

    for 3 kitten - eats everything

    In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:

    **Expected Output:**


    Cat eats
    Cat sleeps a lot
    kitten1 eats milk
    kitten1 sleeps a lot
    kitten2 eats snacks
    kitten2 sleeps a lot
    kitten3 eats everything
    kitten3 sleeps a lot
    */

    public static void main(String[] args) {

        Cat cat = new Cat("Cat");
        Kitten1 kitten1 = new Kitten1("kitten1");
        Kitten2 kitten2 = new Kitten2("kitten2");
        Kitten3 kitten3 = new Kitten3("kitten3");

        Animal[] arr = {cat, kitten1, kitten2, kitten3};

        for (Animal cats : arr) {
            cats.eat();
            cats.sleep();
        }

    }
}

class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void eat() {
    }

    void sleep() {
    }
}

class Cat extends Animal {

    Cat(String type) {
        super(type);
    }

    void eat() {
        System.out.println(type + " eats");
    }

    void sleep() {
        System.out.println(type + " sleeps a lot");
    }
}

class Kitten1 extends Cat {

    Kitten1(String type) {
        super(type);
    }

    void eat() {
        System.out.println("kitten1 eats milk");
    }
}

class Kitten2 extends Cat {

    Kitten2(String type) {
        super(type);
    }

    void eat() {
        System.out.println("kitten2 eats snacks");
    }
}

class Kitten3 extends Cat {

    Kitten3(String type) {
        super(type);
    }

    void eat() {
        System.out.println("kitten3 eats everything");
    }
}
