package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str = "jdnfkd 3498234 ^&+'!";

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))){ //Character.isAlphabetic() kaç tane harf olduğunu sayar. .isDigit() kaç tane sayı olduğunu gösterir.
                counter++;
            }
        }
        System.out.println(counter);
    }


}
