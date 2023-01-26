package class13.Class13Homework;

public class CombineLetters {
    public static void main(String[] args) {

        //Create a String that should be combination of letters, numbers and special characters. Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str = "Umut12445756'^%^+&Hello'^tv35ytjt";

        int counterAlphabet = 0, counterDigit = 0, counterSymbol = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))){
                counterAlphabet++;
            }else if (Character.isDigit(str.charAt(i))){
                counterDigit++;
            }else {
                counterSymbol++;
            }
        }

        System.out.println("There are " + counterAlphabet + " letters in the string.");
        System.out.println("There are " + counterDigit + " digits in the string.");
        System.out.println("There are " + counterSymbol + " symbols in the string.");

    }
}
