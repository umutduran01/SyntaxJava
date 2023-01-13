package class7;

import java.util.Scanner;
import java.util.SortedMap;

public class WhileLoop3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean condition = true;

        while (condition){
            System.out.println("Please enter a number between 10 and 20");
            int number = input.nextInt();
            if (number < 10){
                System.out.println("You entered a smaller number than 10");
            } else if (number > 10) {
                System.out.println("You entered a greater number than 10");
            }else {
                System.out.println("You won !");
                condition = false;
            }
        }

    }
}