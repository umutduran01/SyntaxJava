package JavaTopics;

public class Patterns6 {
    public static void main(String[] args) {

        /*

                  *
                * *
              * * *
            * * * *
          * * * * *

         */


        for (int a = 1; a <= 5; a++) {
            for (int b = a; b <= 5; b++) { //İlk önce ters üçgen şeklinde bir boşluk.
                System.out.print(" ");
            }

            for (int c = 1; c <= a; c++) { //Daha sonra a değeri kadar yıldızı sonuna ekledik.
                System.out.print("*");
            }
            System.out.println();
        }


    }
}


