package class24;

public abstract class Animal { //We declared the class as abstract. We cannot create an object of this base class.

    /*
    Define speak, eat methods and create 3 subclasses and override the eat method.
    */

    abstract void speak(); //We defined how method look but did not explain the implementation. This is abstraction.

    void eat() {
        System.out.println("Animal eating ");
    }
}

class Cat extends Animal { //We should define the child class as abstract or we should write the implementation.

    @Override
    void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating.");
    }
}

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("Wuff Wuff");
    }
}
