package class28.Class28Homework;

import java.util.ArrayList;

public class Replace {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drinks has letter “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("cola");
        drinks.add("tea");
        drinks.add("milk");
        drinks.add("coffee");
        drinks.add("beer");
        drinks.add("sprite");

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "water");
            }
        }

        System.out.println(drinks);

    }
}
