package class5.JavaClass5Homework;

import java.util.Scanner;

public class LanguageFind {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your country: ");
        String country = input.nextLine();

        switch (country){
            case "USA":
                System.out.println("You speak English");
                break;
            case "Portugal":
                System.out.println("You speak Portuguese");
                break;
            case "Turkey":
                System.out.println("You speak Turkish");
                break;
            case "China":
                System.out.println("You speak Chinese");
                break;
            case "Germany":
                System.out.println("You speak German");
                break;
        }

    }
}
