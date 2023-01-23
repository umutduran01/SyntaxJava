package Replit;

public class R88ClassObject {

    String breed, name, color;

    void bark(){
        System.out.println("can bark");
    }

    void run(){
        System.out.println("can run");
    }

    void play(){
        System.out.println("can play");
    }

    public static void main(String[] args) {

        /*
        Create a Class Main

In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().

Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

The output of the program should be as following:

Husky can bark

Husky can run

Husky can play

Bulldog can bark

Bulldog can run

Bulldog can play

Labrador can bark

Labrador can run

Labrador can play

         */


        R88ClassObject dog = new R88ClassObject();

        dog.breed = "Husky";

        System.out.print(dog.breed +" ");
        dog.bark();

        System.out.print(dog.breed +" ");
        dog.run();

        System.out.print(dog.breed +" ");
        dog.play();

        dog.breed = "Bulldog";

        System.out.print(dog.breed +" ");
        dog.bark();

        System.out.print(dog.breed +" ");
        dog.run();

        System.out.print(dog.breed +" ");
        dog.play();

        dog.breed = "Labrador";

        System.out.print(dog.breed +" ");
        dog.bark();

        System.out.print(dog.breed +" ");
        dog.run();

        System.out.print(dog.breed +" ");
        dog.play();
    }
}

