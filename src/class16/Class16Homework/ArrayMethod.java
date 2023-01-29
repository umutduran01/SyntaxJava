package class16.Class16Homework;

public class ArrayMethod {

    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
    */

    private int arraySum(int[] arr) {
        int sum = 0;
        for (int numbers : arr) {
            sum += numbers;
        }
        return sum;
    }

    public static void main(String[] args) {

        ArrayMethod newArray = new ArrayMethod();
        int[] arr={10,25,35,45};

        System.out.println(newArray.arraySum(arr));

    }
}
