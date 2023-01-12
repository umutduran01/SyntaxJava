package class4.Class4Homework;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card ?");
        boolean card = input.nextBoolean();

        if (card) {
            System.out.println("What is the balance of your credit card ?");
            double balance = input.nextDouble();
            if (balance > 1000) {
                System.out.println("Please pay as soon as possible.");
            } else {
                System.out.println("You can spend more money.");
            }
        } else {
            System.out.println("We offer you credit card.");
        }

    }
}