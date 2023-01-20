package class11.Class11Homework;

import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and calculate how many total countries been stored
         */

        String[][] countries = {{"USA","Canada"},{"Brasil","Argentine","Chile","Cuba"},{"Portugal","France","Germany"},{"Turkey","China","Japan"},{"Niger","Morocco"}};

        int sum = 0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                sum += j;
            }
        }
        System.out.println("You have stored " + sum);

    }
}
