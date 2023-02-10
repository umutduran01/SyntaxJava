package class21;

public class ThreeStaticOverloading {
    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
    */

    static void iLove() {
        System.out.println("I love nothing");
    }

    static void iLove(String str) {
        System.out.println("I love Strings and I entered " + str);
    }

    static void iLove(int number) {
        System.out.println("I love numbers and I entered " + number);
    }

    public static void main(String[] args) {
        ThreeStaticOverloading.iLove();
        ThreeStaticOverloading.iLove("Hello");
        ThreeStaticOverloading.iLove(789);

    }
}
