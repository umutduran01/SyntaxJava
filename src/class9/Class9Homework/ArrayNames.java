package class9.Class9Homework;

public class ArrayNames {
    public static void main(String[] args) {

        //Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).

        String[] names = {"Umut", "Rafik", "Savo", "Visjna", "Sezar"};
        System.out.println(names[0]);

        //or

        String [] names2 = new String[5];

        names2[0] = "Umut";
        names2[1] = "Rafik";
        names2[2] = "Savo";
        names2[3] = "Visjna";
        names2[4] = "Sezar";

        System.out.println(names2[0]);

    }
}
