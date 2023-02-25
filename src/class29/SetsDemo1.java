package class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetsDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(9);
        numbers.add(6);
        numbers.add(6);
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(5);

        //Write a code that removes duplicate elements.

        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumbers);
    }
}
