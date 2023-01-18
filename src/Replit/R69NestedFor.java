package Replit;

public class R69NestedFor {
    public static void main(String[] args) {

        /*
        Write a program to print out the pattern:

**Expected output:**

1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7

         */

        for (int a = 0; a < 7; a++) {
            for (int b = 1; b <= 7 - a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        for (int c = 1; c <= 6; c++) {
            for (int d = 1; d <= c + 1; d++) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}

