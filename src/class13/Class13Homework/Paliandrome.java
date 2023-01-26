package class13.Class13Homework;

import java.util.Scanner;

public class Paliandrome {
    public static void main(String[] args) {

        //How would you check if String is palindrome or not?
        //aba=> true
        //Abbc =>false

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word or sentence: ");
        String str = input.nextLine();

        StringBuilder strReverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            strReverse.append(str.charAt(i));
        }

        System.out.println(strReverse);

        if (strReverse.toString().equals(str)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
