package class12;

public class StringDemo {
    public static void main(String[] args) {

        String strObj = new String("Java"); //Creating an object of the String Class

        String strObj2 = "Java"; //Another way of creating an object of String class a shorter way. This is how we create the object of String class.
        System.out.println(strObj2.length()); //.length() is a matter here.

        String str = "Banana "; //7 characters with gap.
        int len = str.length();
        System.out.println(len);

    }
}
