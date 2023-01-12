package class5.JavaClass5Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Please enter +, -, * or /: ");
        char calculation = input.next().charAt(0);
        System.out.print("Please enter the second number: ");
        double number2 = input.nextDouble();

        if (calculation == '+') {
            System.out.println("Result is " + (number1 + number2));
        } else if (calculation == '-') {
            System.out.println("Result is " + (number1 - number2));
        } else if (calculation == '*') {
            System.out.println("Result is " + (number1 * number2));
        } else if (calculation == '/') {
            System.out.println("Result is " + (number1 / number2));
        }


    }
}
