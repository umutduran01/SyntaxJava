package class3;

public class ShortHandOperator {
    public static void main(String[] args) {

        int number = 10;
        number=number+10;
        System.out.println(number);

        //Bunun için daha kısa bir yol var.

        //number += 10; ile number = number + 10; aynı anlama gelmektedir.

        int number2 = 20;
        number2 *= 10;
        //number2 = number * 10;
        System.out.println(number2);

        int number3 = 100;
        number3 /= 10;
        //number3 = number3 / 10;
        System.out.println(number3);

        


    }
}
