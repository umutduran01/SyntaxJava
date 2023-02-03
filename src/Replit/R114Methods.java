package Replit;

public class R114Methods {

    void addition(int a, int b) {
        System.out.println("Addition " + (a + b));
    }

    void multiplication(int a, int b) {
        System.out.println("Multiplication " + (a * b));
    }

    void subtraction(int a, int b) {
        System.out.println("Subtraction " + (a - b));
    }

    public static void main(String[] args) {


        /*
        Step1: Create three methods that will accept 2 in parameters on integer type

        Step2: Write the logic in methods to perform actions below:

        The first method for multiplication

        The second method for addition

        The third method for subtraction

        Step3: execute all methods

        1. for the addition method add two numbers to make 30

        2. for multiplication multiply two numbers to make 30

        3. for Subtraction subtract two numbers to equal 20

        **Expected Output:**

        Addition 30

        Multiplication 30

        Subtraction 20

         */

        R114Methods newPrint = new R114Methods();
        newPrint.addition(20, 10);
        newPrint.multiplication(3, 10);
        newPrint.subtraction(25, 5);
    }
}

