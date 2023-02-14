package Replit;

public class R168Final {
    /*
    Create an instance final method that will reverse a String and return that new String

    Call method from the main method

    **Expected Output:**

    olleh
    */

    final String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {

        R168Final newTest = new R168Final();
        System.out.println(newTest.reverse("hello"));

    }
}
