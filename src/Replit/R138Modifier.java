package Replit;

class AnotherClass {

    static private void privateMethod() {
        System.out.println("private");
    }

    static protected void protectedMethod() {
        System.out.println("protected");
    }

    static void defaultMethod() {
        System.out.println("default");
    }

    static public void publicMethod() {
        System.out.println("public");
    }

}

public class R138Modifier {
    /*
    In AnotherClass declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.

    All methods should be accessible by class name

    Call methods of Another class inside Main class

    **Expected Output:**

    default

    protected

    public
    */

    public static void main(String[] args) {
        AnotherClass.defaultMethod();
        AnotherClass.protectedMethod();
        AnotherClass.publicMethod();

    }
}
