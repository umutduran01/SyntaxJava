package class8.Class8Homework;

public class Pattern1 {
    public static void main(String[] args) {

        /*
        Print the following pattern:
        55555
        4444
        333
        22
        1
         */

        for (int i = 0; i < 5; i++) {
            for (int k = i; k < 5; k++) {
                System.out.print(5 - i);
            }
            System.out.println();
        }



    }
}
