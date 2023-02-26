package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();

        fruit.put("Apple", 1.99);
        fruit.put("Orange", 3.40);
        fruit.put("Kiwi", 2.90);
        fruit.put("Banana", 0.99);
        fruit.put("Apple", 3.90); //If the key is already presented in map, so we'll not the value will be updated with the value.

        System.out.println(fruit);

        fruit.put(null, null); //Only possible with HashMap and LinkedHashMap. TreeMap doesn't support.

        System.out.println(fruit);

        System.out.println("----------------------------------");

        HashMap<String, Double> makeup = new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eyeliner", 12.2);
        makeup.put("Blush on", 12.2);

        HashMap<String, Double> groceries = new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);

        System.out.println(groceries);

    }
}
