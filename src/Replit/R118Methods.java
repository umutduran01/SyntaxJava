package Replit;

public class R118Methods {

    /*
    Write a method header on line two with the following specs:

    Returns: a String

    Name: spaceOut

    Parameters: a String

    Then complete the method by programming the following behavior

    Insert spaces after every character in the String s, then return the new string.

    See below examples (note the space at the end as well).

    Examples:

    spaceOut("hello") ==> "h e l l o "
    spaceOut("technology") ==> "t e c h n o l o g y "
    */

    String spaceOut(String s) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            newStr += s.charAt(i) + " ";
        }
        return newStr;
    }

    public static void main(String[] args) {
        R118Methods newTest = new R118Methods();
        String result = newTest.spaceOut("hello");
        System.out.println(result);
    }
}
