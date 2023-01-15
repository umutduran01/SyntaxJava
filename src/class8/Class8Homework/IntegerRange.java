package class8.Class8Homework;

import java.util.Scanner;

public class IntegerRange {
    public static void main(String[] args) {
        /*
        Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the starting number: ");
        int a = input.nextInt();
        System.out.println("Please enter the ending number: ");
        int b = input.nextInt();

        int evenSum = 0, oddSum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else if (i % 2 != 0) {
                oddSum += i;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }
}
