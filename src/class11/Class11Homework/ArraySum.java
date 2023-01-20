package class11.Class11Homework;

public class ArraySum {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
         */

        int[][] numbers = {{5, 2, 6}, {8, 1, 5}};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }

        System.out.println("Sum of all numbers is " + sum);

    }
}
