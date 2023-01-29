package class15.Class15Homework;

import java.util.Scanner;

public class Grade {


    char gradeIs(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'B';
        }
    }

        public static void main (String[]args){

        /*
        Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
        score > 90 - A
        score >80 - B
        score >70 - C
        score > 50 - D
        anything else - F
         */

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your score: ");
            int scoreIs = input.nextInt();

            Grade newGrade = new Grade();
            char result = newGrade.gradeIs(scoreIs);
            System.out.println(result);

        }
    }
