package class11;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int[][] matrix = {{4, 3, 6, 2}, {2, 1, 7}, {2, 1, 9, 0}};

        //For each loop ile yazdırmak için;

        for (int[] arr : matrix){ //ilk önce kaç tane satır olduğunu
           for (int number : arr){ //sonra bu satırların içerğini yazdırdık
               System.out.print(number);
           }
            System.out.println();
        }
    }
}
