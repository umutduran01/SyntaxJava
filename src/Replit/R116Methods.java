package Replit;

public class R116Methods {

    boolean oddOrEven(int a, int b) {
        boolean bothEven = true;
        if (a % 2 == 0 && b % 2 == 0) {
            return bothEven;
        } else {
            return !bothEven;
        }
    }

    public static void main(String[] args) {


        /*
        Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false

        ( Return false if one or both given numbers are not even)


        Examples:

        - bothEven(4,6) ==> true
        - bothEven(3,4) ==> false
        - bothEven(-1,1) ==> false

        **Expected Output:**

        false
         */

        R116Methods newPrint = new R116Methods();
        boolean result = newPrint.oddOrEven(3,8);
        System.out.println(result);
    }
}

