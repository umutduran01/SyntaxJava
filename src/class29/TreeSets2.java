package class29;

import java.util.TreeSet;

public class TreeSets2 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(3);
        numbers.add(9);
        numbers.add(3);

        //TreeSet removes the duplicates and sorts the elements.

        System.out.println(numbers);

    }
}
