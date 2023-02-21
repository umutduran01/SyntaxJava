package class28.Class28Homework;

public class Insurance {

    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the subclasses and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
    */

    String insuranceName;

    void getQuote() {
    }

    ;

    void cancelInsurance() {
    }

    ;

}

class Car extends Insurance {

    String carModel;

}

class Pet extends Insurance {

    String petType;
}

class Health extends Insurance {

}

