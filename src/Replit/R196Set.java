package Replit;

import java.util.HashSet;
import java.util.Set;

public class R196Set {
    /*
    Create a Set and below values to it.

    [third, first, second]

    Print HashSet and then remove all the elements from Hashset and print it again.

    **Expected Output:**

    [third, first, second]
    []

     */

    public static void main(String[] args) {

        Set<String> list = new HashSet<>();
        list.add("third");
        list.add("first");
        list.add("second");

        System.out.println(list);

        list.removeAll(list);

        System.out.println(list);

    }
}
