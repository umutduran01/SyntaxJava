package class29;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Cherry");

        //In output, we'll see "Mango" once because HashSets accept the same variable only once. Insertion Order can be different as well. It is the fastest.

        System.out.println(fruits);
    }
}
