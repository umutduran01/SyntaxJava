package class9.Class9Homework;

public class ArraySum {
    public static void main(String[] args) {

        //Create an array of size 5 on integers and calculate the sum of all elements in an array.

        int [] numbers = new int[5];

        int sum = 0;

        numbers[0] = 4;
        numbers[1] = 2;
        numbers[2] = 8;
        numbers[3] = 1;
        numbers[4] = 5;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println(sum);

    }
}
