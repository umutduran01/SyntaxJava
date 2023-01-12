package class4.Class4Homework;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mortgage rate: ");
        double mortgageRate = input.nextDouble();
        int housePrice;

        if (mortgageRate > 4.5) {
            System.out.println("Do not buy a house.");
        } else {
            System.out.println("Consider buying a  house.");
            System.out.println("Please enter price of the house: ");
            housePrice = input.nextInt();
            if (housePrice > 200000) {
                System.out.println("Take a loan.");
            } else {
                System.out.println("Pay in cash.");
            }
        }

    }
}
