package Replit;

import java.util.LinkedList;

public class R194List {
    /*
    Create a method that takes a list as a parameter removes an element if it starts with letter A from given List and return new List then in the main method print that list.

     **Expected Output:**

    [USA, Kazakhstan, Pakistan, Russia]
    */

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        System.out.println(remove(countries));

    }

    static LinkedList remove(LinkedList<String> list) {
        list.removeIf(x -> x.startsWith("A"));
        return list;
    }

}

