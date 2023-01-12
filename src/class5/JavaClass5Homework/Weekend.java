package class5.JavaClass5Homework;

import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number");
        int day = input.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a week day.");
                break;
            case 6:
            case 7:
                System.out.println("It is a weekend day.");
                break;
            default:
                System.out.println("Invalid day.");
        }

    }
}
