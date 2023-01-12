package class6;

import java.util.Scanner;

public class LogicalAndDemo {
    public static void main(String[] args) {

        //EXAMPLE 1

        int a = 8;
        System.out.println(a == 4);

        //EXAMPLE 2

        int b = 2, c = 3;
        System.out.println(b == 2 && c == 3);

        //EXAMPLE 3

        boolean isRaining = true;

        if (!isRaining) {
            System.out.println("lets go for a walk");
        } else {
            System.out.println("stay at home");
        }

        //EXAMPLE 4

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day: ");
        String day = input.nextLine();
        //Sadece bir kelime alacaksak eğer .next komutunu da kullanabiliriz.

        //.equalsIgnoreCase kodu ile büyü ve küçük harf hassasiyeti devre dışı kalıyor.

        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")){
            System.out.println("No Class today.");
        }else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            System.out.println("We have Java class.");
        }else if (day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Tuesday")){
            System.out.println("We have manuel testing class.");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review class today.");
        }else {
            System.out.println("Wrong day entered.");
        }


    }
}
