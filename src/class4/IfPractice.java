package class4;

public class IfPractice {
    public static void main(String[] args) {

        //EXAMPLE 1

        int money = 15000;

        if (money > 1000) {
            System.out.println("Let's buy an Iphone");
        }
        if (money > 2000) {
            System.out.println("Let's also buy a Macbook");
        }


        //EXAMPLE 2

        boolean mothersDay = true;

        if (mothersDay) {
            System.out.println("Happy Mother's DAy");
        }

        //if şu anda true değerini tutmaktadır.


        //EXAMPLE 3

        String name = "Umut";

        if (name == "umut") {
            System.out.println("I love football");
        }

        //Çıktı alınmayacak çünkü küçük harfle başladık. Buna ek olarak ".equals()" kullanmalıyız.


    }
}
