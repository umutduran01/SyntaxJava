package class9.Class9Homework;

public class ArrayCars {
    public static void main(String[] args) {

        //Create an array that can store names of cars and store 6 elements into it. Print all values from the array.

        String[] cars = {"Honda", "Toyota", "Ferrari", "Mercedes", "Lamborghini", "Dacia"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
