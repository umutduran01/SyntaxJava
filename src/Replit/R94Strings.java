package Replit;

public class R94Strings {

    public static void main(String[] args) {

        /*
        Create a String given="I love Java classes at Syntax"
        Retrieve 2 Strings using substring method from given String and print them

        **Expected Output:**

        classes at Syntax

        I love Java

         */

        String given = "I love Java classes at Syntax";

        System.out.println(given.substring(given.indexOf("class")));
        System.out.println(given.substring(0,given.indexOf("class")));
    }
}

