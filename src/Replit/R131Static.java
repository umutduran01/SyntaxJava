package Replit;

public class R131Static {
    /*
    Write a method with the following specs:

    Returns: String

    Name: thirdLetter

    Parameters:

    a String called s

    Then complete the method by programming the following behavior

    Returns every 3rd letter of the String s,

    starting from the first letter.
    See below examples.

    Examples:

    thirdLetter("hello there") ==> "hltr"
    thirdLetter("technology") ==> "thly"
    */

    static String thirdLetter(String s){
        String empty = "";
        for (int i = 0; i < s.length(); i += 3) {
            empty += s.charAt(i);
        }
        return empty;
    }

    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
