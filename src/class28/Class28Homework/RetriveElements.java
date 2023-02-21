package class28.Class28Homework;

import java.util.ArrayList;

public class RetriveElements {
    public static void main(String[] args) {

        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.
        */

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Mercedes");
        cars.add("Renault");

        //First way;

        System.out.println(cars);

        //Second way;

        for (String car : cars){
            System.out.println(car);
        }

        //Third Way

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
