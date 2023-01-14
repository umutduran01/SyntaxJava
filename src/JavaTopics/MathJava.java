package JavaTopics;

public class MathJava {

    public static void main(String[] args) {

        //Max Value - Verilenler arasında arasındaki en yüksek sayıyı bulmak için kullanılır. "Math.max(x,y)" olarak yazdırılır.

        System.out.println(Math.max(5,3)); // Output: 5

        //Min Value - Verilenler arasında arasındaki en yüksek sayıyı bulmak için kullanılır. "Math.min(a,b)" olarak yazdırılır.

        System.out.println(Math.min(7,4)); // Output: 4

        // Square Root - Verilen değerin karekökünü bulur. "Math.sqrt(k)" olarak yazdırılır.

        System.out.println(Math.sqrt(64)); // Output: 8.0

        // Absolute Value - Girilen değerin mutlak değerini bulur. "Math.abs(t)" olarak yazıdırılır.

        System.out.println(Math.abs(-45.0)); // Output 45.0

        // Random Numbers - Bu kod girildiğinde 0.0 ve 1.0 arasında rastgele bir sayı verilir. "Math.random()" olarak yazdırılır.

        System.out.println(Math.random());

        // Verilen sayısı 0 ve 100 arasında bir sayı yapmak için aşağıdaki formül uygulanır.

        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);


    }
}
