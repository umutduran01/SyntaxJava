package class30.Class30Homework;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task4 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
    */

    public static void main(String[] args) {

        Collection<String> task = new LinkedHashSet<>();
        task.add("hello");
        task.add("my");
        task.add("name");
        task.add("is");
        task.add("Java");
        task.add("!");

        String conc = "";

        for (String s : task) {
            conc += s;
        }

        System.out.println(conc);

    }
}
