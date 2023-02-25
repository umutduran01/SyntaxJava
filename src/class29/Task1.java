package class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        /*
        How can you remove all duplicates from ArrayList?
        */

        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String> removeDup = new LinkedHashSet<>(aList);

        System.out.println(removeDup);

    }
}
