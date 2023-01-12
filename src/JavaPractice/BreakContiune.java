package JavaPractice;

import java.util.Scanner;

public class BreakContiune {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int timeToEnter = 3;

        while (true) {
            //While döngüsünün içine true değerini girerek sürekli dönmesini sağladık.
            System.out.println("Ondan küçük bir sayı giriniz.");
            int a = input.nextInt();

            timeToEnter--;
            System.out.println("Yanlış cevabı girdiniz. Kalan hakkınız: " + timeToEnter);
            //Eklediğimiz sayaç ile kaç kere sayı girme hakkının olduğunu belirttik. Eğer kalan hak = 0 olursa bloke olacak.
            if (timeToEnter == 0) {
                System.out.println("Bloke edildi.");
                break;
            }
            if (a > 10) {
                break;
                //if komutunun içine eğer sayı 10'dan büyükse durmasını sağladık.
            }
        }
    }
}

