package class28.Class28Homework;

import java.util.ArrayList;

public class EmptyOrNot {
    public static void main(String[] args) {

        /*
        Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
        */

        ArrayList<String> newTest = new ArrayList<>();
        newTest.add("Umut");
        newTest.add("Isabel");
        newTest.add("Ali");
        newTest.add("Fatma");
        newTest.add("Ahmet");

        System.out.println(newTest.isEmpty()); //If the ArrayList is empty ?

        System.out.println(newTest.contains("Isabel")); //Returns true

        System.out.println(newTest.size()); //Size of the ArrayList.

        System.out.println(newTest); //All elements from the ArrayList.


    }
}
