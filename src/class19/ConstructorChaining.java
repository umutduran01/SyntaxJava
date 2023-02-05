package class19;

public class ConstructorChaining {

    ConstructorChaining() {
        System.out.println("I am non argument constructor."); //non argument constructor
    }

    ConstructorChaining(String str) {
        this(); //making a call to non argument constructor. Always must be on the first line. We can have only one non argument constructor in a class.
        System.out.println(str); //parameterized constructor
    }

    ConstructorChaining(int number) {
        this("hello"); //Parametreyi yazdığımızda ilgili constructorı çağırmış oluyoruz. //We can also put str here so it will refer the constructor with a String.
        System.out.println("This is constructor with int parameter.");
    }

    public static void main(String[] args) {

        ConstructorChaining newEx = new ConstructorChaining();
        System.out.println("--------------------");
        ConstructorChaining newEx2 = new ConstructorChaining("hello");
        System.out.println("--------------------");
        ConstructorChaining newEx3 = new ConstructorChaining(65);


    }
}
