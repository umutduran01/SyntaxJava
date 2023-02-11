package Replit;

import java.lang.reflect.Array;

public class R140Modifier {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.

    Method should be visible only within same package!

    **Expected Output:**

    this is long
    */

    static String maxLength(String[] str) {

        String max = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > max.length()) {
                max = str[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
