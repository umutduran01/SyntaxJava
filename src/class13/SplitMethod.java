package class13;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "I like Java. I write a lot of code daily. I am from batch 15.";

        //Bu stringi belirmediğimiz noktalardan cümlelere ayırmak için aşağıdaki işlemi yaparız.

        String[] strArr = str.split("[.?!]");

        //Bu metodu kullanamal için bir array oluşturmamız gerekmektedir.

        System.out.println(strArr.length); //Array uzunluğu. Yani kaç cümle olduğu.

        //Arraylar ile işlem yaptığımızda .length ve Stringler ile işlem yaptığımda .length() kullanırız.

        System.out.println(strArr[0]); //İlk cümleyi yazdırdık.

        System.out.println(strArr[2].trim()); //İlk baştaki boşluğu siliyoruz.
    }
}
