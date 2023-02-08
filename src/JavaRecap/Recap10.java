package JavaRecap;

public class Recap10 {
    public static void main(String[] args) {

        //StringBuilder Oluşturma

        /*
        Bir String oluşturulduğunda ilk önce hafızadaki tüm String değerlerini kontrol eder ve eğer aynı değer varsa ona eşitler. - Yavaş ama hafıza tasarrufu sağlar.
        StringBuilder ise bu kontrol işlemini gerçekleştirmeden yeni bir değer oluşturur ve bundan dolayı daha hızlıdır. - Hızlı ama çok hafıza tüketir.
        */

        StringBuilder obj1 = new StringBuilder("Hello World!"); //How to create a StringBuilder.

        String stringToStringBuilder = "Good Morning !"; //How to create a StringBuilder from a String.
        StringBuilder obj2 = new StringBuilder(stringToStringBuilder);

        String stringToStringBuilder2 = "Good Night !"; //Another way of how to create a StringBuilder from a String.
        StringBuilder obj3 = new StringBuilder();
        obj3.append(stringToStringBuilder2); //The append method takes the string "Good Night !" and adds it to the end of the StringBuilder.

        StringBuilder obj4 = new StringBuilder("I am learning Java."); //How to convert a StringBuilder to String.
        obj4.toString();

        //String Immutable

        //Any operation that appears to modify the String actually creates a new string object with the desired change.

        String str = "hello";
        str = str + " world";

        /*
        In this code, the initial string "hello" is assigned to the variable str. Then, the concatenation str + " world" creates a new string "hello world", which is then assigned back to str.
        The original string "hello" remains unchanged and cannot be modified.
        */

        //StringBuilder in Loops

        String forLoop1 = "Loop Testing with String";
        String emptyString1 = "";

        for (int i = 0; i < forLoop1.length(); i++) { //Bu yöntemi kullanarak sürekli yeni Stringler oluşturuyoruz. Bunun yerine String Builder kullanmak daha faydalı.
            emptyString1 += forLoop1.charAt(i);
        }
        System.out.println(emptyString1);

        String forLoop2 = "Loop Testing with StringBuilder";
        StringBuilder emptyString2 = new StringBuilder();

        for (int i = 0; i < forLoop2.length(); i++) { //Bu örnekte StringBuilder kullanmaktayız. emptyString2 değeri sürekli değişeceğiz için String oluşturmamıza gerek yok.
            emptyString2.append(forLoop2.charAt(i));
        }
        System.out.println(emptyString2);


        //Methods of StringBuilder

        String a = "Merhaba";
        StringBuilder b = new StringBuilder("Dünya"); //Bu metot ile bir String'i ya da bir StringBuilder'i bir StringBuilder'in sonuna ekleyebiliriz. String'te bu metodu kullanamayız.
        b.append(a);
        System.out.println(b);

        StringBuilder insertUse = new StringBuilder("Örnek");
        insertUse.insert(3, "INSERT STRING"); //Bir StringBuilder değerinde belirlediğimiz bir indexe farklı bir String yerleştirme.
        System.out.println(insertUse);

        StringBuilder reverseSb = new StringBuilder("String to reverse.");
        reverseSb.reverse();    //StringBuilder'de reverse methodu ile bir yazıyı ters çevirebiliriz.
        System.out.println(reverseSb);

        StringBuilder convertToString = new StringBuilder("String to convert."); //StrinBuilder'ı String'e çevirdik.
        convertToString.toString();
    }
}
