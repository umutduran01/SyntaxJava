package Replit;

import java.util.Scanner;

public class R79Array2d {
    public static void main(String[] args) {

/*

Write a program to print values from a 2D array

**Example Output:**

1.4 2.0 3.3 2.0

4.0 1.5 6.1 1.0

1.2 3.1 4.0 1.6



 */

        double [][] arr = {{1.4, 2.0, 3.3, 2.0},{4.0, 1.5, 6.1, 1.0},{1.2, 3.1, 4.0, 1.6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}

