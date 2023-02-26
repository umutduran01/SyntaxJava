package class30;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        */

        Map<String, String> countries = new TreeMap<>();
        countries.put("Portugal", "Lisbon");
        countries.put("Germany", "Berlin");
        countries.put("Turkey", "Ankara");
        countries.put("France", "Paris");

        //Set<Map.Entry<String,String>> entrySet = countries.entrySet();

        //to avoid this long code;

        var entrySet = countries.entrySet(); //Only works with Java 10.

        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //with iterator;

        var iterator = countries.entrySet().iterator();

        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
