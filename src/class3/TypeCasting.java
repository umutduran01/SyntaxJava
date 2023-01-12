package class3;

public class TypeCasting {
    public static void main(String[] args) {


        //EXAMPLE 1

        long number = 125;
        byte shorterNumber = (byte) number;
        //Bu noktada daha küçük boyutlu byte değerine yerleştirmek istiyoruz. Bunun için yeni değeri eşitlemek istediğimiz değerin cinsinden yazıyoruz.
        System.out.println(shorterNumber);


        //EXAMPLE 2

        float a = 10.2f;
        //int b = a;
        int b = (int) a;
        System.out.println(b);


        //EXAMPLE 3

        byte x = 27;
        int y = x;

        //Bu noktada sorun alınmayacaktır ve yeni değeri girmemeze gerek yok çünkü genişleyen bir işlem yapıyoruz.

        int t = 80;
        byte k = (byte) t;

        //Daralan işlem yaparken yeni değeri girmek zorundayız.


        //EXAMPLE 4

        System.out.println((char)65);

        //Burada bir sayıyı char a çevireres ASCII tablosundaki karşılığı yazdırılıyor.


    }
}
