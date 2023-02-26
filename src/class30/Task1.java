package class30;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map
        */

        HashMap<Integer, String> floor = new HashMap<>();
        floor.put(1, "Google");
        floor.put(2, "Syntax");
        floor.put(3, "Apple");
        floor.put(4, "IBM");
        floor.put(5, "Samsung");
        floor.put(6, "McDonald's");
        floor.put(7, "Samsung");

        System.out.println(floor.size());

        //floor.put(4, "Shell");

        floor.replace(4,"Shell");

        System.out.println(floor);

        floor.remove(7);

        System.out.println(floor);

        System.out.println(floor.keySet());
        System.out.println(floor.values());


    }
}
