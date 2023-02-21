package class28.Class28Homework;

import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {

        /*
        Create an arrayList of words. Remove every word that ends with “e”.
        */

        ArrayList<String> words = new ArrayList<>();

        words.add("cat");
        words.add("dog");
        words.add("car");
        words.add("house");
        words.add("fish");
        words.add("some");

        System.out.println(words);

        words.removeIf(x -> x.endsWith("e"));

        System.out.println(words);

    }
}
