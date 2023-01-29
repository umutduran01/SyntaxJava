package class15.Class15Homework;

public class LargerNumber {

    int larger(int num1, int num2) {
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {
        //Create a method that will take 2 parameters as a numbers and prints which number is larger.

        LargerNumber number = new LargerNumber();

        int result = number.larger(54,16);
        System.out.println(result);

    }
}
