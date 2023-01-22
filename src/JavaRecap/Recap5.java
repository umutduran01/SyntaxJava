package JavaRecap;

import java.util.Arrays;
import java.util.Scanner;

public class Recap5 {
    public static void main(String[] args) {

        //1D Array

        int[] arr = new int[5];

        //or

        int[] arr2 = {5, 4, 60};


        //Scanner Input In 1D Array

        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();

        int[] arr3 = new int[arrLength];


        //Asking For Values in 1D Array

        int arrLength2 = input.nextInt();

        int[] arr4 = new int[arrLength2]; //First we asked the length of the array.

        for (int i = 0; i < arr4.length; i++) { //Second we asked for indexes by for loop.
            System.out.println("Please enter index " + i);
            arr4[i] = input.nextInt();
        }

        //Printing 1D Arrays

        for (int a = 0; a < arr4.length; a++) {
            System.out.println(arr4[a]);
        }

        //or

        for (int arrIndexes: arr4
             ) {
            System.out.println(arrIndexes);
        }

        //or

        System.out.println(Arrays.toString(arr4));


    }
}
