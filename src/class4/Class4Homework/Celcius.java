package class4.Class4Homework;

import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your city: ");
        String city = input.nextLine();

        System.out.println("Please enter temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        double celcius = (temperature - 32)* 0.5556;

        System.out.println("The temperature is the city " + city + " is " + celcius);

    }
}
