package class11.Class11Homework;

public class EvenOdd {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers = {{15,23,90,12},{34,13,6,7},{3,2,76,59}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0){
                    System.out.println(numbers[i][j] + " is even.");
                }else {
                    System.out.println(numbers[i][j] + " is odd.");
                }
            }
        }

    }
}
