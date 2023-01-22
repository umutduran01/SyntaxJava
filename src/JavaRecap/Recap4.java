package JavaRecap;

import java.util.Scanner;

public class Recap4 {
    public static void main(String[] args) {


        //Integer Array

        int[] number = {1, 2, 3, 4, 5};

        System.out.println(number[1]); //output is 2


        //String Array

        String[] names = {"Ali", "Veli", "Ayşe"};

        System.out.println(names[2]); //output is Ayşe


        //Create A New Array Demo 1

        double[] temperature = new double[5]; //An array with 5 variables.

        //Create A New Array Demo 2

        byte [] games = {2,3,6,1};


        //For Loop Array

        double[] points = {3, 5, 9, 12, 8, 4, 2, 0};

        for (int i = 0; i < 4; i++) {
            System.out.println(points[i]); //output is 3.0, 5.0, 9.0 and 12.0
        }


        //Scanner Input Array

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array length");
        int arrayLength = input.nextInt();

        int[] ages = new int[arrayLength];

        System.out.println(ages.length); //Prints array length.


        //Scanner Input Array Asking Variables

        System.out.println("Please enter array length");
        int arrayLength2 = input.nextInt();

        int[] year = new int[arrayLength2]; //We asked for array length with a scanner.

        for (int index = 0; index < year.length; index++) {
            System.out.println("Please enter index " + index + " for this array.");
            year[index] = input.nextInt();
        }

        System.out.println(year[1]);


        //Creating a 2D Array Demo 1

        int[][] counts;
        counts = new int[2][2];


        //Creating a 2D Array Demo 2

        double[][] grades = new double[2][3];
    }
}
