package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str = "I love java";
        boolean startWith = str.startsWith("I"); //Checks if the word starts with I.
        System.out.println(startWith);
        System.out.println(str.endsWith("java")); //Checks if the word ends with java.

        System.out.println(str.toLowerCase().startsWith("i")); //Method chaining is when multiple methods are called on the same line. Only used if the return is String.

        System.out.println(str.contains("java")); //Check if it has this String
    }
}
