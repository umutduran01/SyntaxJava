package class12.Class12Homework;

public class StringReverse {
    public static void main(String[] args) {

        // Create a String and print it in reverse order (Sunday → yadnuS).

        String hello = "Hello World!";

        for (int i = hello.length()-1; i >= 0; i--) {
            System.out.print(hello.charAt(i));
        }

    }
}
