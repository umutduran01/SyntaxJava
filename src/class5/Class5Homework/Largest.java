package class5.Class5Homework;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 different numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c){
            System.out.println("a is the largest");
        } else if (b > a && b > c) {
            System.out.println("b is the largest");
        } else if (c > a && c > b) {
            System.out.println("c is the largest");
        }

    }
}
