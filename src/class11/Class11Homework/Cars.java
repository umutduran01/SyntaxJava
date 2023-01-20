package class11.Class11Homework;

public class Cars {
    public static void main(String[] args) {
        /*
        Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
         */

        String[][] cars = {{"American","Italian","Japanese"},{"German", "Korean","Spanish"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

    }
}
