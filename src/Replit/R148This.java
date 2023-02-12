package Replit;

public class R148This {
    /*
    **In ShoppingStore class:**

    Create variables as below.

    - item,
    - price,
    - quantity

    Create a constructor to initialize instance variables.

    Create a method with name itemTotalPrice.

    write a logic to to calculate the total values of items in stock. and print the result.

    return the total value.

    **In Main Class.**

    Create two Object of ShoppingStore and pass the parameters to Constructor.

    then using each object call the method itemTotalPrice.

    Store the returned value of each object.

    Calculate sum of both object and print the result.

    Output:

    Blanket Total Value 99.98

    Mattress Total Value 439.18

    You purchased 539.16 Today

    Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.

     */

    public static void main(String[] args) {
        ShoppingStore newTest1 = new ShoppingStore("Blanket", 99.98, 1);
        double result1 = newTest1.itemTotalPrice();
        ShoppingStore newTest2 = new ShoppingStore("Mattress", 87.836, 5);
        double result2 = newTest2.itemTotalPrice();

        System.out.println(newTest1.item + " Total Value " + result1);
        System.out.println(newTest2.item + " Total Value " + result2);
        System.out.println("You purchased " + (result1 + result2) + " Today");
    }
}

class ShoppingStore {

    String item;
    double price;
    int quantity;

    ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    double itemTotalPrice() {
        return price * quantity;
    }
}
