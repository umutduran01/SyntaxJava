package Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class R188List {
    /*
    Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line

    Numbers in:

    4

    62

    8

    5

    4

    **Expected Output:**

    4 62 8 5 4

    */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            Integer number = input.nextInt();
            arrayList.add(number);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}

