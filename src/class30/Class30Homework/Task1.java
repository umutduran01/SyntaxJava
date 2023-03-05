package class30.Class30Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        /*
        Create a map of Best Buy store.
        Place item id and item name in it.
        Retrieve all keys and values from a Best Buy map using entryset.
        */

        Map<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(123456, "Glove");
        bestBuy.put(345678, "Shoes");
        bestBuy.put(890123, "Jacket");

        Set<Map.Entry<Integer, String>> values = bestBuy.entrySet();

        for (Map.Entry<Integer, String> stringEntry : values) {
            System.out.println(stringEntry.getKey() + " and " + stringEntry.getValue());
        }

    }
}
