package class29;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {

        //Create a Set collection in which you need to add names of the countries.
        //In this set we want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.

        TreeSet<String> countries = new TreeSet<>();
        countries.add("England");
        countries.add("Germany");
        countries.add("Austria");
        countries.add("New Zealand");
        countries.add("Turkey");
        countries.add("Russia");

        System.out.println(countries);

        for (String country : countries) {
            System.out.println(country);
        }

    }
}
