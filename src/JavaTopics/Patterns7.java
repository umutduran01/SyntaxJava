package JavaTopics;

public class Patterns7 {
    public static void main(String[] args) {

        /*

          * * * * *
            * * * *
              * * *
                * *
                  *

         */


        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) { //İlk önce artan üçgen şeklinde bir boş üçgen yazdırdık.
                System.out.print(" ");
            }

            for (int c = a; c <= 5; c++) { //Sonrasında 1'den 5'e// kadar her seferinde yıldız yazdırdır
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


