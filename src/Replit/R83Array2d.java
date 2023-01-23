package Replit;

public class R83Array2d {
    public static void main(String[] args) {

/*
Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers

For example, if we run rowSums for the following 2D array:


{

  {1,1,2}, //sum = 4

  {3,1,2}, //sum = 6

  {3,5,3}, //sum = 11

  {0,1,2}  //sum = 3

}


Then we should get the following array back:

4
6
11
3

*/

        int[][] a = {{1, 1, 2}, {3, 1, 2}, {3, 5, 3}, {0, 1, 2}};
        int[] b = new int[a.length];

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            b[i] = sum;
            sum = 0;
        }
        for (int arrB : b
        ) {
            System.out.println(arrB);
        }


    }
}

