package class14;

public class StringDemo3 {
    public static void main(String[] args) {

        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
        */

        StringBuilder str = new StringBuilder("This is sentence i want to reverse");
        System.out.println(str.reverse());

        String st = str.toString(); //Converting StringBuilder to String so we can call String methods.
        String[] stArr = st.split(" ");

        for (int i = stArr.length - 1; i >= 0; i--) {
            System.out.print(stArr[i] + " ");
        }

        //OR
        System.out.println();

        String sentence = "This is sentence i want to reverse";

        String [] sentenceArr = sentence.split(" ");

        for (String sentenceArrPrint: sentenceArr
             ) {
            System.out.print(new StringBuilder(sentenceArrPrint).reverse()); //For loop olmadan yazdık.
            System.out.print(" ");
        }


    }
}
