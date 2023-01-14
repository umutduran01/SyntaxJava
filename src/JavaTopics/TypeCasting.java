package JavaTopics;

public class TypeCasting {
    public static void main(String[] args) {


       //Widening Casting: byte -> short -> char -> int -> long -> float -> double

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myDouble);

        //Narrowing Casting: double -> float -> long -> int -> char -> short -> byte

        double myDouble2 = 7.6;
        int myInt2 = (int) myDouble2;

        System.out.println(myInt2);

        //Integer to String

        int x = 65;
        String y = Integer.toString(x);
        System.out.println(y);

        //String to Integer

        String k = "34";
        int m = Integer.parseInt(k);
        System.out.println(m);

    }
}
