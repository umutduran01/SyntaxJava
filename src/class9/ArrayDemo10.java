package class9;

import java.util.Scanner;

public class ArrayDemo10 {
    public static void main(String[] args) {

        //Write a program that can tell us how many times the number 10.5 is presented in the array.

        double[] arr = {10.5, 12.0, 45, 10.5, 23, 10.5};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10.5) {
                count++;
            }
        }
        System.out.println(count);
    }

}

