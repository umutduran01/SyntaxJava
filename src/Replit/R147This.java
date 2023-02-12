package Replit;

public class R147This {
    /*
    **In carObject class:**

    Create instance variables as below.

    - model
    - price,
    - quantity

    Create a constructor that will initialize instance variables.

    Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.

    run the application in Main Class

    **Expected Output:**

    Toyota 2019 Stock Value 2500000.0
    BMW 2019 Stock Value 652980.0

    Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
    */
    public static void main(String[] args) {

        CarObjects newTest1 = new CarObjects("Toyota", 500000, 5);
        double result1 = newTest1.carStockValue();
        CarObjects newTest2 = new CarObjects("BMW", 65298, 10);
        double result2 = newTest2.carStockValue();

        System.out.println(newTest1.model + " " + CarObjects.year + " Stock Value " + result1);
        System.out.println(newTest2.model + " " + CarObjects.year + " Stock Value " + result2);
    }
}

class CarObjects {

    String model;
    static int year = 2019;
    double price;
    int quantity;

    CarObjects(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    double carStockValue() {
        return price * quantity;
    }
}
