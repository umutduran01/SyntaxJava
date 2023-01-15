package class9;

import java.util.Scanner;

public class ArrayDemo9 {
    public static void main(String[] args) {

        //Create an empty array and store 10 20 30 4 5 6 7 80. Add all elements which are multiple of 2

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
            if (indexNumber % 2 == 0 && indexNumber != 0) {
                evenSum += numbers[indexNumber];
            }
        }

        System.out.println("Sum of multiple of 2 is " + evenSum + ".");
    }
}
