package class9;

import java.util.Scanner;

public class ProgramBreakDown {
    public static void main(String[] args) {

        /*
        Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change. Whenever a user done with payments program should say "Thank you for shopping!"
         */


        //STEP 1
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an item: ");
        String item = input.nextLine();
        System.out.print("Please enter its price: ");
        int price = input.nextInt();

        //STEP 2
        int sumPrice = 0;
        sumPrice+=price;
        System.out.println("Sum: " + sumPrice);

        //STEP 3
        System.out.print("Please enter how much you'll give: ");
        int give = input.nextInt();

        if (give > sumPrice){
            System.out.println("Your change is: " + (give - sumPrice));
        }

        //STEP 4
        System.out.println("Thanks for shopping!");


    }
}
