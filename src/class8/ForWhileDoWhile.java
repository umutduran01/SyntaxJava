package class8;

public class ForWhileDoWhile {
    public static void main(String[] args) {

        //10, 8, 6, 4, 2

        //For Loop

        for (int i = 10; i > 0; i -= 2) {
            System.out.println(i);
        }


        //While Loop

        int b = 10;

        while (b > 0) {
            System.out.println(b);
            b -= 2;
        }


        //Do While Loop

        int c = 10;

        do {
            System.out.println(c);
            c -= 2;
        } while (c > 0);


    }
}
