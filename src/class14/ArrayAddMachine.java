package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[] arr1 = {30, 40, 45, 50};
        addArrayMachine(arr1);

        int[] arr2 = {30,68,42, 40, 49, 51};
        addArrayMachine(arr2);
    }

    static void addArrayMachine(int[] arr){
        int sum = 0;
        for (int numbers:arr) {
            sum+=numbers;
        }
        System.out.println(sum);
    }


}
