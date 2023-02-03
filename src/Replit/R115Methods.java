package Replit;

public class R115Methods {

    String toUpper(String input) {
        return input.toUpperCase();
    }

    public static void main(String[] args) {


        /*
        Create a method that will accept a String as a parameter and return new String all in upper case

        Call method

        **Expected Output:**

        TEST
         */

        R115Methods newPrint = new R115Methods();
        String result = newPrint.toUpper("test");
        System.out.println(result);
    }
}

