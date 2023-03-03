package Replit;

import java.util.LinkedHashSet;

public class R199Set {
        /*
        Create a Set collection in which you want to preserve an order of inserted String Objects.

        Add the below values

        - null
        - Sohil
        - Diego
        - Alijon
        - Asel
        - Sumair

        Print values 1 by 1 using loop and Iterator

        null
        Sohil
        Diego
        Alijon
        Asel
        Sumair
        null
        Sohil
        Diego
        Alijon
        Asel
        Sumair
        */

    public static void main(String[] args) {

        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add(null);
        list.add("Sohil");
        list.add("Diego");
        list.add("Alijon");
        list.add("Asel");
        list.add("Sumair");

        for (String s : list) {
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }

    }
}

