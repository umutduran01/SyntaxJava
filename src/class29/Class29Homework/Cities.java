package class29.Class29Homework;

import java.util.LinkedHashSet;

public class Cities {
    public static void main(String[] args) {

        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”.
        */

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Lisbon");
        cities.add("Ankara");
        cities.add("Tokyo");
        cities.add("Amsterdam");
        cities.add("Paris");

        System.out.println(cities);

        cities.removeIf(city -> city.startsWith("A"));

        System.out.println(cities);

        cities.removeIf(city -> city.startsWith("L") || city.endsWith("n"));

        System.out.println(cities);
    }
}
