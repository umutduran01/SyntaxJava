package class15.Class15Homework;

public class OddEven {

    String oddOrEven(int num) {
        if (num % 2 == 0) {
            return "This number is even.";
        } else {
            return "This number is odd.";
        }
    }


    public static void main(String[] args) {

        //Create a method that will take a number and prints whether the number is even or odd.

        OddEven number = new OddEven();
        String result = number.oddOrEven(9);
        System.out.println(result);

        OddEven number2 = new OddEven();
        String result2 = number2.oddOrEven(12);
        System.out.println(result2);

    }
}
