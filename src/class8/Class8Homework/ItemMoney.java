package class8.Class8Homework;

import java.util.Scanner;

public class ItemMoney {
    public static void main(String[] args) {

        /*
         Write a program to ask a user to enter item they want to buy and the price of that item.
         Every time user enters money accumulate the amount and tell the user how much is left to pay off. If user give more money program should return a change.
         Whenever a user done with payments program should say "Thank you for shopping!"
         */

        Scanner input = new Scanner(System.in);
        boolean shopping = true;

        int priceSum = 0;
        int give;

        while (shopping) {
            System.out.print("Please enter an item. If you finish shopping please type done: ");
            String item = input.next();

            if (!item.equalsIgnoreCase("done")) {
                System.out.print("Please enter its price: ");
                int price = input.nextInt();
                priceSum += price;
                continue;
            } else {
                shopping = false;
                System.out.print("You need to pay " + priceSum + " euros. Please enter how much you give: ");
                give = input.nextInt();
                if (give > priceSum) {
                    System.out.print("Your change is " + (give - priceSum));
                }
            }
        }


    }
}


