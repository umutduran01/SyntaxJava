package class17.Class17Homework;

public class EmptyConstructor {

    /*
     Write a java class that will have a constructor: one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

    String name;
    int number;

    EmptyConstructor(String dogName, int dogNumber) {
        name = dogName;
        number = dogNumber;
    }

    EmptyConstructor(){

    }
}
