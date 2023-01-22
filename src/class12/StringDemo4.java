package class12;

public class StringDemo4 {
    public static void main(String[] args) {

        String str = "";
        System.out.println(str.isEmpty()); //true

        String str2 = "abc";
        System.out.println(str2.isEmpty()); //false

        String str3 = "       ";
        System.out.println(str3.isBlank()); //true - counts everything other than spaces

    }
}
