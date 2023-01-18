package class10;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        //To access number 50 we write:
        System.out.println(arr[4]);

        //To print two numbers:
        System.out.println(arr[1] + " " + arr[4]);

        //To print all values:
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
