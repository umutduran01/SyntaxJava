package JavaTopics;

public class Patterns1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { //5 tane satır yazdırsın.
            for (int j = 1; j <= 5; j++) { //Her satırda 1'den 5'e kadar sembol yazdırsın.
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int k = 1; k <= 5; k++) { //5 tane satır yazdırsın.
            for (int m = 1; m <= k; m++) { //Her seferinde 1'den k'ya kadar sembol yazdırsın.
                System.out.print("% ");
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int a = 1; a <= 5; a++) { //5 tane satır yazdırsın.
            for (int b = a; b <= 5; b++) { //Her satırda a'dan 5'e kadar yazdırsın.
                System.out.print("/ ");
            }
            System.out.println();
        }


    }
}
