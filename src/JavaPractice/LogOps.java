package JavaPractice;

import java.util.Scanner;

public class LogOps {
    public static void main(String[] args) {

        /*
        ! = not
        && = and
        || = or
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Please enter your gender: ");
        char gender = input.next().charAt(0);
        System.out.println("Please enter your city: ");
        input.nextLine();
        String city = input.nextLine();

        if (city.equals("Lisbon") && gender == 'M') {
            if (age > 18) {
                System.out.println("You can enter the concert.");
            } else {
                System.out.println("Please wait outside.");
            }
        } else if (city.equals("Madrid") || gender == 'F') {
            System.out.println("Please wait there");

        }
    }


}

