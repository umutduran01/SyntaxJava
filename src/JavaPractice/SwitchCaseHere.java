package JavaPractice;

import java.util.Scanner;

public class SwitchCaseHere {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 10");
        int number = input.nextInt();

        switch (number){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("You have failed the exam.");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("You can do it.");
                break;
            case 7:
            case 8:
                System.out.println("You passed with no issue.");
                break;
            case 9:
            case 10:
                System.out.println("You are amazing");
                break;
            default:
                System.out.println("You entered a wrong number");
                break;
        }
        input.close();

    }
}
