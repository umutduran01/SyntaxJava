package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Nezir");
        students.put(2, "Anush");
        students.put(3, "Tami");
        students.put(4, "Aisha");
        students.put(5, "Gul");
        students.put(6, "Bahar");
        students.put(7, "Saba");

        //Remove all entries if key is greater than 2 and value contains letter i.

        Set<Map.Entry<Integer, String>> entrySet = students.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet
        ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        entrySet.removeIf(x -> x.getKey() > 2 && x.getValue().contains("i"));

        System.out.println(students);

    }
}
