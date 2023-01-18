package class10;

import java.util.Arrays;

public class D2Arrays2 {
    public static void main(String[] args) {

        int [][] numbers = {{2,4,6},{2,1,9,4},{1,7,0,2,7,4}}; //Burada her dizide eleman sayısı farklıdır.

        for (int a = 0; a < numbers.length; a++) { //İçerisinde kaç tane dizi olduğunu yani dizi uzunluğu
            for (int b = 0; b < numbers[a].length; b++) { //Her dizi ayrı ayrı kaç elaman bulundurduğunu belirtir.
                System.out.println(numbers[a][b]);
            }
        }


    }
}
