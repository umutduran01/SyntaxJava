package class4.Class4Homework;

import java.util.Scanner;

public class Diploma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a diploma ?");
        boolean diploma = input.nextBoolean();
        double gpa;

        if (diploma) {
            System.out.println("Congratulations for having a diploma.");
            System.out.println("Please enter your GPA score: ");
            gpa = input.nextDouble();
            if (gpa >= 3.50){
                System.out.println("You are eligible for scholarship.");
            }else {
                System.out.println("You should have studied harder.");
            }
        }else {
            System.out.println("Please get a degree.");
        }


    }

}
