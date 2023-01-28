package class15;

public class ArrayMethod {

    //Create a method that takes an array of int sum all the elements from the array and return the sum.

    int sumArray(int[] inputArray) {
        int sum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }

}
