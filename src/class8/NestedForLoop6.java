package class8;

public class NestedForLoop6 {
    public static void main(String[] args) {

    /*
    1 2 3 4 5
    1       5
    1 2 3 4 5
     */

        for (int i = 0; i < 3; i++) {
            for (int k = 1; k <= 5; k++) {
                if (i == 1 && k == 2 || i == 1 && k == 3 || i == 1 && k == 4){
                    System.out.print(" ");
                }
                System.out.print(k + " ");
            }
            System.out.println();
        }


    }
}
