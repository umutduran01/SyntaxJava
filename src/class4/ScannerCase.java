package class4;

import java.util.Scanner;

public class ScannerCase {
    public static void main(String[] args) {


        //EXAMPLE 1

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("My name is " + name);


        //EXAMPLE 2

        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = myInput.nextInt();
        System.out.println("My number is " + number);
    }
}
