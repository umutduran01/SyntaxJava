package class11.Class11Homework;

public class Grocery {
    public static void main(String[] args) {

        /*
        Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
         */

        String[][] shoppingList = {{"potato","salsa","garlic"},{"chicken","mince","meat","nugget","burger"},{"milk"},{"sugar","puding","ice cream"}};

        for (int i = 0; i < shoppingList.length; i++) {
            for (int j = 0; j < shoppingList[i].length; j++) {
                System.out.println(shoppingList[i][j]);
            }
        }

    }
}
