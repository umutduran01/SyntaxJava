package class27;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);

        System.out.println(booleans.get(0)); //We enter the index.
        System.out.println(booleans.get(2));

        for (Boolean result : booleans) { //Loop to print all variables.
            System.out.println(result);
        }

        System.out.println("---------------------------------------");

        for (int i = 0; i < booleans.size(); i++) { //.size to find a length in Array List.
            System.out.println(booleans.get(i));
        }

        System.out.println("---------------------------------------");

        int i = 0;
        while (i < booleans.size()) { //The same loop with while loop.
            System.out.println(booleans.get(i));
            i++;
        }

    }
}
