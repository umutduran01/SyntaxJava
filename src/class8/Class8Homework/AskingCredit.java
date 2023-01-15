package class8.Class8Homework;

import java.util.Scanner;

public class AskingCredit {
    public static void main(String[] args) {

        /*
        Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.
         */

        Scanner input = new Scanner(System.in);


        for (int i = 10; i >= 0; i--) {
            System.out.println("Do you want to apply for credit ?");
            String answer = input.next();
            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
            System.out.println("");
        }

    }
}
