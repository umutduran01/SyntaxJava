package class9.Class9Homework;

public class ArrayCapital {
    public static void main(String[] args) {

        //Create an array of countries. While retrieving all values from an array print capital for each country choose any five countries.

        String[] countries = {"Turkey", "Germany", "Portugal", "France", "England"};

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Turkey")) {
                System.out.println("Ankara");
            } else if (countries[i].equals("Germany")) {
                System.out.println("Berlin");
            } else if (countries[i].equals("Portugal")) {
                System.out.println("Lisbon");
            } else if (countries[i].equals("France")) {
                System.out.println("Paris");
            } else if (countries[i].equals("England")) {
                System.out.println("London");
            }
        }

    }
}
