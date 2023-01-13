package class5.Class5Homework;

import java.util.Scanner;

public class NestedLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 different number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest");
            } else {
                System.out.println("c is the largest");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("b is the largest");
            } else {
                System.out.println("c is the largest");
            }

        }

    }
}
