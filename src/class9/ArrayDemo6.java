package class9;

public class ArrayDemo6 {
    public static void main(String[] args) {

        //Create an array to store the letters A B c d e F

        int [] numbers = new int[5]; //5 büyüklüğünde boş bir dizi.
        System.out.println(numbers[2]); //Dizi boş olduğu için bunun çıktısı 0 olacaktır.

        numbers[0] = 50;
        numbers[1] = 30;
        numbers[2] = 55;
        numbers[3] = 60;
        numbers[4] = 52;

        //Boş dizi oluşturduktan sonra değerleri atadık.

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Tüm değerleri yazdırdık.

    }
}
