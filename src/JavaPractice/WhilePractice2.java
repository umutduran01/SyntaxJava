package JavaPractice;

import java.util.Scanner;

public class WhilePractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Negatif sayı girilinceye kadar sayı isteyen ve girilen tek sayıların toplamını yazdıran program.

        int sum = 0;

        while (true) {
            System.out.println("Negatif bir sayı giriniz.");
            int a = input.nextInt();

            if (a < 0) {
                break;
            } else if (a % 2 != 0) {
                sum = sum + a;
                System.out.println("Girileb negatif sayıların toplamı" + sum);
            }
        }



    }
}
