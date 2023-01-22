package class12;

public class StringDemo5 {
    public static void main(String[] args) {

        String str = "Java";
        String str2 = "Java";

        System.out.println(str.equals(str2)); //true - case sensitive

        boolean areEqual = str.equals(str2); //true
        System.out.println(areEqual);
        boolean areEqual2 = str.equalsIgnoreCase(str2); //true
        System.out.println(areEqual2);
    }
}
