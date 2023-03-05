package class30.Class30Homework;

import java.util.ArrayList;
import java.util.Collection;

public class Task5 {
    /*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
    */

    public static void main(String[] args) {

        Collection<Integer> task = new ArrayList<>();
        task.add(4);
        task.add(7);
        task.add(2);
        task.add(9);
        task.add(3);
        task.add(2);
        task.add(4);
        task.add(1);

        int sum = 0;

        for (int number : task) {
            sum += number;
        }

        System.out.println(sum);
    }
}
