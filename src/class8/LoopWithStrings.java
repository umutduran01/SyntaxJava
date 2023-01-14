package class8;

import java.util.Locale;
import java.util.Scanner;

public class LoopWithStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //String a = input.nextLine().toLowerCase(Locale.ROOT);

        while (input.next().equalsIgnoreCase("Sha")){
            System.out.println("String loop example executed.");
            //System.out.println(a);
        }


    }
}
