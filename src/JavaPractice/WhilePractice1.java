package JavaPractice;

public class WhilePractice1 {
    public static void main(String[] args) {

        //1'den 100'e kadar olan çift sayılar.

        int a = 1;

        while (a <= 100){
            a++;
            if (a % 2 == 0){
                System.out.println(a);
            }
        }

    }
}
