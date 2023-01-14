package JavaRecap;

import java.util.Scanner;

public class Recap2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your deposit amount: ");
        int deposit = input.nextInt();

        boolean buyCar;

        if (deposit > 2500) {
            buyCar = true;
        } else {
        buyCar = false;
        }

        if (buyCar){
            System.out.println("You can buy several cars.");
        }

    }
}
