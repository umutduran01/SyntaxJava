package class29;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Cherry");

        //Despite HashSet it give the exact insertion order. Also does not allow duplicates. Slower than HashSet.

        System.out.println(fruits);
    }
}
