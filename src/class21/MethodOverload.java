package class21;

public class MethodOverload {

    void add(int num1, int num2) { //Basic method
        System.out.println(num1 + num2);
    }

    //Bir metodu overloading yaparken data type ya da sequence type değiştirebiliriz.

    void add(int num1,double num2) { //Değişik variable
        System.out.println(num1 + num2);
    }

    void add(double num2, int num1) { //Değişik variable sequence
        System.out.println(num1 + num2);
    }

    void add(int num1, int num2, int num3) { //Değişik variable sayısı
        System.out.println(num1 + num2 + num3);
    }

}
