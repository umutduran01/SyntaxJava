package JavaPractice;

public class Strings {

    public static void main(String[] args) {

        //String Length - İfadede kaç eleman olduğunu bulur. ".length()" ile ifade edilir.

        String myString = "qweasdrtyfghuıojkl";
        System.out.println(myString.length()); // Output: 18

        //Upper Case - Yazılan ifadeyi büyük harfe çevirir. ".toUpperCae()" ile ifade edilir.

        String txt = "Hello World";
        System.out.println(txt.toUpperCase()); // Output: HELLO WORLD

        //Lower Case - Yazılan ifadeyi küçük harfle yazar. ".toLowerCase()" ile gösterilir.

        String txt2 = "Hello World";
        System.out.println(txt2.toLowerCase()); // Output: hello world

        //Index Bulma - Yazılan ifadenin ilk nerede bulunduğunu gösterir. ".indexOf(ifade)" ile gösterilir.

        String txt3 = "There is a big storm outside.";
        System.out.println(txt3.indexOf("big")); // Output: 11

        //Concatenate - İki String'i birleştirmek için kullanılır. "ilkString.concat(ikinciString)" ile gösterilir.

        String firstString = "David", secondString = "McDonald's";
        System.out.println(firstString.concat(secondString)); // Output: DavidMcDonald's

        //Char Bulma - Bir String'deki bir karakteri bulmak için kullanılır. ".charAt(sayı)" ile gösterilir. Girilen değer her zaman int şeklinde olmalı. n-1 kadar değer vardır.

        String str = "Ali okula gidiyor";
        System.out.println(str.charAt(5));




    }
}
