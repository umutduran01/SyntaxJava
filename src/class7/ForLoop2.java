package class7;

public class ForLoop2 {
    public static void main(String[] args) {

        //Printing odd number from 1 to 20 using for loop

        for (int a = 1; a <= 20; a++) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
        }

        System.out.println("**************");

        for (int b = 1; b < 20; b+=2) {
            System.out.println(b);
        }
        //Bu kod ilk koda göre daha az çalışalağı için daha iyidir.
    }
}
