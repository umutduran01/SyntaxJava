package class4.Class4Homework;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter years of work: ");
        int year = input.nextInt();

        System.out.println("Please enter annual salary: ");
        int salary = input.nextInt();

        if (year >= 5){
            System.out.println("You are eligible for bonus.");
            if (salary > 50000){
                System.out.println("Your bonus is 5000 $.");
            }else {
                System.out.println("Your bonus is 3000 $.");
            }
        }else {
            System.out.println("You are not eligible for bonus.");
        }

    }
}
