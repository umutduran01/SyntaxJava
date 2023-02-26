package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo5 {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Nezir");
        students.put(2, "Anush");
        students.put(3, "Tami");
        students.put(4, "Aisha");
        students.put(5, "Gul");
        students.put(6, "Bahar");
        students.put(7, "Saba");

        //Remove all values which contain letter i.

        Collection<String> values = students.values();

        values.removeIf(value -> value.contains("i"));

        System.out.println(students);

    }
}
