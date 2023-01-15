package class8.Class8Homework;

public class Pattern2 {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * *
         * *
         *

         */

        for (int i = 1; i <= 4; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int b = 1; b <= 4; b++) {
            for (int c = b; c < 4; c++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

