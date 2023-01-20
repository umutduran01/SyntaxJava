package class11;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[][] matrix = {{3, 2, 5}, {6, 2, 0, 6}, {1, 4, 3, 2, 7, 3}};

        System.out.println(matrix[2][4]); //Belirli bir öğeyi yazdırdık.

        System.out.println(Arrays.toString(matrix[0])); //İlk diziyi yazdırdık.

        for (int a = 0; a < matrix[0].length; a++) { //İlk satırı for loop ile yazdırdık.
            System.out.println(matrix[0][a]);
        }

        int [] ilkSatir = matrix[0]; //İlk satırı farklı bir değere tanımlayarak işlem yaptık.
        for (int c = 0; c < ilkSatir.length; c++) {
            System.out.println(ilkSatir[c]);
        }

        System.out.println("------------------");

        System.out.println(Arrays.toString(matrix[2])); //Son satırı yazdırdık.

        for (int k = 0; k < matrix[2].length; k++) { //For loop ile yazdırdık.
            System.out.println(matrix[2][k]);
        }

        int [] sonSatir = matrix[2]; //Yeni değer atayarak son satırı girdik.
        for (int l = 0; l < sonSatir.length; l++) {
            System.out.println(sonSatir[l]);
        }

    }
}

