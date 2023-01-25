package class13;

public class StringReplaceAll {
    public static void main(String[] args) {

        //Regular expression a sequence of characters that forms a search pattern.
        // When you search for data in a text, you can use this search pattern to describe what you are searching for.

        String str = "kDFGHDFZXFfdhyuk34677867^+%(/(^+%";

        System.out.println(str.replaceAll("[A-Z]", "#"));

        //Tüm büyük harflerin yerini # ile değiştirdik.

        System.out.println(str.replaceAll("[A-K]", "_"));

        //Burada alfabe üzerinde A'dan K'ye kadar olan ifadeleri _ ile değiştirdik.

        System.out.println(str.replaceAll("[a-z]", "*"));

        //Burada küçük harflerin tamamını * ile değiştirdik.

        System.out.println(str.replaceAll("[0-9]", "!"));

        //Tüm sayıları ! ile değiştirdik.

        System.out.println(str.replaceAll("[A-Za-z]", "~"));

        //Burada iki ifade tanımladık. Tüm büyük harfler ve küçük harfler ~ ile değişiyor.

        System.out.println(str.replaceAll("[A-Za-z0-9]","-"));

        //Tüm büyük, küçük harfleri ve sayıları - ile değiştirdik.

        System.out.println(str.replaceAll("[^A-Za-z0-9]",">"));

        //Regular Exppression kullanıdığımızda ^ ifadesi normaldeki ! ifadesidir. Yani değil anlamına gelir. Bu aynı zamanda özel karakterleri değiştirmek için de kullanılır.

        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));

        //Bu karakterler dışındaki her şeyi sildi.

    }
}
