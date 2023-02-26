package class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapsDemo3 {
    public static void main(String[] args) {

        HashMap<String, Double> makeup = new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eyeliner", 12.2);
        makeup.put("Blush on", 12.2);

        //Delete keys if key has more than 7 chars.

        System.out.println(makeup);

        Set<String> products = makeup.keySet();

        products.removeIf(product -> product.length() > 7);
        System.out.println(makeup);

    }
}

