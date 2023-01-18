package class10;

public class EnhancedForLoop3 {
    public static void main(String[] args) {

        //Limitations of For Each Loop

        int[] arr = {10,13,20,25,45,50};

        //Print odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }

        //Replace all the odd numbers in this array with help of a normal loop

        for (int a = 0; a < arr.length; a++) {
            if (arr[a] % 2 != 0){
                arr[a] = 0;
            }
        }

        System.out.println(arr[1]);




    }
}
