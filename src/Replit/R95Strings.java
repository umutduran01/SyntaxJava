package Replit;

import java.util.Scanner;

public class R95Strings {

    public static void main(String[] args) {

        /*
        Using Scanner class input string value.

        Print out the following: "The first 3 letters of \_\_\_ is ___"

        For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String inputString = input.next();

        System.out.println("The first 3 letters of " + inputString + " is " + inputString.substring(0, 3));
    }
}

