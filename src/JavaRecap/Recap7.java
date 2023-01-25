package JavaRecap;

public class Recap7 {
    public static void main(String[] args) {


        String str = "Hello everyone. My name is Umut and I am 27 years old. My phone number is +123456789.";

        //Char----------
        System.out.println(str.charAt(0)); //Char index.

        if (str.charAt(2) == str.charAt(3)) { //If condition with char
            System.out.println("Chars are equal.");
        }


        //Index Of------------
        System.out.println(str.indexOf('u')); //U harfinin ilk geçtiği yer.

        int counter = 0;
        for (int i = 0; i < str.length(); i++) { //For loop ile String içerisinde kaç tane aynı harf geçtiğini bulma.
            if (str.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("Geçen a sayısı: " + counter);


        //String Length-----------
        System.out.println(str.length()); //String uzunluğu

        for (int i = 0; i < str.length() / 8; i++) { //String uzunluğu ile for loop
            System.out.print("hello");
        }

        for (int i = str.length() - 1; i >= 0; i--) { //String uzunluğu ve charAt kullanarak ters yazdırma
            System.out.print(str.charAt(i));
        }

        System.out.println();


        //toUppercase and toLowerCase----------
        System.out.println(str.toLowerCase()); //Bütün harfler küçük
        System.out.println(str.toUpperCase()); //Bütün harfler büyük


        //String Concatenation----------
        String a = "hello";
        String b = "world";

        System.out.println(a.concat(" " + b)); //iki string birleşti


        //Empty String----------
        System.out.println(str.isEmpty()); //Çıktısı false olacak çünkü stringte yazılar var.

        String str2 = "";
        System.out.println(str2.isEmpty()); //Çıktısı true olacak çünkü içi boş.


        //Blank String---------
        System.out.println(str.isBlank()); //Çıktısı false çünkü String boşluklardan oluşmuyor.

        String str3 = "          ";
        System.out.println(str3.isBlank()); //Çıktısı true çünkü stringte sadece yazılar var.


        //Equal strings-----------
        String s1 = "hello", s2 = "hi", s3 = "HellO";
        System.out.println(s1.equals(s2)); //False çünkü iki string birbirine eşit değil.
        System.out.println(s1.equalsIgnoreCase(s3)); //Büyük ve küçük harf duyarlılığı olmadan iki string birbirine eşit.


        //String Trim-----------
        String strings = "      umut       ";
        System.out.println(strings.trim()); //Sadece baştaki ve sondaki boşlukları keser.


        //String Ends With & Starts With-----------
        String k = "Every1 likes Java";
        System.out.println(k.startsWith("E")); //true
        System.out.println(k.endsWith("l")); //false


        //String Contains------------
        System.out.println(k.contains("i")); //true
        System.out.println(k.contains("like")); //true


        //Is Alphabet & Is Digit---------
        System.out.println(Character.isAlphabetic(k.charAt(2))); //True çünkü index 2 bir harf.

        System.out.println(Character.isDigit(k.charAt(5))); //True çünkü index 5 bir sayı.


        //Index Of-------------
        System.out.println(k.indexOf('y')); //4. indexte başlıyor.
        System.out.println(k.indexOf("Java")); //13. indexte başlıyor.


        //Substring
        System.out.println(k.substring(5)); //5. karakterden itibaren yazıdırır.
        System.out.println(k.substring(0,8)); //0 ve 8 indexleri arasını yazdırır.



    }
}
