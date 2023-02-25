package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> groceries = new LinkedHashMap<>(); //This one will maintain the order of the values.

        groceries.put("Milk",3);
        groceries.put("Egg",10);
        groceries.put("Bread",1);
        groceries.put("Sugar",1);
        groceries.put("Banana",5);
        groceries.put("Chips",2);

        System.out.println(groceries);
    }
}
