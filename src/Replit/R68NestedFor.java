package Replit;

public class R68NestedFor {
    public static void main(String[] args) {

        /*
        Write a program to print out the pattern:

        **Expected output:**

        $$$$
        $  $
        $  $
        $$$$
         */


        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 4; b++) {

                if ((a == 2 && b == 2 || a == 2 && b == 3) || (a == 3 && b == 2 || a == 3 && b == 3)) {
                    System.out.print(" ");
                }else {
                    System.out.print("$");
                }

            }
            System.out.println();
        }
    }
}
