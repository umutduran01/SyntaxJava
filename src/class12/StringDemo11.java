package class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str = "Send it to support channel. More java.";

        String newStr = str.substring(28);

        System.out.println(newStr); //Deletes what is written until this index.

        System.out.println(str.substring(0,27)); //Print indexes between 0 and 27.
    }
}
