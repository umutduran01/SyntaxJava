package Replit;

public class R159Overloading {
    /*
    Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers

    In main method execute all 3 methods to match the output:

    Expected Output

    40 (should come from subtracting 4 numbers)
    30 (should come from subtracting 3 numbers)
    20 (should come from subtracting 2 numbers)
    */

    void sub(int num1, int num2) {
        System.out.println((num1 - num2) + " (should come from subtracting 2 numbers)");
    }

    void sub(int num1, int num2, int num3) {
        System.out.println((num1 - num2 - num3) + " (should come from subtracting 3 numbers)");
    }

    void sub(int num1, int num2, int num3, int num4) {
        System.out.println((num1 - num2 - num3 - num4) + " (should come from subtracting 4 numbers)");
    }

    public static void main(String[] args) {

        R159Overloading newTest1 = new R159Overloading();
        R159Overloading newTest2 = new R159Overloading();
        R159Overloading newTest3 = new R159Overloading();

        newTest1.sub(49,2,1,6);
        newTest2.sub(60,7,23);
        newTest3.sub(100,80);

    }
}
