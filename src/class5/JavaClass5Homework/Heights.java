package class5.JavaClass5Homework;

import JavaPractice.Sout;

import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height");
        int height = input.nextInt();

        if (height < 60){
            System.out.println("Short");
        } else if (height > 60 && height < 72) {
            System.out.println("Medium");
        } else if (height > 72) {
            System.out.println("Tall");
        }
    }
}
