package Replit;

public class R106StringBuilder {

    public static void main(String[] args) {

        /*
        Instantiate and StringBuffer class

        Append Value "Hello" to it

        Append value "World" to it.

        Print in UPPERCASE.

        **Expected Output:**

        HELLO WORLD

         */

        StringBuilder newStr = new StringBuilder();
        newStr.append("Hello ");
        newStr.append("World");
        System.out.println(newStr.toString().toUpperCase());
    }
}

