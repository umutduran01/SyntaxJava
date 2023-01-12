package class5;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a gender:");
        char gender = input.next().charAt(0);

        switch (gender){
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("You entered a wrong gender.");
        }
    }
}
