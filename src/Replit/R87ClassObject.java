package Replit;

public class R87ClassObject {

    String color, make;

    int year;

    public static void main(String[] args) {

        /*
        Create a class named 'Main' with specific attributes.

        Create two objects of that class in which you will be assigning the following values and then print them.

        carColor='Black'

        carYear=2019

        carMake='BMW'

        carColor='White'

        carYear=2018

        carMake='Toyota'

        **Expected Output:**

        Car color is Black and car year is 2019 and car model is BMW
        Car color is White and car year is 2018 and car model is Toyota
         */


        R87ClassObject car = new R87ClassObject();

        car.color = "Black";

        car.year = 2019;

        car.make = "BMW";

        System.out.println("Car color is " + car.color + " and car year is " + car.year + " and car model is " + car.make);

        car.color = "White";

        car.year = 2018;

        car.make = "Toyota";

        System.out.println("Car color is " + car.color + " and car year is " + car.year + " and car model is " + car.make);

    }
}

