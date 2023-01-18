package JavaTopics;

public class Patterns11 {
    public static void main(String[] args) {

          /*

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *

         */

        for (int a = 1; a <= 5; a++) {
            for (int b = a; b <= 5; b++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int d = 1; d <= 4; d++) {
            for (int e = 0; e <= d; e++) {
                System.out.print(" ");
            }

            for (int f = d; f <= 4; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}


