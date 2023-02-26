package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Nezir");
        students.put(2, "Anush");
        students.put(3, "Tami");
        students.put(4, "Aisha");
        students.put(5, "Gul");
        students.put(6, "Bahar");
        students.put(7, "Saba");

        //Remove the keys if they are greater than 2.

        Set<Integer> studentsKeys = students.keySet();

        studentsKeys.removeIf(keyNo -> keyNo > 2);

        System.out.println(students);
        System.out.println(studentsKeys); //When we delete on map, it also deletes on set.

    }
}

