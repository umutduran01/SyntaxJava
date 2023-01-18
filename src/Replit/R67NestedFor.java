package Replit;

public class R67NestedFor {
    public static void main(String[] args) {

        /*
        Write a program to print out the pattern: 

        1 2 3 4 5 6 7 8 9 10 

        2 4 6 8 10 12 14 16 18 20 

        3 6 9 12 15 18 21 24 27 30 

        4 8 12 16 20 24 28 32 36 40 

        5 10 15 20 25 30 35 40 45 50
         */

        for (int a = 1; a <= 5; a++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * a + " ");
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
