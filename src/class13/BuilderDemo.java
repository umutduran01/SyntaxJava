package class13;

public class BuilderDemo {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Sunday");
        System.out.println(str.reverse()); //Loop olmadan ters çevirebildik.

        /*

        String oluşturulduğunda ilk önce hafızadaki stringleri kontrol eder ve eğer aynı string varsa ona eşitler. Yani;

        String a = "Hello";
        String b = "Hello";

        Bu işlemi yaparken yavaş çalışır ama hafızafan tasarruf eder.

        StringBuilder ise hafızada daha önceki tutulan stringleri kontrol etmez direkt yeni bir string oluşturur. Bu da hafıza tüketir ancak daha hızlıdır.

        Birçok string aynı değere yöneldiği için o değer değiştirilemez çünkü değiştirildiğinde diğer değer de çalışmayacaktır.

         */

    }
}
