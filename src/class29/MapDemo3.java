package class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
    public static void main(String[] args) {

        TreeMap<String,Integer> groceries = new TreeMap<>(); //It will sort the data according to keys.

        groceries.put("Milk",3);
        groceries.put("Egg",10);
        groceries.put("Bread",1);
        groceries.put("Sugar",1);
        groceries.put("Banana",5);
        groceries.put("Chips",2);

        System.out.println(groceries);

    }
}
