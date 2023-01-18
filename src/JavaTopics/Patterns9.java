package JavaTopics;

public class Patterns9 {
    public static void main(String[] args) {

          /*

             *
            * *
           * * *
          * * * *
         * * * * *

         */

        for (int a = 1; a <= 5; a++) {
            for (int b = a; b <= 5; b++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= a; c++) {
                System.out.print("* "); //*'ın sonuna bir boşluk ekleyerek bu motifi elde ettik.
            }
            System.out.println();
        }



    }
}


