package class14;

public class StringDemo2 {
    public static void main(String[] args) {

        //Create a String that should be combination of letters, numbers and special characters. Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str = "dfjshcrASDGVSrthlac235bw4v'^%BRTvrthw";

        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length()); //Method chaining

    }
}
