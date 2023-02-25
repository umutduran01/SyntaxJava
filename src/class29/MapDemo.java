package class29;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> groceries = new HashMap<>(); //With HashMap, we can store 2 values at the same time. First entry is Key, second one is Value.

        groceries.put("Milk",3);
        groceries.put("Egg",10);
        groceries.put("Bread",1);
        groceries.put("Sugar",1);
        groceries.put("Banana",5);
        groceries.put("Chips",2);

        System.out.println(groceries);

        System.out.println("----------------------------------------------------------");

        System.out.println(groceries.get("Milk")); //We only print the value.

        System.out.println("----------------------------------------------------------");

        for (Map.Entry<String, Integer> stringIntegerEntry : groceries.entrySet()) { //We print everything.
            System.out.println(stringIntegerEntry);
        }

        System.out.println("----------------------------------------------------------");

        for (String s : groceries.keySet()) { //We only print the first elements.
            System.out.println(s);
        }

        System.out.println("----------------------------------------------------------");

        for (Integer value : groceries.values()) { //We only print the values.
            System.out.println(value);
        }
    }
}
