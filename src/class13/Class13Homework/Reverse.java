package class13.Class13Homework;

public class Reverse {
    public static void main(String[] args) {

        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
        */

        String str = "This is sentence i want to reverse";

        String [] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            for (int j = strArr[i].length()-1; j >= 0; j--) {
                System.out.print(strArr[i].charAt(j));
            }
            System.out.print(" ");
        }

    }
}
