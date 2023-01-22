package JavaRecap;

import java.util.Scanner;

public class Recap6 {
    public static void main(String[] args) {

        //2D Arrays

        int[][] arr = new int[2][3];

        //or

        int [][] arr2 = {{2,8,6},{5,3,7}};

        //Scanner Input in 2D Array

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter row number of the array: ");
        int arrRow = input.nextInt();

        System.out.println("Please enter column number of the array: ");
        int arrColumn = input.nextInt();;

        int[][] arr3 = new int[arrRow][arrColumn];

        //Asking For Values in 2D Array

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println("Please enter " + i + " x " + j);
                arr3[i][j] = input.nextInt();
            }
        }

        //Printing Values in 2D Array

        for (int a = 0; a < arr3.length; a++) {
            for (int b = 0; b < arr3[a].length; b++) {
                System.out.println(arr3[a][b]);
            }
        }

        //or

        for (int[] numbersOfRows: arr3
             ) {
            for (int valuesOfRows: numbersOfRows
                 ) {
                System.out.println(valuesOfRows);

            }
        }

    }
}
