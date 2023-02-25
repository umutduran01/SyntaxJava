package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {

        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Cherry");

        //TreeSet removes the duplicates and sorts the elements. It is the slowest.

        System.out.println(fruits);

    }
}
