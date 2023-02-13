package JavaRecap;

public class Recap11 {
    public static void main(String[] args) {

        SuperClass newTest = new SuperClass();
        newTest.sayHelloTo("Ali");

        SubClass newTest2 = new SubClass();
        newTest2.sayHelloTo();

    }
}

class SuperClass {
    String name = "Umut";

    void sayHelloTo(String name) {
        System.out.println("Hello to " + name); //Girilen String değerini yazdırır.
    }
}

class SubClass extends SuperClass {

    void sayHelloTo() {
        System.out.println("Hello to " + super.name); //SuperClass'tan alınan değeri yazdırır.
    }

}
