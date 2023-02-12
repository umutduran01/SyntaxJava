package Replit;

public class R125Variables {
    /*
    Declare a static variable **number** that will hold an integer value:

    Access **number** from the main method and assign value to it.

    Create an Object of the class, access **number** in a nonstatic way and assing value of 200.

    Print out **number** using class name and using instance

    **Expected Output:**

    200

    200
    */

    static int number;

    public static void main(String[] args) {
        R125Variables.number = 200;
        int number2 = number;

        System.out.println(number);
        System.out.println(number2);

    }
}
