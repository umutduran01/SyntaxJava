package JavaTopics;

public class Patterns12 {
    public static void main(String[] args) {

        /*


         * * * * *
          * * * *
           * * *
            * *
             *
             *
            * *
           * * *
          * * * *
         * * * * *

         */

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = a; c <= 5; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int d = 1; d <= 5; d++) {
            for (int e = d; e <= 5; e++) {
                System.out.print(" ");
            }

            for (int f = 1; f <= d; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}





