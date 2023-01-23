package Replit;

public class R84Array2d {
    public static void main(String[] args) {

/*
Write a program that prints the total number of elements that are negative AND odd

**Output:**
for example -3 is both negative and odd

3

*/

        int[][] a = {{-5, -2, -3, 7}, {1, -5, -2, 2}, {1, -2, 3, -4}};
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0 && a[i][j] % 2 != 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}

