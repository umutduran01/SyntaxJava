package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int x = input.nextInt();

        int[] arr = new int[x];

        /*
        This code manually stores values in array.
        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 9;
        arr[4] = 1;
         */

        /*
        This code asks for many scanners.
        arr[0] = input.nextInt();
        arr[1] = input.nextInt();
        arr[2] = input.nextInt();
        arr[3] = input.nextInt();
        arr[4] = input.nextInt();
         */

        for (int k = 0; k < arr.length; k++) {
            System.out.println("Enter values to array");
            arr[k] = input.nextInt();
        }

        //Printing way 1
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }

        //Printing way 2
        for (int numbers: arr){
            System.out.println(numbers);
        }

        //Printing way 3
        System.out.println(Arrays.toString(arr));



    }
}
