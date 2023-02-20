package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        //Remove all the elements from this list which ends with a.

        /*
        for (String s : words) {
            if(s.endsWith("a")){
                words.remove(s);
            }
        }

        System.out.println(words);
        */

        //We cannot use normal for loop or while loop to perform any operation in arrays which can modify the array. So this for each loop will give us a ConcurrentModificationException error.

        Iterator<String> iterator = words.iterator(); //Works from Java 6 to 19

        while (iterator.hasNext()){ //hasNext() returns true if there is any element left.
            String s = iterator.next(); //if there is more element(true), next() assigns the next element to s.
            if (s.endsWith("a")){
                iterator.remove();
            }
        }

        System.out.println(words);

        //THERE IS A SHORTER WAY - Doesn't work in Java 7

        words.removeIf(s -> s.endsWith("a")); //s is variable name. we do not need to specify the data type. remove if s.endsWith("a") condition is true.

        System.out.println(words);

        //VARIABLES - Doesn't work in Java 9 and below

        var name = "Umut";
        var year = 19;

    }
}
