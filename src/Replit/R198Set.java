package Replit;

import java.util.TreeSet;

public class R198Set {
        /*
        Create Set to store String Objects and you want them to be stored in ascending order

        Please add the below values and see the result

        `"India"`

        `"Australia"`

        `"South Africa"`

        `"India"`

        `"America"`

        `"America"`

        Print the Set.

        `Expected Output:`

        ```
        [America, Australia, India, South Africa]
        */

    public static void main(String[] args) {

        TreeSet<String> list = new TreeSet<>();
        list.add("India");
        list.add("Australia");
        list.add("South Africa");
        list.add("India");
        list.add("America");
        list.add("America");

        System.out.println(list);

    }
}

