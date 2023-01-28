package class14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodsDemo {
    public static void main(String[] args) {

        int[] arr1 = {30, 40, 45, 50};
        int sum = 0;

        for (int number : arr1) {
            sum+=number;
        }
        System.out.println(sum);
        System.out.println(arr1); //this code will not work. in stead of this we can use the following code
        System.out.println(Arrays.toString(arr1));

        System.out.println("----------------------------");

        int[] arr2 = {30,12,25, 40, 45, 50};
        int sum2 = 0;

        for (int number:arr2) {
            sum2+=number;
        }
        System.out.println(sum2);
    }
}
