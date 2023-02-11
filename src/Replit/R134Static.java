package Replit;

public class R134Static {
    /*
    Write a method with the following specs:

    Returns:

    an integer

    Name:

    countVowels

    Parameters:

    a String called s

    Purpose:

    count the number of vowels in the string s.  Assume s is all lowercase.

    Examples:

    countVowels("obama") ==> 3
    countVowels("happy friday! i love weekends") ==> 9
    */

    static int countVowels(String s) {

        char[] vowels = {'a', 'e', 'i', 'u', 'o'};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (s.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}

