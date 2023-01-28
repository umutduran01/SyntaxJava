package class14;

public class StringDemo {
    public static void main(String[] args) {

        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String a = "Hello everyone ! I am in Portugal right now.";

        System.out.println(a.replaceAll(" ", "")); //Tüm boşlukları kaldırdı.
        System.out.println(a.replaceAll("one", "")); //Tüm one yazılarını kaldırdı.
        System.out.println(a.replaceAll("[A-Z]", "")); //Tüm büyük harfleri kaldırdı.



    }
}
