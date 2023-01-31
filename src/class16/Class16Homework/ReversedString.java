package class16.Class16Homework;

import javax.crypto.spec.PSource;

public class ReversedString {

    /*
     Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */

    public String toReverse(String inputString) {
        StringBuilder builderString = new StringBuilder(inputString);
        return builderString.reverse().toString();
    }

    public static void main(String[] args) {

        ReversedString str = new ReversedString();
        String reservedString = str.toReverse("Hello World!");
        System.out.println(reservedString);
    }
}
