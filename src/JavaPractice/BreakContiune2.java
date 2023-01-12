package JavaPractice;

import java.util.Scanner;

public class BreakContiune2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //boolean even = true; olarak da işlem yapılabilir. while döngüsü için even yazılır.

        while (true){
            System.out.println("Please enter an even number");
            int number = input.nextInt();
            if (number % 2 != 0){
                continue;
            }else {
                break;
            }
        }

    }
}

