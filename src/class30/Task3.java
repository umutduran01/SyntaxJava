package class30;

import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all values from a country map using for each loop and iterator.
        */

        Map<String, String> countries = new TreeMap<>();
        countries.put("Portugal", "Lisbon");
        countries.put("Germany", "Berlin");
        countries.put("Turkey", "Ankara");
        countries.put("France", "Paris");

        var values = countries.values();

        for (var entry : values) {
            System.out.println(entry);
        }

    }
}
