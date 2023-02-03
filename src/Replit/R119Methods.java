package Replit;

public class R119Methods {
    /*
    Write a method header with the following specs:

    Returns: a String

    Name: censorLetter

    Parameters: a String, a char

    Then complete the method by programming the following behavior

    Replace all instances of given character with a "*" within the given String.
    See below examples.

    Examples:

    censorLetter("computer science",'e') ==> "comput*r sci*nc*"
    censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */

    String censorLetter(String str, char chr) {
        return str.replaceAll(Character.toString(chr), "*");
    }

    public static void main(String[] args) {

        R119Methods newTest1 = new R119Methods();
        String result1 = newTest1.censorLetter("computer science", 'e');
        System.out.println(result1);

        R119Methods newTest2 = new R119Methods();
        String result2 = newTest2.censorLetter("trick or treat", 't');
        System.out.println(result2);
    }

}
