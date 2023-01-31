package Replit;

import java.util.Scanner;

public class R101Strings {

    public static void main(String[] args) {

        /*
        Inputs:


        String word;

        Write a for loop that will print out every other letter in a String, starting with the first letter.  These letters should be printed all on one line with no space in between.

        Sample input/outputs

        In: hello
        hlo

        In: SSyynnttaaxxTTeecchhnnoollooggiieess
        SyntaxTechnologies

         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        String a = "";

        for (int i = 0; i < s.length(); i+=2) {
            a+=s.charAt(i);
        }
        System.out.println(a);

    }
}

