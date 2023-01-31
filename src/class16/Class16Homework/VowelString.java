package class16.Class16Homework;

public class VowelString {

    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    private String toOnlyVowels(String input) {
        return input.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {

        VowelString newString = new VowelString();
        String toPrint = newString.toOnlyVowels("Hello everyone! I liked food.");
        System.out.println(toPrint);
    }
}
