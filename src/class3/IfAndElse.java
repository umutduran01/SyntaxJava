package class3;

import java.awt.desktop.AboutEvent;

public class IfAndElse {
    public static void main(String[] args) {


        //EXAMPLE 1

        int money = 1500;

        System.out.println(money >= 300);

        if (money >= 300){
            System.out.println("I am going to shopping !");
        }


        //EXAMPLE 2

        int age = 19;

        if (age<18){
            System.out.println("It is time to play");
        }

        //Burada bir sonuç çıkmayacak çünkü koşulu sağlamıyor.


        //EXAMPLE 3

        boolean inSyntaxBootCamp = true;

        if (true) {
            System.out.println("Let's practice Java !");
        }

        //Eğer koşul true ise yine de if kısmını yazdıracaktır.

        if (inSyntaxBootCamp){
            System.out.println("Here is Java practice.");
        }


        //EXAMPLE 4

        char c ='M';

        if (c == 'M') {
            System.out.println("It is a M.");
        }


        //EXAMPLE 5

        String name = "Sam";

        if (name.equals("Sam")){
            System.out.println("Great name !");
        }

        //String değerlerde "==" kullanılmamaktadır. Bunun yerin "x.equals("value")" yazılır.


        //EXAMPLE 6

        String nameNew = "Michael";

        if (!nameNew.equals("George")){
            System.out.println("Amazing Student !");
        }

        //String kontrolü yaparken değildir ifadesi için "!x.equals("value")" yazılır.


        //EXAMPLE 7

        boolean hungry = true;

        if (!hungry){
            System.out.println("Let's eat !");
        }

        //Burada herhangi bir sonuç yazıdırılmayacak çünkü hungry ifadesi true ama "!" işareti ile false yaptık.


        //EXAMPLE 8

        int moneyNew = 1500;

        if (moneyNew > 3000) {
            System.out.println("Do Shopping...");
        }else {
            System.out.println("Save money !");
        }



    }
}
