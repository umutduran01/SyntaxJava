package Replit;

public class R117Methods {
        /*
        Create a method with the following specs:

        Returns: an integer

        Name: sumEvenToX

        Parameters: an integer called "x"

        Purpose: calculate the sum of the EVEN integers from 1 to x (including x)

        Examples:

        sumEvenToX(5) ==> 6
        sumEvenToX(8) ==> 20
        */

    int sumEvenToX(int x) {
        int count = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        R117Methods newExample = new R117Methods();
        int result = newExample.sumEvenToX(8);
        System.out.println(result);
    }
}

