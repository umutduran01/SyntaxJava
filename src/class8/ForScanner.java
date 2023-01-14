package class8;

import java.util.Scanner;

public class ForScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = input.nextInt();

        for (int i = 0; i <= a; i++) {
            System.out.print(i + " ");
        }

    }
}
