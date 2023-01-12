package class6;

import java.util.Scanner;

public class WhileLoopDecreament2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        while (number > 0){
            System.out.println(number);
            number--;
        }

    }
}
