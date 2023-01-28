package class15;

public class MethodsPractice {

    //create a method that returns true or false and take the int number as a parameter if number is even it returns true otherwise it returns false

    boolean oddEven(int num) {
        boolean even;
        if (num % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
        return even;
    }

    //OR

    boolean oddEven2(int num2) {
        if (num2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //OR

    boolean oddEven3(int num3){
        return num3 % 2 == 0;
    }
}
