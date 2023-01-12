package JavaPractice;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {

        //Girilen sayıya kadar olan 2'nin kuvvetlerini yazıran program.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int number = input.nextInt();

        int k = 1;

        while (k <= number){
            System.out.println(k);
            k = k * 2;

        }


    }
}
