package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(10.0);
        numbers.add(6.3);
        /*
        numbers.add(2.3);
        numbers.add(9.2);
        numbers.add(14.1);
        numbers.add(40.2);
        */

        /*
         for (Double number : numbers){
            if (number > 11){
                numbers.remove(number);
            }
        }
        */

        //numbers.removeIf(number -> number > 11); //We replaced that for each loop with this method.

        System.out.println("------------------------------------------------------");

        Iterator<Double> iterator = numbers.iterator(); //We are getting Iterator object.

        System.out.println(iterator.hasNext()); //Internal pointer starts from -1, so it will always return true because the pointer only moves with .next().
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext()); //This output will be false.

        System.out.println("------------------------------------------------------");

        while (iterator.hasNext()) { //Returns true as long as there is element left.
            double number = iterator.next(); //Assign the next element to number.
            if (number>11){
                iterator.remove();
            }

        }
    }
}
