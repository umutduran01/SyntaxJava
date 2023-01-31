package Replit;

import java.util.Scanner;

public class R103Strings {

    public static void main(String[] args) {

        /*


        String s;

        Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.

        Sample input/outputs:

        In: hello
        h e l l o

        In: covert

        c o v e r t

        In: blasphemy

        b l a s p h e m y


         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();


        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + " ");
        }

    }
}

