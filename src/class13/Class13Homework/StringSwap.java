package class13.Class13Homework;

public class StringSwap {
    public static void main(String[] args) {

        //How would you swap  2 strings without a temporary variable?

        String a = "Hello A", b = "Hello B";

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;

        System.out.println(a);

        b = a.substring(0,b.length());
        a = a.substring(b.length());

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
