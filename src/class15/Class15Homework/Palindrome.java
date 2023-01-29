package class15.Class15Homework;

import java.util.Scanner;

public class Palindrome {

    String palindrome(String inputString) {
        StringBuilder strB = new StringBuilder(inputString);
        if (strB.reverse().toString().equals(inputString)) {
            return inputString + " is palindrome.";
        } else {
            return inputString + " is not palindrome.";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String");
        String inputString = input.next();

        Palindrome newPalindrome = new Palindrome();
        String result = newPalindrome.palindrome(inputString);
        System.out.println(result);
    }
}
