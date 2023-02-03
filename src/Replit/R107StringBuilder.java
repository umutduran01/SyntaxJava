package Replit;

public class R107StringBuilder {

    public static void main(String[] args) {

        /*
        # How would you reverse a String using StringBuffer Class

        Given String = "Hello Friends"

        **Expected Output:**

        sdneirF olleH

         */

       StringBuilder newStr = new StringBuilder("Hello Friends");
       newStr.reverse();
        System.out.println(newStr);

    }
}

