package class29;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Jacky", "Persian", 15));
        dogs.add(new Dog("Jami", "German", 5));
        dogs.add(new Dog("Jimmi", "Bulldog", 7));
        dogs.add(new Dog("Mami", "Unknown", 10));

        for (Dog dog : dogs) {
            dog.printDogName();
        }

    }
}
