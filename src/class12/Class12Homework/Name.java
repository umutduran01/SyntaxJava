package class12.Class12Homework;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first names and if they expecting boy or girl?

        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter father's name: ");
        String nameFather = input.nextLine();
        System.out.println("Please enter mother's name");
        String nameMother = input.nextLine();

        System.out.println("Are you expecting a boy or a girl ? Enter B or G: ");
        char gender = input.next().charAt(0);

        if (gender == 'B'){
            System.out.println(nameFather.substring(0,nameFather.length()/2) + nameMother.substring(nameMother.length()/2));
        } else if (gender == 'G') {
            System.out.println(nameMother.substring(0,nameMother.length()/2) + nameFather.substring(nameFather.length()/2));
        }
    }
}
