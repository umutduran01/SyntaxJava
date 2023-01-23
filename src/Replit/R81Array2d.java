package Replit;

public class R81Array2d {
    public static void main(String[] args) {

/*

Write a program that prints the highest value in the array.

**Expected Output:**
input [5,4,8]

8

 */

        int[] arr = {5, 4, 8};

        int max = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

