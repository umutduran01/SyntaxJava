package Replit;

public class R169Final {
    /*
    Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.

    **Expected Output:**

    4.8
    */

    final static double avgElements(int[] arr) {

        double sum = 0;

        for (int number : arr) {
            sum += number;
        }
        return (sum / (arr.length));
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}
