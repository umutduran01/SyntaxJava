package class5.JavaClass5Homework;

import java.util.Scanner;

public class Exams {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quiz: ");
        int quiz = input.nextInt();
        System.out.println("Please enter your mid term: ");
        int midTerm = input.nextInt();
        System.out.println("Please enter your final: ");
        int finall = input.nextInt();

        int average = (quiz + midTerm + finall) / 3;

        System.out.println("Your average score is: " + average);

        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 70 && average < 90) {
            System.out.println("Grade B");
        } else if (average >= 50 && average < 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}
