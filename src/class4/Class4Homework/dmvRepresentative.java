package class4.Class4Homework;

import java.util.Scanner;

public class dmvRepresentative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Driver licence issued.");
        } else {
            System.out.println("Learner's permit offered.");
        }
    }
}
