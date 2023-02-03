package Replit;

import java.util.Scanner;

public class R105Strings {

    public static void main(String[] args) {

        /*
        There is a code that takes input as a String.

        Write a program that will print out only vowels of that string

        Sample input/outputs:

        In: howdyho
        oo

        In: huehuehuehue
        ueueueue

        In: poopoo what idk what im doing
        ooooaiaioi
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        System.out.println(word.replaceAll("[^aeuioAEUIO]",""));
    }
}

