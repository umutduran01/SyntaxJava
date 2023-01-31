package Replit;

import java.util.Scanner;

public class R96Strings {

    public static void main(String[] args) {

        /*
        You have Scanner class to input string value.

        If language is Java it should print the:

        "Java is a programming language".

        If language is C it should print the:

        "C is a procedural programming language"

        If language is C++ it should print the:

        "C++ is a middle-level programming language"

        If any other should print:

        "Doesn't match any programming language"

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a language: ");
        String inputString = input.next();

        if (inputString.equalsIgnoreCase("Java")) {
            System.out.println("Java is a programming language");
        } else if (inputString.equalsIgnoreCase("C")) {
            System.out.println("C is a procedural programming language");
        } else if (inputString.equalsIgnoreCase("C++")) {
            System.out.println("C++ is a middle-level programming language");
        } else {
            System.out.println("Doesn't match match any programmig language");
        }


    }
}

