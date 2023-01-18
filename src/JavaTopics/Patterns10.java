package JavaTopics;

public class Patterns10 {
    public static void main(String[] args) {

          /*

           * * * * *
            * * * *
             * * *
              * *
               *

         */

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }

            for (int c = a; c <= 5; c++) {
                System.out.print("* "); //ilk önce artan boş üçgen sonra azalan sağ üçgen çizdik ve sonuna bir boşluk ekledik.
            }
            System.out.println();
        }



    }
}


