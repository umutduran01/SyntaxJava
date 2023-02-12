package class24;

public class AnimalTesting {
    public static void main(String[] args) {

        //Animal animal = new Animal(); - We cannot create an object from abstract class.

        Animal[] arr = {new Cat(), new Dog()};

        for (Animal animal : arr
        ) {
            animal.eat();
            animal.speak();
        }
    }
}
