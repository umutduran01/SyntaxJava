package class9;

import java.util.Scanner;

public class ArrayDemo7 {
    public static void main(String[] args) {

        //Create an empty array and store 45 44 33 20 and 10 in it. Use a loop to add all elements which are present in even indexes.

        Scanner input = new Scanner(System.in);

        int evenSum = 0;

        System.out.print("Please enter array length: ");
        int a = input.nextInt();

        int[] numbers = new int[a];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter index " + i + " : ");
            numbers[i] = input.nextInt();

        }

        for (int b = 0; b < numbers.length; b++) {
            if (b % 2 == 0) {
                System.out.println("Even index " + b + " is " + numbers[b] + ".");
                evenSum += numbers[b];
            }
        }

        System.out.println("Sum is " + evenSum + ".");
    }
}
