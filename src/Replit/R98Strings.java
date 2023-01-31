package Replit;

import java.util.Scanner;

public class R98Strings {

    public static void main(String[] args) {

        /*
        Create a String given="Hello Syntax friends".

        Using String methods from given String create new String "Welcome Syntax family"

        **Expected Output:**

        Welcome Syntax family

         */

        String newString = "Hello Syntax friends";

        System.out.println(newString.replaceAll("Hello","Welcome").replaceAll("friends","family"));

    }
}

