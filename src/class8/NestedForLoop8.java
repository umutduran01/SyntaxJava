package class8;

public class NestedForLoop8 {
    public static void main(String[] args) {

    /*
    0 1 2 3 4 5
    0 2 4 6 8 10
    0 3 6 9 12 15
     */

        for (int a = 1; a < 4; a++) { //satır sayısı
            for (int b = 0; b <= a*5; b = b + a) { //satırda ne yazacağı
                System.out.print(b + " ");
            }
            System.out.println();
        }

        System.out.println("********");

        for (int a = 1; a < 4; a++) { //satır sayısı
            for (int b = 0; b <= 5; b++) { //satırda ne yazacağı
                System.out.print(a*b + " ");
            }
            System.out.println();
        }

    }
}
