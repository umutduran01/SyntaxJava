package class12.Class12Homework;

public class StringMani {
    public static void main(String[] args) {

        /*
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        For Example String str=hello =>l
         */

        String newString = "hello dear world";

        if (!newString.isEmpty()){
            if (newString.length()/2 != 0 && newString.length() > 3){
                System.out.println(newString.charAt(newString.length()/2));
            }
        }

    }
}
