package class13;

public class StringRecap {
    public static void main(String[] args) {

        String str = "Java is Great";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

        //input is integer and output is char

        //count how many times the letter a appears

        System.out.println();

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
