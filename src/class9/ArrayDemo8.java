package class9;

import java.util.Scanner;

public class ArrayDemo8 {
    public static void main(String[] args) {

        //Create an empty array and store 45 44 33 20 and 10 in it. Use a loop to add all elements which are present in even indexes.

        Scanner input = new Scanner(System.in);

        int evenSum = 0;

        System.out.print("Please enter array length: ");
        int arrayLength = input.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter index " + i + " : ");
            numbers[i] = input.nextInt();
        }

        for (int indexNumber = 0; indexNumber < numbers.length; indexNumber++) {
            if (indexNumber % 2 == 0) {
                System.out.println("Even index " + indexNumber + " is " + numbers[indexNumber] + ".");
                evenSum += numbers[indexNumber];
            }
        }

        System.out.println("Sum is " + evenSum + ".");
    }
}
